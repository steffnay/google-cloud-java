// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/container/v1/cluster_service.proto

package com.google.container.v1;

public interface SetNodePoolAutoscalingRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.SetNodePoolAutoscalingRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getProjectId();
  /**
   * <pre>
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840).
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string project_id = 1 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getZone();
  /**
   * <pre>
   * Deprecated. The name of the Google Compute Engine
   * [zone](/compute/docs/zones#available) in which the cluster
   * resides.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string zone = 2 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getZoneBytes();

  /**
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getClusterId();
  /**
   * <pre>
   * Deprecated. The name of the cluster to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string cluster_id = 3 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getClusterIdBytes();

  /**
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated java.lang.String getNodePoolId();
  /**
   * <pre>
   * Deprecated. The name of the node pool to upgrade.
   * This field has been deprecated and replaced by the name field.
   * </pre>
   *
   * <code>string node_pool_id = 4 [deprecated = true];</code>
   */
  @java.lang.Deprecated com.google.protobuf.ByteString
      getNodePoolIdBytes();

  /**
   * <pre>
   * Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
   */
  boolean hasAutoscaling();
  /**
   * <pre>
   * Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
   */
  com.google.container.v1.NodePoolAutoscaling getAutoscaling();
  /**
   * <pre>
   * Autoscaling configuration for the node pool.
   * </pre>
   *
   * <code>.google.container.v1.NodePoolAutoscaling autoscaling = 5;</code>
   */
  com.google.container.v1.NodePoolAutoscalingOrBuilder getAutoscalingOrBuilder();

  /**
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to set
   * autoscaler settings. Specified in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;'.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * The name (project, location, cluster, node pool) of the node pool to set
   * autoscaler settings. Specified in the format
   * 'projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;&#47;nodePools/&#42;'.
   * </pre>
   *
   * <code>string name = 6;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();
}
