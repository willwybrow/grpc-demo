// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc-demo-protobuf/risk_engine.proto

package co.wdns.grpc_demo.risk_engine;

public interface UserManagementRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:risk_engine.UserManagementRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.UserId block_user_id = 1;</code>
   */
  boolean hasBlockUserId();
  /**
   * <code>.UserId block_user_id = 1;</code>
   */
  co.wdns.grpc_demo.common.UserId getBlockUserId();
  /**
   * <code>.UserId block_user_id = 1;</code>
   */
  co.wdns.grpc_demo.common.UserIdOrBuilder getBlockUserIdOrBuilder();

  /**
   * <code>.UserId unblock_user_id = 2;</code>
   */
  boolean hasUnblockUserId();
  /**
   * <code>.UserId unblock_user_id = 2;</code>
   */
  co.wdns.grpc_demo.common.UserId getUnblockUserId();
  /**
   * <code>.UserId unblock_user_id = 2;</code>
   */
  co.wdns.grpc_demo.common.UserIdOrBuilder getUnblockUserIdOrBuilder();

  public co.wdns.grpc_demo.risk_engine.UserManagementRequest.BlockOrUnblockCase getBlockOrUnblockCase();
}
