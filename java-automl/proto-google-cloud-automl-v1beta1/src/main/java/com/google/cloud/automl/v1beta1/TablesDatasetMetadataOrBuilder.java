// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/automl/v1beta1/tables.proto

package com.google.cloud.automl.v1beta1;

public interface TablesDatasetMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.TablesDatasetMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The table_spec_id of the primary table of this dataset.
   * </pre>
   *
   * <code>string primary_table_spec_id = 1;</code>
   */
  java.lang.String getPrimaryTableSpecId();
  /**
   *
   *
   * <pre>
   * Output only. The table_spec_id of the primary table of this dataset.
   * </pre>
   *
   * <code>string primary_table_spec_id = 1;</code>
   */
  com.google.protobuf.ByteString getPrimaryTableSpecIdBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * training &amp; prediction target.
   * This column must be non-nullable and have one of following data types
   * (otherwise model creation will error):
   * * CATEGORY
   * * ARRAY(CATEGORY)
   * * FLOAT64
   * Furthermore, if the type is CATEGORY or ARRAY(CATEGORY), then only up to
   * 40 unique values may exist in that column across all rows, but for
   * ARRAY(CATEGORY) unique values are counted as elements of the ARRAY (i.e.
   * following 3 ARRAY-s: [A, B], [A], [B] are counted as having 2 unique
   * values).
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string target_column_spec_id = 2;</code>
   */
  java.lang.String getTargetColumnSpecId();
  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * training &amp; prediction target.
   * This column must be non-nullable and have one of following data types
   * (otherwise model creation will error):
   * * CATEGORY
   * * ARRAY(CATEGORY)
   * * FLOAT64
   * Furthermore, if the type is CATEGORY or ARRAY(CATEGORY), then only up to
   * 40 unique values may exist in that column across all rows, but for
   * ARRAY(CATEGORY) unique values are counted as elements of the ARRAY (i.e.
   * following 3 ARRAY-s: [A, B], [A], [B] are counted as having 2 unique
   * values).
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string target_column_spec_id = 2;</code>
   */
  com.google.protobuf.ByteString getTargetColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * weight column, i.e. the higher the value the more important the row will be
   * during model training.
   * Required type: FLOAT64.
   * Allowed values: 0 to 10000, inclusive on both ends; 0 means the row is
   *                 ignored for training.
   * If not set all rows are assumed to have equal weight of 1.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string weight_column_spec_id = 3;</code>
   */
  java.lang.String getWeightColumnSpecId();
  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table's column that should be used as the
   * weight column, i.e. the higher the value the more important the row will be
   * during model training.
   * Required type: FLOAT64.
   * Allowed values: 0 to 10000, inclusive on both ends; 0 means the row is
   *                 ignored for training.
   * If not set all rows are assumed to have equal weight of 1.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string weight_column_spec_id = 3;</code>
   */
  com.google.protobuf.ByteString getWeightColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table column which specifies a possible ML
   * use of the row, i.e. the column will be used to split the rows into TRAIN,
   * VALIDATE and TEST sets.
   * Required type: STRING.
   * This column, if set, must either have all of `TRAIN`, `VALIDATE`, `TEST`
   * among its values, or only have `TEST`, `UNASSIGNED` values. In the latter
   * case the rows with `UNASSIGNED` value will be assigned by AutoML. Note
   * that if a given ml use distribution makes it impossible to create a "good"
   * model, that call will error describing the issue.
   * If both this column_spec_id and primary table's time_column_spec_id are not
   * set, then all rows are treated as `UNASSIGNED`.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string ml_use_column_spec_id = 4;</code>
   */
  java.lang.String getMlUseColumnSpecId();
  /**
   *
   *
   * <pre>
   * column_spec_id of the primary table column which specifies a possible ML
   * use of the row, i.e. the column will be used to split the rows into TRAIN,
   * VALIDATE and TEST sets.
   * Required type: STRING.
   * This column, if set, must either have all of `TRAIN`, `VALIDATE`, `TEST`
   * among its values, or only have `TEST`, `UNASSIGNED` values. In the latter
   * case the rows with `UNASSIGNED` value will be assigned by AutoML. Note
   * that if a given ml use distribution makes it impossible to create a "good"
   * model, that call will error describing the issue.
   * If both this column_spec_id and primary table's time_column_spec_id are not
   * set, then all rows are treated as `UNASSIGNED`.
   * NOTE: Updates of this field will instantly affect any other users
   * concurrently working with the dataset.
   * </pre>
   *
   * <code>string ml_use_column_spec_id = 4;</code>
   */
  com.google.protobuf.ByteString getMlUseColumnSpecIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   * [target_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column],
   * and other columns of the
   * [primary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  int getTargetColumnCorrelationsCount();
  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   * [target_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column],
   * and other columns of the
   * [primary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  boolean containsTargetColumnCorrelations(java.lang.String key);
  /** Use {@link #getTargetColumnCorrelationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.CorrelationStats>
      getTargetColumnCorrelations();
  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   * [target_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column],
   * and other columns of the
   * [primary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.automl.v1beta1.CorrelationStats>
      getTargetColumnCorrelationsMap();
  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   * [target_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column],
   * and other columns of the
   * [primary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  com.google.cloud.automl.v1beta1.CorrelationStats getTargetColumnCorrelationsOrDefault(
      java.lang.String key, com.google.cloud.automl.v1beta1.CorrelationStats defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. Correlations between
   * [target_column][google.cloud.automl.v1beta1.TablesDatasetMetadata.target_column],
   * and other columns of the
   * [primary_table][google.cloud.automl.v1beta1.TablesDatasetMetadata.primary_table_spec_id].
   * Only set if the target column is set. Mapping from other column spec id to
   * its CorrelationStats with the target column.
   * This field may be stale, see the stats_update_time field for
   * for the timestamp at which these stats were last updated.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.automl.v1beta1.CorrelationStats&gt; target_column_correlations = 6;
   * </code>
   */
  com.google.cloud.automl.v1beta1.CorrelationStats getTargetColumnCorrelationsOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * The most recent timestamp when target_column_correlations field and all
   * descendant ColumnSpec.data_stats and ColumnSpec.top_correlated_columns
   * fields were last (re-)generated. Any changes that happened to the dataset
   * afterwards are not reflected in these fields values. The regeneration
   * happens in the background on a best effort basis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp stats_update_time = 7;</code>
   */
  boolean hasStatsUpdateTime();
  /**
   *
   *
   * <pre>
   * The most recent timestamp when target_column_correlations field and all
   * descendant ColumnSpec.data_stats and ColumnSpec.top_correlated_columns
   * fields were last (re-)generated. Any changes that happened to the dataset
   * afterwards are not reflected in these fields values. The regeneration
   * happens in the background on a best effort basis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp stats_update_time = 7;</code>
   */
  com.google.protobuf.Timestamp getStatsUpdateTime();
  /**
   *
   *
   * <pre>
   * The most recent timestamp when target_column_correlations field and all
   * descendant ColumnSpec.data_stats and ColumnSpec.top_correlated_columns
   * fields were last (re-)generated. Any changes that happened to the dataset
   * afterwards are not reflected in these fields values. The regeneration
   * happens in the background on a best effort basis.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp stats_update_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getStatsUpdateTimeOrBuilder();
}
