// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/helloworld.proto

package io.assalielmehdi.helloworld.grpc;

public interface HelloWorldResponseOrBuilder extends
  // @@protoc_insertion_point(interface_extends:helloworld.HelloWorldResponse)
  com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @return A list containing the messages.
   */
  java.util.List<java.lang.String>
  getMessagesList();

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @return The count of messages.
   */
  int getMessagesCount();

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  java.lang.String getMessages(int index);

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  com.google.protobuf.ByteString
  getMessagesBytes(int index);
}
