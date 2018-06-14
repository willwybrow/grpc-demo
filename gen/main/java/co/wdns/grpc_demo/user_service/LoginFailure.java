// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-demo-protobuf/user_service.proto

package co.wdns.grpc_demo.user_service;

/**
 * Protobuf type {@code user_service.LoginFailure}
 */
public  final class LoginFailure extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user_service.LoginFailure)
    LoginFailureOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LoginFailure.newBuilder() to construct.
  private LoginFailure(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LoginFailure() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LoginFailure(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LoginFailure_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LoginFailure_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            co.wdns.grpc_demo.user_service.LoginFailure.class, co.wdns.grpc_demo.user_service.LoginFailure.Builder.class);
  }

  /**
   * Protobuf enum {@code user_service.LoginFailure.FailureReason}
   */
  public enum FailureReason
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>USER_NOT_FOUND = 0;</code>
     */
    USER_NOT_FOUND(0),
    /**
     * <code>BAD_PASSWORD = 1;</code>
     */
    BAD_PASSWORD(1),
    /**
     * <code>USER_LOCKED = 2;</code>
     */
    USER_LOCKED(2),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>USER_NOT_FOUND = 0;</code>
     */
    public static final int USER_NOT_FOUND_VALUE = 0;
    /**
     * <code>BAD_PASSWORD = 1;</code>
     */
    public static final int BAD_PASSWORD_VALUE = 1;
    /**
     * <code>USER_LOCKED = 2;</code>
     */
    public static final int USER_LOCKED_VALUE = 2;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static FailureReason valueOf(int value) {
      return forNumber(value);
    }

    public static FailureReason forNumber(int value) {
      switch (value) {
        case 0: return USER_NOT_FOUND;
        case 1: return BAD_PASSWORD;
        case 2: return USER_LOCKED;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FailureReason>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        FailureReason> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<FailureReason>() {
            public FailureReason findValueByNumber(int number) {
              return FailureReason.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return co.wdns.grpc_demo.user_service.LoginFailure.getDescriptor().getEnumTypes().get(0);
    }

    private static final FailureReason[] VALUES = values();

    public static FailureReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FailureReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:user_service.LoginFailure.FailureReason)
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof co.wdns.grpc_demo.user_service.LoginFailure)) {
      return super.equals(obj);
    }
    co.wdns.grpc_demo.user_service.LoginFailure other = (co.wdns.grpc_demo.user_service.LoginFailure) obj;

    boolean result = true;
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.LoginFailure parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(co.wdns.grpc_demo.user_service.LoginFailure prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code user_service.LoginFailure}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user_service.LoginFailure)
      co.wdns.grpc_demo.user_service.LoginFailureOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LoginFailure_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LoginFailure_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.wdns.grpc_demo.user_service.LoginFailure.class, co.wdns.grpc_demo.user_service.LoginFailure.Builder.class);
    }

    // Construct using co.wdns.grpc_demo.user_service.LoginFailure.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LoginFailure_descriptor;
    }

    public co.wdns.grpc_demo.user_service.LoginFailure getDefaultInstanceForType() {
      return co.wdns.grpc_demo.user_service.LoginFailure.getDefaultInstance();
    }

    public co.wdns.grpc_demo.user_service.LoginFailure build() {
      co.wdns.grpc_demo.user_service.LoginFailure result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public co.wdns.grpc_demo.user_service.LoginFailure buildPartial() {
      co.wdns.grpc_demo.user_service.LoginFailure result = new co.wdns.grpc_demo.user_service.LoginFailure(this);
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof co.wdns.grpc_demo.user_service.LoginFailure) {
        return mergeFrom((co.wdns.grpc_demo.user_service.LoginFailure)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(co.wdns.grpc_demo.user_service.LoginFailure other) {
      if (other == co.wdns.grpc_demo.user_service.LoginFailure.getDefaultInstance()) return this;
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      co.wdns.grpc_demo.user_service.LoginFailure parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (co.wdns.grpc_demo.user_service.LoginFailure) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:user_service.LoginFailure)
  }

  // @@protoc_insertion_point(class_scope:user_service.LoginFailure)
  private static final co.wdns.grpc_demo.user_service.LoginFailure DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new co.wdns.grpc_demo.user_service.LoginFailure();
  }

  public static co.wdns.grpc_demo.user_service.LoginFailure getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LoginFailure>
      PARSER = new com.google.protobuf.AbstractParser<LoginFailure>() {
    public LoginFailure parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LoginFailure(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LoginFailure> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LoginFailure> getParserForType() {
    return PARSER;
  }

  public co.wdns.grpc_demo.user_service.LoginFailure getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
