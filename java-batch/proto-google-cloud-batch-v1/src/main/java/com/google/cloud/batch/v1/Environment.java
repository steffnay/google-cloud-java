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
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

/**
 *
 *
 * <pre>
 * An Environment describes a collection of environment variables to set when
 * executing Tasks.
 * </pre>
 *
 * Protobuf type {@code google.cloud.batch.v1.Environment}
 */
public final class Environment extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.batch.v1.Environment)
    EnvironmentOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Environment.newBuilder() to construct.
  private Environment(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Environment() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Environment();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.batch.v1.TaskProto
        .internal_static_google_cloud_batch_v1_Environment_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 1:
        return internalGetVariables();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.batch.v1.TaskProto
        .internal_static_google_cloud_batch_v1_Environment_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.batch.v1.Environment.class,
            com.google.cloud.batch.v1.Environment.Builder.class);
  }

  public static final int VARIABLES_FIELD_NUMBER = 1;

  private static final class VariablesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.cloud.batch.v1.TaskProto
                .internal_static_google_cloud_batch_v1_Environment_VariablesEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> variables_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetVariables() {
    if (variables_ == null) {
      return com.google.protobuf.MapField.emptyMapField(VariablesDefaultEntryHolder.defaultEntry);
    }
    return variables_;
  }

  public int getVariablesCount() {
    return internalGetVariables().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  @java.lang.Override
  public boolean containsVariables(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetVariables().getMap().containsKey(key);
  }
  /** Use {@link #getVariablesMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getVariables() {
    return getVariablesMap();
  }
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getVariablesMap() {
    return internalGetVariables().getMap();
  }
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getVariablesOrDefault(
      java.lang.String key, java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetVariables().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * A map of environment variable names to values.
   * </pre>
   *
   * <code>map&lt;string, string&gt; variables = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getVariablesOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetVariables().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetVariables(), VariablesDefaultEntryHolder.defaultEntry, 1);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetVariables().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> variables__ =
          VariablesDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, variables__);
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
    if (!(obj instanceof com.google.cloud.batch.v1.Environment)) {
      return super.equals(obj);
    }
    com.google.cloud.batch.v1.Environment other = (com.google.cloud.batch.v1.Environment) obj;

    if (!internalGetVariables().equals(other.internalGetVariables())) return false;
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
    if (!internalGetVariables().getMap().isEmpty()) {
      hash = (37 * hash) + VARIABLES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetVariables().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.Environment parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.Environment parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.batch.v1.Environment parseFrom(
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

  public static Builder newBuilder(com.google.cloud.batch.v1.Environment prototype) {
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
   * An Environment describes a collection of environment variables to set when
   * executing Tasks.
   * </pre>
   *
   * Protobuf type {@code google.cloud.batch.v1.Environment}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.batch.v1.Environment)
      com.google.cloud.batch.v1.EnvironmentOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_Environment_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 1:
          return internalGetVariables();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 1:
          return internalGetMutableVariables();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_Environment_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.batch.v1.Environment.class,
              com.google.cloud.batch.v1.Environment.Builder.class);
    }

    // Construct using com.google.cloud.batch.v1.Environment.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      internalGetMutableVariables().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.batch.v1.TaskProto
          .internal_static_google_cloud_batch_v1_Environment_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.Environment getDefaultInstanceForType() {
      return com.google.cloud.batch.v1.Environment.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.Environment build() {
      com.google.cloud.batch.v1.Environment result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.batch.v1.Environment buildPartial() {
      com.google.cloud.batch.v1.Environment result =
          new com.google.cloud.batch.v1.Environment(this);
      int from_bitField0_ = bitField0_;
      result.variables_ = internalGetVariables();
      result.variables_.makeImmutable();
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
      if (other instanceof com.google.cloud.batch.v1.Environment) {
        return mergeFrom((com.google.cloud.batch.v1.Environment) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.batch.v1.Environment other) {
      if (other == com.google.cloud.batch.v1.Environment.getDefaultInstance()) return this;
      internalGetMutableVariables().mergeFrom(other.internalGetVariables());
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> variables__ =
                    input.readMessage(
                        VariablesDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableVariables()
                    .getMutableMap()
                    .put(variables__.getKey(), variables__.getValue());
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

    private int bitField0_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> variables_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetVariables() {
      if (variables_ == null) {
        return com.google.protobuf.MapField.emptyMapField(VariablesDefaultEntryHolder.defaultEntry);
      }
      return variables_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableVariables() {
      onChanged();
      ;
      if (variables_ == null) {
        variables_ =
            com.google.protobuf.MapField.newMapField(VariablesDefaultEntryHolder.defaultEntry);
      }
      if (!variables_.isMutable()) {
        variables_ = variables_.copy();
      }
      return variables_;
    }

    public int getVariablesCount() {
      return internalGetVariables().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    @java.lang.Override
    public boolean containsVariables(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetVariables().getMap().containsKey(key);
    }
    /** Use {@link #getVariablesMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getVariables() {
      return getVariablesMap();
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getVariablesMap() {
      return internalGetVariables().getMap();
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getVariablesOrDefault(
        java.lang.String key, java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetVariables().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getVariablesOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetVariables().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearVariables() {
      internalGetMutableVariables().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    public Builder removeVariables(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableVariables().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableVariables() {
      return internalGetMutableVariables().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    public Builder putVariables(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableVariables().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * A map of environment variable names to values.
     * </pre>
     *
     * <code>map&lt;string, string&gt; variables = 1;</code>
     */
    public Builder putAllVariables(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableVariables().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.batch.v1.Environment)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.batch.v1.Environment)
  private static final com.google.cloud.batch.v1.Environment DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.batch.v1.Environment();
  }

  public static com.google.cloud.batch.v1.Environment getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Environment> PARSER =
      new com.google.protobuf.AbstractParser<Environment>() {
        @java.lang.Override
        public Environment parsePartialFrom(
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

  public static com.google.protobuf.Parser<Environment> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Environment> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.batch.v1.Environment getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
