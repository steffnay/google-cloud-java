/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/billing/budgets/v1beta1/budget_service.proto

package com.google.cloud.billing.budgets.v1beta1;

/**
 *
 *
 * <pre>
 * Response for ListBudgets
 * </pre>
 *
 * Protobuf type {@code google.cloud.billing.budgets.v1beta1.ListBudgetsResponse}
 */
public final class ListBudgetsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.billing.budgets.v1beta1.ListBudgetsResponse)
    ListBudgetsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListBudgetsResponse.newBuilder() to construct.
  private ListBudgetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListBudgetsResponse() {
    budgets_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListBudgetsResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListBudgetsResponse(
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                budgets_ =
                    new java.util.ArrayList<com.google.cloud.billing.budgets.v1beta1.Budget>();
                mutable_bitField0_ |= 0x00000001;
              }
              budgets_.add(
                  input.readMessage(
                      com.google.cloud.billing.budgets.v1beta1.Budget.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        budgets_ = java.util.Collections.unmodifiableList(budgets_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
        .internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
        .internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.class,
            com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.Builder.class);
  }

  public static final int BUDGETS_FIELD_NUMBER = 1;
  private java.util.List<com.google.cloud.billing.budgets.v1beta1.Budget> budgets_;
  /**
   *
   *
   * <pre>
   * List of the budgets owned by the requested billing account.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
   */
  public java.util.List<com.google.cloud.billing.budgets.v1beta1.Budget> getBudgetsList() {
    return budgets_;
  }
  /**
   *
   *
   * <pre>
   * List of the budgets owned by the requested billing account.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
   */
  public java.util.List<? extends com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>
      getBudgetsOrBuilderList() {
    return budgets_;
  }
  /**
   *
   *
   * <pre>
   * List of the budgets owned by the requested billing account.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
   */
  public int getBudgetsCount() {
    return budgets_.size();
  }
  /**
   *
   *
   * <pre>
   * List of the budgets owned by the requested billing account.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
   */
  public com.google.cloud.billing.budgets.v1beta1.Budget getBudgets(int index) {
    return budgets_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of the budgets owned by the requested billing account.
   * </pre>
   *
   * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
   */
  public com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder getBudgetsOrBuilder(int index) {
    return budgets_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more budgets that match the
   * request; this value should be passed in a new `ListBudgetsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If not empty, indicates that there may be more budgets that match the
   * request; this value should be passed in a new `ListBudgetsRequest`.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < budgets_.size(); i++) {
      output.writeMessage(1, budgets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < budgets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, budgets_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse other =
        (com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse) obj;

    if (!getBudgetsList().equals(other.getBudgetsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getBudgetsCount() > 0) {
      hash = (37 * hash) + BUDGETS_FIELD_NUMBER;
      hash = (53 * hash) + getBudgetsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Response for ListBudgets
   * </pre>
   *
   * Protobuf type {@code google.cloud.billing.budgets.v1beta1.ListBudgetsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.billing.budgets.v1beta1.ListBudgetsResponse)
      com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
          .internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
          .internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.class,
              com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.Builder.class);
    }

    // Construct using com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getBudgetsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (budgetsBuilder_ == null) {
        budgets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        budgetsBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.billing.budgets.v1beta1.BudgetServiceOuterClass
          .internal_static_google_cloud_billing_budgets_v1beta1_ListBudgetsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse build() {
      com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse buildPartial() {
      com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse result =
          new com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse(this);
      int from_bitField0_ = bitField0_;
      if (budgetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          budgets_ = java.util.Collections.unmodifiableList(budgets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.budgets_ = budgets_;
      } else {
        result.budgets_ = budgetsBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse) {
        return mergeFrom((com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse other) {
      if (other
          == com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse.getDefaultInstance())
        return this;
      if (budgetsBuilder_ == null) {
        if (!other.budgets_.isEmpty()) {
          if (budgets_.isEmpty()) {
            budgets_ = other.budgets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureBudgetsIsMutable();
            budgets_.addAll(other.budgets_);
          }
          onChanged();
        }
      } else {
        if (!other.budgets_.isEmpty()) {
          if (budgetsBuilder_.isEmpty()) {
            budgetsBuilder_.dispose();
            budgetsBuilder_ = null;
            budgets_ = other.budgets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            budgetsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getBudgetsFieldBuilder()
                    : null;
          } else {
            budgetsBuilder_.addAllMessages(other.budgets_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
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
      com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.cloud.billing.budgets.v1beta1.Budget> budgets_ =
        java.util.Collections.emptyList();

    private void ensureBudgetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        budgets_ =
            new java.util.ArrayList<com.google.cloud.billing.budgets.v1beta1.Budget>(budgets_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.billing.budgets.v1beta1.Budget,
            com.google.cloud.billing.budgets.v1beta1.Budget.Builder,
            com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>
        budgetsBuilder_;

    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public java.util.List<com.google.cloud.billing.budgets.v1beta1.Budget> getBudgetsList() {
      if (budgetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(budgets_);
      } else {
        return budgetsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public int getBudgetsCount() {
      if (budgetsBuilder_ == null) {
        return budgets_.size();
      } else {
        return budgetsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public com.google.cloud.billing.budgets.v1beta1.Budget getBudgets(int index) {
      if (budgetsBuilder_ == null) {
        return budgets_.get(index);
      } else {
        return budgetsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder setBudgets(int index, com.google.cloud.billing.budgets.v1beta1.Budget value) {
      if (budgetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBudgetsIsMutable();
        budgets_.set(index, value);
        onChanged();
      } else {
        budgetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder setBudgets(
        int index, com.google.cloud.billing.budgets.v1beta1.Budget.Builder builderForValue) {
      if (budgetsBuilder_ == null) {
        ensureBudgetsIsMutable();
        budgets_.set(index, builderForValue.build());
        onChanged();
      } else {
        budgetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder addBudgets(com.google.cloud.billing.budgets.v1beta1.Budget value) {
      if (budgetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBudgetsIsMutable();
        budgets_.add(value);
        onChanged();
      } else {
        budgetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder addBudgets(int index, com.google.cloud.billing.budgets.v1beta1.Budget value) {
      if (budgetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBudgetsIsMutable();
        budgets_.add(index, value);
        onChanged();
      } else {
        budgetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder addBudgets(
        com.google.cloud.billing.budgets.v1beta1.Budget.Builder builderForValue) {
      if (budgetsBuilder_ == null) {
        ensureBudgetsIsMutable();
        budgets_.add(builderForValue.build());
        onChanged();
      } else {
        budgetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder addBudgets(
        int index, com.google.cloud.billing.budgets.v1beta1.Budget.Builder builderForValue) {
      if (budgetsBuilder_ == null) {
        ensureBudgetsIsMutable();
        budgets_.add(index, builderForValue.build());
        onChanged();
      } else {
        budgetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder addAllBudgets(
        java.lang.Iterable<? extends com.google.cloud.billing.budgets.v1beta1.Budget> values) {
      if (budgetsBuilder_ == null) {
        ensureBudgetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, budgets_);
        onChanged();
      } else {
        budgetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder clearBudgets() {
      if (budgetsBuilder_ == null) {
        budgets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        budgetsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public Builder removeBudgets(int index) {
      if (budgetsBuilder_ == null) {
        ensureBudgetsIsMutable();
        budgets_.remove(index);
        onChanged();
      } else {
        budgetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public com.google.cloud.billing.budgets.v1beta1.Budget.Builder getBudgetsBuilder(int index) {
      return getBudgetsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder getBudgetsOrBuilder(int index) {
      if (budgetsBuilder_ == null) {
        return budgets_.get(index);
      } else {
        return budgetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>
        getBudgetsOrBuilderList() {
      if (budgetsBuilder_ != null) {
        return budgetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(budgets_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public com.google.cloud.billing.budgets.v1beta1.Budget.Builder addBudgetsBuilder() {
      return getBudgetsFieldBuilder()
          .addBuilder(com.google.cloud.billing.budgets.v1beta1.Budget.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public com.google.cloud.billing.budgets.v1beta1.Budget.Builder addBudgetsBuilder(int index) {
      return getBudgetsFieldBuilder()
          .addBuilder(index, com.google.cloud.billing.budgets.v1beta1.Budget.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of the budgets owned by the requested billing account.
     * </pre>
     *
     * <code>repeated .google.cloud.billing.budgets.v1beta1.Budget budgets = 1;</code>
     */
    public java.util.List<com.google.cloud.billing.budgets.v1beta1.Budget.Builder>
        getBudgetsBuilderList() {
      return getBudgetsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.billing.budgets.v1beta1.Budget,
            com.google.cloud.billing.budgets.v1beta1.Budget.Builder,
            com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>
        getBudgetsFieldBuilder() {
      if (budgetsBuilder_ == null) {
        budgetsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.billing.budgets.v1beta1.Budget,
                com.google.cloud.billing.budgets.v1beta1.Budget.Builder,
                com.google.cloud.billing.budgets.v1beta1.BudgetOrBuilder>(
                budgets_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        budgets_ = null;
      }
      return budgetsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more budgets that match the
     * request; this value should be passed in a new `ListBudgetsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more budgets that match the
     * request; this value should be passed in a new `ListBudgetsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more budgets that match the
     * request; this value should be passed in a new `ListBudgetsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more budgets that match the
     * request; this value should be passed in a new `ListBudgetsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If not empty, indicates that there may be more budgets that match the
     * request; this value should be passed in a new `ListBudgetsRequest`.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.billing.budgets.v1beta1.ListBudgetsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.billing.budgets.v1beta1.ListBudgetsResponse)
  private static final com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse();
  }

  public static com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListBudgetsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListBudgetsResponse>() {
        @java.lang.Override
        public ListBudgetsResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListBudgetsResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListBudgetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListBudgetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.billing.budgets.v1beta1.ListBudgetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
