// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: main/proto/helloworld.proto

package io.assalielmehdi.helloworld.grpc;

/**
 * Protobuf type {@code helloworld.HelloWorldResponse}
 */
public final class HelloWorldResponse extends
  com.google.protobuf.GeneratedMessageV3 implements
  // @@protoc_insertion_point(message_implements:helloworld.HelloWorldResponse)
  HelloWorldResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use HelloWorldResponse.newBuilder() to construct.
  private HelloWorldResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private HelloWorldResponse() {
    messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
    UnusedPrivateParameter unused) {
    return new HelloWorldResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }

  private HelloWorldResponse(
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
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              messages_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            messages_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        messages_ = messages_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor
  getDescriptor() {
    return io.assalielmehdi.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloWorldResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return io.assalielmehdi.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloWorldResponse_fieldAccessorTable
      .ensureFieldAccessorsInitialized(
        io.assalielmehdi.helloworld.grpc.HelloWorldResponse.class, io.assalielmehdi.helloworld.grpc.HelloWorldResponse.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList messages_;

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @return A list containing the messages.
   */
  public com.google.protobuf.ProtocolStringList
  getMessagesList() {
    return messages_;
  }

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @return The count of messages.
   */
  public int getMessagesCount() {
    return messages_.size();
  }

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The messages at the given index.
   */
  public java.lang.String getMessages(int index) {
    return messages_.get(index);
  }

  /**
   * <code>repeated string messages = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the messages at the given index.
   */
  public com.google.protobuf.ByteString
  getMessagesBytes(int index) {
    return messages_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
    throws java.io.IOException {
    for (int i = 0; i < messages_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, messages_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < messages_.size(); i++) {
        dataSize += computeStringSizeNoTag(messages_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessagesList().size();
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
    if (!(obj instanceof io.assalielmehdi.helloworld.grpc.HelloWorldResponse)) {
      return super.equals(obj);
    }
    io.assalielmehdi.helloworld.grpc.HelloWorldResponse other = (io.assalielmehdi.helloworld.grpc.HelloWorldResponse) obj;

    if (!getMessagesList()
      .equals(other.getMessagesList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    java.nio.ByteBuffer data)
    throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    java.nio.ByteBuffer data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    com.google.protobuf.ByteString data)
    throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    com.google.protobuf.ByteString data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(byte[] data)
    throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    byte[] data,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(java.io.InputStream input)
    throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseDelimitedFrom(java.io.InputStream input)
    throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
      .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseDelimitedFrom(
    java.io.InputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
      .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    com.google.protobuf.CodedInputStream input)
    throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input);
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse parseFrom(
    com.google.protobuf.CodedInputStream input,
    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
    throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
      .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.assalielmehdi.helloworld.grpc.HelloWorldResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
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
   * Protobuf type {@code helloworld.HelloWorldResponse}
   */
  public static final class Builder extends
    com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
    // @@protoc_insertion_point(builder_implements:helloworld.HelloWorldResponse)
    io.assalielmehdi.helloworld.grpc.HelloWorldResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return io.assalielmehdi.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloWorldResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return io.assalielmehdi.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloWorldResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
          io.assalielmehdi.helloworld.grpc.HelloWorldResponse.class, io.assalielmehdi.helloworld.grpc.HelloWorldResponse.Builder.class);
    }

    // Construct using io.assalielmehdi.helloworld.grpc.HelloWorldResponse.newBuilder()
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

    @java.lang.Override
    public Builder clear() {
      super.clear();
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return io.assalielmehdi.helloworld.grpc.HelloWorldProto.internal_static_helloworld_HelloWorldResponse_descriptor;
    }

    @java.lang.Override
    public io.assalielmehdi.helloworld.grpc.HelloWorldResponse getDefaultInstanceForType() {
      return io.assalielmehdi.helloworld.grpc.HelloWorldResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.assalielmehdi.helloworld.grpc.HelloWorldResponse build() {
      io.assalielmehdi.helloworld.grpc.HelloWorldResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.assalielmehdi.helloworld.grpc.HelloWorldResponse buildPartial() {
      io.assalielmehdi.helloworld.grpc.HelloWorldResponse result = new io.assalielmehdi.helloworld.grpc.HelloWorldResponse(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        messages_ = messages_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.messages_ = messages_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
      com.google.protobuf.Descriptors.FieldDescriptor field,
      java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(
      com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(
      com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
      com.google.protobuf.Descriptors.FieldDescriptor field,
      int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
      com.google.protobuf.Descriptors.FieldDescriptor field,
      java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.assalielmehdi.helloworld.grpc.HelloWorldResponse) {
        return mergeFrom((io.assalielmehdi.helloworld.grpc.HelloWorldResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.assalielmehdi.helloworld.grpc.HelloWorldResponse other) {
      if (other == io.assalielmehdi.helloworld.grpc.HelloWorldResponse.getDefaultInstance()) return this;
      if (!other.messages_.isEmpty()) {
        if (messages_.isEmpty()) {
          messages_ = other.messages_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessagesIsMutable();
          messages_.addAll(other.messages_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
      io.assalielmehdi.helloworld.grpc.HelloWorldResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.assalielmehdi.helloworld.grpc.HelloWorldResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.LazyStringList messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;

    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new com.google.protobuf.LazyStringArrayList(messages_);
        bitField0_ |= 0x00000001;
      }
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @return A list containing the messages.
     */
    public com.google.protobuf.ProtocolStringList
    getMessagesList() {
      return messages_.getUnmodifiableView();
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @return The count of messages.
     */
    public int getMessagesCount() {
      return messages_.size();
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The messages at the given index.
     */
    public java.lang.String getMessages(int index) {
      return messages_.get(index);
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the messages at the given index.
     */
    public com.google.protobuf.ByteString
    getMessagesBytes(int index) {
      return messages_.getByteString(index);
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The messages to set.
     * @return This builder for chaining.
     */
    public Builder setMessages(
      int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMessagesIsMutable();
      messages_.set(index, value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @param value The messages to add.
     * @return This builder for chaining.
     */
    public Builder addMessages(
      java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @param values The messages to add.
     * @return This builder for chaining.
     */
    public Builder addAllMessages(
      java.lang.Iterable<java.lang.String> values) {
      ensureMessagesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
        values, messages_);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessages() {
      messages_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     * <code>repeated string messages = 1;</code>
     *
     * @param value The bytes of the messages to add.
     * @return This builder for chaining.
     */
    public Builder addMessagesBytes(
      com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMessagesIsMutable();
      messages_.add(value);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(
      final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
      final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:helloworld.HelloWorldResponse)
  }

  // @@protoc_insertion_point(class_scope:helloworld.HelloWorldResponse)
  private static final io.assalielmehdi.helloworld.grpc.HelloWorldResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.assalielmehdi.helloworld.grpc.HelloWorldResponse();
  }

  public static io.assalielmehdi.helloworld.grpc.HelloWorldResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HelloWorldResponse>
    PARSER = new com.google.protobuf.AbstractParser<HelloWorldResponse>() {
    @java.lang.Override
    public HelloWorldResponse parsePartialFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
      return new HelloWorldResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<HelloWorldResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HelloWorldResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.assalielmehdi.helloworld.grpc.HelloWorldResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

