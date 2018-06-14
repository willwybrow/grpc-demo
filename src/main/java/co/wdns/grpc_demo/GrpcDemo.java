package co.wdns.grpc_demo;

import co.wdns.grpc_demo.servers.MainServer;
import io.grpc.ServerBuilder;

import java.io.IOException;

public class GrpcDemo {
    public static void main(String[] args) throws IOException, InterruptedException {
        int port = 50050;
        ServerBuilder serverBuilder = ServerBuilder.forPort(port);
        MainServer mainServer = new MainServer(serverBuilder, port);

        mainServer.start();
        mainServer.blockUntilShutdown();
    }
}
