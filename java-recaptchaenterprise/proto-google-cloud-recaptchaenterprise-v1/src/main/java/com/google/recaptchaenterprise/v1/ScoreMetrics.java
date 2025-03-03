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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Metrics related to scoring.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ScoreMetrics}
 */
public final class ScoreMetrics extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.ScoreMetrics)
    ScoreMetricsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ScoreMetrics.newBuilder() to construct.
  private ScoreMetrics(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ScoreMetrics() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ScoreMetrics();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_ScoreMetrics_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(int number) {
    switch (number) {
      case 2:
        return internalGetActionMetrics();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_ScoreMetrics_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.ScoreMetrics.class,
            com.google.recaptchaenterprise.v1.ScoreMetrics.Builder.class);
  }

  public static final int OVERALL_METRICS_FIELD_NUMBER = 1;
  private com.google.recaptchaenterprise.v1.ScoreDistribution overallMetrics_;
  /**
   *
   *
   * <pre>
   * Aggregated score metrics for all traffic.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
   *
   * @return Whether the overallMetrics field is set.
   */
  @java.lang.Override
  public boolean hasOverallMetrics() {
    return overallMetrics_ != null;
  }
  /**
   *
   *
   * <pre>
   * Aggregated score metrics for all traffic.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
   *
   * @return The overallMetrics.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ScoreDistribution getOverallMetrics() {
    return overallMetrics_ == null
        ? com.google.recaptchaenterprise.v1.ScoreDistribution.getDefaultInstance()
        : overallMetrics_;
  }
  /**
   *
   *
   * <pre>
   * Aggregated score metrics for all traffic.
   * </pre>
   *
   * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder getOverallMetricsOrBuilder() {
    return getOverallMetrics();
  }

  public static final int ACTION_METRICS_FIELD_NUMBER = 2;

  private static final class ActionMetricsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
            java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        defaultEntry =
            com.google.protobuf.MapEntry
                .<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
                    newDefaultInstance(
                        com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
                            .internal_static_google_cloud_recaptchaenterprise_v1_ScoreMetrics_ActionMetricsEntry_descriptor,
                        com.google.protobuf.WireFormat.FieldType.STRING,
                        "",
                        com.google.protobuf.WireFormat.FieldType.MESSAGE,
                        com.google.recaptchaenterprise.v1.ScoreDistribution.getDefaultInstance());
  }

  private com.google.protobuf.MapField<
          java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
      actionMetrics_;

  private com.google.protobuf.MapField<
          java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
      internalGetActionMetrics() {
    if (actionMetrics_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ActionMetricsDefaultEntryHolder.defaultEntry);
    }
    return actionMetrics_;
  }

  public int getActionMetricsCount() {
    return internalGetActionMetrics().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * Populated only for SCORE keys.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  @java.lang.Override
  public boolean containsActionMetrics(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetActionMetrics().getMap().containsKey(key);
  }
  /** Use {@link #getActionMetricsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
      getActionMetrics() {
    return getActionMetricsMap();
  }
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * Populated only for SCORE keys.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
      getActionMetricsMap() {
    return internalGetActionMetrics().getMap();
  }
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * Populated only for SCORE keys.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ScoreDistribution getActionMetricsOrDefault(
      java.lang.String key, com.google.recaptchaenterprise.v1.ScoreDistribution defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution> map =
        internalGetActionMetrics().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * Action-based metrics. The map key is the action name which specified by the
   * site owners at time of the "execute" client-side call.
   * Populated only for SCORE keys.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ScoreDistribution getActionMetricsOrThrow(
      java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution> map =
        internalGetActionMetrics().getMap();
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
    if (overallMetrics_ != null) {
      output.writeMessage(1, getOverallMetrics());
    }
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetActionMetrics(), ActionMetricsDefaultEntryHolder.defaultEntry, 2);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (overallMetrics_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getOverallMetrics());
    }
    for (java.util.Map.Entry<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        entry : internalGetActionMetrics().getMap().entrySet()) {
      com.google.protobuf.MapEntry<
              java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
          actionMetrics__ =
              ActionMetricsDefaultEntryHolder.defaultEntry
                  .newBuilderForType()
                  .setKey(entry.getKey())
                  .setValue(entry.getValue())
                  .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, actionMetrics__);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.ScoreMetrics)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.ScoreMetrics other =
        (com.google.recaptchaenterprise.v1.ScoreMetrics) obj;

    if (hasOverallMetrics() != other.hasOverallMetrics()) return false;
    if (hasOverallMetrics()) {
      if (!getOverallMetrics().equals(other.getOverallMetrics())) return false;
    }
    if (!internalGetActionMetrics().equals(other.internalGetActionMetrics())) return false;
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
    if (hasOverallMetrics()) {
      hash = (37 * hash) + OVERALL_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + getOverallMetrics().hashCode();
    }
    if (!internalGetActionMetrics().getMap().isEmpty()) {
      hash = (37 * hash) + ACTION_METRICS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetActionMetrics().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics parseFrom(
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

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.ScoreMetrics prototype) {
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
   * Metrics related to scoring.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.ScoreMetrics}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.ScoreMetrics)
      com.google.recaptchaenterprise.v1.ScoreMetricsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_ScoreMetrics_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(int number) {
      switch (number) {
        case 2:
          return internalGetActionMetrics();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(int number) {
      switch (number) {
        case 2:
          return internalGetMutableActionMetrics();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_ScoreMetrics_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.ScoreMetrics.class,
              com.google.recaptchaenterprise.v1.ScoreMetrics.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.ScoreMetrics.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (overallMetricsBuilder_ == null) {
        overallMetrics_ = null;
      } else {
        overallMetrics_ = null;
        overallMetricsBuilder_ = null;
      }
      internalGetMutableActionMetrics().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_ScoreMetrics_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreMetrics getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.ScoreMetrics.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreMetrics build() {
      com.google.recaptchaenterprise.v1.ScoreMetrics result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreMetrics buildPartial() {
      com.google.recaptchaenterprise.v1.ScoreMetrics result =
          new com.google.recaptchaenterprise.v1.ScoreMetrics(this);
      int from_bitField0_ = bitField0_;
      if (overallMetricsBuilder_ == null) {
        result.overallMetrics_ = overallMetrics_;
      } else {
        result.overallMetrics_ = overallMetricsBuilder_.build();
      }
      result.actionMetrics_ = internalGetActionMetrics();
      result.actionMetrics_.makeImmutable();
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
      if (other instanceof com.google.recaptchaenterprise.v1.ScoreMetrics) {
        return mergeFrom((com.google.recaptchaenterprise.v1.ScoreMetrics) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.ScoreMetrics other) {
      if (other == com.google.recaptchaenterprise.v1.ScoreMetrics.getDefaultInstance()) return this;
      if (other.hasOverallMetrics()) {
        mergeOverallMetrics(other.getOverallMetrics());
      }
      internalGetMutableActionMetrics().mergeFrom(other.internalGetActionMetrics());
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
                input.readMessage(getOverallMetricsFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 10
            case 18:
              {
                com.google.protobuf.MapEntry<
                        java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
                    actionMetrics__ =
                        input.readMessage(
                            ActionMetricsDefaultEntryHolder.defaultEntry.getParserForType(),
                            extensionRegistry);
                internalGetMutableActionMetrics()
                    .getMutableMap()
                    .put(actionMetrics__.getKey(), actionMetrics__.getValue());
                break;
              } // case 18
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

    private com.google.recaptchaenterprise.v1.ScoreDistribution overallMetrics_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.ScoreDistribution,
            com.google.recaptchaenterprise.v1.ScoreDistribution.Builder,
            com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder>
        overallMetricsBuilder_;
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     *
     * @return Whether the overallMetrics field is set.
     */
    public boolean hasOverallMetrics() {
      return overallMetricsBuilder_ != null || overallMetrics_ != null;
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     *
     * @return The overallMetrics.
     */
    public com.google.recaptchaenterprise.v1.ScoreDistribution getOverallMetrics() {
      if (overallMetricsBuilder_ == null) {
        return overallMetrics_ == null
            ? com.google.recaptchaenterprise.v1.ScoreDistribution.getDefaultInstance()
            : overallMetrics_;
      } else {
        return overallMetricsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    public Builder setOverallMetrics(com.google.recaptchaenterprise.v1.ScoreDistribution value) {
      if (overallMetricsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        overallMetrics_ = value;
        onChanged();
      } else {
        overallMetricsBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    public Builder setOverallMetrics(
        com.google.recaptchaenterprise.v1.ScoreDistribution.Builder builderForValue) {
      if (overallMetricsBuilder_ == null) {
        overallMetrics_ = builderForValue.build();
        onChanged();
      } else {
        overallMetricsBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    public Builder mergeOverallMetrics(com.google.recaptchaenterprise.v1.ScoreDistribution value) {
      if (overallMetricsBuilder_ == null) {
        if (overallMetrics_ != null) {
          overallMetrics_ =
              com.google.recaptchaenterprise.v1.ScoreDistribution.newBuilder(overallMetrics_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          overallMetrics_ = value;
        }
        onChanged();
      } else {
        overallMetricsBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    public Builder clearOverallMetrics() {
      if (overallMetricsBuilder_ == null) {
        overallMetrics_ = null;
        onChanged();
      } else {
        overallMetrics_ = null;
        overallMetricsBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.ScoreDistribution.Builder getOverallMetricsBuilder() {

      onChanged();
      return getOverallMetricsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    public com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder
        getOverallMetricsOrBuilder() {
      if (overallMetricsBuilder_ != null) {
        return overallMetricsBuilder_.getMessageOrBuilder();
      } else {
        return overallMetrics_ == null
            ? com.google.recaptchaenterprise.v1.ScoreDistribution.getDefaultInstance()
            : overallMetrics_;
      }
    }
    /**
     *
     *
     * <pre>
     * Aggregated score metrics for all traffic.
     * </pre>
     *
     * <code>.google.cloud.recaptchaenterprise.v1.ScoreDistribution overall_metrics = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.recaptchaenterprise.v1.ScoreDistribution,
            com.google.recaptchaenterprise.v1.ScoreDistribution.Builder,
            com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder>
        getOverallMetricsFieldBuilder() {
      if (overallMetricsBuilder_ == null) {
        overallMetricsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.recaptchaenterprise.v1.ScoreDistribution,
                com.google.recaptchaenterprise.v1.ScoreDistribution.Builder,
                com.google.recaptchaenterprise.v1.ScoreDistributionOrBuilder>(
                getOverallMetrics(), getParentForChildren(), isClean());
        overallMetrics_ = null;
      }
      return overallMetricsBuilder_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        actionMetrics_;

    private com.google.protobuf.MapField<
            java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        internalGetActionMetrics() {
      if (actionMetrics_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ActionMetricsDefaultEntryHolder.defaultEntry);
      }
      return actionMetrics_;
    }

    private com.google.protobuf.MapField<
            java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        internalGetMutableActionMetrics() {
      onChanged();
      ;
      if (actionMetrics_ == null) {
        actionMetrics_ =
            com.google.protobuf.MapField.newMapField(ActionMetricsDefaultEntryHolder.defaultEntry);
      }
      if (!actionMetrics_.isMutable()) {
        actionMetrics_ = actionMetrics_.copy();
      }
      return actionMetrics_;
    }

    public int getActionMetricsCount() {
      return internalGetActionMetrics().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    @java.lang.Override
    public boolean containsActionMetrics(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetActionMetrics().getMap().containsKey(key);
    }
    /** Use {@link #getActionMetricsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        getActionMetrics() {
      return getActionMetricsMap();
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        getActionMetricsMap() {
      return internalGetActionMetrics().getMap();
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreDistribution getActionMetricsOrDefault(
        java.lang.String key, com.google.recaptchaenterprise.v1.ScoreDistribution defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution> map =
          internalGetActionMetrics().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    @java.lang.Override
    public com.google.recaptchaenterprise.v1.ScoreDistribution getActionMetricsOrThrow(
        java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution> map =
          internalGetActionMetrics().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearActionMetrics() {
      internalGetMutableActionMetrics().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    public Builder removeActionMetrics(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableActionMetrics().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
        getMutableActionMetrics() {
      return internalGetMutableActionMetrics().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    public Builder putActionMetrics(
        java.lang.String key, com.google.recaptchaenterprise.v1.ScoreDistribution value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }

      internalGetMutableActionMetrics().getMutableMap().put(key, value);
      return this;
    }
    /**
     *
     *
     * <pre>
     * Action-based metrics. The map key is the action name which specified by the
     * site owners at time of the "execute" client-side call.
     * Populated only for SCORE keys.
     * </pre>
     *
     * <code>
     * map&lt;string, .google.cloud.recaptchaenterprise.v1.ScoreDistribution&gt; action_metrics = 2;
     * </code>
     */
    public Builder putAllActionMetrics(
        java.util.Map<java.lang.String, com.google.recaptchaenterprise.v1.ScoreDistribution>
            values) {
      internalGetMutableActionMetrics().getMutableMap().putAll(values);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.ScoreMetrics)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.ScoreMetrics)
  private static final com.google.recaptchaenterprise.v1.ScoreMetrics DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.ScoreMetrics();
  }

  public static com.google.recaptchaenterprise.v1.ScoreMetrics getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ScoreMetrics> PARSER =
      new com.google.protobuf.AbstractParser<ScoreMetrics>() {
        @java.lang.Override
        public ScoreMetrics parsePartialFrom(
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

  public static com.google.protobuf.Parser<ScoreMetrics> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ScoreMetrics> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.ScoreMetrics getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
