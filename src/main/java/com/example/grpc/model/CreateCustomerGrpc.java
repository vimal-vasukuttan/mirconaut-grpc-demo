package model;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.0.1)",
    comments = "Source: customer.proto")
public class CreateCustomerGrpc {

  private CreateCustomerGrpc() {}

  public static final String SERVICE_NAME = "model.CreateCustomer";

  // Static method descriptors that strictly reflect the proto.
  @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/1901")
  public static final io.grpc.MethodDescriptor<model.Customer,
      model.Customer> METHOD_CREATE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "model.CreateCustomer", "Create"),
          io.grpc.protobuf.ProtoUtils.marshaller(model.Customer.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(model.Customer.getDefaultInstance()));

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CreateCustomerStub newStub(io.grpc.Channel channel) {
    return new CreateCustomerStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CreateCustomerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new CreateCustomerBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary and streaming output calls on the service
   */
  public static CreateCustomerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new CreateCustomerFutureStub(channel);
  }

  /**
   */
  public static abstract class CreateCustomerImplBase implements io.grpc.BindableService {

    /**
     */
    public void create(model.Customer request,
        io.grpc.stub.StreamObserver<model.Customer> responseObserver) {
      asyncUnimplementedUnaryCall(METHOD_CREATE, responseObserver);
    }

    @java.lang.Override public io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            METHOD_CREATE,
            asyncUnaryCall(
              new MethodHandlers<
                model.Customer,
                model.Customer>(
                  this, METHODID_CREATE)))
          .build();
    }
  }

  /**
   */
  public static final class CreateCustomerStub extends io.grpc.stub.AbstractStub<CreateCustomerStub> {
    private CreateCustomerStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCustomerStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCustomerStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCustomerStub(channel, callOptions);
    }

    /**
     */
    public void create(model.Customer request,
        io.grpc.stub.StreamObserver<model.Customer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class CreateCustomerBlockingStub extends io.grpc.stub.AbstractStub<CreateCustomerBlockingStub> {
    private CreateCustomerBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCustomerBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCustomerBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCustomerBlockingStub(channel, callOptions);
    }

    /**
     */
    public model.Customer create(model.Customer request) {
      return blockingUnaryCall(
          getChannel(), METHOD_CREATE, getCallOptions(), request);
    }
  }

  /**
   */
  public static final class CreateCustomerFutureStub extends io.grpc.stub.AbstractStub<CreateCustomerFutureStub> {
    private CreateCustomerFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private CreateCustomerFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CreateCustomerFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new CreateCustomerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<model.Customer> create(
        model.Customer request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_CREATE, getCallOptions()), request);
    }
  }

  private static final int METHODID_CREATE = 0;

  private static class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CreateCustomerImplBase serviceImpl;
    private final int methodId;

    public MethodHandlers(CreateCustomerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CREATE:
          serviceImpl.create((model.Customer) request,
              (io.grpc.stub.StreamObserver<model.Customer>) responseObserver);
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

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    return new io.grpc.ServiceDescriptor(SERVICE_NAME,
        METHOD_CREATE);
  }

}
