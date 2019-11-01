/*
 * Copyright 2019 Google LLC
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
// source: google/cloud/dialogflow/v2/entity_type.proto

package com.google.cloud.dialogflow.v2;

public interface EntityTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.EntityType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of the entity type.
   * Required for [EntityTypes.UpdateEntityType][google.cloud.dialogflow.v2.EntityTypes.UpdateEntityType] and
   * [EntityTypes.BatchUpdateEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchUpdateEntityTypes] methods.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of the entity type.
   * Required for [EntityTypes.UpdateEntityType][google.cloud.dialogflow.v2.EntityTypes.UpdateEntityType] and
   * [EntityTypes.BatchUpdateEntityTypes][google.cloud.dialogflow.v2.EntityTypes.BatchUpdateEntityTypes] methods.
   * Format: `projects/&lt;Project ID&gt;/agent/entityTypes/&lt;Entity Type ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of the entity type.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of the entity type.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Indicates the kind of entity type.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EntityType.Kind kind = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getKindValue();
  /**
   *
   *
   * <pre>
   * Required. Indicates the kind of entity type.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EntityType.Kind kind = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EntityType.Kind getKind();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the entity type can be automatically
   * expanded.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EntityType.AutoExpansionMode auto_expansion_mode = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAutoExpansionModeValue();
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether the entity type can be automatically
   * expanded.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.EntityType.AutoExpansionMode auto_expansion_mode = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EntityType.AutoExpansionMode getAutoExpansionMode();

  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.EntityType.Entity> getEntitiesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EntityType.Entity getEntities(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getEntitiesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.EntityType.EntityOrBuilder>
      getEntitiesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of entity entries associated with the entity type.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.EntityType.Entity entities = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.EntityType.EntityOrBuilder getEntitiesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Enables fuzzy entity extraction during classification.
   * </pre>
   *
   * <code>bool enable_fuzzy_extraction = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean getEnableFuzzyExtraction();
}
