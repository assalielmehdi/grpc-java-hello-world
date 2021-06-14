package io.assalielmehdi.helloworld.client;

import io.assalielmehdi.helloworld.grpc.HelloWorldGrpc;
import io.assalielmehdi.helloworld.grpc.HelloWorldRequest;
import io.assalielmehdi.helloworld.server.GrpcServer;
import io.grpc.ManagedChannelBuilder;

import java.util.List;

public class HelloWorldClient {

  private static HelloWorldClient instance;

  private final HelloWorldGrpc.HelloWorldBlockingStub stub;

  private HelloWorldClient() {
    final var channel = ManagedChannelBuilder
      .forAddress(GrpcServer.ADDRESS, GrpcServer.PORT)
      .usePlaintext()
      .build();

    stub = HelloWorldGrpc.newBlockingStub(channel);
  }

  public static HelloWorldClient getInstance() {
    if (instance == null) {
      instance = new HelloWorldClient();
    }
    return instance;
  }

  public List<String> request(int numberOfMessages) {
    final var request = HelloWorldRequest
      .newBuilder()
      .setNumberOfMessages(numberOfMessages)
      .build();

    final var response = stub.sayHelloWorld(request);

    return response.getMessagesList();
  }

}
