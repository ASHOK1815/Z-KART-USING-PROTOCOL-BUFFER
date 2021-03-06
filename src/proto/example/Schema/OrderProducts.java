// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Schema.proto

package proto.example.Schema;

/**
 * Protobuf type {@code OrderProducts}
 */
public final class OrderProducts extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:OrderProducts)
    OrderProductsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use OrderProducts.newBuilder() to construct.
  private OrderProducts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private OrderProducts() {
    orderProducts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new OrderProducts();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private OrderProducts(
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
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              orderProducts_ = new java.util.ArrayList<proto.example.Schema.OrderProduct>();
              mutable_bitField0_ |= 0x00000001;
            }
            orderProducts_.add(
                input.readMessage(proto.example.Schema.OrderProduct.parser(), extensionRegistry));
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
        orderProducts_ = java.util.Collections.unmodifiableList(orderProducts_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.example.Schema.SchemaProtos.internal_static_OrderProducts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.example.Schema.SchemaProtos.internal_static_OrderProducts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.example.Schema.OrderProducts.class, proto.example.Schema.OrderProducts.Builder.class);
  }

  public static final int ORDERPRODUCTS_FIELD_NUMBER = 1;
  private java.util.List<proto.example.Schema.OrderProduct> orderProducts_;
  /**
   * <code>repeated .OrderProduct orderProducts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.example.Schema.OrderProduct> getOrderProductsList() {
    return orderProducts_;
  }
  /**
   * <code>repeated .OrderProduct orderProducts = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.example.Schema.OrderProductOrBuilder> 
      getOrderProductsOrBuilderList() {
    return orderProducts_;
  }
  /**
   * <code>repeated .OrderProduct orderProducts = 1;</code>
   */
  @java.lang.Override
  public int getOrderProductsCount() {
    return orderProducts_.size();
  }
  /**
   * <code>repeated .OrderProduct orderProducts = 1;</code>
   */
  @java.lang.Override
  public proto.example.Schema.OrderProduct getOrderProducts(int index) {
    return orderProducts_.get(index);
  }
  /**
   * <code>repeated .OrderProduct orderProducts = 1;</code>
   */
  @java.lang.Override
  public proto.example.Schema.OrderProductOrBuilder getOrderProductsOrBuilder(
      int index) {
    return orderProducts_.get(index);
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
    for (int i = 0; i < orderProducts_.size(); i++) {
      output.writeMessage(1, orderProducts_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orderProducts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, orderProducts_.get(i));
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
    if (!(obj instanceof proto.example.Schema.OrderProducts)) {
      return super.equals(obj);
    }
    proto.example.Schema.OrderProducts other = (proto.example.Schema.OrderProducts) obj;

    if (!getOrderProductsList()
        .equals(other.getOrderProductsList())) return false;
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
    if (getOrderProductsCount() > 0) {
      hash = (37 * hash) + ORDERPRODUCTS_FIELD_NUMBER;
      hash = (53 * hash) + getOrderProductsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.example.Schema.OrderProducts parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.OrderProducts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.OrderProducts parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.OrderProducts parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.example.Schema.OrderProducts parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.OrderProducts parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(proto.example.Schema.OrderProducts prototype) {
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
   * Protobuf type {@code OrderProducts}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:OrderProducts)
      proto.example.Schema.OrderProductsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.example.Schema.SchemaProtos.internal_static_OrderProducts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.example.Schema.SchemaProtos.internal_static_OrderProducts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.example.Schema.OrderProducts.class, proto.example.Schema.OrderProducts.Builder.class);
    }

    // Construct using proto.example.Schema.OrderProducts.newBuilder()
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
        getOrderProductsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (orderProductsBuilder_ == null) {
        orderProducts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        orderProductsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.example.Schema.SchemaProtos.internal_static_OrderProducts_descriptor;
    }

    @java.lang.Override
    public proto.example.Schema.OrderProducts getDefaultInstanceForType() {
      return proto.example.Schema.OrderProducts.getDefaultInstance();
    }

    @java.lang.Override
    public proto.example.Schema.OrderProducts build() {
      proto.example.Schema.OrderProducts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.example.Schema.OrderProducts buildPartial() {
      proto.example.Schema.OrderProducts result = new proto.example.Schema.OrderProducts(this);
      int from_bitField0_ = bitField0_;
      if (orderProductsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          orderProducts_ = java.util.Collections.unmodifiableList(orderProducts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orderProducts_ = orderProducts_;
      } else {
        result.orderProducts_ = orderProductsBuilder_.build();
      }
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
      if (other instanceof proto.example.Schema.OrderProducts) {
        return mergeFrom((proto.example.Schema.OrderProducts)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.example.Schema.OrderProducts other) {
      if (other == proto.example.Schema.OrderProducts.getDefaultInstance()) return this;
      if (orderProductsBuilder_ == null) {
        if (!other.orderProducts_.isEmpty()) {
          if (orderProducts_.isEmpty()) {
            orderProducts_ = other.orderProducts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrderProductsIsMutable();
            orderProducts_.addAll(other.orderProducts_);
          }
          onChanged();
        }
      } else {
        if (!other.orderProducts_.isEmpty()) {
          if (orderProductsBuilder_.isEmpty()) {
            orderProductsBuilder_.dispose();
            orderProductsBuilder_ = null;
            orderProducts_ = other.orderProducts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            orderProductsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrderProductsFieldBuilder() : null;
          } else {
            orderProductsBuilder_.addAllMessages(other.orderProducts_);
          }
        }
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
      proto.example.Schema.OrderProducts parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.example.Schema.OrderProducts) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.example.Schema.OrderProduct> orderProducts_ =
      java.util.Collections.emptyList();
    private void ensureOrderProductsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orderProducts_ = new java.util.ArrayList<proto.example.Schema.OrderProduct>(orderProducts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.OrderProduct, proto.example.Schema.OrderProduct.Builder, proto.example.Schema.OrderProductOrBuilder> orderProductsBuilder_;

    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public java.util.List<proto.example.Schema.OrderProduct> getOrderProductsList() {
      if (orderProductsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orderProducts_);
      } else {
        return orderProductsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public int getOrderProductsCount() {
      if (orderProductsBuilder_ == null) {
        return orderProducts_.size();
      } else {
        return orderProductsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public proto.example.Schema.OrderProduct getOrderProducts(int index) {
      if (orderProductsBuilder_ == null) {
        return orderProducts_.get(index);
      } else {
        return orderProductsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder setOrderProducts(
        int index, proto.example.Schema.OrderProduct value) {
      if (orderProductsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderProductsIsMutable();
        orderProducts_.set(index, value);
        onChanged();
      } else {
        orderProductsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder setOrderProducts(
        int index, proto.example.Schema.OrderProduct.Builder builderForValue) {
      if (orderProductsBuilder_ == null) {
        ensureOrderProductsIsMutable();
        orderProducts_.set(index, builderForValue.build());
        onChanged();
      } else {
        orderProductsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder addOrderProducts(proto.example.Schema.OrderProduct value) {
      if (orderProductsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderProductsIsMutable();
        orderProducts_.add(value);
        onChanged();
      } else {
        orderProductsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder addOrderProducts(
        int index, proto.example.Schema.OrderProduct value) {
      if (orderProductsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrderProductsIsMutable();
        orderProducts_.add(index, value);
        onChanged();
      } else {
        orderProductsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder addOrderProducts(
        proto.example.Schema.OrderProduct.Builder builderForValue) {
      if (orderProductsBuilder_ == null) {
        ensureOrderProductsIsMutable();
        orderProducts_.add(builderForValue.build());
        onChanged();
      } else {
        orderProductsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder addOrderProducts(
        int index, proto.example.Schema.OrderProduct.Builder builderForValue) {
      if (orderProductsBuilder_ == null) {
        ensureOrderProductsIsMutable();
        orderProducts_.add(index, builderForValue.build());
        onChanged();
      } else {
        orderProductsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder addAllOrderProducts(
        java.lang.Iterable<? extends proto.example.Schema.OrderProduct> values) {
      if (orderProductsBuilder_ == null) {
        ensureOrderProductsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orderProducts_);
        onChanged();
      } else {
        orderProductsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder clearOrderProducts() {
      if (orderProductsBuilder_ == null) {
        orderProducts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        orderProductsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public Builder removeOrderProducts(int index) {
      if (orderProductsBuilder_ == null) {
        ensureOrderProductsIsMutable();
        orderProducts_.remove(index);
        onChanged();
      } else {
        orderProductsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public proto.example.Schema.OrderProduct.Builder getOrderProductsBuilder(
        int index) {
      return getOrderProductsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public proto.example.Schema.OrderProductOrBuilder getOrderProductsOrBuilder(
        int index) {
      if (orderProductsBuilder_ == null) {
        return orderProducts_.get(index);  } else {
        return orderProductsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public java.util.List<? extends proto.example.Schema.OrderProductOrBuilder> 
         getOrderProductsOrBuilderList() {
      if (orderProductsBuilder_ != null) {
        return orderProductsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orderProducts_);
      }
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public proto.example.Schema.OrderProduct.Builder addOrderProductsBuilder() {
      return getOrderProductsFieldBuilder().addBuilder(
          proto.example.Schema.OrderProduct.getDefaultInstance());
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public proto.example.Schema.OrderProduct.Builder addOrderProductsBuilder(
        int index) {
      return getOrderProductsFieldBuilder().addBuilder(
          index, proto.example.Schema.OrderProduct.getDefaultInstance());
    }
    /**
     * <code>repeated .OrderProduct orderProducts = 1;</code>
     */
    public java.util.List<proto.example.Schema.OrderProduct.Builder> 
         getOrderProductsBuilderList() {
      return getOrderProductsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.OrderProduct, proto.example.Schema.OrderProduct.Builder, proto.example.Schema.OrderProductOrBuilder> 
        getOrderProductsFieldBuilder() {
      if (orderProductsBuilder_ == null) {
        orderProductsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.example.Schema.OrderProduct, proto.example.Schema.OrderProduct.Builder, proto.example.Schema.OrderProductOrBuilder>(
                orderProducts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        orderProducts_ = null;
      }
      return orderProductsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:OrderProducts)
  }

  // @@protoc_insertion_point(class_scope:OrderProducts)
  private static final proto.example.Schema.OrderProducts DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.example.Schema.OrderProducts();
  }

  public static proto.example.Schema.OrderProducts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OrderProducts>
      PARSER = new com.google.protobuf.AbstractParser<OrderProducts>() {
    @java.lang.Override
    public OrderProducts parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new OrderProducts(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<OrderProducts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OrderProducts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.example.Schema.OrderProducts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

