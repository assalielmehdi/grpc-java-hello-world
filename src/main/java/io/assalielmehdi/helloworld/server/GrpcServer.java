package io.assalielmehdi.helloworld.server;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class GrpcServer {

  private static GrpcServer instance;

  private static final int AWAIT_TERMINATION_SEC = 30;

  private final Server server;

  public static final String ADDRESS = "localhost";

  public static final int PORT = 8080;

  private GrpcServer(List<? extends BindableService> services) {
    final var serverBuilder = ServerBuilder.forPort(PORT);

    services.forEach(serverBuilder::addService);

    server = serverBuilder.build();
  }

  public static GrpcServer getInstance(List<? extends BindableService> services) {
    if (instance == null) {
      instance = new GrpcServer(services);
    }
    return instance;
  }

  public void start() throws IOException, InterruptedException {
    server.start();

    Runtime.getRuntime().addShutdownHook(new Thread() {

      @Override
      public void run() {
        try {
          GrpcServer.this.stop();
        } catch (InterruptedException e) {
          this.interrupt();
        }
      }

    });

    server.awaitTermination();
  }

  public void stop() throws InterruptedException {
    server.shutdown().awaitTermination(AWAIT_TERMINATION_SEC, TimeUnit.SECONDS);
  }

}
