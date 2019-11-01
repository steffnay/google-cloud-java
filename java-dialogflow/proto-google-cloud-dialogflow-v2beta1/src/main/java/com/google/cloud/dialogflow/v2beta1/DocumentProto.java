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
// source: google/cloud/dialogflow/v2beta1/document.proto

package com.google.cloud.dialogflow.v2beta1;

public final class DocumentProto {
  private DocumentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Document_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/dialogflow/v2beta1/docume"
          + "nt.proto\022\037google.cloud.dialogflow.v2beta"
          + "1\032\034google/api/annotations.proto\032)google/"
          + "cloud/dialogflow/v2beta1/gcs.proto\032#goog"
          + "le/longrunning/operations.proto\032\033google/"
          + "protobuf/empty.proto\032 google/protobuf/fi"
          + "eld_mask.proto\032\037google/protobuf/timestam"
          + "p.proto\032\027google/rpc/status.proto\032\027google"
          + "/api/client.proto\"\257\002\n\010Document\022\014\n\004name\030\001"
          + " \001(\t\022\024\n\014display_name\030\002 \001(\t\022\021\n\tmime_type\030"
          + "\003 \001(\t\022P\n\017knowledge_types\030\004 \003(\01627.google."
          + "cloud.dialogflow.v2beta1.Document.Knowle"
          + "dgeType\022\025\n\013content_uri\030\005 \001(\tH\000\022\025\n\007conten"
          + "t\030\006 \001(\tB\002\030\001H\000\022\025\n\013raw_content\030\t \001(\014H\000\"K\n\r"
          + "KnowledgeType\022\036\n\032KNOWLEDGE_TYPE_UNSPECIF"
          + "IED\020\000\022\007\n\003FAQ\020\001\022\021\n\rEXTRACTIVE_QA\020\002B\010\n\006sou"
          + "rce\"M\n\024ListDocumentsRequest\022\016\n\006parent\030\001 "
          + "\001(\t\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001"
          + "(\t\"n\n\025ListDocumentsResponse\022<\n\tdocuments"
          + "\030\001 \003(\0132).google.cloud.dialogflow.v2beta1"
          + ".Document\022\027\n\017next_page_token\030\002 \001(\t\"\"\n\022Ge"
          + "tDocumentRequest\022\014\n\004name\030\001 \001(\t\"d\n\025Create"
          + "DocumentRequest\022\016\n\006parent\030\001 \001(\t\022;\n\010docum"
          + "ent\030\002 \001(\0132).google.cloud.dialogflow.v2be"
          + "ta1.Document\"%\n\025DeleteDocumentRequest\022\014\n"
          + "\004name\030\001 \001(\t\"\205\001\n\025UpdateDocumentRequest\022;\n"
          + "\010document\030\001 \001(\0132).google.cloud.dialogflo"
          + "w.v2beta1.Document\022/\n\013update_mask\030\002 \001(\0132"
          + "\032.google.protobuf.FieldMask\"\262\001\n\032Knowledg"
          + "eOperationMetadata\022P\n\005state\030\001 \001(\0162A.goog"
          + "le.cloud.dialogflow.v2beta1.KnowledgeOpe"
          + "rationMetadata.State\"B\n\005State\022\025\n\021STATE_U"
          + "NSPECIFIED\020\000\022\013\n\007PENDING\020\001\022\013\n\007RUNNING\020\002\022\010"
          + "\n\004DONE\020\003\"q\n\025ReloadDocumentRequest\022\014\n\004nam"
          + "e\030\001 \001(\t\022@\n\ngcs_source\030\003 \001(\0132*.google.clo"
          + "ud.dialogflow.v2beta1.GcsSourceH\000B\010\n\006sou"
          + "rce2\201\r\n\tDocuments\022\201\002\n\rListDocuments\0225.go"
          + "ogle.cloud.dialogflow.v2beta1.ListDocume"
          + "ntsRequest\0326.google.cloud.dialogflow.v2b"
          + "eta1.ListDocumentsResponse\"\200\001\202\323\344\223\002z\0227/v2"
          + "beta1/{parent=projects/*/knowledgeBases/"
          + "*}/documentsZ?\022=/v2beta1/{parent=project"
          + "s/*/agent/knowledgeBases/*}/documents\022\360\001"
          + "\n\013GetDocument\0223.google.cloud.dialogflow."
          + "v2beta1.GetDocumentRequest\032).google.clou"
          + "d.dialogflow.v2beta1.Document\"\200\001\202\323\344\223\002z\0227"
          + "/v2beta1/{name=projects/*/knowledgeBases"
          + "/*/documents/*}Z?\022=/v2beta1/{name=projec"
          + "ts/*/agent/knowledgeBases/*/documents/*}"
          + "\022\377\001\n\016CreateDocument\0226.google.cloud.dialo"
          + "gflow.v2beta1.CreateDocumentRequest\032\035.go"
          + "ogle.longrunning.Operation\"\225\001\202\323\344\223\002\216\001\"7/v"
          + "2beta1/{parent=projects/*/knowledgeBases"
          + "/*}/documents:\010documentZI\"=/v2beta1/{par"
          + "ent=projects/*/agent/knowledgeBases/*}/d"
          + "ocuments:\010document\022\352\001\n\016DeleteDocument\0226."
          + "google.cloud.dialogflow.v2beta1.DeleteDo"
          + "cumentRequest\032\035.google.longrunning.Opera"
          + "tion\"\200\001\202\323\344\223\002z*7/v2beta1/{name=projects/*"
          + "/knowledgeBases/*/documents/*}Z?*=/v2bet"
          + "a1/{name=projects/*/agent/knowledgeBases"
          + "/*/documents/*}\022\221\002\n\016UpdateDocument\0226.goo"
          + "gle.cloud.dialogflow.v2beta1.UpdateDocum"
          + "entRequest\032\035.google.longrunning.Operatio"
          + "n\"\247\001\202\323\344\223\002\240\0012@/v2beta1/{document.name=pro"
          + "jects/*/knowledgeBases/*/documents/*}:\010d"
          + "ocumentZR2F/v2beta1/{document.name=proje"
          + "cts/*/agent/knowledgeBases/*/documents/*"
          + "}:\010document\022\377\001\n\016ReloadDocument\0226.google."
          + "cloud.dialogflow.v2beta1.ReloadDocumentR"
          + "equest\032\035.google.longrunning.Operation\"\225\001"
          + "\202\323\344\223\002\216\001\">/v2beta1/{name=projects/*/knowl"
          + "edgeBases/*/documents/*}:reload:\001*ZI\"D/v"
          + "2beta1/{name=projects/*/agent/knowledgeB"
          + "ases/*/documents/*}:reload:\001*\032x\312A\031dialog"
          + "flow.googleapis.com\322AYhttps://www.google"
          + "apis.com/auth/cloud-platform,https://www"
          + ".googleapis.com/auth/dialogflowB\253\001\n#com."
          + "google.cloud.dialogflow.v2beta1B\rDocumen"
          + "tProtoP\001ZIgoogle.golang.org/genproto/goo"
          + "gleapis/cloud/dialogflow/v2beta1;dialogf"
          + "low\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V2"
          + "beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.cloud.dialogflow.v2beta1.GcsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.TimestampProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
          com.google.api.ClientProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Document_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Document_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "MimeType",
              "KnowledgeTypes",
              "ContentUri",
              "Content",
              "RawContent",
              "Source",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ListDocumentsResponse_descriptor,
            new java.lang.String[] {
              "Documents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_CreateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Document",
            });
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_DeleteDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_UpdateDocumentRequest_descriptor,
            new java.lang.String[] {
              "Document", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_KnowledgeOperationMetadata_descriptor,
            new java.lang.String[] {
              "State",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ReloadDocumentRequest_descriptor,
            new java.lang.String[] {
              "Name", "GcsSource", "Source",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.cloud.dialogflow.v2beta1.GcsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
