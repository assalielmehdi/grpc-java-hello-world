package io.assalielmehdi.helloworld.services;

import io.assalielmehdi.helloworld.grpc.HelloWorldGrpc;
import io.assalielmehdi.helloworld.grpc.HelloWorldRequest;
import io.assalielmehdi.helloworld.grpc.HelloWorldResponse;
import io.grpc.stub.StreamObserver;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorldServiceImpl extends HelloWorldGrpc.HelloWorldImplBase {

  private static HelloWorldServiceImpl instance;

  private static final String HELLO_WORLD_MESSAGE = "Hello World";

  private HelloWorldServiceImpl() {
  }

  public static HelloWorldServiceImpl getInstance() {
    if (instance == null) {
      instance = new HelloWorldServiceImpl();
    }
    return instance;
  }

  @Override
  public void sayHelloWorld(HelloWorldRequest request, StreamObserver<HelloWorldResponse> responseObserver) {
    if (request.getNumberOfMessages() <= 0) {
      responseObserver.onError(new IllegalArgumentException("numberOfMessages should be strictly positive!"));
    }

    final var helloWorldList = Stream
      .generate(() -> HELLO_WORLD_MESSAGE)
      .limit(request.getNumberOfMessages())
      .collect(Collectors.toList());

    final var response = HelloWorldResponse
      .newBuilder()
      .addAllMessages(helloWorldList)
      .build();

    responseObserver.onNext(response);

    responseObserver.onCompleted();
  }

}