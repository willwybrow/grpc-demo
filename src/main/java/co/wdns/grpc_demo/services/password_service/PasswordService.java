package co.wdns.grpc_demo.services.password_service;

import co.wdns.grpc_demo.password_service.PasswordRating;
import co.wdns.grpc_demo.password_service.PasswordStrength;
import com.google.common.hash.Hashing;
import com.nulabinc.zxcvbn.Zxcvbn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

public class PasswordService {

    private final Zxcvbn zxcvbn;
    private final List<String> wordList;
    private final Random random;

    public PasswordService() {
        this.zxcvbn = new Zxcvbn();
        this.wordList = loadWordList();
        this.random = new Random();
    }

    private List<String> loadWordList() {
        ArrayList<String> wordList = new ArrayList<>();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream("brit-sixplus.txt");
        InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
        BufferedReader reader = new BufferedReader(streamReader);
        try {
            for (String line; (line = reader.readLine()) != null; ) {
                wordList.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return wordList;
    }

    private List<String> nRandomWords(int n) {
        int length = this.wordList.size();

        if (length < n) {
            return new ArrayList<>();
        }

        for (int i = length - 1; i >= length - n; --i) {
            Collections.swap(this.wordList, i, this.random.nextInt(i + 1));
        }

        List<String> subList = this.wordList.subList(length - n, length);
        //Collections.rotate(this.wordList, n);

        return subList;
    }

    public String suggestPassword() {
        UUID uuid = UUID.randomUUID();
        String[] segments = uuid.toString().split("-");
        List<String> passwordSegments = nRandomWords(6);
        passwordSegments.addAll(Arrays.asList(segments));

        Collections.shuffle(passwordSegments);

        return passwordSegments.subList(0, random.nextInt(3) + 4).stream().collect(Collectors.joining("-"));
    }

    public PasswordStrength checkPasswordStringStrength(String password) {
        long entropy = passwordEntropy(password);
        PasswordRating rating = passwordRating(entropy);
        return PasswordStrength.newBuilder()
                .setPasswordEntropy(entropy)
                .setPasswordRating(rating).build();
    }

    private long passwordEntropy(String password) {
        return Math.round(this.zxcvbn.measure(password).getGuessesLog10() * 2.3);
    }

    private PasswordRating passwordRating(long entropy) {
        if (entropy < 10) {
            return PasswordRating.HORRIBLE;
        } else if (entropy < 40) {
            return PasswordRating.WEAK;
        } else if (entropy < 80) {
            return PasswordRating.OKAY;
        } else if (entropy < 130) {
            return PasswordRating.STRONG;
        } else if (entropy < 250) {
            return PasswordRating.IMPENETRABLE;
        } else {
            return PasswordRating.MARK_TAYLOR;
        }
    }

    public boolean passwordIsSecureEnough(String password) {
        return true;
    }

    public boolean userPasswordMatchesHash(String username, String password, String hash) {
        return hashUserPassword(username, password).equals(hash);
    }

    public String hashUserPassword(String username, String password) {
        return Hashing.sha256()
                .hashString(salt(password, username), StandardCharsets.UTF_8)
                .toString();
    }

    private String salt(String secret, String salt) {
        return String.format("%s:%s", secret, salt);
    }
}
