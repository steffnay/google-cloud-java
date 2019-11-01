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
// source: google/cloud/dialogflow/v2/audio_config.proto

package com.google.cloud.dialogflow.v2;

public interface InputAudioConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.v2.InputAudioConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
   */
  int getAudioEncodingValue();
  /**
   *
   *
   * <pre>
   * Required. Audio encoding of the audio content to process.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.AudioEncoding audio_encoding = 1;</code>
   */
  com.google.cloud.dialogflow.v2.AudioEncoding getAudioEncoding();

  /**
   *
   *
   * <pre>
   * Required. Sample rate (in Hertz) of the audio content sent in the query.
   * Refer to
   * [Cloud Speech API
   * documentation](https://cloud.google.com/speech-to-text/docs/basics) for
   * more details.
   * </pre>
   *
   * <code>int32 sample_rate_hertz = 2;</code>
   */
  int getSampleRateHertz();

  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  java.lang.String getLanguageCode();
  /**
   *
   *
   * <pre>
   * Required. The language of the supplied audio. Dialogflow does not do
   * translations. See [Language
   * Support](https://cloud.google.com/dialogflow/docs/reference/language)
   * for a list of the currently supported language codes. Note that queries in
   * the same session do not necessarily need to specify the same language.
   * </pre>
   *
   * <code>string language_code = 3;</code>
   */
  com.google.protobuf.ByteString getLanguageCodeBytes();

  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  java.util.List<java.lang.String> getPhraseHintsList();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  int getPhraseHintsCount();
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  java.lang.String getPhraseHints(int index);
  /**
   *
   *
   * <pre>
   * Optional. A list of strings containing words and phrases that the speech
   * recognizer should recognize with higher likelihood.
   * See [the Cloud Speech
   * documentation](https://cloud.google.com/speech-to-text/docs/basics#phrase-hints)
   * for more details.
   * </pre>
   *
   * <code>repeated string phrase_hints = 4;</code>
   */
  com.google.protobuf.ByteString getPhraseHintsBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Which variant of the [Speech model][google.cloud.dialogflow.v2.InputAudioConfig.model] to use.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechModelVariant model_variant = 10;</code>
   */
  int getModelVariantValue();
  /**
   *
   *
   * <pre>
   * Optional. Which variant of the [Speech model][google.cloud.dialogflow.v2.InputAudioConfig.model] to use.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.v2.SpeechModelVariant model_variant = 10;</code>
   */
  com.google.cloud.dialogflow.v2.SpeechModelVariant getModelVariant();

  /**
   *
   *
   * <pre>
   * Optional. If `false` (default), recognition does not cease until the
   * client closes the stream.
   * If `true`, the recognizer will detect a single spoken utterance in input
   * audio. Recognition ceases when it detects the audio's voice has
   * stopped or paused. In this case, once a detected intent is received, the
   * client should close the stream and start a new request with a new stream as
   * needed.
   * Note: This setting is relevant only for streaming methods.
   * Note: When specified, InputAudioConfig.single_utterance takes precedence
   * over StreamingDetectIntentRequest.single_utterance.
   * </pre>
   *
   * <code>bool single_utterance = 8;</code>
   */
  boolean getSingleUtterance();
}
