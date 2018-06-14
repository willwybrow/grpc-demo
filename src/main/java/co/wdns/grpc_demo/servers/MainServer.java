package co.wdns.grpc_demo.servers;

import co.wdns.grpc_demo.services.AccessTokenService;
import co.wdns.grpc_demo.services.password_service.PasswordRpcService;
import co.wdns.grpc_demo.services.password_service.PasswordService;
import co.wdns.grpc_demo.services.user_service.UserRpcService;
import com.google.common.eventbus.EventBus;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.logging.Logger;

public class MainServer {

    private static final Logger logger = Logger.getLogger(MainServer.class.getName());

    private final Server server;
    private final int port;
    private final PasswordRpcService passwordRpcService;
    private EventBus eventBus;
    private PasswordService passwordService;
    private AccessTokenService accessTokenService;
    private UserRpcService userRpcService;

    public MainServer(ServerBuilder<?> serverBuilder, int port) {
        eventBus = new EventBus();
        passwordService = new PasswordService();
        accessTokenService = new AccessTokenService();
        userRpcService = new UserRpcService(eventBus, accessTokenService, passwordService);
        passwordRpcService = new PasswordRpcService(passwordService);

        this.port = port;
        this.server = serverBuilder
                .addService(userRpcService)
                .addService(passwordRpcService)
                .build();
    }

    public void start() throws IOException {
        server.start();
        logger.info("Server started, listening on " + port);
        Runtime.getRuntime().addShutdownHook(new Thread() {
            @Override
            public void run() {
                // Use stderr here since the logger may has been reset by its JVM shutdown hook.
                System.err.println("*** shutting down gRPC server since JVM is shutting down");
                this.stop();
                System.err.println("*** server shut down");
            }
        });
    }

    public void stop() {
        if (server != null) {
            server.shutdown();
        }
    }

    public void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }

}
