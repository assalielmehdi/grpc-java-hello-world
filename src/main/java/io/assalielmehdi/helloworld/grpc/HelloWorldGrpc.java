package io.assalielmehdi.helloworld.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 *
 */
@javax.annotation.Generated(
  value = "by gRPC proto compiler (version 1.38.0)",
  comments = "Source: main/proto/helloworld.proto")
public final class HelloWorldGrpc {

  private HelloWorldGrpc() {
  }

  public static final String SERVICE_NAME = "helloworld.HelloWorld";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<io.assalielmehdi.helloworld.grpc.HelloWorldRequest,
    io.assalielmehdi.helloworld.grpc.HelloWorldResponse> getSayHelloWorldMethod;

  @io.grpc.stub.annotations.RpcMethod(
    fullMethodName = SERVICE_NAME + '/' + "sayHelloWorld",
    requestType = io.assalielmehdi.helloworld.grpc.HelloWorldRequest.class,
    responseType = io.assalielmehdi.helloworld.grpc.HelloWorldResponse.class,
    methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<io.assalielmehdi.helloworld.grpc.HelloWorldRequest,
    io.assalielmehdi.helloworld.grpc.HelloWorldResponse> getSayHelloWorldMethod() {
    io.grpc.MethodDescriptor<io.assalielmehdi.helloworld.grpc.HelloWorldRequest, io.assalielmehdi.helloworld.grpc.HelloWorldResponse> getSayHelloWorldMethod;
    if ((getSayHelloWorldMethod = HelloWorldGrpc.getSayHelloWorldMethod) == null) {
      synchronized (HelloWorldGrpc.class) {
        if ((getSayHelloWorldMethod = HelloWorldGrpc.getSayHelloWorldMethod) == null) {
          HelloWorldGrpc.getSayHelloWorldMethod = getSayHelloWorldMethod =
            io.grpc.MethodDescriptor.<io.assalielmehdi.helloworld.grpc.HelloWorldRequest, io.assalielmehdi.helloworld.grpc.HelloWorldResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sayHelloWorld"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                io.assalielmehdi.helloworld.grpc.HelloWorldRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                io.assalielmehdi.helloworld.grpc.HelloWorldResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HelloWorldMethodDescriptorSupplier("sayHelloWorld"))
              .build();
        }
      }
    }
    return getSayHelloWorldMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HelloWorldStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldStub>() {
        @java.lang.Override
        public HelloWorldStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldStub(channel, callOptions);
        }
      };
    return HelloWorldStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HelloWorldBlockingStub newBlockingStub(
    io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldBlockingStub>() {
        @java.lang.Override
        public HelloWorldBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldBlockingStub(channel, callOptions);
        }
      };
    return HelloWorldBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HelloWorldFutureStub newFutureStub(
    io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HelloWorldFutureStub>() {
        @java.lang.Override
        public HelloWorldFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HelloWorldFutureStub(channel, callOptions);
        }
      };
    return HelloWorldFutureStub.newStub(factory, channel);
  }

  /**
   *
   */
  public static abstract class HelloWorldImplBase implements io.grpc.BindableService {

    /**
     *
     */
    public void sayHelloWorld(io.assalielmehdi.helloworld.grpc.HelloWorldRequest request,
                              io.grpc.stub.StreamObserver<io.assalielmehdi.helloworld.grpc.HelloWorldResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSayHelloWorldMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getSayHelloWorldMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              io.assalielmehdi.helloworld.grpc.HelloWorldRequest,
              io.assalielmehdi.helloworld.grpc.HelloWorldResponse>(
              this, METHODID_SAY_HELLO_WORLD)))
        .build();
    }
  }

  /**
   *
   */
  public static final class HelloWorldStub extends io.grpc.stub.AbstractAsyncStub<HelloWorldStub> {
    private HelloWorldStub(
      io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldStub build(
      io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldStub(channel, callOptions);
    }

    /**
     *
     */
    public void sayHelloWorld(io.assalielmehdi.helloworld.grpc.HelloWorldRequest request,
                              io.grpc.stub.StreamObserver<io.assalielmehdi.helloworld.grpc.HelloWorldResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
        getChannel().newCall(getSayHelloWorldMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   *
   */
  public static final class HelloWorldBlockingStub extends io.grpc.stub.AbstractBlockingStub<HelloWorldBlockingStub> {
    private HelloWorldBlockingStub(
      io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldBlockingStub build(
      io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldBlockingStub(channel, callOptions);
    }

    /**
     *
     */
    public io.assalielmehdi.helloworld.grpc.HelloWorldResponse sayHelloWorld(io.assalielmehdi.helloworld.grpc.HelloWorldRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
        getChannel(), getSayHelloWorldMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   */
  public static final class HelloWorldFutureStub extends io.grpc.stub.AbstractFutureStub<HelloWorldFutureStub> {
    private HelloWorldFutureStub(
      io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HelloWorldFutureStub build(
      io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HelloWorldFutureStub(channel, callOptions);
    }

    /**
     *
     */
    public com.google.common.util.concurrent.ListenableFuture<io.assalielmehdi.helloworld.grpc.HelloWorldResponse> sayHelloWorld(
      io.assalielmehdi.helloworld.grpc.HelloWorldRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
        getChannel().newCall(getSayHelloWorldMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAY_HELLO_WORLD = 0;

  private static final class MethodHandlers<Req, Resp> implements
    io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
    io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
    io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
    io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HelloWorldImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HelloWorldImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAY_HELLO_WORLD:
          serviceImpl.sayHelloWorld((io.assalielmehdi.helloworld.grpc.HelloWorldRequest) request,
            (io.grpc.stub.StreamObserver<io.assalielmehdi.helloworld.grpc.HelloWorldResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
      io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class HelloWorldBaseDescriptorSupplier
    implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HelloWorldBaseDescriptorSupplier() {
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return io.assalielmehdi.helloworld.grpc.HelloWorldProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HelloWorld");
    }
  }

  private static final class HelloWorldFileDescriptorSupplier
    extends HelloWorldBaseDescriptorSupplier {
    HelloWorldFileDescriptorSupplier() {
    }
  }

  private static final class HelloWorldMethodDescriptorSupplier
    extends HelloWorldBaseDescriptorSupplier
    implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HelloWorldMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HelloWorldGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
            .setSchemaDescriptor(new HelloWorldFileDescriptorSupplier())
            .addMethod(getSayHelloWorldMethod())
            .build();
        }
      }
    }
    return result;
  }
}
