package co.wdns.grpc_demo.user_service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.12.0)",
    comments = "Source: grpc-demo-protobuf/user_service.proto")
public final class UserServiceGrpc {

  private UserServiceGrpc() {}

  public static final String SERVICE_NAME = "user_service.UserService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getRegisterUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.UserRegistrationRequest,
      co.wdns.grpc_demo.user_service.UserRegistrationResult> METHOD_REGISTER_USER = getRegisterUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.UserRegistrationRequest,
      co.wdns.grpc_demo.user_service.UserRegistrationResult> getRegisterUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.UserRegistrationRequest,
      co.wdns.grpc_demo.user_service.UserRegistrationResult> getRegisterUserMethod() {
    return getRegisterUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.UserRegistrationRequest,
      co.wdns.grpc_demo.user_service.UserRegistrationResult> getRegisterUserMethodHelper() {
    io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.UserRegistrationRequest, co.wdns.grpc_demo.user_service.UserRegistrationResult> getRegisterUserMethod;
    if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getRegisterUserMethod = UserServiceGrpc.getRegisterUserMethod) == null) {
          UserServiceGrpc.getRegisterUserMethod = getRegisterUserMethod = 
              io.grpc.MethodDescriptor.<co.wdns.grpc_demo.user_service.UserRegistrationRequest, co.wdns.grpc_demo.user_service.UserRegistrationResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user_service.UserService", "RegisterUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.user_service.UserRegistrationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.user_service.UserRegistrationResult.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("RegisterUser"))
                  .build();
          }
        }
     }
     return getRegisterUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLoginUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LoginUserAttempt,
      co.wdns.grpc_demo.user_service.LoginUserResult> METHOD_LOGIN_USER = getLoginUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LoginUserAttempt,
      co.wdns.grpc_demo.user_service.LoginUserResult> getLoginUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LoginUserAttempt,
      co.wdns.grpc_demo.user_service.LoginUserResult> getLoginUserMethod() {
    return getLoginUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LoginUserAttempt,
      co.wdns.grpc_demo.user_service.LoginUserResult> getLoginUserMethodHelper() {
    io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LoginUserAttempt, co.wdns.grpc_demo.user_service.LoginUserResult> getLoginUserMethod;
    if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLoginUserMethod = UserServiceGrpc.getLoginUserMethod) == null) {
          UserServiceGrpc.getLoginUserMethod = getLoginUserMethod = 
              io.grpc.MethodDescriptor.<co.wdns.grpc_demo.user_service.LoginUserAttempt, co.wdns.grpc_demo.user_service.LoginUserResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user_service.UserService", "LoginUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.user_service.LoginUserAttempt.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.user_service.LoginUserResult.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LoginUser"))
                  .build();
          }
        }
     }
     return getLoginUserMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getLogoutUserMethod()} instead. 
  public static final io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LogoutUserAttempt,
      co.wdns.grpc_demo.user_service.LogoutUserResult> METHOD_LOGOUT_USER = getLogoutUserMethodHelper();

  private static volatile io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LogoutUserAttempt,
      co.wdns.grpc_demo.user_service.LogoutUserResult> getLogoutUserMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LogoutUserAttempt,
      co.wdns.grpc_demo.user_service.LogoutUserResult> getLogoutUserMethod() {
    return getLogoutUserMethodHelper();
  }

  private static io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LogoutUserAttempt,
      co.wdns.grpc_demo.user_service.LogoutUserResult> getLogoutUserMethodHelper() {
    io.grpc.MethodDescriptor<co.wdns.grpc_demo.user_service.LogoutUserAttempt, co.wdns.grpc_demo.user_service.LogoutUserResult> getLogoutUserMethod;
    if ((getLogoutUserMethod = UserServiceGrpc.getLogoutUserMethod) == null) {
      synchronized (UserServiceGrpc.class) {
        if ((getLogoutUserMethod = UserServiceGrpc.getLogoutUserMethod) == null) {
          UserServiceGrpc.getLogoutUserMethod = getLogoutUserMethod = 
              io.grpc.MethodDescriptor.<co.wdns.grpc_demo.user_service.LogoutUserAttempt, co.wdns.grpc_demo.user_service.LogoutUserResult>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "user_service.UserService", "LogoutUser"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.user_service.LogoutUserAttempt.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.user_service.LogoutUserResult.getDefaultInstance()))
                  .setSchemaDescriptor(new UserServiceMethodDescriptorSupplier("LogoutUser"))
                  .build();
          }
        }
     }
     return getLogoutUserMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static UserServiceStub newStub(io.grpc.Channel channel) {
    return new UserServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static UserServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new UserServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static UserServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new UserServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class UserServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Register a new user
     * </pre>
     */
    public void registerUser(co.wdns.grpc_demo.user_service.UserRegistrationRequest request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.UserRegistrationResult> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterUserMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * login a registered user
     * </pre>
     */
    public void loginUser(co.wdns.grpc_demo.user_service.LoginUserAttempt request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.LoginUserResult> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginUserMethodHelper(), responseObserver);
    }

    /**
     * <pre>
     * logout a logged-in user
     * </pre>
     */
    public void logoutUser(co.wdns.grpc_demo.user_service.LogoutUserAttempt request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.LogoutUserResult> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutUserMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                co.wdns.grpc_demo.user_service.UserRegistrationRequest,
                co.wdns.grpc_demo.user_service.UserRegistrationResult>(
                  this, METHODID_REGISTER_USER)))
          .addMethod(
            getLoginUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                co.wdns.grpc_demo.user_service.LoginUserAttempt,
                co.wdns.grpc_demo.user_service.LoginUserResult>(
                  this, METHODID_LOGIN_USER)))
          .addMethod(
            getLogoutUserMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                co.wdns.grpc_demo.user_service.LogoutUserAttempt,
                co.wdns.grpc_demo.user_service.LogoutUserResult>(
                  this, METHODID_LOGOUT_USER)))
          .build();
    }
  }

  /**
   */
  public static final class UserServiceStub extends io.grpc.stub.AbstractStub<UserServiceStub> {
    private UserServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new user
     * </pre>
     */
    public void registerUser(co.wdns.grpc_demo.user_service.UserRegistrationRequest request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.UserRegistrationResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * login a registered user
     * </pre>
     */
    public void loginUser(co.wdns.grpc_demo.user_service.LoginUserAttempt request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.LoginUserResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginUserMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * logout a logged-in user
     * </pre>
     */
    public void logoutUser(co.wdns.grpc_demo.user_service.LogoutUserAttempt request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.LogoutUserResult> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutUserMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class UserServiceBlockingStub extends io.grpc.stub.AbstractStub<UserServiceBlockingStub> {
    private UserServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new user
     * </pre>
     */
    public co.wdns.grpc_demo.user_service.UserRegistrationResult registerUser(co.wdns.grpc_demo.user_service.UserRegistrationRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterUserMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * login a registered user
     * </pre>
     */
    public co.wdns.grpc_demo.user_service.LoginUserResult loginUser(co.wdns.grpc_demo.user_service.LoginUserAttempt request) {
      return blockingUnaryCall(
          getChannel(), getLoginUserMethodHelper(), getCallOptions(), request);
    }

    /**
     * <pre>
     * logout a logged-in user
     * </pre>
     */
    public co.wdns.grpc_demo.user_service.LogoutUserResult logoutUser(co.wdns.grpc_demo.user_service.LogoutUserAttempt request) {
      return blockingUnaryCall(
          getChannel(), getLogoutUserMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class UserServiceFutureStub extends io.grpc.stub.AbstractStub<UserServiceFutureStub> {
    private UserServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private UserServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected UserServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new UserServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Register a new user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<co.wdns.grpc_demo.user_service.UserRegistrationResult> registerUser(
        co.wdns.grpc_demo.user_service.UserRegistrationRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterUserMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * login a registered user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<co.wdns.grpc_demo.user_service.LoginUserResult> loginUser(
        co.wdns.grpc_demo.user_service.LoginUserAttempt request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginUserMethodHelper(), getCallOptions()), request);
    }

    /**
     * <pre>
     * logout a logged-in user
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<co.wdns.grpc_demo.user_service.LogoutUserResult> logoutUser(
        co.wdns.grpc_demo.user_service.LogoutUserAttempt request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutUserMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER_USER = 0;
  private static final int METHODID_LOGIN_USER = 1;
  private static final int METHODID_LOGOUT_USER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final UserServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(UserServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER_USER:
          serviceImpl.registerUser((co.wdns.grpc_demo.user_service.UserRegistrationRequest) request,
              (io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.UserRegistrationResult>) responseObserver);
          break;
        case METHODID_LOGIN_USER:
          serviceImpl.loginUser((co.wdns.grpc_demo.user_service.LoginUserAttempt) request,
              (io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.LoginUserResult>) responseObserver);
          break;
        case METHODID_LOGOUT_USER:
          serviceImpl.logoutUser((co.wdns.grpc_demo.user_service.LogoutUserAttempt) request,
              (io.grpc.stub.StreamObserver<co.wdns.grpc_demo.user_service.LogoutUserResult>) responseObserver);
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

  private static abstract class UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    UserServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("UserService");
    }
  }

  private static final class UserServiceFileDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier {
    UserServiceFileDescriptorSupplier() {}
  }

  private static final class UserServiceMethodDescriptorSupplier
      extends UserServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    UserServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (UserServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new UserServiceFileDescriptorSupplier())
              .addMethod(getRegisterUserMethodHelper())
              .addMethod(getLoginUserMethodHelper())
              .addMethod(getLogoutUserMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
