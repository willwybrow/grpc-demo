// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-demo-protobuf/user_service.proto

package co.wdns.grpc_demo.user_service;

/**
 * Protobuf type {@code user_service.LogoutUserAttempt}
 */
public  final class LogoutUserAttempt extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:user_service.LogoutUserAttempt)
    LogoutUserAttemptOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LogoutUserAttempt.newBuilder() to construct.
  private LogoutUserAttempt(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LogoutUserAttempt() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LogoutUserAttempt(
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
            co.wdns.grpc_demo.user_service.AccessTokenId.Builder subBuilder = null;
            if (accessToken_ != null) {
              subBuilder = accessToken_.toBuilder();
            }
            accessToken_ = input.readMessage(co.wdns.grpc_demo.user_service.AccessTokenId.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(accessToken_);
              accessToken_ = subBuilder.buildPartial();
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
    return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LogoutUserAttempt_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LogoutUserAttempt_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            co.wdns.grpc_demo.user_service.LogoutUserAttempt.class, co.wdns.grpc_demo.user_service.LogoutUserAttempt.Builder.class);
  }

  public static final int ACCESS_TOKEN_FIELD_NUMBER = 1;
  private co.wdns.grpc_demo.user_service.AccessTokenId accessToken_;
  /**
   * <code>.user_service.AccessTokenId access_token = 1;</code>
   */
  public boolean hasAccessToken() {
    return accessToken_ != null;
  }
  /**
   * <code>.user_service.AccessTokenId access_token = 1;</code>
   */
  public co.wdns.grpc_demo.user_service.AccessTokenId getAccessToken() {
    return accessToken_ == null ? co.wdns.grpc_demo.user_service.AccessTokenId.getDefaultInstance() : accessToken_;
  }
  /**
   * <code>.user_service.AccessTokenId access_token = 1;</code>
   */
  public co.wdns.grpc_demo.user_service.AccessTokenIdOrBuilder getAccessTokenOrBuilder() {
    return getAccessToken();
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
    if (accessToken_ != null) {
      output.writeMessage(1, getAccessToken());
    }
    unknownFields.writeTo(output);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (accessToken_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAccessToken());
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
    if (!(obj instanceof co.wdns.grpc_demo.user_service.LogoutUserAttempt)) {
      return super.equals(obj);
    }
    co.wdns.grpc_demo.user_service.LogoutUserAttempt other = (co.wdns.grpc_demo.user_service.LogoutUserAttempt) obj;

    boolean result = true;
    result = result && (hasAccessToken() == other.hasAccessToken());
    if (hasAccessToken()) {
      result = result && getAccessToken()
          .equals(other.getAccessToken());
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
    if (hasAccessToken()) {
      hash = (37 * hash) + ACCESS_TOKEN_FIELD_NUMBER;
      hash = (53 * hash) + getAccessToken().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt parseFrom(
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
  public static Builder newBuilder(co.wdns.grpc_demo.user_service.LogoutUserAttempt prototype) {
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
   * Protobuf type {@code user_service.LogoutUserAttempt}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:user_service.LogoutUserAttempt)
      co.wdns.grpc_demo.user_service.LogoutUserAttemptOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LogoutUserAttempt_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LogoutUserAttempt_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.wdns.grpc_demo.user_service.LogoutUserAttempt.class, co.wdns.grpc_demo.user_service.LogoutUserAttempt.Builder.class);
    }

    // Construct using co.wdns.grpc_demo.user_service.LogoutUserAttempt.newBuilder()
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
      if (accessTokenBuilder_ == null) {
        accessToken_ = null;
      } else {
        accessToken_ = null;
        accessTokenBuilder_ = null;
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return co.wdns.grpc_demo.user_service.UserServiceProto.internal_static_user_service_LogoutUserAttempt_descriptor;
    }

    public co.wdns.grpc_demo.user_service.LogoutUserAttempt getDefaultInstanceForType() {
      return co.wdns.grpc_demo.user_service.LogoutUserAttempt.getDefaultInstance();
    }

    public co.wdns.grpc_demo.user_service.LogoutUserAttempt build() {
      co.wdns.grpc_demo.user_service.LogoutUserAttempt result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public co.wdns.grpc_demo.user_service.LogoutUserAttempt buildPartial() {
      co.wdns.grpc_demo.user_service.LogoutUserAttempt result = new co.wdns.grpc_demo.user_service.LogoutUserAttempt(this);
      if (accessTokenBuilder_ == null) {
        result.accessToken_ = accessToken_;
      } else {
        result.accessToken_ = accessTokenBuilder_.build();
      }
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
      if (other instanceof co.wdns.grpc_demo.user_service.LogoutUserAttempt) {
        return mergeFrom((co.wdns.grpc_demo.user_service.LogoutUserAttempt)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(co.wdns.grpc_demo.user_service.LogoutUserAttempt other) {
      if (other == co.wdns.grpc_demo.user_service.LogoutUserAttempt.getDefaultInstance()) return this;
      if (other.hasAccessToken()) {
        mergeAccessToken(other.getAccessToken());
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
      co.wdns.grpc_demo.user_service.LogoutUserAttempt parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (co.wdns.grpc_demo.user_service.LogoutUserAttempt) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private co.wdns.grpc_demo.user_service.AccessTokenId accessToken_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        co.wdns.grpc_demo.user_service.AccessTokenId, co.wdns.grpc_demo.user_service.AccessTokenId.Builder, co.wdns.grpc_demo.user_service.AccessTokenIdOrBuilder> accessTokenBuilder_;
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public boolean hasAccessToken() {
      return accessTokenBuilder_ != null || accessToken_ != null;
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public co.wdns.grpc_demo.user_service.AccessTokenId getAccessToken() {
      if (accessTokenBuilder_ == null) {
        return accessToken_ == null ? co.wdns.grpc_demo.user_service.AccessTokenId.getDefaultInstance() : accessToken_;
      } else {
        return accessTokenBuilder_.getMessage();
      }
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public Builder setAccessToken(co.wdns.grpc_demo.user_service.AccessTokenId value) {
      if (accessTokenBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accessToken_ = value;
        onChanged();
      } else {
        accessTokenBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public Builder setAccessToken(
        co.wdns.grpc_demo.user_service.AccessTokenId.Builder builderForValue) {
      if (accessTokenBuilder_ == null) {
        accessToken_ = builderForValue.build();
        onChanged();
      } else {
        accessTokenBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public Builder mergeAccessToken(co.wdns.grpc_demo.user_service.AccessTokenId value) {
      if (accessTokenBuilder_ == null) {
        if (accessToken_ != null) {
          accessToken_ =
            co.wdns.grpc_demo.user_service.AccessTokenId.newBuilder(accessToken_).mergeFrom(value).buildPartial();
        } else {
          accessToken_ = value;
        }
        onChanged();
      } else {
        accessTokenBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public Builder clearAccessToken() {
      if (accessTokenBuilder_ == null) {
        accessToken_ = null;
        onChanged();
      } else {
        accessToken_ = null;
        accessTokenBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public co.wdns.grpc_demo.user_service.AccessTokenId.Builder getAccessTokenBuilder() {
      
      onChanged();
      return getAccessTokenFieldBuilder().getBuilder();
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    public co.wdns.grpc_demo.user_service.AccessTokenIdOrBuilder getAccessTokenOrBuilder() {
      if (accessTokenBuilder_ != null) {
        return accessTokenBuilder_.getMessageOrBuilder();
      } else {
        return accessToken_ == null ?
            co.wdns.grpc_demo.user_service.AccessTokenId.getDefaultInstance() : accessToken_;
      }
    }
    /**
     * <code>.user_service.AccessTokenId access_token = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        co.wdns.grpc_demo.user_service.AccessTokenId, co.wdns.grpc_demo.user_service.AccessTokenId.Builder, co.wdns.grpc_demo.user_service.AccessTokenIdOrBuilder> 
        getAccessTokenFieldBuilder() {
      if (accessTokenBuilder_ == null) {
        accessTokenBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            co.wdns.grpc_demo.user_service.AccessTokenId, co.wdns.grpc_demo.user_service.AccessTokenId.Builder, co.wdns.grpc_demo.user_service.AccessTokenIdOrBuilder>(
                getAccessToken(),
                getParentForChildren(),
                isClean());
        accessToken_ = null;
      }
      return accessTokenBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:user_service.LogoutUserAttempt)
  }

  // @@protoc_insertion_point(class_scope:user_service.LogoutUserAttempt)
  private static final co.wdns.grpc_demo.user_service.LogoutUserAttempt DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new co.wdns.grpc_demo.user_service.LogoutUserAttempt();
  }

  public static co.wdns.grpc_demo.user_service.LogoutUserAttempt getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LogoutUserAttempt>
      PARSER = new com.google.protobuf.AbstractParser<LogoutUserAttempt>() {
    public LogoutUserAttempt parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LogoutUserAttempt(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LogoutUserAttempt> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LogoutUserAttempt> getParserForType() {
    return PARSER;
  }

  public co.wdns.grpc_demo.user_service.LogoutUserAttempt getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

