package co.wdns.grpc_demo.risk_engine;

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
    comments = "Source: grpc-demo-protobuf/risk_engine.proto")
public final class RiskEngineGrpc {

  private RiskEngineGrpc() {}

  public static final String SERVICE_NAME = "risk_engine.RiskEngine";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  @java.lang.Deprecated // Use {@link #getInteractivelyManageUsersMethod()} instead. 
  public static final io.grpc.MethodDescriptor<co.wdns.grpc_demo.risk_engine.UserManagementRequest,
      co.wdns.grpc_demo.risk_engine.UserActivity> METHOD_INTERACTIVELY_MANAGE_USERS = getInteractivelyManageUsersMethodHelper();

  private static volatile io.grpc.MethodDescriptor<co.wdns.grpc_demo.risk_engine.UserManagementRequest,
      co.wdns.grpc_demo.risk_engine.UserActivity> getInteractivelyManageUsersMethod;

  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static io.grpc.MethodDescriptor<co.wdns.grpc_demo.risk_engine.UserManagementRequest,
      co.wdns.grpc_demo.risk_engine.UserActivity> getInteractivelyManageUsersMethod() {
    return getInteractivelyManageUsersMethodHelper();
  }

  private static io.grpc.MethodDescriptor<co.wdns.grpc_demo.risk_engine.UserManagementRequest,
      co.wdns.grpc_demo.risk_engine.UserActivity> getInteractivelyManageUsersMethodHelper() {
    io.grpc.MethodDescriptor<co.wdns.grpc_demo.risk_engine.UserManagementRequest, co.wdns.grpc_demo.risk_engine.UserActivity> getInteractivelyManageUsersMethod;
    if ((getInteractivelyManageUsersMethod = RiskEngineGrpc.getInteractivelyManageUsersMethod) == null) {
      synchronized (RiskEngineGrpc.class) {
        if ((getInteractivelyManageUsersMethod = RiskEngineGrpc.getInteractivelyManageUsersMethod) == null) {
          RiskEngineGrpc.getInteractivelyManageUsersMethod = getInteractivelyManageUsersMethod = 
              io.grpc.MethodDescriptor.<co.wdns.grpc_demo.risk_engine.UserManagementRequest, co.wdns.grpc_demo.risk_engine.UserActivity>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "risk_engine.RiskEngine", "InteractivelyManageUsers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.risk_engine.UserManagementRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  co.wdns.grpc_demo.risk_engine.UserActivity.getDefaultInstance()))
                  .setSchemaDescriptor(new RiskEngineMethodDescriptorSupplier("InteractivelyManageUsers"))
                  .build();
          }
        }
     }
     return getInteractivelyManageUsersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RiskEngineStub newStub(io.grpc.Channel channel) {
    return new RiskEngineStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RiskEngineBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new RiskEngineBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RiskEngineFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new RiskEngineFutureStub(channel);
  }

  /**
   */
  public static abstract class RiskEngineImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<co.wdns.grpc_demo.risk_engine.UserManagementRequest> interactivelyManageUsers(
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.risk_engine.UserActivity> responseObserver) {
      return asyncUnimplementedStreamingCall(getInteractivelyManageUsersMethodHelper(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getInteractivelyManageUsersMethodHelper(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                co.wdns.grpc_demo.risk_engine.UserManagementRequest,
                co.wdns.grpc_demo.risk_engine.UserActivity>(
                  this, METHODID_INTERACTIVELY_MANAGE_USERS)))
          .build();
    }
  }

  /**
   */
  public static final class RiskEngineStub extends io.grpc.stub.AbstractStub<RiskEngineStub> {
    private RiskEngineStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RiskEngineStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiskEngineStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RiskEngineStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<co.wdns.grpc_demo.risk_engine.UserManagementRequest> interactivelyManageUsers(
        io.grpc.stub.StreamObserver<co.wdns.grpc_demo.risk_engine.UserActivity> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getInteractivelyManageUsersMethodHelper(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RiskEngineBlockingStub extends io.grpc.stub.AbstractStub<RiskEngineBlockingStub> {
    private RiskEngineBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RiskEngineBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiskEngineBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RiskEngineBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class RiskEngineFutureStub extends io.grpc.stub.AbstractStub<RiskEngineFutureStub> {
    private RiskEngineFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private RiskEngineFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RiskEngineFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new RiskEngineFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_INTERACTIVELY_MANAGE_USERS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RiskEngineImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RiskEngineImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_INTERACTIVELY_MANAGE_USERS:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.interactivelyManageUsers(
              (io.grpc.stub.StreamObserver<co.wdns.grpc_demo.risk_engine.UserActivity>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RiskEngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RiskEngineBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return co.wdns.grpc_demo.risk_engine.RiskEngineProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RiskEngine");
    }
  }

  private static final class RiskEngineFileDescriptorSupplier
      extends RiskEngineBaseDescriptorSupplier {
    RiskEngineFileDescriptorSupplier() {}
  }

  private static final class RiskEngineMethodDescriptorSupplier
      extends RiskEngineBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RiskEngineMethodDescriptorSupplier(String methodName) {
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
      synchronized (RiskEngineGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RiskEngineFileDescriptorSupplier())
              .addMethod(getInteractivelyManageUsersMethodHelper())
              .build();
        }
      }
    }
    return result;
  }
}
