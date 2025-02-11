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
// source: google/cloud/oslogin/v1/oslogin.proto

package com.google.cloud.oslogin.v1;

/**
 *
 *
 * <pre>
 * A response message for importing an SSH public key.
 * </pre>
 *
 * Protobuf type {@code google.cloud.oslogin.v1.ImportSshPublicKeyResponse}
 */
public final class ImportSshPublicKeyResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oslogin.v1.ImportSshPublicKeyResponse)
    ImportSshPublicKeyResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportSshPublicKeyResponse.newBuilder() to construct.
  private ImportSshPublicKeyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportSshPublicKeyResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportSshPublicKeyResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oslogin.v1.OsLoginProto
        .internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oslogin.v1.OsLoginProto
        .internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.class,
            com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.Builder.class);
  }

  public static final int LOGIN_PROFILE_FIELD_NUMBER = 1;
  private com.google.cloud.oslogin.v1.LoginProfile loginProfile_;
  /**
   *
   *
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   *
   * @return Whether the loginProfile field is set.
   */
  @java.lang.Override
  public boolean hasLoginProfile() {
    return loginProfile_ != null;
  }
  /**
   *
   *
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   *
   * @return The loginProfile.
   */
  @java.lang.Override
  public com.google.cloud.oslogin.v1.LoginProfile getLoginProfile() {
    return loginProfile_ == null
        ? com.google.cloud.oslogin.v1.LoginProfile.getDefaultInstance()
        : loginProfile_;
  }
  /**
   *
   *
   * <pre>
   * The login profile information for the user.
   * </pre>
   *
   * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.oslogin.v1.LoginProfileOrBuilder getLoginProfileOrBuilder() {
    return getLoginProfile();
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
    if (loginProfile_ != null) {
      output.writeMessage(1, getLoginProfile());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (loginProfile_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getLoginProfile());
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
    if (!(obj instanceof com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse other =
        (com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse) obj;

    if (hasLoginProfile() != other.hasLoginProfile()) return false;
    if (hasLoginProfile()) {
      if (!getLoginProfile().equals(other.getLoginProfile())) return false;
    }
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
    if (hasLoginProfile()) {
      hash = (37 * hash) + LOGIN_PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getLoginProfile().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse parseFrom(
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
      com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse prototype) {
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
   * A response message for importing an SSH public key.
   * </pre>
   *
   * Protobuf type {@code google.cloud.oslogin.v1.ImportSshPublicKeyResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oslogin.v1.ImportSshPublicKeyResponse)
      com.google.cloud.oslogin.v1.ImportSshPublicKeyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.class,
              com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.Builder.class);
    }

    // Construct using com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (loginProfileBuilder_ == null) {
        loginProfile_ = null;
      } else {
        loginProfile_ = null;
        loginProfileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oslogin.v1.OsLoginProto
          .internal_static_google_cloud_oslogin_v1_ImportSshPublicKeyResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse getDefaultInstanceForType() {
      return com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse build() {
      com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse buildPartial() {
      com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse result =
          new com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse(this);
      if (loginProfileBuilder_ == null) {
        result.loginProfile_ = loginProfile_;
      } else {
        result.loginProfile_ = loginProfileBuilder_.build();
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
      if (other instanceof com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse) {
        return mergeFrom((com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse other) {
      if (other == com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse.getDefaultInstance())
        return this;
      if (other.hasLoginProfile()) {
        mergeLoginProfile(other.getLoginProfile());
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
            case 10:
              {
                input.readMessage(getLoginProfileFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
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

    private com.google.cloud.oslogin.v1.LoginProfile loginProfile_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.v1.LoginProfile,
            com.google.cloud.oslogin.v1.LoginProfile.Builder,
            com.google.cloud.oslogin.v1.LoginProfileOrBuilder>
        loginProfileBuilder_;
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     *
     * @return Whether the loginProfile field is set.
     */
    public boolean hasLoginProfile() {
      return loginProfileBuilder_ != null || loginProfile_ != null;
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     *
     * @return The loginProfile.
     */
    public com.google.cloud.oslogin.v1.LoginProfile getLoginProfile() {
      if (loginProfileBuilder_ == null) {
        return loginProfile_ == null
            ? com.google.cloud.oslogin.v1.LoginProfile.getDefaultInstance()
            : loginProfile_;
      } else {
        return loginProfileBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    public Builder setLoginProfile(com.google.cloud.oslogin.v1.LoginProfile value) {
      if (loginProfileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        loginProfile_ = value;
        onChanged();
      } else {
        loginProfileBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    public Builder setLoginProfile(
        com.google.cloud.oslogin.v1.LoginProfile.Builder builderForValue) {
      if (loginProfileBuilder_ == null) {
        loginProfile_ = builderForValue.build();
        onChanged();
      } else {
        loginProfileBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    public Builder mergeLoginProfile(com.google.cloud.oslogin.v1.LoginProfile value) {
      if (loginProfileBuilder_ == null) {
        if (loginProfile_ != null) {
          loginProfile_ =
              com.google.cloud.oslogin.v1.LoginProfile.newBuilder(loginProfile_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          loginProfile_ = value;
        }
        onChanged();
      } else {
        loginProfileBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    public Builder clearLoginProfile() {
      if (loginProfileBuilder_ == null) {
        loginProfile_ = null;
        onChanged();
      } else {
        loginProfile_ = null;
        loginProfileBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    public com.google.cloud.oslogin.v1.LoginProfile.Builder getLoginProfileBuilder() {

      onChanged();
      return getLoginProfileFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    public com.google.cloud.oslogin.v1.LoginProfileOrBuilder getLoginProfileOrBuilder() {
      if (loginProfileBuilder_ != null) {
        return loginProfileBuilder_.getMessageOrBuilder();
      } else {
        return loginProfile_ == null
            ? com.google.cloud.oslogin.v1.LoginProfile.getDefaultInstance()
            : loginProfile_;
      }
    }
    /**
     *
     *
     * <pre>
     * The login profile information for the user.
     * </pre>
     *
     * <code>.google.cloud.oslogin.v1.LoginProfile login_profile = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.oslogin.v1.LoginProfile,
            com.google.cloud.oslogin.v1.LoginProfile.Builder,
            com.google.cloud.oslogin.v1.LoginProfileOrBuilder>
        getLoginProfileFieldBuilder() {
      if (loginProfileBuilder_ == null) {
        loginProfileBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.oslogin.v1.LoginProfile,
                com.google.cloud.oslogin.v1.LoginProfile.Builder,
                com.google.cloud.oslogin.v1.LoginProfileOrBuilder>(
                getLoginProfile(), getParentForChildren(), isClean());
        loginProfile_ = null;
      }
      return loginProfileBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oslogin.v1.ImportSshPublicKeyResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oslogin.v1.ImportSshPublicKeyResponse)
  private static final com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse();
  }

  public static com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportSshPublicKeyResponse> PARSER =
      new com.google.protobuf.AbstractParser<ImportSshPublicKeyResponse>() {
        @java.lang.Override
        public ImportSshPublicKeyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportSshPublicKeyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportSshPublicKeyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oslogin.v1.ImportSshPublicKeyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
