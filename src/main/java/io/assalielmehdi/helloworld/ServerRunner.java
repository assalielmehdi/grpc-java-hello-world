package io.assalielmehdi.helloworld;

import io.assalielmehdi.helloworld.server.GrpcServer;
import io.assalielmehdi.helloworld.services.HelloWorldServiceImpl;
import io.grpc.BindableService;

import java.io.IOException;
import java.util.List;

public class ServerRunner {

  private static final List<? extends BindableService> SERVICES = List.of(HelloWorldServiceImpl.getInstance());

  public static void main(String[] args) throws IOException, InterruptedException {
    final var server = GrpcServer.getInstance(SERVICES);

    server.start();
  }

}
