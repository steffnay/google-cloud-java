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
// source: google/cloud/resourcesettings/v1/resource_settings.proto

package com.google.cloud.resourcesettings.v1;

public interface SettingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcesettings.v1.Setting)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the setting. Must be in one of the following forms:
   * * `projects/{project_number}/settings/{setting_name}`
   * * `folders/{folder_id}/settings/{setting_name}`
   * * `organizations/{organization_id}/settings/{setting_name}`
   * For example, "/projects/123/settings/gcp-enableMyFeature"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the setting. Must be in one of the following forms:
   * * `projects/{project_number}/settings/{setting_name}`
   * * `folders/{folder_id}/settings/{setting_name}`
   * * `organizations/{organization_id}/settings/{setting_name}`
   * For example, "/projects/123/settings/gcp-enableMyFeature"
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Metadata about a setting which is not editable by the end user.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.SettingMetadata metadata = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about a setting which is not editable by the end user.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.SettingMetadata metadata = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The metadata.
   */
  com.google.cloud.resourcesettings.v1.SettingMetadata getMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Metadata about a setting which is not editable by the end user.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.SettingMetadata metadata = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.resourcesettings.v1.SettingMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The configured value of the setting at the given parent resource (ignoring
   * the resource hierarchy). The data type of [Value][google.cloud.resourcesettings.v1.Value] must always be
   * consistent with the data type defined in [Setting.metadata][google.cloud.resourcesettings.v1.Setting.metadata].
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.Value local_value = 8;</code>
   *
   * @return Whether the localValue field is set.
   */
  boolean hasLocalValue();
  /**
   *
   *
   * <pre>
   * The configured value of the setting at the given parent resource (ignoring
   * the resource hierarchy). The data type of [Value][google.cloud.resourcesettings.v1.Value] must always be
   * consistent with the data type defined in [Setting.metadata][google.cloud.resourcesettings.v1.Setting.metadata].
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.Value local_value = 8;</code>
   *
   * @return The localValue.
   */
  com.google.cloud.resourcesettings.v1.Value getLocalValue();
  /**
   *
   *
   * <pre>
   * The configured value of the setting at the given parent resource (ignoring
   * the resource hierarchy). The data type of [Value][google.cloud.resourcesettings.v1.Value] must always be
   * consistent with the data type defined in [Setting.metadata][google.cloud.resourcesettings.v1.Setting.metadata].
   * </pre>
   *
   * <code>.google.cloud.resourcesettings.v1.Value local_value = 8;</code>
   */
  com.google.cloud.resourcesettings.v1.ValueOrBuilder getLocalValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The computed effective value of the setting at the given parent resource
   * (based on the resource hierarchy).
   * The effective value evaluates to one of the following options in the given
   * order (the next option is used if the previous one does not exist):
   * 1. the local setting value on the given resource: [Setting.local_value][google.cloud.resourcesettings.v1.Setting.local_value]
   * 2. if one of the given resource's ancestors have a local setting value,
   *    the local value at the nearest such ancestor
   * 3. the setting's default value: [SettingMetadata.default_value][google.cloud.resourcesettings.v1.SettingMetadata.default_value]
   * 4. an empty value (defined as a `Value` with all fields unset)
   * The data type of [Value][google.cloud.resourcesettings.v1.Value] must always be
   * consistent with the data type defined in [Setting.metadata][google.cloud.resourcesettings.v1.Setting.metadata].
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Value effective_value = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the effectiveValue field is set.
   */
  boolean hasEffectiveValue();
  /**
   *
   *
   * <pre>
   * Output only. The computed effective value of the setting at the given parent resource
   * (based on the resource hierarchy).
   * The effective value evaluates to one of the following options in the given
   * order (the next option is used if the previous one does not exist):
   * 1. the local setting value on the given resource: [Setting.local_value][google.cloud.resourcesettings.v1.Setting.local_value]
   * 2. if one of the given resource's ancestors have a local setting value,
   *    the local value at the nearest such ancestor
   * 3. the setting's default value: [SettingMetadata.default_value][google.cloud.resourcesettings.v1.SettingMetadata.default_value]
   * 4. an empty value (defined as a `Value` with all fields unset)
   * The data type of [Value][google.cloud.resourcesettings.v1.Value] must always be
   * consistent with the data type defined in [Setting.metadata][google.cloud.resourcesettings.v1.Setting.metadata].
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Value effective_value = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The effectiveValue.
   */
  com.google.cloud.resourcesettings.v1.Value getEffectiveValue();
  /**
   *
   *
   * <pre>
   * Output only. The computed effective value of the setting at the given parent resource
   * (based on the resource hierarchy).
   * The effective value evaluates to one of the following options in the given
   * order (the next option is used if the previous one does not exist):
   * 1. the local setting value on the given resource: [Setting.local_value][google.cloud.resourcesettings.v1.Setting.local_value]
   * 2. if one of the given resource's ancestors have a local setting value,
   *    the local value at the nearest such ancestor
   * 3. the setting's default value: [SettingMetadata.default_value][google.cloud.resourcesettings.v1.SettingMetadata.default_value]
   * 4. an empty value (defined as a `Value` with all fields unset)
   * The data type of [Value][google.cloud.resourcesettings.v1.Value] must always be
   * consistent with the data type defined in [Setting.metadata][google.cloud.resourcesettings.v1.Setting.metadata].
   * </pre>
   *
   * <code>
   * .google.cloud.resourcesettings.v1.Value effective_value = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.resourcesettings.v1.ValueOrBuilder getEffectiveValueOrBuilder();

  /**
   *
   *
   * <pre>
   * A fingerprint used for optimistic concurrency. See
   * [UpdateSetting][google.cloud.resourcesettings.v1.ResourceSettingsService.UpdateSetting] for more
   * details.
   * </pre>
   *
   * <code>string etag = 10;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * A fingerprint used for optimistic concurrency. See
   * [UpdateSetting][google.cloud.resourcesettings.v1.ResourceSettingsService.UpdateSetting] for more
   * details.
   * </pre>
   *
   * <code>string etag = 10;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();
}
