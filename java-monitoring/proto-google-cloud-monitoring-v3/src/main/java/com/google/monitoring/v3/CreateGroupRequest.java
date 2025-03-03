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
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `CreateGroup` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateGroupRequest}
 */
public final class CreateGroupRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateGroupRequest)
    CreateGroupRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGroupRequest.newBuilder() to construct.
  private CreateGroupRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGroupRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGroupRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.GroupServiceProto
        .internal_static_google_monitoring_v3_CreateGroupRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.GroupServiceProto
        .internal_static_google_monitoring_v3_CreateGroupRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateGroupRequest.class,
            com.google.monitoring.v3.CreateGroupRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 4;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
   * which to create the group. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
   * which to create the group. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GROUP_FIELD_NUMBER = 2;
  private com.google.monitoring.v3.Group group_;
  /**
   *
   *
   * <pre>
   * Required. A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the group field is set.
   */
  @java.lang.Override
  public boolean hasGroup() {
    return group_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The group.
   */
  @java.lang.Override
  public com.google.monitoring.v3.Group getGroup() {
    return group_ == null ? com.google.monitoring.v3.Group.getDefaultInstance() : group_;
  }
  /**
   *
   *
   * <pre>
   * Required. A group definition. It is an error to define the `name` field because
   * the system assigns the name.
   * </pre>
   *
   * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  @java.lang.Override
  public com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder() {
    return getGroup();
  }

  public static final int VALIDATE_ONLY_FIELD_NUMBER = 3;
  private boolean validateOnly_;
  /**
   *
   *
   * <pre>
   * If true, validate this request but do not create the group.
   * </pre>
   *
   * <code>bool validate_only = 3;</code>
   *
   * @return The validateOnly.
   */
  @java.lang.Override
  public boolean getValidateOnly() {
    return validateOnly_;
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
    if (group_ != null) {
      output.writeMessage(2, getGroup());
    }
    if (validateOnly_ != false) {
      output.writeBool(3, validateOnly_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (group_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getGroup());
    }
    if (validateOnly_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, validateOnly_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, name_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.CreateGroupRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateGroupRequest other =
        (com.google.monitoring.v3.CreateGroupRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasGroup() != other.hasGroup()) return false;
    if (hasGroup()) {
      if (!getGroup().equals(other.getGroup())) return false;
    }
    if (getValidateOnly() != other.getValidateOnly()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasGroup()) {
      hash = (37 * hash) + GROUP_FIELD_NUMBER;
      hash = (53 * hash) + getGroup().hashCode();
    }
    hash = (37 * hash) + VALIDATE_ONLY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getValidateOnly());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateGroupRequest parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.CreateGroupRequest prototype) {
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
   * The `CreateGroup` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateGroupRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateGroupRequest)
      com.google.monitoring.v3.CreateGroupRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_CreateGroupRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_CreateGroupRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateGroupRequest.class,
              com.google.monitoring.v3.CreateGroupRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateGroupRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (groupBuilder_ == null) {
        group_ = null;
      } else {
        group_ = null;
        groupBuilder_ = null;
      }
      validateOnly_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_CreateGroupRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateGroupRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateGroupRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateGroupRequest build() {
      com.google.monitoring.v3.CreateGroupRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateGroupRequest buildPartial() {
      com.google.monitoring.v3.CreateGroupRequest result =
          new com.google.monitoring.v3.CreateGroupRequest(this);
      result.name_ = name_;
      if (groupBuilder_ == null) {
        result.group_ = group_;
      } else {
        result.group_ = groupBuilder_.build();
      }
      result.validateOnly_ = validateOnly_;
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
      if (other instanceof com.google.monitoring.v3.CreateGroupRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateGroupRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateGroupRequest other) {
      if (other == com.google.monitoring.v3.CreateGroupRequest.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasGroup()) {
        mergeGroup(other.getGroup());
      }
      if (other.getValidateOnly() != false) {
        setValidateOnly(other.getValidateOnly());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18:
              {
                input.readMessage(getGroupFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 24:
              {
                validateOnly_ = input.readBool();

                break;
              } // case 24
            case 34:
              {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 34
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
     * which to create the group. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
     * which to create the group. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
     * which to create the group. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
     * which to create the group. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
     * which to create the group. The format is:
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.monitoring.v3.Group group_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Group,
            com.google.monitoring.v3.Group.Builder,
            com.google.monitoring.v3.GroupOrBuilder>
        groupBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the group field is set.
     */
    public boolean hasGroup() {
      return groupBuilder_ != null || group_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The group.
     */
    public com.google.monitoring.v3.Group getGroup() {
      if (groupBuilder_ == null) {
        return group_ == null ? com.google.monitoring.v3.Group.getDefaultInstance() : group_;
      } else {
        return groupBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGroup(com.google.monitoring.v3.Group value) {
      if (groupBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        group_ = value;
        onChanged();
      } else {
        groupBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder setGroup(com.google.monitoring.v3.Group.Builder builderForValue) {
      if (groupBuilder_ == null) {
        group_ = builderForValue.build();
        onChanged();
      } else {
        groupBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder mergeGroup(com.google.monitoring.v3.Group value) {
      if (groupBuilder_ == null) {
        if (group_ != null) {
          group_ =
              com.google.monitoring.v3.Group.newBuilder(group_).mergeFrom(value).buildPartial();
        } else {
          group_ = value;
        }
        onChanged();
      } else {
        groupBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public Builder clearGroup() {
      if (groupBuilder_ == null) {
        group_ = null;
        onChanged();
      } else {
        group_ = null;
        groupBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.monitoring.v3.Group.Builder getGroupBuilder() {

      onChanged();
      return getGroupFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    public com.google.monitoring.v3.GroupOrBuilder getGroupOrBuilder() {
      if (groupBuilder_ != null) {
        return groupBuilder_.getMessageOrBuilder();
      } else {
        return group_ == null ? com.google.monitoring.v3.Group.getDefaultInstance() : group_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A group definition. It is an error to define the `name` field because
     * the system assigns the name.
     * </pre>
     *
     * <code>.google.monitoring.v3.Group group = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.monitoring.v3.Group,
            com.google.monitoring.v3.Group.Builder,
            com.google.monitoring.v3.GroupOrBuilder>
        getGroupFieldBuilder() {
      if (groupBuilder_ == null) {
        groupBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.monitoring.v3.Group,
                com.google.monitoring.v3.Group.Builder,
                com.google.monitoring.v3.GroupOrBuilder>(
                getGroup(), getParentForChildren(), isClean());
        group_ = null;
      }
      return groupBuilder_;
    }

    private boolean validateOnly_;
    /**
     *
     *
     * <pre>
     * If true, validate this request but do not create the group.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return The validateOnly.
     */
    @java.lang.Override
    public boolean getValidateOnly() {
      return validateOnly_;
    }
    /**
     *
     *
     * <pre>
     * If true, validate this request but do not create the group.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @param value The validateOnly to set.
     * @return This builder for chaining.
     */
    public Builder setValidateOnly(boolean value) {

      validateOnly_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If true, validate this request but do not create the group.
     * </pre>
     *
     * <code>bool validate_only = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValidateOnly() {

      validateOnly_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateGroupRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateGroupRequest)
  private static final com.google.monitoring.v3.CreateGroupRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateGroupRequest();
  }

  public static com.google.monitoring.v3.CreateGroupRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGroupRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGroupRequest>() {
        @java.lang.Override
        public CreateGroupRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateGroupRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGroupRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateGroupRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
