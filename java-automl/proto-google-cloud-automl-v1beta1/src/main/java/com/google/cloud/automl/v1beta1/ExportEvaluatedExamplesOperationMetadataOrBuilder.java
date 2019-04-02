// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/operations.proto

package com.google.cloud.automl.v1beta1;

public interface ExportEvaluatedExamplesOperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Information further describing the output of this evaluated
   * examples export.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo output_info = 2;
   * </code>
   */
  boolean hasOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing the output of this evaluated
   * examples export.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo output_info = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata
          .ExportEvaluatedExamplesOutputInfo
      getOutputInfo();
  /**
   *
   *
   * <pre>
   * Output only. Information further describing the output of this evaluated
   * examples export.
   * </pre>
   *
   * <code>
   * .google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata.ExportEvaluatedExamplesOutputInfo output_info = 2;
   * </code>
   */
  com.google.cloud.automl.v1beta1.ExportEvaluatedExamplesOperationMetadata
          .ExportEvaluatedExamplesOutputInfoOrBuilder
      getOutputInfoOrBuilder();
}
