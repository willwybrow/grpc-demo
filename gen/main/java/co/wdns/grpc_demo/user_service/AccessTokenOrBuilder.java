// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-demo-protobuf/user_service.proto

package co.wdns.grpc_demo.user_service;

public interface AccessTokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:user_service.AccessToken)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.user_service.AccessTokenId id = 1;</code>
   */
  boolean hasId();
  /**
   * <code>.user_service.AccessTokenId id = 1;</code>
   */
  co.wdns.grpc_demo.user_service.AccessTokenId getId();
  /**
   * <code>.user_service.AccessTokenId id = 1;</code>
   */
  co.wdns.grpc_demo.user_service.AccessTokenIdOrBuilder getIdOrBuilder();

  /**
   * <code>.UserId user_id = 2;</code>
   */
  boolean hasUserId();
  /**
   * <code>.UserId user_id = 2;</code>
   */
  co.wdns.grpc_demo.common.UserId getUserId();
  /**
   * <code>.UserId user_id = 2;</code>
   */
  co.wdns.grpc_demo.common.UserIdOrBuilder getUserIdOrBuilder();

  /**
   * <code>uint64 expires = 3;</code>
   */
  long getExpires();

  /**
   * <code>repeated string scope = 4;</code>
   */
  java.util.List<java.lang.String>
      getScopeList();
  /**
   * <code>repeated string scope = 4;</code>
   */
  int getScopeCount();
  /**
   * <code>repeated string scope = 4;</code>
   */
  java.lang.String getScope(int index);
  /**
   * <code>repeated string scope = 4;</code>
   */
  com.google.protobuf.ByteString
      getScopeBytes(int index);

  /**
   * <code>repeated .user_service.Claim claims = 5;</code>
   */
  java.util.List<co.wdns.grpc_demo.user_service.Claim> 
      getClaimsList();
  /**
   * <code>repeated .user_service.Claim claims = 5;</code>
   */
  co.wdns.grpc_demo.user_service.Claim getClaims(int index);
  /**
   * <code>repeated .user_service.Claim claims = 5;</code>
   */
  int getClaimsCount();
  /**
   * <code>repeated .user_service.Claim claims = 5;</code>
   */
  java.util.List<? extends co.wdns.grpc_demo.user_service.ClaimOrBuilder> 
      getClaimsOrBuilderList();
  /**
   * <code>repeated .user_service.Claim claims = 5;</code>
   */
  co.wdns.grpc_demo.user_service.ClaimOrBuilder getClaimsOrBuilder(
      int index);
}
