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
// source: google/cloud/gaming/v1/game_server_deployments.proto

package com.google.cloud.gaming.v1;

/**
 *
 *
 * <pre>
 * Request message for GameServerDeploymentsService.CreateGameServerDeployment.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gaming.v1.CreateGameServerDeploymentRequest}
 */
public final class CreateGameServerDeploymentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gaming.v1.CreateGameServerDeploymentRequest)
    CreateGameServerDeploymentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateGameServerDeploymentRequest.newBuilder() to construct.
  private CreateGameServerDeploymentRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateGameServerDeploymentRequest() {
    parent_ = "";
    deploymentId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateGameServerDeploymentRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private CreateGameServerDeploymentRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
              java.lang.String s = input.readStringRequireUtf8();

              parent_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              deploymentId_ = s;
              break;
            }
          case 26:
            {
              com.google.cloud.gaming.v1.GameServerDeployment.Builder subBuilder = null;
              if (gameServerDeployment_ != null) {
                subBuilder = gameServerDeployment_.toBuilder();
              }
              gameServerDeployment_ =
                  input.readMessage(
                      com.google.cloud.gaming.v1.GameServerDeployment.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(gameServerDeployment_);
                gameServerDeployment_ = subBuilder.buildPartial();
              }

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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gaming.v1.GameServerDeployments
        .internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gaming.v1.GameServerDeployments
        .internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.class,
            com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.Builder.class);
  }

  public static final int PARENT_FIELD_NUMBER = 1;
  private volatile java.lang.Object parent_;
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, in the following form:
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent resource name, in the following form:
   * `projects/{project}/locations/{location}`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEPLOYMENT_ID_FIELD_NUMBER = 2;
  private volatile java.lang.Object deploymentId_;
  /**
   *
   *
   * <pre>
   * Required. The ID of the game server delpoyment resource to be created.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The deploymentId.
   */
  @java.lang.Override
  public java.lang.String getDeploymentId() {
    java.lang.Object ref = deploymentId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deploymentId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The ID of the game server delpoyment resource to be created.
   * </pre>
   *
   * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for deploymentId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeploymentIdBytes() {
    java.lang.Object ref = deploymentId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deploymentId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GAME_SERVER_DEPLOYMENT_FIELD_NUMBER = 3;
  private com.google.cloud.gaming.v1.GameServerDeployment gameServerDeployment_;
  /**
   *
   *
   * <pre>
   * Required. The game server delpoyment resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the gameServerDeployment field is set.
   */
  @java.lang.Override
  public boolean hasGameServerDeployment() {
    return gameServerDeployment_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server delpoyment resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The gameServerDeployment.
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.GameServerDeployment getGameServerDeployment() {
    return gameServerDeployment_ == null
        ? com.google.cloud.gaming.v1.GameServerDeployment.getDefaultInstance()
        : gameServerDeployment_;
  }
  /**
   *
   *
   * <pre>
   * Required. The game server delpoyment resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gaming.v1.GameServerDeploymentOrBuilder
      getGameServerDeploymentOrBuilder() {
    return getGameServerDeployment();
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deploymentId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, deploymentId_);
    }
    if (gameServerDeployment_ != null) {
      output.writeMessage(3, getGameServerDeployment());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deploymentId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, deploymentId_);
    }
    if (gameServerDeployment_ != null) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(3, getGameServerDeployment());
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
    if (!(obj instanceof com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest other =
        (com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (!getDeploymentId().equals(other.getDeploymentId())) return false;
    if (hasGameServerDeployment() != other.hasGameServerDeployment()) return false;
    if (hasGameServerDeployment()) {
      if (!getGameServerDeployment().equals(other.getGameServerDeployment())) return false;
    }
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    hash = (37 * hash) + DEPLOYMENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeploymentId().hashCode();
    if (hasGameServerDeployment()) {
      hash = (37 * hash) + GAME_SERVER_DEPLOYMENT_FIELD_NUMBER;
      hash = (53 * hash) + getGameServerDeployment().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parseFrom(
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
      com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest prototype) {
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
   * Request message for GameServerDeploymentsService.CreateGameServerDeployment.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gaming.v1.CreateGameServerDeploymentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gaming.v1.CreateGameServerDeploymentRequest)
      com.google.cloud.gaming.v1.CreateGameServerDeploymentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gaming.v1.GameServerDeployments
          .internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gaming.v1.GameServerDeployments
          .internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.class,
              com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.Builder.class);
    }

    // Construct using com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      parent_ = "";

      deploymentId_ = "";

      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = null;
      } else {
        gameServerDeployment_ = null;
        gameServerDeploymentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gaming.v1.GameServerDeployments
          .internal_static_google_cloud_gaming_v1_CreateGameServerDeploymentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest
        getDefaultInstanceForType() {
      return com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest build() {
      com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest buildPartial() {
      com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest result =
          new com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest(this);
      result.parent_ = parent_;
      result.deploymentId_ = deploymentId_;
      if (gameServerDeploymentBuilder_ == null) {
        result.gameServerDeployment_ = gameServerDeployment_;
      } else {
        result.gameServerDeployment_ = gameServerDeploymentBuilder_.build();
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
      if (other instanceof com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest) {
        return mergeFrom((com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest other) {
      if (other
          == com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        onChanged();
      }
      if (!other.getDeploymentId().isEmpty()) {
        deploymentId_ = other.deploymentId_;
        onChanged();
      }
      if (other.hasGameServerDeployment()) {
        mergeGameServerDeployment(other.getGameServerDeployment());
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
      com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, in the following form:
     * `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, in the following form:
     * `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, in the following form:
     * `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      parent_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, in the following form:
     * `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {

      parent_ = getDefaultInstance().getParent();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent resource name, in the following form:
     * `projects/{project}/locations/{location}`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      parent_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object deploymentId_ = "";
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server delpoyment resource to be created.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The deploymentId.
     */
    public java.lang.String getDeploymentId() {
      java.lang.Object ref = deploymentId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deploymentId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server delpoyment resource to be created.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for deploymentId.
     */
    public com.google.protobuf.ByteString getDeploymentIdBytes() {
      java.lang.Object ref = deploymentId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deploymentId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server delpoyment resource to be created.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The deploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      deploymentId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server delpoyment resource to be created.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeploymentId() {

      deploymentId_ = getDefaultInstance().getDeploymentId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The ID of the game server delpoyment resource to be created.
     * </pre>
     *
     * <code>string deployment_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for deploymentId to set.
     * @return This builder for chaining.
     */
    public Builder setDeploymentIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      deploymentId_ = value;
      onChanged();
      return this;
    }

    private com.google.cloud.gaming.v1.GameServerDeployment gameServerDeployment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1.GameServerDeployment,
            com.google.cloud.gaming.v1.GameServerDeployment.Builder,
            com.google.cloud.gaming.v1.GameServerDeploymentOrBuilder>
        gameServerDeploymentBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the gameServerDeployment field is set.
     */
    public boolean hasGameServerDeployment() {
      return gameServerDeploymentBuilder_ != null || gameServerDeployment_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The gameServerDeployment.
     */
    public com.google.cloud.gaming.v1.GameServerDeployment getGameServerDeployment() {
      if (gameServerDeploymentBuilder_ == null) {
        return gameServerDeployment_ == null
            ? com.google.cloud.gaming.v1.GameServerDeployment.getDefaultInstance()
            : gameServerDeployment_;
      } else {
        return gameServerDeploymentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGameServerDeployment(com.google.cloud.gaming.v1.GameServerDeployment value) {
      if (gameServerDeploymentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        gameServerDeployment_ = value;
        onChanged();
      } else {
        gameServerDeploymentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setGameServerDeployment(
        com.google.cloud.gaming.v1.GameServerDeployment.Builder builderForValue) {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = builderForValue.build();
        onChanged();
      } else {
        gameServerDeploymentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeGameServerDeployment(
        com.google.cloud.gaming.v1.GameServerDeployment value) {
      if (gameServerDeploymentBuilder_ == null) {
        if (gameServerDeployment_ != null) {
          gameServerDeployment_ =
              com.google.cloud.gaming.v1.GameServerDeployment.newBuilder(gameServerDeployment_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          gameServerDeployment_ = value;
        }
        onChanged();
      } else {
        gameServerDeploymentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearGameServerDeployment() {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeployment_ = null;
        onChanged();
      } else {
        gameServerDeployment_ = null;
        gameServerDeploymentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gaming.v1.GameServerDeployment.Builder
        getGameServerDeploymentBuilder() {

      onChanged();
      return getGameServerDeploymentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gaming.v1.GameServerDeploymentOrBuilder
        getGameServerDeploymentOrBuilder() {
      if (gameServerDeploymentBuilder_ != null) {
        return gameServerDeploymentBuilder_.getMessageOrBuilder();
      } else {
        return gameServerDeployment_ == null
            ? com.google.cloud.gaming.v1.GameServerDeployment.getDefaultInstance()
            : gameServerDeployment_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The game server delpoyment resource to be created.
     * </pre>
     *
     * <code>
     * .google.cloud.gaming.v1.GameServerDeployment game_server_deployment = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gaming.v1.GameServerDeployment,
            com.google.cloud.gaming.v1.GameServerDeployment.Builder,
            com.google.cloud.gaming.v1.GameServerDeploymentOrBuilder>
        getGameServerDeploymentFieldBuilder() {
      if (gameServerDeploymentBuilder_ == null) {
        gameServerDeploymentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gaming.v1.GameServerDeployment,
                com.google.cloud.gaming.v1.GameServerDeployment.Builder,
                com.google.cloud.gaming.v1.GameServerDeploymentOrBuilder>(
                getGameServerDeployment(), getParentForChildren(), isClean());
        gameServerDeployment_ = null;
      }
      return gameServerDeploymentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gaming.v1.CreateGameServerDeploymentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gaming.v1.CreateGameServerDeploymentRequest)
  private static final com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest();
  }

  public static com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateGameServerDeploymentRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateGameServerDeploymentRequest>() {
        @java.lang.Override
        public CreateGameServerDeploymentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new CreateGameServerDeploymentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<CreateGameServerDeploymentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateGameServerDeploymentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gaming.v1.CreateGameServerDeploymentRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
