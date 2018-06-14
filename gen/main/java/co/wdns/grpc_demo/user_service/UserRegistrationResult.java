// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-demo-protobuf/user_service.proto

package co.wdns.grpc_demo.user_service;

/**
 * Protobuf type {@code user_service.UserRegistrationResult}
 */
public  final class UserRegistrationResult extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user_service.UserRegistrationResult)
    UserRegistrationResultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserRegistrationResult.newBuilder() to construct.
  private UserRegistrationResult(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserRegistrationResult() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserRegistrationResult(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10: {
            co.wdns.grpc_demo.user_service.AccessToken.Builder subBuilder = null;
            if (registrationResultCase_ == 1) {
              subBuilder = ((co.wdns.grpc_demo.user_service.AccessToken) registrationResult_).toBuilder();
            }
            registrationResult_ =
                input.readMessage(co.wdns.grpc_demo.user_service.AccessToken.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((co.wdns.grpc_demo.user_service.AccessToken) registrationResult_);
              registrationResult_ = subBuilder.buildPartial();
            }
            registrationResultCase_ = 1;
            break;
          }
          case 18: {
            co.wdns.grpc_demo.user_service.RegistrationFailure.Builder subBuilder = null;
            if (registrationResultCase_ == 2) {
              subBuilder = ((co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_).toBuilder();
            }
            registrationResult_ =
                input.readMessage(co.wdns.grpc_demo.user_service.RegistrationFailure.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom((co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_);
              registrationResult_ = subBuilder.buildPartial();
            }
            registrationResultCase_ = 2;
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
    return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_UserRegistrationResult_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_UserRegistrationResult_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            co.wdns.grpc_demo.user_service.UserRegistrationResult.class, co.wdns.grpc_demo.user_service.UserRegistrationResult.Builder.class);
  }

  private int registrationResultCase_ = 0;
  private java.lang.Object registrationResult_;
  public enum RegistrationResultCase
      implements com.google.protobuf.Internal.EnumLite {
    ACCESS_TOKEN(1),
    REGISTRATION_FAILURE(2),
    REGISTRATIONRESULT_NOT_SET(0);
    private final int value;
    private RegistrationResultCase(int value) {
      this.value = value;
    }
    /**
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static RegistrationResultCase valueOf(int value) {
      return forNumber(value);
    }

    public static RegistrationResultCase forNumber(int value) {
      switch (value) {
        case 1: return ACCESS_TOKEN;
        case 2: return REGISTRATION_FAILURE;
        case 0: return REGISTRATIONRESULT_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public RegistrationResultCase
  getRegistrationResultCase() {
    return RegistrationResultCase.forNumber(
        registrationResultCase_);
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  /**
   * <code>.user_service.AccessToken access_token = 1;</code>
   */
  public boolean hasAccessToken() {
    return registrationResultCase_ == 1;
  }
  /**
   * <code>.user_service.AccessToken access_token = 1;</code>
   */
  public co.wdns.grpc_demo.user_service.AccessToken getAccessToken() {
    if (registrationResultCase_ == 1) {
       return (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_;
    }
    return co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance();
  }
  /**
   * <code>.user_service.AccessToken access_token = 1;</code>
   */
  public co.wdns.grpc_demo.user_service.AccessTokenOrBuilder getAccessTokenOrBuilder() {
    if (registrationResultCase_ == 1) {
       return (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_;
    }
    return co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance();
  }

  public static final int REGISTRATION_FAILURE_FIELD_NUMBER = 2;
  /**
   * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
   */
  public boolean hasRegistrationFailure() {
    return registrationResultCase_ == 2;
  }
  /**
   * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
   */
  public co.wdns.grpc_demo.user_service.RegistrationFailure getRegistrationFailure() {
    if (registrationResultCase_ == 2) {
       return (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_;
    }
    return co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance();
  }
  /**
   * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
   */
  public co.wdns.grpc_demo.user_service.RegistrationFailureOrBuilder getRegistrationFailureOrBuilder() {
    if (registrationResultCase_ == 2) {
       return (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_;
    }
    return co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance();
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
    if (registrationResultCase_ == 1) {
      output.writeMessage(1, (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_);
    }
    if (registrationResultCase_ == 2) {
      output.writeMessage(2, (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_);
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (registrationResultCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_);
    }
    if (registrationResultCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof co.wdns.grpc_demo.user_service.UserRegistrationResult)) {
      return super.equals(obj);
    }
    co.wdns.grpc_demo.user_service.UserRegistrationResult other = (co.wdns.grpc_demo.user_service.UserRegistrationResult) obj;

    boolean result = true;
    result = result && getRegistrationResultCase().equals(
        other.getRegistrationResultCase());
    if (!result) return false;
    switch (registrationResultCase_) {
      case 1:
        result = result && getAccessToken()
            .equals(other.getAccessToken());
        break;
      case 2:
        result = result && getRegistrationFailure()
            .equals(other.getRegistrationFailure());
        break;
      case 0:
      default:
    }
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
    switch (registrationResultCase_) {
      case 1:
        hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
        hash = (53 * hash) + getAccessToken().hashCode();
        break;
      case 2:
        hash = (37 * hash) + REGISTRATION_FAILURE_FIELD_NUMBER;
        hash = (53 * hash) + getRegistrationFailure().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.UserRegistrationResult parseFrom(
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
  public static Builder newBuilder(co.wdns.grpc_demo.user_service.UserRegistrationResult prototype) {
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
   * Protobuf type {@code user_service.UserRegistrationResult}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user_service.UserRegistrationResult)
      co.wdns.grpc_demo.user_service.UserRegistrationResultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_UserRegistrationResult_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_UserRegistrationResult_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.wdns.grpc_demo.user_service.UserRegistrationResult.class, co.wdns.grpc_demo.user_service.UserRegistrationResult.Builder.class);
    }

    // Construct using co.wdns.grpc_demo.user_service.UserRegistrationResult.newBuilder()
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
      registrationResultCase_ = 0;
      registrationResult_ = null;
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_UserRegistrationResult_descriptor;
    }

    public co.wdns.grpc_demo.user_service.UserRegistrationResult getDefaultInstanceForType() {
      return co.wdns.grpc_demo.user_service.UserRegistrationResult.getDefaultInstance();
    }

    public co.wdns.grpc_demo.user_service.UserRegistrationResult build() {
      co.wdns.grpc_demo.user_service.UserRegistrationResult result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public co.wdns.grpc_demo.user_service.UserRegistrationResult buildPartial() {
      co.wdns.grpc_demo.user_service.UserRegistrationResult result = new co.wdns.grpc_demo.user_service.UserRegistrationResult(this);
      if (registrationResultCase_ == 1) {
        if (accessTokenBuilder_ == null) {
          result.registrationResult_ = registrationResult_;
        } else {
          result.registrationResult_ = accessTokenBuilder_.build();
        }
      }
      if (registrationResultCase_ == 2) {
        if (registrationFailureBuilder_ == null) {
          result.registrationResult_ = registrationResult_;
        } else {
          result.registrationResult_ = registrationFailureBuilder_.build();
        }
      }
      result.registrationResultCase_ = registrationResultCase_;
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
      if (other instanceof co.wdns.grpc_demo.user_service.UserRegistrationResult) {
        return mergeFrom((co.wdns.grpc_demo.user_service.UserRegistrationResult)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(co.wdns.grpc_demo.user_service.UserRegistrationResult other) {
      if (other == co.wdns.grpc_demo.user_service.UserRegistrationResult.getDefaultInstance()) return this;
      switch (other.getRegistrationResultCase()) {
        case ACCESS_TOKEN: {
          mergeAccessToken(other.getAccessToken());
          break;
        }
        case REGISTRATION_FAILURE: {
          mergeRegistrationFailure(other.getRegistrationFailure());
          break;
        }
        case REGISTRATIONRESULT_NOT_SET: {
          break;
        }
      }
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
      co.wdns.grpc_demo.user_service.UserRegistrationResult parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (co.wdns.grpc_demo.user_service.UserRegistrationResult) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int registrationResultCase_ = 0;
    private java.lang.Object registrationResult_;
    public RegistrationResultCase
        getRegistrationResultCase() {
      return RegistrationResultCase.forNumber(
          registrationResultCase_);
    }

    public Builder clearRegistrationResult() {
      registrationResultCase_ = 0;
      registrationResult_ = null;
      onChanged();
      return this;
    }


    private com.google.protobuf.SingleFieldBuilderV3<
        co.wdns.grpc_demo.user_service.AccessToken, co.wdns.grpc_demo.user_service.AccessToken.Builder, co.wdns.grpc_demo.user_service.AccessTokenOrBuilder> accessTokenBuilder_;
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public boolean hasAccessToken() {
      return registrationResultCase_ == 1;
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public co.wdns.grpc_demo.user_service.AccessToken getAccessToken() {
      if (accessTokenBuilder_ == null) {
        if (registrationResultCase_ == 1) {
          return (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_;
        }
        return co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance();
      } else {
        if (registrationResultCase_ == 1) {
          return accessTokenBuilder_.getMessage();
        }
        return co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance();
      }
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public Builder setAccessToken(co.wdns.grpc_demo.user_service.AccessToken value) {
      if (accessTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registrationResult_ = value;
        onChanged();
      } else {
        accessTokenBuilder_.setMessage(value);
      }
      registrationResultCase_ = 1;
      return this;
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public Builder setAccessToken(
        co.wdns.grpc_demo.user_service.AccessToken.Builder builderForValue) {
      if (accessTokenBuilder_ == null) {
        registrationResult_ = builderForValue.build();
        onChanged();
      } else {
        accessTokenBuilder_.setMessage(builderForValue.build());
      }
      registrationResultCase_ = 1;
      return this;
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public Builder mergeAccessToken(co.wdns.grpc_demo.user_service.AccessToken value) {
      if (accessTokenBuilder_ == null) {
        if (registrationResultCase_ == 1 &&
            registrationResult_ != co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance()) {
          registrationResult_ = co.wdns.grpc_demo.user_service.AccessToken.newBuilder((co.wdns.grpc_demo.user_service.AccessToken) registrationResult_)
              .mergeFrom(value).buildPartial();
        } else {
          registrationResult_ = value;
        }
        onChanged();
      } else {
        if (registrationResultCase_ == 1) {
          accessTokenBuilder_.mergeFrom(value);
        }
        accessTokenBuilder_.setMessage(value);
      }
      registrationResultCase_ = 1;
      return this;
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public Builder clearAccessToken() {
      if (accessTokenBuilder_ == null) {
        if (registrationResultCase_ == 1) {
          registrationResultCase_ = 0;
          registrationResult_ = null;
          onChanged();
        }
      } else {
        if (registrationResultCase_ == 1) {
          registrationResultCase_ = 0;
          registrationResult_ = null;
        }
        accessTokenBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public co.wdns.grpc_demo.user_service.AccessToken.Builder getAccessTokenBuilder() {
      return getAccessTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    public co.wdns.grpc_demo.user_service.AccessTokenOrBuilder getAccessTokenOrBuilder() {
      if ((registrationResultCase_ == 1) && (accessTokenBuilder_ != null)) {
        return accessTokenBuilder_.getMessageOrBuilder();
      } else {
        if (registrationResultCase_ == 1) {
          return (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_;
        }
        return co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance();
      }
    }
    /**
     * <code>.user_service.AccessToken access_token = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        co.wdns.grpc_demo.user_service.AccessToken, co.wdns.grpc_demo.user_service.AccessToken.Builder, co.wdns.grpc_demo.user_service.AccessTokenOrBuilder> 
        getAccessTokenFieldBuilder() {
      if (accessTokenBuilder_ == null) {
        if (!(registrationResultCase_ == 1)) {
          registrationResult_ = co.wdns.grpc_demo.user_service.AccessToken.getDefaultInstance();
        }
        accessTokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            co.wdns.grpc_demo.user_service.AccessToken, co.wdns.grpc_demo.user_service.AccessToken.Builder, co.wdns.grpc_demo.user_service.AccessTokenOrBuilder>(
                (co.wdns.grpc_demo.user_service.AccessToken) registrationResult_,
                getParentForChildren(),
                isClean());
        registrationResult_ = null;
      }
      registrationResultCase_ = 1;
      onChanged();;
      return accessTokenBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
        co.wdns.grpc_demo.user_service.RegistrationFailure, co.wdns.grpc_demo.user_service.RegistrationFailure.Builder, co.wdns.grpc_demo.user_service.RegistrationFailureOrBuilder> registrationFailureBuilder_;
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public boolean hasRegistrationFailure() {
      return registrationResultCase_ == 2;
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public co.wdns.grpc_demo.user_service.RegistrationFailure getRegistrationFailure() {
      if (registrationFailureBuilder_ == null) {
        if (registrationResultCase_ == 2) {
          return (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_;
        }
        return co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance();
      } else {
        if (registrationResultCase_ == 2) {
          return registrationFailureBuilder_.getMessage();
        }
        return co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance();
      }
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public Builder setRegistrationFailure(co.wdns.grpc_demo.user_service.RegistrationFailure value) {
      if (registrationFailureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        registrationResult_ = value;
        onChanged();
      } else {
        registrationFailureBuilder_.setMessage(value);
      }
      registrationResultCase_ = 2;
      return this;
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public Builder setRegistrationFailure(
        co.wdns.grpc_demo.user_service.RegistrationFailure.Builder builderForValue) {
      if (registrationFailureBuilder_ == null) {
        registrationResult_ = builderForValue.build();
        onChanged();
      } else {
        registrationFailureBuilder_.setMessage(builderForValue.build());
      }
      registrationResultCase_ = 2;
      return this;
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public Builder mergeRegistrationFailure(co.wdns.grpc_demo.user_service.RegistrationFailure value) {
      if (registrationFailureBuilder_ == null) {
        if (registrationResultCase_ == 2 &&
            registrationResult_ != co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance()) {
          registrationResult_ = co.wdns.grpc_demo.user_service.RegistrationFailure.newBuilder((co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_)
              .mergeFrom(value).buildPartial();
        } else {
          registrationResult_ = value;
        }
        onChanged();
      } else {
        if (registrationResultCase_ == 2) {
          registrationFailureBuilder_.mergeFrom(value);
        }
        registrationFailureBuilder_.setMessage(value);
      }
      registrationResultCase_ = 2;
      return this;
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public Builder clearRegistrationFailure() {
      if (registrationFailureBuilder_ == null) {
        if (registrationResultCase_ == 2) {
          registrationResultCase_ = 0;
          registrationResult_ = null;
          onChanged();
        }
      } else {
        if (registrationResultCase_ == 2) {
          registrationResultCase_ = 0;
          registrationResult_ = null;
        }
        registrationFailureBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public co.wdns.grpc_demo.user_service.RegistrationFailure.Builder getRegistrationFailureBuilder() {
      return getRegistrationFailureFieldBuilder().getBuilder();
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    public co.wdns.grpc_demo.user_service.RegistrationFailureOrBuilder getRegistrationFailureOrBuilder() {
      if ((registrationResultCase_ == 2) && (registrationFailureBuilder_ != null)) {
        return registrationFailureBuilder_.getMessageOrBuilder();
      } else {
        if (registrationResultCase_ == 2) {
          return (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_;
        }
        return co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance();
      }
    }
    /**
     * <code>.user_service.RegistrationFailure registration_failure = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        co.wdns.grpc_demo.user_service.RegistrationFailure, co.wdns.grpc_demo.user_service.RegistrationFailure.Builder, co.wdns.grpc_demo.user_service.RegistrationFailureOrBuilder> 
        getRegistrationFailureFieldBuilder() {
      if (registrationFailureBuilder_ == null) {
        if (!(registrationResultCase_ == 2)) {
          registrationResult_ = co.wdns.grpc_demo.user_service.RegistrationFailure.getDefaultInstance();
        }
        registrationFailureBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            co.wdns.grpc_demo.user_service.RegistrationFailure, co.wdns.grpc_demo.user_service.RegistrationFailure.Builder, co.wdns.grpc_demo.user_service.RegistrationFailureOrBuilder>(
                (co.wdns.grpc_demo.user_service.RegistrationFailure) registrationResult_,
                getParentForChildren(),
                isClean());
        registrationResult_ = null;
      }
      registrationResultCase_ = 2;
      onChanged();;
      return registrationFailureBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:user_service.UserRegistrationResult)
  }

  // @@protoc_insertion_point(class_scope:user_service.UserRegistrationResult)
  private static final co.wdns.grpc_demo.user_service.UserRegistrationResult DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new co.wdns.grpc_demo.user_service.UserRegistrationResult();
  }

  public static co.wdns.grpc_demo.user_service.UserRegistrationResult getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserRegistrationResult>
      PARSER = new com.google.protobuf.AbstractParser<UserRegistrationResult>() {
    public UserRegistrationResult parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserRegistrationResult(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserRegistrationResult> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserRegistrationResult> getParserForType() {
    return PARSER;
  }

  public co.wdns.grpc_demo.user_service.UserRegistrationResult getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
