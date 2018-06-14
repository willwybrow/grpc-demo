package co.wdns.grpc_demo.password_service;

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
    comments = "Source: grpc-demo-protobuf/password_service.proto")
public final class PasswordServiceGrpc {

  private PasswordServiceGrpc() {}

  public static final String SERVICE_NAME = "password_service.PasswordService";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getEvaluatePasswordStrengthMethod()} instead. 
  public static final io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.Password,
      co.wdns.grpc_demo.password_service.PasswordStrength> METHOD_EVALUATE_PASSWORD_STRENGTH = getEvaluatePasswordStrengthMethodHelper();

  private static volatile io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.Password,
      co.wdns.grpc_demo.password_service.PasswordStrength> getEvaluatePasswordStrengthMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.Password,
      co.wdns.grpc_demo.password_service.PasswordStrength> getEvaluatePasswordStrengthMethod() {
    return getEvaluatePasswordStrengthMethodHelper();
  }

  private static io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.Password,
      co.wdns.grpc_demo.password_service.PasswordStrength> getEvaluatePasswordStrengthMethodHelper() {
    io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.Password, co.wdns.grpc_demo.password_service.PasswordStrength> getEvaluatePasswordStrengthMethod;
    if ((getEvaluatePasswordStrengthMethod = PasswordServiceGrpc.getEvaluatePasswordStrengthMethod) == null) {
      synchronized (PasswordServiceGrpc.class) {
        if ((getEvaluatePasswordStrengthMethod = PasswordServiceGrpc.getEvaluatePasswordStrengthMethod) == null) {
          PasswordServiceGrpc.getEvaluatePasswordStrengthMethod = getEvaluatePasswordStrengthMethod = 
              io.grpc.MethodDescriptor.<co.wdns.grpc_demo.password_service.Password, co.wdns.grpc_demo.password_service.PasswordStrength>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "password_service.PasswordService", "EvaluatePasswordStrength"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.password_service.Password.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.password_service.PasswordStrength.getDefaultInstance()))
                  .setSchemaDescriptor(new PasswordServiceMethodDescriptorSupplier("EvaluatePasswordStrength"))
                  .build();
          }
        }
     }
     return getEvaluatePasswordStrengthMethod;
  }
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getGetPasswordSuggestionsStrongerThanMethod()} instead. 
  public static final io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.PasswordStrength,
      co.wdns.grpc_demo.password_service.PasswordSuggestion> METHOD_GET_PASSWORD_SUGGESTIONS_STRONGER_THAN = getGetPasswordSuggestionsStrongerThanMethodHelper();

  private static volatile io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.PasswordStrength,
      co.wdns.grpc_demo.password_service.PasswordSuggestion> getGetPasswordSuggestionsStrongerThanMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.PasswordStrength,
      co.wdns.grpc_demo.password_service.PasswordSuggestion> getGetPasswordSuggestionsStrongerThanMethod() {
    return getGetPasswordSuggestionsStrongerThanMethodHelper();
  }

  private static io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.PasswordStrength,
      co.wdns.grpc_demo.password_service.PasswordSuggestion> getGetPasswordSuggestionsStrongerThanMethodHelper() {
    io.grpc.MethodDescriptor<co.wdns.grpc_demo.password_service.PasswordStrength, co.wdns.grpc_demo.password_service.PasswordSuggestion> getGetPasswordSuggestionsStrongerThanMethod;
    if ((getGetPasswordSuggestionsStrongerThanMethod = PasswordServiceGrpc.getGetPasswordSuggestionsStrongerThanMethod) == null) {
      synchronized (PasswordServiceGrpc.class) {
        if ((getGetPasswordSuggestionsStrongerThanMethod = PasswordServiceGrpc.getGetPasswordSuggestionsStrongerThanMethod) == null) {
          PasswordServiceGrpc.getGetPasswordSuggestionsStrongerThanMethod = getGetPasswordSuggestionsStrongerThanMethod = 
              io.grpc.MethodDescriptor.<co.wdns.grpc_demo.password_service.PasswordStrength, co.wdns.grpc_demo.password_service.PasswordSuggestion>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "password_service.PasswordService", "GetPasswordSuggestionsStrongerThan"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.password_service.PasswordStrength.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.password_service.PasswordSuggestion.getDefaultInstance()))
                  .setSchemaDescriptor(new PasswordServiceMethodDescriptorSupplier("GetPasswordSuggestionsStrongerThan"))
                  .build();
          }
        }
     }
     return getGetPasswordSuggestionsStrongerThanMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PasswordServiceStub newStub(io.grpc.Channel channel) {
    return new PasswordServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PasswordServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new PasswordServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PasswordServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new PasswordServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class PasswordServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void evaluatePasswordStrength(co.wdns.grpc_demo.password_service.Password request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.password_service.PasswordStrength> responseObserver) {
      asyncUnimplementedUnaryCall(getEvaluatePasswordStrengthMethodHelper(), responseObserver);
    }

    /**
     */
    public void getPasswordSuggestionsStrongerThan(co.wdns.grpc_demo.password_service.PasswordStrength request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.password_service.PasswordSuggestion> responseObserver) {
      asyncUnimplementedUnaryCall(getGetPasswordSuggestionsStrongerThanMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getEvaluatePasswordStrengthMethodHelper(),
            asyncUnaryCall(
              new MethodHandlers<
                co.wdns.grpc_demo.password_service.Password,
                co.wdns.grpc_demo.password_service.PasswordStrength>(
                  this, METHODID_EVALUATE_PASSWORD_STRENGTH)))
          .addMethod(
            getGetPasswordSuggestionsStrongerThanMethodHelper(),
            asyncServerStreamingCall(
              new MethodHandlers<
                co.wdns.grpc_demo.password_service.PasswordStrength,
                co.wdns.grpc_demo.password_service.PasswordSuggestion>(
                  this, METHODID_GET_PASSWORD_SUGGESTIONS_STRONGER_THAN)))
          .build();
    }
  }

  /**
   */
  public static final class PasswordServiceStub extends io.grpc.stub.AbstractStub<PasswordServiceStub> {
    private PasswordServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordServiceStub(channel, callOptions);
    }

    /**
     */
    public void evaluatePasswordStrength(co.wdns.grpc_demo.password_service.Password request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.password_service.PasswordStrength> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEvaluatePasswordStrengthMethodHelper(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPasswordSuggestionsStrongerThan(co.wdns.grpc_demo.password_service.PasswordStrength request,
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.password_service.PasswordSuggestion> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getGetPasswordSuggestionsStrongerThanMethodHelper(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PasswordServiceBlockingStub extends io.grpc.stub.AbstractStub<PasswordServiceBlockingStub> {
    private PasswordServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public co.wdns.grpc_demo.password_service.PasswordStrength evaluatePasswordStrength(co.wdns.grpc_demo.password_service.Password request) {
      return blockingUnaryCall(
          getChannel(), getEvaluatePasswordStrengthMethodHelper(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<co.wdns.grpc_demo.password_service.PasswordSuggestion> getPasswordSuggestionsStrongerThan(
        co.wdns.grpc_demo.password_service.PasswordStrength request) {
      return blockingServerStreamingCall(
          getChannel(), getGetPasswordSuggestionsStrongerThanMethodHelper(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PasswordServiceFutureStub extends io.grpc.stub.AbstractStub<PasswordServiceFutureStub> {
    private PasswordServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private PasswordServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PasswordServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new PasswordServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<co.wdns.grpc_demo.password_service.PasswordStrength> evaluatePasswordStrength(
        co.wdns.grpc_demo.password_service.Password request) {
      return futureUnaryCall(
          getChannel().newCall(getEvaluatePasswordStrengthMethodHelper(), getCallOptions()), request);
    }
  }

  private static final int METHODID_EVALUATE_PASSWORD_STRENGTH = 0;
  private static final int METHODID_GET_PASSWORD_SUGGESTIONS_STRONGER_THAN = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PasswordServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PasswordServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_EVALUATE_PASSWORD_STRENGTH:
          serviceImpl.evaluatePasswordStrength((co.wdns.grpc_demo.password_service.Password) request,
              (io.grpc.stub.StreamObserver<co.wdns.grpc_demo.password_service.PasswordStrength>) responseObserver);
          break;
        case METHODID_GET_PASSWORD_SUGGESTIONS_STRONGER_THAN:
          serviceImpl.getPasswordSuggestionsStrongerThan((co.wdns.grpc_demo.password_service.PasswordStrength) request,
              (io.grpc.stub.StreamObserver<co.wdns.grpc_demo.password_service.PasswordSuggestion>) responseObserver);
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

  private static abstract class PasswordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PasswordServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return co.wdns.grpc_demo.password_service.PasswordServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PasswordService");
    }
  }

  private static final class PasswordServiceFileDescriptorSupplier
      extends PasswordServiceBaseDescriptorSupplier {
    PasswordServiceFileDescriptorSupplier() {}
  }

  private static final class PasswordServiceMethodDescriptorSupplier
      extends PasswordServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PasswordServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PasswordServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PasswordServiceFileDescriptorSupplier())
              .addMethod(getEvaluatePasswordStrengthMethodHelper())
              .addMethod(getGetPasswordSuggestionsStrongerThanMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
