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
// source: google/cloud/aiplatform/v1/model.proto

package com.google.cloud.aiplatform.v1;

public final class ModelProto {
  private ModelProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_PredictSchemata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Port_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Port_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/model.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\0323google/cloud/aiplatform/v1/dep"
          + "loyed_model_ref.proto\0320google/cloud/aipl"
          + "atform/v1/encryption_spec.proto\032(google/"
          + "cloud/aiplatform/v1/env_var.proto\032,googl"
          + "e/cloud/aiplatform/v1/explanation.proto\032"
          + "\034google/protobuf/struct.proto\032\037google/pr"
          + "otobuf/timestamp.proto\"\366\016\n\005Model\022\014\n\004name"
          + "\030\001 \001(\t\022\032\n\nversion_id\030\034 \001(\tB\006\340A\005\340A\003\022\027\n\017ve"
          + "rsion_aliases\030\035 \003(\t\022<\n\023version_create_ti"
          + "me\030\037 \001(\0132\032.google.protobuf.TimestampB\003\340A"
          + "\003\022<\n\023version_update_time\030  \001(\0132\032.google."
          + "protobuf.TimestampB\003\340A\003\022\031\n\014display_name\030"
          + "\002 \001(\tB\003\340A\002\022\023\n\013description\030\003 \001(\t\022\033\n\023versi"
          + "on_description\030\036 \001(\t\022E\n\020predict_schemata"
          + "\030\004 \001(\0132+.google.cloud.aiplatform.v1.Pred"
          + "ictSchemata\022 \n\023metadata_schema_uri\030\005 \001(\t"
          + "B\003\340A\005\022-\n\010metadata\030\006 \001(\0132\026.google.protobu"
          + "f.ValueB\003\340A\005\022U\n\030supported_export_formats"
          + "\030\024 \003(\0132..google.cloud.aiplatform.v1.Mode"
          + "l.ExportFormatB\003\340A\003\022M\n\021training_pipeline"
          + "\030\007 \001(\tB2\340A\003\372A,\n*aiplatform.googleapis.co"
          + "m/TrainingPipeline\022K\n\016container_spec\030\t \001"
          + "(\0132..google.cloud.aiplatform.v1.ModelCon"
          + "tainerSpecB\003\340A\004\022\031\n\014artifact_uri\030\032 \001(\tB\003\340"
          + "A\005\022l\n$supported_deployment_resources_typ"
          + "es\030\n \003(\01629.google.cloud.aiplatform.v1.Mo"
          + "del.DeploymentResourcesTypeB\003\340A\003\022,\n\037supp"
          + "orted_input_storage_formats\030\013 \003(\tB\003\340A\003\022-"
          + "\n supported_output_storage_formats\030\014 \003(\t"
          + "B\003\340A\003\0224\n\013create_time\030\r \001(\0132\032.google.prot"
          + "obuf.TimestampB\003\340A\003\0224\n\013update_time\030\016 \001(\013"
          + "2\032.google.protobuf.TimestampB\003\340A\003\022J\n\017dep"
          + "loyed_models\030\017 \003(\0132,.google.cloud.aiplat"
          + "form.v1.DeployedModelRefB\003\340A\003\022E\n\020explana"
          + "tion_spec\030\027 \001(\0132+.google.cloud.aiplatfor"
          + "m.v1.ExplanationSpec\022\014\n\004etag\030\020 \001(\t\022=\n\006la"
          + "bels\030\021 \003(\0132-.google.cloud.aiplatform.v1."
          + "Model.LabelsEntry\022C\n\017encryption_spec\030\030 \001"
          + "(\0132*.google.cloud.aiplatform.v1.Encrypti"
          + "onSpec\022K\n\021model_source_info\030& \001(\0132+.goog"
          + "le.cloud.aiplatform.v1.ModelSourceInfoB\003"
          + "\340A\003\022\036\n\021metadata_artifact\030, \001(\tB\003\340A\003\032\325\001\n\014"
          + "ExportFormat\022\017\n\002id\030\001 \001(\tB\003\340A\003\022b\n\023exporta"
          + "ble_contents\030\002 \003(\0162@.google.cloud.aiplat"
          + "form.v1.Model.ExportFormat.ExportableCon"
          + "tentB\003\340A\003\"P\n\021ExportableContent\022\"\n\036EXPORT"
          + "ABLE_CONTENT_UNSPECIFIED\020\000\022\014\n\010ARTIFACT\020\001"
          + "\022\t\n\005IMAGE\020\002\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022"
          + "\r\n\005value\030\002 \001(\t:\0028\001\"\214\001\n\027DeploymentResourc"
          + "esType\022)\n%DEPLOYMENT_RESOURCES_TYPE_UNSP"
          + "ECIFIED\020\000\022\027\n\023DEDICATED_RESOURCES\020\001\022\027\n\023AU"
          + "TOMATIC_RESOURCES\020\002\022\024\n\020SHARED_RESOURCES\020"
          + "\003:\\\352AY\n\037aiplatform.googleapis.com/Model\022"
          + "6projects/{project}/locations/{location}"
          + "/models/{model}\"{\n\017PredictSchemata\022 \n\023in"
          + "stance_schema_uri\030\001 \001(\tB\003\340A\005\022\"\n\025paramete"
          + "rs_schema_uri\030\002 \001(\tB\003\340A\005\022\"\n\025prediction_s"
          + "chema_uri\030\003 \001(\tB\003\340A\005\"\373\001\n\022ModelContainerS"
          + "pec\022\031\n\timage_uri\030\001 \001(\tB\006\340A\002\340A\005\022\024\n\007comman"
          + "d\030\002 \003(\tB\003\340A\005\022\021\n\004args\030\003 \003(\tB\003\340A\005\0224\n\003env\030\004"
          + " \003(\0132\".google.cloud.aiplatform.v1.EnvVar"
          + "B\003\340A\005\0224\n\005ports\030\005 \003(\0132 .google.cloud.aipl"
          + "atform.v1.PortB\003\340A\005\022\032\n\rpredict_route\030\006 \001"
          + "(\tB\003\340A\005\022\031\n\014health_route\030\007 \001(\tB\003\340A\005\"\036\n\004Po"
          + "rt\022\026\n\016container_port\030\003 \001(\005\"\273\001\n\017ModelSour"
          + "ceInfo\022P\n\013source_type\030\001 \001(\0162;.google.clo"
          + "ud.aiplatform.v1.ModelSourceInfo.ModelSo"
          + "urceType\"V\n\017ModelSourceType\022!\n\035MODEL_SOU"
          + "RCE_TYPE_UNSPECIFIED\020\000\022\n\n\006AUTOML\020\001\022\n\n\006CU"
          + "STOM\020\002\022\010\n\004BQML\020\003B\316\001\n\036com.google.cloud.ai"
          + "platform.v1B\nModelProtoP\001ZDgoogle.golang"
          + ".org/genproto/googleapis/cloud/aiplatfor"
          + "m/v1;aiplatform\252\002\032Google.Cloud.AIPlatfor"
          + "m.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Goog"
          + "le::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Model_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Model_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_descriptor,
            new java.lang.String[] {
              "Name",
              "VersionId",
              "VersionAliases",
              "VersionCreateTime",
              "VersionUpdateTime",
              "DisplayName",
              "Description",
              "VersionDescription",
              "PredictSchemata",
              "MetadataSchemaUri",
              "Metadata",
              "SupportedExportFormats",
              "TrainingPipeline",
              "ContainerSpec",
              "ArtifactUri",
              "SupportedDeploymentResourcesTypes",
              "SupportedInputStorageFormats",
              "SupportedOutputStorageFormats",
              "CreateTime",
              "UpdateTime",
              "DeployedModels",
              "ExplanationSpec",
              "Etag",
              "Labels",
              "EncryptionSpec",
              "ModelSourceInfo",
              "MetadataArtifact",
            });
    internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_ExportFormat_descriptor,
            new java.lang.String[] {
              "Id", "ExportableContents",
            });
    internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Model_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Model_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_PredictSchemata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_PredictSchemata_descriptor,
            new java.lang.String[] {
              "InstanceSchemaUri", "ParametersSchemaUri", "PredictionSchemaUri",
            });
    internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelContainerSpec_descriptor,
            new java.lang.String[] {
              "ImageUri", "Command", "Args", "Env", "Ports", "PredictRoute", "HealthRoute",
            });
    internal_static_google_cloud_aiplatform_v1_Port_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_Port_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Port_descriptor,
            new java.lang.String[] {
              "ContainerPort",
            });
    internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ModelSourceInfo_descriptor,
            new java.lang.String[] {
              "SourceType",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.DeployedModelNameProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EnvVarProto.getDescriptor();
    com.google.cloud.aiplatform.v1.ExplanationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
