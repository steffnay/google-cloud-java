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
// source: google/cloud/dialogflow/v2/intent.proto

package com.google.cloud.dialogflow.v2;

public interface IntentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.Intent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The unique identifier of this intent.
   * Required for [Intents.UpdateIntent][google.cloud.dialogflow.v2.Intents.UpdateIntent] and [Intents.BatchUpdateIntents][google.cloud.dialogflow.v2.Intents.BatchUpdateIntents]
   * methods.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The unique identifier of this intent.
   * Required for [Intents.UpdateIntent][google.cloud.dialogflow.v2.Intents.UpdateIntent] and [Intents.BatchUpdateIntents][google.cloud.dialogflow.v2.Intents.BatchUpdateIntents]
   * methods.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The name of this intent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Required. The name of this intent.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether webhooks are enabled for the intent.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Intent.WebhookState webhook_state = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getWebhookStateValue();
  /**
   *
   *
   * <pre>
   * Optional. Indicates whether webhooks are enabled for the intent.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.Intent.WebhookState webhook_state = 6 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.WebhookState getWebhookState();

  /**
   *
   *
   * <pre>
   * Optional. The priority of this intent. Higher numbers represent higher
   * priorities. If this is zero or unspecified, we use the default
   * priority 500000.
   * Negative numbers mean that the intent is disabled.
   * </pre>
   *
   * <code>int32 priority = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getPriority();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether this is a fallback intent.
   * </pre>
   *
   * <code>bool is_fallback = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean getIsFallback();

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether Machine Learning is disabled for the intent.
   * Note: If `ml_diabled` setting is set to true, then this intent is not
   * taken into account during inference in `ML ONLY` match mode. Also,
   * auto-markup in the UI is turned off.
   * </pre>
   *
   * <code>bool ml_disabled = 19 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean getMlDisabled();

  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<java.lang.String> getInputContextNamesList();
  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getInputContextNamesCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getInputContextNames(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of context names required for this intent to be
   * triggered.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>repeated string input_context_names = 7 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getInputContextNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.List<java.lang.String> getEventsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getEventsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getEvents(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of event names that trigger the intent.
   * If the collection of input contexts is not empty, all of the contexts must
   * be present in the active user session for an event to trigger this intent.
   * </pre>
   *
   * <code>repeated string events = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getEventsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.TrainingPhrase training_phrases = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent.TrainingPhrase> getTrainingPhrasesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.TrainingPhrase training_phrases = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.TrainingPhrase getTrainingPhrases(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.TrainingPhrase training_phrases = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getTrainingPhrasesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.TrainingPhrase training_phrases = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.Intent.TrainingPhraseOrBuilder>
      getTrainingPhrasesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of examples that the agent is
   * trained on.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.TrainingPhrase training_phrases = 9 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.TrainingPhraseOrBuilder getTrainingPhrasesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The name of the action associated with the intent.
   * Note: The action name must not contain whitespaces.
   * </pre>
   *
   * <code>string action = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getAction();
  /**
   *
   *
   * <pre>
   * Optional. The name of the action associated with the intent.
   * Note: The action name must not contain whitespaces.
   * </pre>
   *
   * <code>string action = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.ByteString getActionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Context output_contexts = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Context> getOutputContextsList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Context output_contexts = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Context getOutputContexts(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Context output_contexts = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getOutputContextsCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Context output_contexts = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.ContextOrBuilder>
      getOutputContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of contexts that are activated when the intent
   * is matched. Context messages in this collection should not set the
   * parameters field. Setting the `lifespan_count` to 0 will reset the context
   * when the intent is matched.
   * Format: `projects/&lt;Project ID&gt;/agent/sessions/-/contexts/&lt;Context ID&gt;`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Context output_contexts = 11 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.ContextOrBuilder getOutputContextsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Indicates whether to delete all contexts in the current
   * session when this intent is matched.
   * </pre>
   *
   * <code>bool reset_contexts = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean getResetContexts();

  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Parameter parameters = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent.Parameter> getParametersList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Parameter parameters = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.Parameter getParameters(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Parameter parameters = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getParametersCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Parameter parameters = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.Intent.ParameterOrBuilder>
      getParametersOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of parameters associated with the intent.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Parameter parameters = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.ParameterOrBuilder getParametersOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message messages = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent.Message> getMessagesList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message messages = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.Message getMessages(int index);
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message messages = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message messages = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.Intent.MessageOrBuilder>
      getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. The collection of rich messages corresponding to the
   * `Response` field in the Dialogflow console.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message messages = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.MessageOrBuilder getMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message.Platform default_response_platforms = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent.Message.Platform>
      getDefaultResponsePlatformsList();
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message.Platform default_response_platforms = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getDefaultResponsePlatformsCount();
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message.Platform default_response_platforms = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.Message.Platform getDefaultResponsePlatforms(int index);
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message.Platform default_response_platforms = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<java.lang.Integer> getDefaultResponsePlatformsValueList();
  /**
   *
   *
   * <pre>
   * Optional. The list of platforms for which the first responses will be
   * copied from the messages in PLATFORM_UNSPECIFIED (i.e. default platform).
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dialogflow.v2.Intent.Message.Platform default_response_platforms = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getDefaultResponsePlatformsValue(int index);

  /**
   *
   *
   * <pre>
   * Read-only. The unique identifier of the root intent in the chain of
   * followup intents. It identifies the correct followup intents chain for
   * this intent. We populate this field only in the output.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string root_followup_intent_name = 16;</code>
   */
  java.lang.String getRootFollowupIntentName();
  /**
   *
   *
   * <pre>
   * Read-only. The unique identifier of the root intent in the chain of
   * followup intents. It identifies the correct followup intents chain for
   * this intent. We populate this field only in the output.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string root_followup_intent_name = 16;</code>
   */
  com.google.protobuf.ByteString getRootFollowupIntentNameBytes();

  /**
   *
   *
   * <pre>
   * Read-only after creation. The unique identifier of the parent intent in the
   * chain of followup intents. You can set this field when creating an intent,
   * for example with [CreateIntent][] or [BatchUpdateIntents][], in order to
   * make this intent a followup intent.
   * It identifies the parent followup intent.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string parent_followup_intent_name = 17;</code>
   */
  java.lang.String getParentFollowupIntentName();
  /**
   *
   *
   * <pre>
   * Read-only after creation. The unique identifier of the parent intent in the
   * chain of followup intents. You can set this field when creating an intent,
   * for example with [CreateIntent][] or [BatchUpdateIntents][], in order to
   * make this intent a followup intent.
   * It identifies the parent followup intent.
   * Format: `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
   * </pre>
   *
   * <code>string parent_followup_intent_name = 17;</code>
   */
  com.google.protobuf.ByteString getParentFollowupIntentNameBytes();

  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  java.util.List<com.google.cloud.dialogflow.v2.Intent.FollowupIntentInfo>
      getFollowupIntentInfoList();
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.FollowupIntentInfo getFollowupIntentInfo(int index);
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  int getFollowupIntentInfoCount();
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  java.util.List<? extends com.google.cloud.dialogflow.v2.Intent.FollowupIntentInfoOrBuilder>
      getFollowupIntentInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Read-only. Information about all followup intents that have this intent as
   * a direct or indirect parent. We populate this field only in the output.
   * </pre>
   *
   * <code>repeated .google.cloud.dialogflow.v2.Intent.FollowupIntentInfo followup_intent_info = 18;
   * </code>
   */
  com.google.cloud.dialogflow.v2.Intent.FollowupIntentInfoOrBuilder getFollowupIntentInfoOrBuilder(
      int index);
}
