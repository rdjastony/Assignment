package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Order.proto")
public final class UserServceGrpc {

  private UserServceGrpc() {}

  public static final String SERVICE_NAME = "UserServce";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.UserRequest,
      org.example.UserResponse> getGetUserMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetUser",
      requestType = org.example.UserRequest.class,
      responseType = org.example.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.UserRequest,
      org.example.UserResponse> getGetUserMethod() {
    io.grpc.MethodDescriptor<org.example.UserRequest, org.example.UserResponse> getGetUserMethod;
    if ((getGetUserMethod = UserServceGrpc.getGetUserMethod) == null) {
      synchronized (UserServceGrpc.class) {
        if ((getGetUserMethod = UserServceGrpc.getGetUserMethod) == null) {
          UserServceGrpc.getGetUserMethod = getGetUserMethod =
              io.grpc.MethodDescriptor.<org.example.UserRequest, org.example.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new UserServceMethodDescriptorSupplier("GetUser"))
              .build();
        }
      }
    }
    return getGetUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServceStub>() {
        @java.lang.Override
        public UserServceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServceStub(channel, callOptions);
        }
      };
    return UserServceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServceBlockingStub>() {
        @java.lang.Override
        public UserServceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServceBlockingStub(channel, callOptions);
        }
      };
    return UserServceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<UserServceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<UserServceFutureStub>() {
        @java.lang.Override
        public UserServceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new UserServceFutureStub(channel, callOptions);
        }
      };
    return UserServceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class UserServceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getUser(org.example.UserRequest request,
        io.grpc.stub.StreamObserver<org.example.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetUserMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetUserMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.UserRequest,
                org.example.UserResponse>(
                  this, METHODID_GET_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServceStub extends io.grpc.stub.AbstractAsyncStub<UserServceStub> {
    private UserServceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServceStub(channel, callOptions);
    }

    /**
     */
    public void getUser(org.example.UserRequest request,
        io.grpc.stub.StreamObserver<org.example.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServceBlockingStub extends io.grpc.stub.AbstractBlockingStub<UserServceBlockingStub> {
    private UserServceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.UserResponse getUser(org.example.UserRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetUserMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServceFutureStub extends io.grpc.stub.AbstractFutureStub<UserServceFutureStub> {
    private UserServceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new UserServceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.UserResponse> getUser(
        org.example.UserRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetUserMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_USER = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_USER:
          serviceImpl.getUser((org.example.UserRequest) request,
              (io.grpc.stub.StreamObserver<org.example.UserResponse>) responseObserver);
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

  private static abstract class UserServceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.Order.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserServce");
    }
  }

  private static final class UserServceFileDescriptorSupplier
      extends UserServceBaseDescriptorSupplier {
    UserServceFileDescriptorSupplier() {}
  }

  private static final class UserServceMethodDescriptorSupplier
      extends UserServceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServceFileDescriptorSupplier())
              .addMethod(getGetUserMethod())
              .build();
        }
      }
    }
    return result;
  }
}
