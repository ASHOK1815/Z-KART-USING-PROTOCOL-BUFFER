// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Schema.proto

package proto.example.Schema;

/**
 * Protobuf type {@code Orders}
 */
public final class Orders extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Orders)
    OrdersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Orders.newBuilder() to construct.
  private Orders(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Orders() {
    orders_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Orders();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Orders(
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
              orders_ = new java.util.ArrayList<proto.example.Schema.Order>();
              mutable_bitField0_ |= 0x00000001;
            }
            orders_.add(
                input.readMessage(proto.example.Schema.Order.parser(), extensionRegistry));
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
        orders_ = java.util.Collections.unmodifiableList(orders_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.example.Schema.SchemaProtos.internal_static_Orders_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.example.Schema.SchemaProtos.internal_static_Orders_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.example.Schema.Orders.class, proto.example.Schema.Orders.Builder.class);
  }

  public static final int ORDERS_FIELD_NUMBER = 1;
  private java.util.List<proto.example.Schema.Order> orders_;
  /**
   * <code>repeated .Order orders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.example.Schema.Order> getOrdersList() {
    return orders_;
  }
  /**
   * <code>repeated .Order orders = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.example.Schema.OrderOrBuilder> 
      getOrdersOrBuilderList() {
    return orders_;
  }
  /**
   * <code>repeated .Order orders = 1;</code>
   */
  @java.lang.Override
  public int getOrdersCount() {
    return orders_.size();
  }
  /**
   * <code>repeated .Order orders = 1;</code>
   */
  @java.lang.Override
  public proto.example.Schema.Order getOrders(int index) {
    return orders_.get(index);
  }
  /**
   * <code>repeated .Order orders = 1;</code>
   */
  @java.lang.Override
  public proto.example.Schema.OrderOrBuilder getOrdersOrBuilder(
      int index) {
    return orders_.get(index);
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
    for (int i = 0; i < orders_.size(); i++) {
      output.writeMessage(1, orders_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < orders_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, orders_.get(i));
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
    if (!(obj instanceof proto.example.Schema.Orders)) {
      return super.equals(obj);
    }
    proto.example.Schema.Orders other = (proto.example.Schema.Orders) obj;

    if (!getOrdersList()
        .equals(other.getOrdersList())) return false;
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
    if (getOrdersCount() > 0) {
      hash = (37 * hash) + ORDERS_FIELD_NUMBER;
      hash = (53 * hash) + getOrdersList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.example.Schema.Orders parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Orders parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Orders parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Orders parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Orders parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Orders parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Orders parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Orders parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.Orders parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Orders parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.Orders parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Orders parseFrom(
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
  public static Builder newBuilder(proto.example.Schema.Orders prototype) {
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
   * Protobuf type {@code Orders}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Orders)
      proto.example.Schema.OrdersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.example.Schema.SchemaProtos.internal_static_Orders_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.example.Schema.SchemaProtos.internal_static_Orders_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.example.Schema.Orders.class, proto.example.Schema.Orders.Builder.class);
    }

    // Construct using proto.example.Schema.Orders.newBuilder()
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
        getOrdersFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.example.Schema.SchemaProtos.internal_static_Orders_descriptor;
    }

    @java.lang.Override
    public proto.example.Schema.Orders getDefaultInstanceForType() {
      return proto.example.Schema.Orders.getDefaultInstance();
    }

    @java.lang.Override
    public proto.example.Schema.Orders build() {
      proto.example.Schema.Orders result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.example.Schema.Orders buildPartial() {
      proto.example.Schema.Orders result = new proto.example.Schema.Orders(this);
      int from_bitField0_ = bitField0_;
      if (ordersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          orders_ = java.util.Collections.unmodifiableList(orders_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.orders_ = orders_;
      } else {
        result.orders_ = ordersBuilder_.build();
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
      if (other instanceof proto.example.Schema.Orders) {
        return mergeFrom((proto.example.Schema.Orders)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.example.Schema.Orders other) {
      if (other == proto.example.Schema.Orders.getDefaultInstance()) return this;
      if (ordersBuilder_ == null) {
        if (!other.orders_.isEmpty()) {
          if (orders_.isEmpty()) {
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOrdersIsMutable();
            orders_.addAll(other.orders_);
          }
          onChanged();
        }
      } else {
        if (!other.orders_.isEmpty()) {
          if (ordersBuilder_.isEmpty()) {
            ordersBuilder_.dispose();
            ordersBuilder_ = null;
            orders_ = other.orders_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ordersBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getOrdersFieldBuilder() : null;
          } else {
            ordersBuilder_.addAllMessages(other.orders_);
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
      proto.example.Schema.Orders parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.example.Schema.Orders) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.example.Schema.Order> orders_ =
      java.util.Collections.emptyList();
    private void ensureOrdersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        orders_ = new java.util.ArrayList<proto.example.Schema.Order>(orders_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.Order, proto.example.Schema.Order.Builder, proto.example.Schema.OrderOrBuilder> ordersBuilder_;

    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public java.util.List<proto.example.Schema.Order> getOrdersList() {
      if (ordersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(orders_);
      } else {
        return ordersBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public int getOrdersCount() {
      if (ordersBuilder_ == null) {
        return orders_.size();
      } else {
        return ordersBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public proto.example.Schema.Order getOrders(int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);
      } else {
        return ordersBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder setOrders(
        int index, proto.example.Schema.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.set(index, value);
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder setOrders(
        int index, proto.example.Schema.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.set(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder addOrders(proto.example.Schema.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder addOrders(
        int index, proto.example.Schema.Order value) {
      if (ordersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOrdersIsMutable();
        orders_.add(index, value);
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder addOrders(
        proto.example.Schema.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder addOrders(
        int index, proto.example.Schema.Order.Builder builderForValue) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.add(index, builderForValue.build());
        onChanged();
      } else {
        ordersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder addAllOrders(
        java.lang.Iterable<? extends proto.example.Schema.Order> values) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, orders_);
        onChanged();
      } else {
        ordersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder clearOrders() {
      if (ordersBuilder_ == null) {
        orders_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ordersBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public Builder removeOrders(int index) {
      if (ordersBuilder_ == null) {
        ensureOrdersIsMutable();
        orders_.remove(index);
        onChanged();
      } else {
        ordersBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public proto.example.Schema.Order.Builder getOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public proto.example.Schema.OrderOrBuilder getOrdersOrBuilder(
        int index) {
      if (ordersBuilder_ == null) {
        return orders_.get(index);  } else {
        return ordersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public java.util.List<? extends proto.example.Schema.OrderOrBuilder> 
         getOrdersOrBuilderList() {
      if (ordersBuilder_ != null) {
        return ordersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(orders_);
      }
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public proto.example.Schema.Order.Builder addOrdersBuilder() {
      return getOrdersFieldBuilder().addBuilder(
          proto.example.Schema.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public proto.example.Schema.Order.Builder addOrdersBuilder(
        int index) {
      return getOrdersFieldBuilder().addBuilder(
          index, proto.example.Schema.Order.getDefaultInstance());
    }
    /**
     * <code>repeated .Order orders = 1;</code>
     */
    public java.util.List<proto.example.Schema.Order.Builder> 
         getOrdersBuilderList() {
      return getOrdersFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.Order, proto.example.Schema.Order.Builder, proto.example.Schema.OrderOrBuilder> 
        getOrdersFieldBuilder() {
      if (ordersBuilder_ == null) {
        ordersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.example.Schema.Order, proto.example.Schema.Order.Builder, proto.example.Schema.OrderOrBuilder>(
                orders_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        orders_ = null;
      }
      return ordersBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Orders)
  }

  // @@protoc_insertion_point(class_scope:Orders)
  private static final proto.example.Schema.Orders DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.example.Schema.Orders();
  }

  public static proto.example.Schema.Orders getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Orders>
      PARSER = new com.google.protobuf.AbstractParser<Orders>() {
    @java.lang.Override
    public Orders parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Orders(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Orders> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Orders> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.example.Schema.Orders getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
