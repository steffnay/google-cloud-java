/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.dialogflow.cx.v3beta1.stub;

import static com.google.cloud.dialogflow.cx.v3beta1.IntentsClient.ListIntentsPagedResponse;
import static com.google.cloud.dialogflow.cx.v3beta1.IntentsClient.ListLocationsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.core.InternalApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.core.BackgroundResourceAggregation;
import com.google.api.gax.httpjson.ApiMethodDescriptor;
import com.google.api.gax.httpjson.HttpJsonCallSettings;
import com.google.api.gax.httpjson.HttpJsonStubCallableFactory;
import com.google.api.gax.httpjson.ProtoMessageRequestFormatter;
import com.google.api.gax.httpjson.ProtoMessageResponseParser;
import com.google.api.gax.httpjson.ProtoRestSerializer;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.dialogflow.cx.v3beta1.CreateIntentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.DeleteIntentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.GetIntentRequest;
import com.google.cloud.dialogflow.cx.v3beta1.Intent;
import com.google.cloud.dialogflow.cx.v3beta1.ListIntentsRequest;
import com.google.cloud.dialogflow.cx.v3beta1.ListIntentsResponse;
import com.google.cloud.dialogflow.cx.v3beta1.UpdateIntentRequest;
import com.google.cloud.location.GetLocationRequest;
import com.google.cloud.location.ListLocationsRequest;
import com.google.cloud.location.ListLocationsResponse;
import com.google.cloud.location.Location;
import com.google.protobuf.Empty;
import com.google.protobuf.TypeRegistry;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * REST stub implementation for the Intents service API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class HttpJsonIntentsStub extends IntentsStub {
  private static final TypeRegistry typeRegistry = TypeRegistry.newBuilder().build();

  private static final ApiMethodDescriptor<ListIntentsRequest, ListIntentsResponse>
      listIntentsMethodDescriptor =
          ApiMethodDescriptor.<ListIntentsRequest, ListIntentsResponse>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Intents/ListIntents")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListIntentsRequest>newBuilder()
                      .setPath(
                          "/v3beta1/{parent=projects/*/locations/*/agents/*}/intents",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListIntentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListIntentsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "intentView", request.getIntentViewValue());
                            serializer.putQueryParam(
                                fields, "languageCode", request.getLanguageCode());
                            serializer.putQueryParam(fields, "pageSize", request.getPageSize());
                            serializer.putQueryParam(fields, "pageToken", request.getPageToken());
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListIntentsResponse>newBuilder()
                      .setDefaultInstance(ListIntentsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetIntentRequest, Intent> getIntentMethodDescriptor =
      ApiMethodDescriptor.<GetIntentRequest, Intent>newBuilder()
          .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Intents/GetIntent")
          .setHttpMethod("GET")
          .setType(ApiMethodDescriptor.MethodType.UNARY)
          .setRequestFormatter(
              ProtoMessageRequestFormatter.<GetIntentRequest>newBuilder()
                  .setPath(
                      "/v3beta1/{name=projects/*/locations/*/agents/*/intents/*}",
                      request -> {
                        Map<String, String> fields = new HashMap<>();
                        ProtoRestSerializer<GetIntentRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putPathParam(fields, "name", request.getName());
                        return fields;
                      })
                  .setQueryParamsExtractor(
                      request -> {
                        Map<String, List<String>> fields = new HashMap<>();
                        ProtoRestSerializer<GetIntentRequest> serializer =
                            ProtoRestSerializer.create();
                        serializer.putQueryParam(fields, "languageCode", request.getLanguageCode());
                        return fields;
                      })
                  .setRequestBodyExtractor(request -> null)
                  .build())
          .setResponseParser(
              ProtoMessageResponseParser.<Intent>newBuilder()
                  .setDefaultInstance(Intent.getDefaultInstance())
                  .setDefaultTypeRegistry(typeRegistry)
                  .build())
          .build();

  private static final ApiMethodDescriptor<CreateIntentRequest, Intent>
      createIntentMethodDescriptor =
          ApiMethodDescriptor.<CreateIntentRequest, Intent>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Intents/CreateIntent")
              .setHttpMethod("POST")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<CreateIntentRequest>newBuilder()
                      .setPath(
                          "/v3beta1/{parent=projects/*/locations/*/agents/*}/intents",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<CreateIntentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "parent", request.getParent());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<CreateIntentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "languageCode", request.getLanguageCode());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("intent", request.getIntent(), false))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Intent>newBuilder()
                      .setDefaultInstance(Intent.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<UpdateIntentRequest, Intent>
      updateIntentMethodDescriptor =
          ApiMethodDescriptor.<UpdateIntentRequest, Intent>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Intents/UpdateIntent")
              .setHttpMethod("PATCH")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<UpdateIntentRequest>newBuilder()
                      .setPath(
                          "/v3beta1/{intent.name=projects/*/locations/*/agents/*/intents/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateIntentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(
                                fields, "intent.name", request.getIntent().getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<UpdateIntentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putQueryParam(
                                fields, "languageCode", request.getLanguageCode());
                            serializer.putQueryParam(fields, "updateMask", request.getUpdateMask());
                            return fields;
                          })
                      .setRequestBodyExtractor(
                          request ->
                              ProtoRestSerializer.create()
                                  .toBody("intent", request.getIntent(), false))
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Intent>newBuilder()
                      .setDefaultInstance(Intent.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<DeleteIntentRequest, Empty>
      deleteIntentMethodDescriptor =
          ApiMethodDescriptor.<DeleteIntentRequest, Empty>newBuilder()
              .setFullMethodName("google.cloud.dialogflow.cx.v3beta1.Intents/DeleteIntent")
              .setHttpMethod("DELETE")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<DeleteIntentRequest>newBuilder()
                      .setPath(
                          "/v3beta1/{name=projects/*/locations/*/agents/*/intents/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteIntentRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<DeleteIntentRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Empty>newBuilder()
                      .setDefaultInstance(Empty.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<ListLocationsRequest, ListLocationsResponse>
      listLocationsMethodDescriptor =
          ApiMethodDescriptor.<ListLocationsRequest, ListLocationsResponse>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/ListLocations")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<ListLocationsRequest>newBuilder()
                      .setPath(
                          "/v3beta1/{name=projects/*}/locations",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<ListLocationsRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<ListLocationsResponse>newBuilder()
                      .setDefaultInstance(ListLocationsResponse.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private static final ApiMethodDescriptor<GetLocationRequest, Location>
      getLocationMethodDescriptor =
          ApiMethodDescriptor.<GetLocationRequest, Location>newBuilder()
              .setFullMethodName("google.cloud.location.Locations/GetLocation")
              .setHttpMethod("GET")
              .setType(ApiMethodDescriptor.MethodType.UNARY)
              .setRequestFormatter(
                  ProtoMessageRequestFormatter.<GetLocationRequest>newBuilder()
                      .setPath(
                          "/v3beta1/{name=projects/*/locations/*}",
                          request -> {
                            Map<String, String> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            serializer.putPathParam(fields, "name", request.getName());
                            return fields;
                          })
                      .setQueryParamsExtractor(
                          request -> {
                            Map<String, List<String>> fields = new HashMap<>();
                            ProtoRestSerializer<GetLocationRequest> serializer =
                                ProtoRestSerializer.create();
                            return fields;
                          })
                      .setRequestBodyExtractor(request -> null)
                      .build())
              .setResponseParser(
                  ProtoMessageResponseParser.<Location>newBuilder()
                      .setDefaultInstance(Location.getDefaultInstance())
                      .setDefaultTypeRegistry(typeRegistry)
                      .build())
              .build();

  private final UnaryCallable<ListIntentsRequest, ListIntentsResponse> listIntentsCallable;
  private final UnaryCallable<ListIntentsRequest, ListIntentsPagedResponse>
      listIntentsPagedCallable;
  private final UnaryCallable<GetIntentRequest, Intent> getIntentCallable;
  private final UnaryCallable<CreateIntentRequest, Intent> createIntentCallable;
  private final UnaryCallable<UpdateIntentRequest, Intent> updateIntentCallable;
  private final UnaryCallable<DeleteIntentRequest, Empty> deleteIntentCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable;
  private final UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable;
  private final UnaryCallable<GetLocationRequest, Location> getLocationCallable;

  private final BackgroundResource backgroundResources;
  private final HttpJsonStubCallableFactory callableFactory;

  public static final HttpJsonIntentsStub create(IntentsStubSettings settings) throws IOException {
    return new HttpJsonIntentsStub(settings, ClientContext.create(settings));
  }

  public static final HttpJsonIntentsStub create(ClientContext clientContext) throws IOException {
    return new HttpJsonIntentsStub(IntentsStubSettings.newHttpJsonBuilder().build(), clientContext);
  }

  public static final HttpJsonIntentsStub create(
      ClientContext clientContext, HttpJsonStubCallableFactory callableFactory) throws IOException {
    return new HttpJsonIntentsStub(
        IntentsStubSettings.newHttpJsonBuilder().build(), clientContext, callableFactory);
  }

  /**
   * Constructs an instance of HttpJsonIntentsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonIntentsStub(IntentsStubSettings settings, ClientContext clientContext)
      throws IOException {
    this(settings, clientContext, new HttpJsonIntentsCallableFactory());
  }

  /**
   * Constructs an instance of HttpJsonIntentsStub, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected HttpJsonIntentsStub(
      IntentsStubSettings settings,
      ClientContext clientContext,
      HttpJsonStubCallableFactory callableFactory)
      throws IOException {
    this.callableFactory = callableFactory;

    HttpJsonCallSettings<ListIntentsRequest, ListIntentsResponse> listIntentsTransportSettings =
        HttpJsonCallSettings.<ListIntentsRequest, ListIntentsResponse>newBuilder()
            .setMethodDescriptor(listIntentsMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<GetIntentRequest, Intent> getIntentTransportSettings =
        HttpJsonCallSettings.<GetIntentRequest, Intent>newBuilder()
            .setMethodDescriptor(getIntentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<CreateIntentRequest, Intent> createIntentTransportSettings =
        HttpJsonCallSettings.<CreateIntentRequest, Intent>newBuilder()
            .setMethodDescriptor(createIntentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<UpdateIntentRequest, Intent> updateIntentTransportSettings =
        HttpJsonCallSettings.<UpdateIntentRequest, Intent>newBuilder()
            .setMethodDescriptor(updateIntentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<DeleteIntentRequest, Empty> deleteIntentTransportSettings =
        HttpJsonCallSettings.<DeleteIntentRequest, Empty>newBuilder()
            .setMethodDescriptor(deleteIntentMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();
    HttpJsonCallSettings<ListLocationsRequest, ListLocationsResponse>
        listLocationsTransportSettings =
            HttpJsonCallSettings.<ListLocationsRequest, ListLocationsResponse>newBuilder()
                .setMethodDescriptor(listLocationsMethodDescriptor)
                .setTypeRegistry(typeRegistry)
                .build();
    HttpJsonCallSettings<GetLocationRequest, Location> getLocationTransportSettings =
        HttpJsonCallSettings.<GetLocationRequest, Location>newBuilder()
            .setMethodDescriptor(getLocationMethodDescriptor)
            .setTypeRegistry(typeRegistry)
            .build();

    this.listIntentsCallable =
        callableFactory.createUnaryCallable(
            listIntentsTransportSettings, settings.listIntentsSettings(), clientContext);
    this.listIntentsPagedCallable =
        callableFactory.createPagedCallable(
            listIntentsTransportSettings, settings.listIntentsSettings(), clientContext);
    this.getIntentCallable =
        callableFactory.createUnaryCallable(
            getIntentTransportSettings, settings.getIntentSettings(), clientContext);
    this.createIntentCallable =
        callableFactory.createUnaryCallable(
            createIntentTransportSettings, settings.createIntentSettings(), clientContext);
    this.updateIntentCallable =
        callableFactory.createUnaryCallable(
            updateIntentTransportSettings, settings.updateIntentSettings(), clientContext);
    this.deleteIntentCallable =
        callableFactory.createUnaryCallable(
            deleteIntentTransportSettings, settings.deleteIntentSettings(), clientContext);
    this.listLocationsCallable =
        callableFactory.createUnaryCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.listLocationsPagedCallable =
        callableFactory.createPagedCallable(
            listLocationsTransportSettings, settings.listLocationsSettings(), clientContext);
    this.getLocationCallable =
        callableFactory.createUnaryCallable(
            getLocationTransportSettings, settings.getLocationSettings(), clientContext);

    this.backgroundResources =
        new BackgroundResourceAggregation(clientContext.getBackgroundResources());
  }

  @InternalApi
  public static List<ApiMethodDescriptor> getMethodDescriptors() {
    List<ApiMethodDescriptor> methodDescriptors = new ArrayList<>();
    methodDescriptors.add(listIntentsMethodDescriptor);
    methodDescriptors.add(getIntentMethodDescriptor);
    methodDescriptors.add(createIntentMethodDescriptor);
    methodDescriptors.add(updateIntentMethodDescriptor);
    methodDescriptors.add(deleteIntentMethodDescriptor);
    methodDescriptors.add(listLocationsMethodDescriptor);
    methodDescriptors.add(getLocationMethodDescriptor);
    return methodDescriptors;
  }

  @Override
  public UnaryCallable<ListIntentsRequest, ListIntentsResponse> listIntentsCallable() {
    return listIntentsCallable;
  }

  @Override
  public UnaryCallable<ListIntentsRequest, ListIntentsPagedResponse> listIntentsPagedCallable() {
    return listIntentsPagedCallable;
  }

  @Override
  public UnaryCallable<GetIntentRequest, Intent> getIntentCallable() {
    return getIntentCallable;
  }

  @Override
  public UnaryCallable<CreateIntentRequest, Intent> createIntentCallable() {
    return createIntentCallable;
  }

  @Override
  public UnaryCallable<UpdateIntentRequest, Intent> updateIntentCallable() {
    return updateIntentCallable;
  }

  @Override
  public UnaryCallable<DeleteIntentRequest, Empty> deleteIntentCallable() {
    return deleteIntentCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsResponse> listLocationsCallable() {
    return listLocationsCallable;
  }

  @Override
  public UnaryCallable<ListLocationsRequest, ListLocationsPagedResponse>
      listLocationsPagedCallable() {
    return listLocationsPagedCallable;
  }

  @Override
  public UnaryCallable<GetLocationRequest, Location> getLocationCallable() {
    return getLocationCallable;
  }

  @Override
  public final void close() {
    try {
      backgroundResources.close();
    } catch (RuntimeException e) {
      throw e;
    } catch (Exception e) {
      throw new IllegalStateException("Failed to close resource", e);
    }
  }

  @Override
  public void shutdown() {
    backgroundResources.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return backgroundResources.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return backgroundResources.isTerminated();
  }

  @Override
  public void shutdownNow() {
    backgroundResources.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return backgroundResources.awaitTermination(duration, unit);
  }
}
