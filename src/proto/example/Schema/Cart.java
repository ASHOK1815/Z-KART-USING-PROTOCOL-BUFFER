// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Schema.proto

package proto.example.Schema;

/**
 * Protobuf type {@code Cart}
 */
public final class Cart extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:Cart)
    CartOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Cart.newBuilder() to construct.
  private Cart(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Cart() {
    cartItems_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Cart();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Cart(
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
              cartItems_ = new java.util.ArrayList<proto.example.Schema.CartItem>();
              mutable_bitField0_ |= 0x00000001;
            }
            cartItems_.add(
                input.readMessage(proto.example.Schema.CartItem.parser(), extensionRegistry));
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
        cartItems_ = java.util.Collections.unmodifiableList(cartItems_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return proto.example.Schema.SchemaProtos.internal_static_Cart_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return proto.example.Schema.SchemaProtos.internal_static_Cart_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            proto.example.Schema.Cart.class, proto.example.Schema.Cart.Builder.class);
  }

  public static final int CARTITEMS_FIELD_NUMBER = 1;
  private java.util.List<proto.example.Schema.CartItem> cartItems_;
  /**
   * <code>repeated .CartItem cartItems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<proto.example.Schema.CartItem> getCartItemsList() {
    return cartItems_;
  }
  /**
   * <code>repeated .CartItem cartItems = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends proto.example.Schema.CartItemOrBuilder> 
      getCartItemsOrBuilderList() {
    return cartItems_;
  }
  /**
   * <code>repeated .CartItem cartItems = 1;</code>
   */
  @java.lang.Override
  public int getCartItemsCount() {
    return cartItems_.size();
  }
  /**
   * <code>repeated .CartItem cartItems = 1;</code>
   */
  @java.lang.Override
  public proto.example.Schema.CartItem getCartItems(int index) {
    return cartItems_.get(index);
  }
  /**
   * <code>repeated .CartItem cartItems = 1;</code>
   */
  @java.lang.Override
  public proto.example.Schema.CartItemOrBuilder getCartItemsOrBuilder(
      int index) {
    return cartItems_.get(index);
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
    for (int i = 0; i < cartItems_.size(); i++) {
      output.writeMessage(1, cartItems_.get(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cartItems_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cartItems_.get(i));
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
    if (!(obj instanceof proto.example.Schema.Cart)) {
      return super.equals(obj);
    }
    proto.example.Schema.Cart other = (proto.example.Schema.Cart) obj;

    if (!getCartItemsList()
        .equals(other.getCartItemsList())) return false;
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
    if (getCartItemsCount() > 0) {
      hash = (37 * hash) + CARTITEMS_FIELD_NUMBER;
      hash = (53 * hash) + getCartItemsList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static proto.example.Schema.Cart parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Cart parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Cart parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Cart parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Cart parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static proto.example.Schema.Cart parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static proto.example.Schema.Cart parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Cart parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.Cart parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Cart parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static proto.example.Schema.Cart parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static proto.example.Schema.Cart parseFrom(
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
  public static Builder newBuilder(proto.example.Schema.Cart prototype) {
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
   * Protobuf type {@code Cart}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Cart)
      proto.example.Schema.CartOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return proto.example.Schema.SchemaProtos.internal_static_Cart_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return proto.example.Schema.SchemaProtos.internal_static_Cart_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              proto.example.Schema.Cart.class, proto.example.Schema.Cart.Builder.class);
    }

    // Construct using proto.example.Schema.Cart.newBuilder()
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
        getCartItemsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (cartItemsBuilder_ == null) {
        cartItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        cartItemsBuilder_.clear();
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return proto.example.Schema.SchemaProtos.internal_static_Cart_descriptor;
    }

    @java.lang.Override
    public proto.example.Schema.Cart getDefaultInstanceForType() {
      return proto.example.Schema.Cart.getDefaultInstance();
    }

    @java.lang.Override
    public proto.example.Schema.Cart build() {
      proto.example.Schema.Cart result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public proto.example.Schema.Cart buildPartial() {
      proto.example.Schema.Cart result = new proto.example.Schema.Cart(this);
      int from_bitField0_ = bitField0_;
      if (cartItemsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cartItems_ = java.util.Collections.unmodifiableList(cartItems_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cartItems_ = cartItems_;
      } else {
        result.cartItems_ = cartItemsBuilder_.build();
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
      if (other instanceof proto.example.Schema.Cart) {
        return mergeFrom((proto.example.Schema.Cart)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(proto.example.Schema.Cart other) {
      if (other == proto.example.Schema.Cart.getDefaultInstance()) return this;
      if (cartItemsBuilder_ == null) {
        if (!other.cartItems_.isEmpty()) {
          if (cartItems_.isEmpty()) {
            cartItems_ = other.cartItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCartItemsIsMutable();
            cartItems_.addAll(other.cartItems_);
          }
          onChanged();
        }
      } else {
        if (!other.cartItems_.isEmpty()) {
          if (cartItemsBuilder_.isEmpty()) {
            cartItemsBuilder_.dispose();
            cartItemsBuilder_ = null;
            cartItems_ = other.cartItems_;
            bitField0_ = (bitField0_ & ~0x00000001);
            cartItemsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getCartItemsFieldBuilder() : null;
          } else {
            cartItemsBuilder_.addAllMessages(other.cartItems_);
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
      proto.example.Schema.Cart parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (proto.example.Schema.Cart) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<proto.example.Schema.CartItem> cartItems_ =
      java.util.Collections.emptyList();
    private void ensureCartItemsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cartItems_ = new java.util.ArrayList<proto.example.Schema.CartItem>(cartItems_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.CartItem, proto.example.Schema.CartItem.Builder, proto.example.Schema.CartItemOrBuilder> cartItemsBuilder_;

    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public java.util.List<proto.example.Schema.CartItem> getCartItemsList() {
      if (cartItemsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cartItems_);
      } else {
        return cartItemsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public int getCartItemsCount() {
      if (cartItemsBuilder_ == null) {
        return cartItems_.size();
      } else {
        return cartItemsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public proto.example.Schema.CartItem getCartItems(int index) {
      if (cartItemsBuilder_ == null) {
        return cartItems_.get(index);
      } else {
        return cartItemsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder setCartItems(
        int index, proto.example.Schema.CartItem value) {
      if (cartItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCartItemsIsMutable();
        cartItems_.set(index, value);
        onChanged();
      } else {
        cartItemsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder setCartItems(
        int index, proto.example.Schema.CartItem.Builder builderForValue) {
      if (cartItemsBuilder_ == null) {
        ensureCartItemsIsMutable();
        cartItems_.set(index, builderForValue.build());
        onChanged();
      } else {
        cartItemsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder addCartItems(proto.example.Schema.CartItem value) {
      if (cartItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCartItemsIsMutable();
        cartItems_.add(value);
        onChanged();
      } else {
        cartItemsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder addCartItems(
        int index, proto.example.Schema.CartItem value) {
      if (cartItemsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCartItemsIsMutable();
        cartItems_.add(index, value);
        onChanged();
      } else {
        cartItemsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder addCartItems(
        proto.example.Schema.CartItem.Builder builderForValue) {
      if (cartItemsBuilder_ == null) {
        ensureCartItemsIsMutable();
        cartItems_.add(builderForValue.build());
        onChanged();
      } else {
        cartItemsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder addCartItems(
        int index, proto.example.Schema.CartItem.Builder builderForValue) {
      if (cartItemsBuilder_ == null) {
        ensureCartItemsIsMutable();
        cartItems_.add(index, builderForValue.build());
        onChanged();
      } else {
        cartItemsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder addAllCartItems(
        java.lang.Iterable<? extends proto.example.Schema.CartItem> values) {
      if (cartItemsBuilder_ == null) {
        ensureCartItemsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cartItems_);
        onChanged();
      } else {
        cartItemsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder clearCartItems() {
      if (cartItemsBuilder_ == null) {
        cartItems_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        cartItemsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public Builder removeCartItems(int index) {
      if (cartItemsBuilder_ == null) {
        ensureCartItemsIsMutable();
        cartItems_.remove(index);
        onChanged();
      } else {
        cartItemsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public proto.example.Schema.CartItem.Builder getCartItemsBuilder(
        int index) {
      return getCartItemsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public proto.example.Schema.CartItemOrBuilder getCartItemsOrBuilder(
        int index) {
      if (cartItemsBuilder_ == null) {
        return cartItems_.get(index);  } else {
        return cartItemsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public java.util.List<? extends proto.example.Schema.CartItemOrBuilder> 
         getCartItemsOrBuilderList() {
      if (cartItemsBuilder_ != null) {
        return cartItemsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cartItems_);
      }
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public proto.example.Schema.CartItem.Builder addCartItemsBuilder() {
      return getCartItemsFieldBuilder().addBuilder(
          proto.example.Schema.CartItem.getDefaultInstance());
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public proto.example.Schema.CartItem.Builder addCartItemsBuilder(
        int index) {
      return getCartItemsFieldBuilder().addBuilder(
          index, proto.example.Schema.CartItem.getDefaultInstance());
    }
    /**
     * <code>repeated .CartItem cartItems = 1;</code>
     */
    public java.util.List<proto.example.Schema.CartItem.Builder> 
         getCartItemsBuilderList() {
      return getCartItemsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        proto.example.Schema.CartItem, proto.example.Schema.CartItem.Builder, proto.example.Schema.CartItemOrBuilder> 
        getCartItemsFieldBuilder() {
      if (cartItemsBuilder_ == null) {
        cartItemsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            proto.example.Schema.CartItem, proto.example.Schema.CartItem.Builder, proto.example.Schema.CartItemOrBuilder>(
                cartItems_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cartItems_ = null;
      }
      return cartItemsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:Cart)
  }

  // @@protoc_insertion_point(class_scope:Cart)
  private static final proto.example.Schema.Cart DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new proto.example.Schema.Cart();
  }

  public static proto.example.Schema.Cart getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Cart>
      PARSER = new com.google.protobuf.AbstractParser<Cart>() {
    @java.lang.Override
    public Cart parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Cart(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Cart> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Cart> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public proto.example.Schema.Cart getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
