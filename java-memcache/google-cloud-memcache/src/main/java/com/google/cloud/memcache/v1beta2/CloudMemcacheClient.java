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

package com.google.cloud.memcache.v1beta2;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.httpjson.longrunning.OperationsClient;
import com.google.api.gax.longrunning.OperationFuture;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.memcache.v1beta2.stub.CloudMemcacheStub;
import com.google.cloud.memcache.v1beta2.stub.CloudMemcacheStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import com.google.protobuf.FieldMask;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Service Description: Configures and manages Cloud Memorystore for Memcached instances.
 *
 * <p>The `memcache.googleapis.com` service implements the Google Cloud Memorystore for Memcached
 * API and defines the following resource model for managing Memorystore Memcached (also called
 * Memcached below) instances:
 *
 * <ul>
 *   <li>The service works with a collection of cloud projects, named: `/projects/&#42;`
 *   <li>Each project has a collection of available locations, named: `/locations/&#42;`
 *   <li>Each location has a collection of Memcached instances, named: `/instances/&#42;`
 *   <li>As such, Memcached instances are resources of the form:
 *       `/projects/{project_id}/locations/{location_id}/instances/{instance_id}`
 * </ul>
 *
 * <p>Note that location_id must be a GCP `region`; for example:
 *
 * <ul>
 *   <li>`projects/my-memcached-project/locations/us-central1/instances/my-memcached`
 * </ul>
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
 *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
 *   Instance response = cloudMemcacheClient.getInstance(name);
 * }
 * }</pre>
 *
 * <p>Note: close() needs to be called on the CloudMemcacheClient object to clean up resources such
 * as threads. In the example above, try-with-resources is used, which automatically calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of CloudMemcacheSettings to
 * create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudMemcacheSettings cloudMemcacheSettings =
 *     CloudMemcacheSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create(cloudMemcacheSettings);
 * }</pre>
 *
 * <p>To customize the endpoint:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudMemcacheSettings cloudMemcacheSettings =
 *     CloudMemcacheSettings.newBuilder().setEndpoint(myEndpoint).build();
 * CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create(cloudMemcacheSettings);
 * }</pre>
 *
 * <p>To use REST (HTTP1.1/JSON) transport (instead of gRPC) for sending and receiving requests over
 * the wire:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * CloudMemcacheSettings cloudMemcacheSettings =
 *     CloudMemcacheSettings.newHttpJsonBuilder().build();
 * CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create(cloudMemcacheSettings);
 * }</pre>
 *
 * <p>Please refer to the GitHub repository's samples for more quickstart code snippets.
 */
@BetaApi
@Generated("by gapic-generator-java")
public class CloudMemcacheClient implements BackgroundResource {
  private final CloudMemcacheSettings settings;
  private final CloudMemcacheStub stub;
  private final OperationsClient httpJsonOperationsClient;
  private final com.google.longrunning.OperationsClient operationsClient;

  /** Constructs an instance of CloudMemcacheClient with default settings. */
  public static final CloudMemcacheClient create() throws IOException {
    return create(CloudMemcacheSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of CloudMemcacheClient, using the given settings. The channels are
   * created based on the settings passed in, or defaults for any settings that are not set.
   */
  public static final CloudMemcacheClient create(CloudMemcacheSettings settings)
      throws IOException {
    return new CloudMemcacheClient(settings);
  }

  /**
   * Constructs an instance of CloudMemcacheClient, using the given stub for making calls. This is
   * for advanced usage - prefer using create(CloudMemcacheSettings).
   */
  public static final CloudMemcacheClient create(CloudMemcacheStub stub) {
    return new CloudMemcacheClient(stub);
  }

  /**
   * Constructs an instance of CloudMemcacheClient, using the given settings. This is protected so
   * that it is easy to make a subclass, but otherwise, the static factory methods should be
   * preferred.
   */
  protected CloudMemcacheClient(CloudMemcacheSettings settings) throws IOException {
    this.settings = settings;
    this.stub = ((CloudMemcacheStubSettings) settings.getStubSettings()).createStub();
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  protected CloudMemcacheClient(CloudMemcacheStub stub) {
    this.settings = null;
    this.stub = stub;
    this.operationsClient =
        com.google.longrunning.OperationsClient.create(this.stub.getOperationsStub());
    this.httpJsonOperationsClient = OperationsClient.create(this.stub.getHttpJsonOperationsStub());
  }

  public final CloudMemcacheSettings getSettings() {
    return settings;
  }

  public CloudMemcacheStub getStub() {
    return stub;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  public final com.google.longrunning.OperationsClient getOperationsClient() {
    return operationsClient;
  }

  /**
   * Returns the OperationsClient that can be used to query the status of a long-running operation
   * returned by another API method call.
   */
  @BetaApi
  public final OperationsClient getHttpJsonOperationsClient() {
    return httpJsonOperationsClient;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Instances in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   for (Instance element : cloudMemcacheClient.listInstances(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInstancesPagedResponse listInstances(LocationName parent) {
    ListInstancesRequest request =
        ListInstancesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Instances in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   for (Instance element : cloudMemcacheClient.listInstances(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInstancesPagedResponse listInstances(String parent) {
    ListInstancesRequest request = ListInstancesRequest.newBuilder().setParent(parent).build();
    return listInstances(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Instances in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ListInstancesRequest request =
   *       ListInstancesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   for (Instance element : cloudMemcacheClient.listInstances(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListInstancesPagedResponse listInstances(ListInstancesRequest request) {
    return listInstancesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Instances in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ListInstancesRequest request =
   *       ListInstancesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   ApiFuture<Instance> future =
   *       cloudMemcacheClient.listInstancesPagedCallable().futureCall(request);
   *   // Do something.
   *   for (Instance element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInstancesRequest, ListInstancesPagedResponse>
      listInstancesPagedCallable() {
    return stub.listInstancesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Lists Instances in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ListInstancesRequest request =
   *       ListInstancesRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setPageSize(883849137)
   *           .setPageToken("pageToken873572522")
   *           .setFilter("filter-1274492040")
   *           .setOrderBy("orderBy-1207110587")
   *           .build();
   *   while (true) {
   *     ListInstancesResponse response = cloudMemcacheClient.listInstancesCallable().call(request);
   *     for (Instance element : response.getResourcesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * }</pre>
   */
  public final UnaryCallable<ListInstancesRequest, ListInstancesResponse> listInstancesCallable() {
    return stub.listInstancesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
   *   Instance response = cloudMemcacheClient.getInstance(name);
   * }
   * }</pre>
   *
   * @param name Required. Memcached instance resource name in the format:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id`
   *     refers to a GCP region
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Instance getInstance(InstanceName name) {
    GetInstanceRequest request =
        GetInstanceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
   *   Instance response = cloudMemcacheClient.getInstance(name);
   * }
   * }</pre>
   *
   * @param name Required. Memcached instance resource name in the format:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id`
   *     refers to a GCP region
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Instance getInstance(String name) {
    GetInstanceRequest request = GetInstanceRequest.newBuilder().setName(name).build();
    return getInstance(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   GetInstanceRequest request =
   *       GetInstanceRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .build();
   *   Instance response = cloudMemcacheClient.getInstance(request);
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Instance getInstance(GetInstanceRequest request) {
    return getInstanceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Gets details of a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   GetInstanceRequest request =
   *       GetInstanceRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .build();
   *   ApiFuture<Instance> future = cloudMemcacheClient.getInstanceCallable().futureCall(request);
   *   // Do something.
   *   Instance response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<GetInstanceRequest, Instance> getInstanceCallable() {
    return stub.getInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Instance in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   LocationName parent = LocationName.of("[PROJECT]", "[LOCATION]");
   *   String instanceId = "instanceId902024336";
   *   Instance resource = Instance.newBuilder().build();
   *   Instance response =
   *       cloudMemcacheClient.createInstanceAsync(parent, instanceId, resource).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region
   * @param instanceId Required. The logical name of the Memcached instance in the user project with
   *     the following restrictions:
   *     <ul>
   *       <li>Must contain only lowercase letters, numbers, and hyphens.
   *       <li>Must start with a letter.
   *       <li>Must be between 1-40 characters.
   *       <li>Must end with a number or a letter.
   *       <li>Must be unique within the user project / location.
   *     </ul>
   *     <p>If any of the above are not met, the API raises an invalid argument error.
   * @param resource Required. A Memcached [Instance] resource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> createInstanceAsync(
      LocationName parent, String instanceId, Instance resource) {
    CreateInstanceRequest request =
        CreateInstanceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setInstanceId(instanceId)
            .setResource(resource)
            .build();
    return createInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Instance in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String parent = LocationName.of("[PROJECT]", "[LOCATION]").toString();
   *   String instanceId = "instanceId902024336";
   *   Instance resource = Instance.newBuilder().build();
   *   Instance response =
   *       cloudMemcacheClient.createInstanceAsync(parent, instanceId, resource).get();
   * }
   * }</pre>
   *
   * @param parent Required. The resource name of the instance location using the form:
   *     `projects/{project_id}/locations/{location_id}` where `location_id` refers to a GCP region
   * @param instanceId Required. The logical name of the Memcached instance in the user project with
   *     the following restrictions:
   *     <ul>
   *       <li>Must contain only lowercase letters, numbers, and hyphens.
   *       <li>Must start with a letter.
   *       <li>Must be between 1-40 characters.
   *       <li>Must end with a number or a letter.
   *       <li>Must be unique within the user project / location.
   *     </ul>
   *     <p>If any of the above are not met, the API raises an invalid argument error.
   * @param resource Required. A Memcached [Instance] resource
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> createInstanceAsync(
      String parent, String instanceId, Instance resource) {
    CreateInstanceRequest request =
        CreateInstanceRequest.newBuilder()
            .setParent(parent)
            .setInstanceId(instanceId)
            .setResource(resource)
            .build();
    return createInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Instance in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   CreateInstanceRequest request =
   *       CreateInstanceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setInstanceId("instanceId902024336")
   *           .setResource(Instance.newBuilder().build())
   *           .build();
   *   Instance response = cloudMemcacheClient.createInstanceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> createInstanceAsync(
      CreateInstanceRequest request) {
    return createInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Instance in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   CreateInstanceRequest request =
   *       CreateInstanceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setInstanceId("instanceId902024336")
   *           .setResource(Instance.newBuilder().build())
   *           .build();
   *   OperationFuture<Instance, OperationMetadata> future =
   *       cloudMemcacheClient.createInstanceOperationCallable().futureCall(request);
   *   // Do something.
   *   Instance response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<CreateInstanceRequest, Instance, OperationMetadata>
      createInstanceOperationCallable() {
    return stub.createInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Creates a new Instance in a given location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   CreateInstanceRequest request =
   *       CreateInstanceRequest.newBuilder()
   *           .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
   *           .setInstanceId("instanceId902024336")
   *           .setResource(Instance.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudMemcacheClient.createInstanceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<CreateInstanceRequest, Operation> createInstanceCallable() {
    return stub.createInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an existing Instance in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   Instance resource = Instance.newBuilder().build();
   *   Instance response = cloudMemcacheClient.updateInstanceAsync(updateMask, resource).get();
   * }
   * }</pre>
   *
   * @param updateMask Required. Mask of fields to update. &#42; `displayName`
   * @param resource Required. A Memcached [Instance] resource. Only fields specified in update_mask
   *     are updated.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> updateInstanceAsync(
      FieldMask updateMask, Instance resource) {
    UpdateInstanceRequest request =
        UpdateInstanceRequest.newBuilder().setUpdateMask(updateMask).setResource(resource).build();
    return updateInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an existing Instance in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   UpdateInstanceRequest request =
   *       UpdateInstanceRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setResource(Instance.newBuilder().build())
   *           .build();
   *   Instance response = cloudMemcacheClient.updateInstanceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> updateInstanceAsync(
      UpdateInstanceRequest request) {
    return updateInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an existing Instance in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   UpdateInstanceRequest request =
   *       UpdateInstanceRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setResource(Instance.newBuilder().build())
   *           .build();
   *   OperationFuture<Instance, OperationMetadata> future =
   *       cloudMemcacheClient.updateInstanceOperationCallable().futureCall(request);
   *   // Do something.
   *   Instance response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateInstanceRequest, Instance, OperationMetadata>
      updateInstanceOperationCallable() {
    return stub.updateInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates an existing Instance in a given project and location.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   UpdateInstanceRequest request =
   *       UpdateInstanceRequest.newBuilder()
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setResource(Instance.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudMemcacheClient.updateInstanceCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateInstanceRequest, Operation> updateInstanceCallable() {
    return stub.updateInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the defined Memcached parameters for an existing instance. This method only stages the
   * parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the
   * Memcached instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   MemcacheParameters parameters = MemcacheParameters.newBuilder().build();
   *   Instance response =
   *       cloudMemcacheClient.updateParametersAsync(name, updateMask, parameters).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name of the Memcached instance for which the parameters should
   *     be updated.
   * @param updateMask Required. Mask of fields to update.
   * @param parameters The parameters to apply to the instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> updateParametersAsync(
      InstanceName name, FieldMask updateMask, MemcacheParameters parameters) {
    UpdateParametersRequest request =
        UpdateParametersRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .setUpdateMask(updateMask)
            .setParameters(parameters)
            .build();
    return updateParametersAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the defined Memcached parameters for an existing instance. This method only stages the
   * parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the
   * Memcached instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
   *   FieldMask updateMask = FieldMask.newBuilder().build();
   *   MemcacheParameters parameters = MemcacheParameters.newBuilder().build();
   *   Instance response =
   *       cloudMemcacheClient.updateParametersAsync(name, updateMask, parameters).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name of the Memcached instance for which the parameters should
   *     be updated.
   * @param updateMask Required. Mask of fields to update.
   * @param parameters The parameters to apply to the instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> updateParametersAsync(
      String name, FieldMask updateMask, MemcacheParameters parameters) {
    UpdateParametersRequest request =
        UpdateParametersRequest.newBuilder()
            .setName(name)
            .setUpdateMask(updateMask)
            .setParameters(parameters)
            .build();
    return updateParametersAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the defined Memcached parameters for an existing instance. This method only stages the
   * parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the
   * Memcached instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   UpdateParametersRequest request =
   *       UpdateParametersRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setParameters(MemcacheParameters.newBuilder().build())
   *           .build();
   *   Instance response = cloudMemcacheClient.updateParametersAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> updateParametersAsync(
      UpdateParametersRequest request) {
    return updateParametersOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the defined Memcached parameters for an existing instance. This method only stages the
   * parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the
   * Memcached instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   UpdateParametersRequest request =
   *       UpdateParametersRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setParameters(MemcacheParameters.newBuilder().build())
   *           .build();
   *   OperationFuture<Instance, OperationMetadata> future =
   *       cloudMemcacheClient.updateParametersOperationCallable().futureCall(request);
   *   // Do something.
   *   Instance response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<UpdateParametersRequest, Instance, OperationMetadata>
      updateParametersOperationCallable() {
    return stub.updateParametersOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates the defined Memcached parameters for an existing instance. This method only stages the
   * parameters, it must be followed by `ApplyParameters` to apply the parameters to nodes of the
   * Memcached instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   UpdateParametersRequest request =
   *       UpdateParametersRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .setUpdateMask(FieldMask.newBuilder().build())
   *           .setParameters(MemcacheParameters.newBuilder().build())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudMemcacheClient.updateParametersCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<UpdateParametersRequest, Operation> updateParametersCallable() {
    return stub.updateParametersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
   *   cloudMemcacheClient.deleteInstanceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Memcached instance resource name in the format:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id`
   *     refers to a GCP region
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteInstanceAsync(InstanceName name) {
    DeleteInstanceRequest request =
        DeleteInstanceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return deleteInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
   *   cloudMemcacheClient.deleteInstanceAsync(name).get();
   * }
   * }</pre>
   *
   * @param name Required. Memcached instance resource name in the format:
   *     `projects/{project_id}/locations/{location_id}/instances/{instance_id}` where `location_id`
   *     refers to a GCP region
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteInstanceAsync(String name) {
    DeleteInstanceRequest request = DeleteInstanceRequest.newBuilder().setName(name).build();
    return deleteInstanceAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   DeleteInstanceRequest request =
   *       DeleteInstanceRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .build();
   *   cloudMemcacheClient.deleteInstanceAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Empty, OperationMetadata> deleteInstanceAsync(
      DeleteInstanceRequest request) {
    return deleteInstanceOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   DeleteInstanceRequest request =
   *       DeleteInstanceRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .build();
   *   OperationFuture<Empty, OperationMetadata> future =
   *       cloudMemcacheClient.deleteInstanceOperationCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<DeleteInstanceRequest, Empty, OperationMetadata>
      deleteInstanceOperationCallable() {
    return stub.deleteInstanceOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Deletes a single Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   DeleteInstanceRequest request =
   *       DeleteInstanceRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudMemcacheClient.deleteInstanceCallable().futureCall(request);
   *   // Do something.
   *   future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<DeleteInstanceRequest, Operation> deleteInstanceCallable() {
    return stub.deleteInstanceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * `ApplyParameters` restarts the set of specified nodes in order to update them to the current
   * set of parameters for the Memcached Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   InstanceName name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
   *   List<String> nodeIds = new ArrayList<>();
   *   boolean applyAll = true;
   *   Instance response = cloudMemcacheClient.applyParametersAsync(name, nodeIds, applyAll).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name of the Memcached instance for which parameter group updates
   *     should be applied.
   * @param nodeIds Nodes to which the instance-level parameter group is applied.
   * @param applyAll Whether to apply instance-level parameter group to all nodes. If set to true,
   *     users are restricted from specifying individual nodes, and `ApplyParameters` updates all
   *     nodes within the instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> applyParametersAsync(
      InstanceName name, List<String> nodeIds, boolean applyAll) {
    ApplyParametersRequest request =
        ApplyParametersRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .addAllNodeIds(nodeIds)
            .setApplyAll(applyAll)
            .build();
    return applyParametersAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * `ApplyParameters` restarts the set of specified nodes in order to update them to the current
   * set of parameters for the Memcached Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String name = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
   *   List<String> nodeIds = new ArrayList<>();
   *   boolean applyAll = true;
   *   Instance response = cloudMemcacheClient.applyParametersAsync(name, nodeIds, applyAll).get();
   * }
   * }</pre>
   *
   * @param name Required. Resource name of the Memcached instance for which parameter group updates
   *     should be applied.
   * @param nodeIds Nodes to which the instance-level parameter group is applied.
   * @param applyAll Whether to apply instance-level parameter group to all nodes. If set to true,
   *     users are restricted from specifying individual nodes, and `ApplyParameters` updates all
   *     nodes within the instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> applyParametersAsync(
      String name, List<String> nodeIds, boolean applyAll) {
    ApplyParametersRequest request =
        ApplyParametersRequest.newBuilder()
            .setName(name)
            .addAllNodeIds(nodeIds)
            .setApplyAll(applyAll)
            .build();
    return applyParametersAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * `ApplyParameters` restarts the set of specified nodes in order to update them to the current
   * set of parameters for the Memcached Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ApplyParametersRequest request =
   *       ApplyParametersRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .addAllNodeIds(new ArrayList<String>())
   *           .setApplyAll(true)
   *           .build();
   *   Instance response = cloudMemcacheClient.applyParametersAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> applyParametersAsync(
      ApplyParametersRequest request) {
    return applyParametersOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * `ApplyParameters` restarts the set of specified nodes in order to update them to the current
   * set of parameters for the Memcached Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ApplyParametersRequest request =
   *       ApplyParametersRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .addAllNodeIds(new ArrayList<String>())
   *           .setApplyAll(true)
   *           .build();
   *   OperationFuture<Instance, OperationMetadata> future =
   *       cloudMemcacheClient.applyParametersOperationCallable().futureCall(request);
   *   // Do something.
   *   Instance response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ApplyParametersRequest, Instance, OperationMetadata>
      applyParametersOperationCallable() {
    return stub.applyParametersOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * `ApplyParameters` restarts the set of specified nodes in order to update them to the current
   * set of parameters for the Memcached Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ApplyParametersRequest request =
   *       ApplyParametersRequest.newBuilder()
   *           .setName(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .addAllNodeIds(new ArrayList<String>())
   *           .setApplyAll(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudMemcacheClient.applyParametersCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ApplyParametersRequest, Operation> applyParametersCallable() {
    return stub.applyParametersCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates software on the selected nodes of the Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   InstanceName instance = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]");
   *   List<String> nodeIds = new ArrayList<>();
   *   boolean applyAll = true;
   *   Instance response =
   *       cloudMemcacheClient.applySoftwareUpdateAsync(instance, nodeIds, applyAll).get();
   * }
   * }</pre>
   *
   * @param instance Required. Resource name of the Memcached instance for which software update
   *     should be applied.
   * @param nodeIds Nodes to which we should apply the update to. Note all the selected nodes are
   *     updated in parallel.
   * @param applyAll Whether to apply the update to all nodes. If set to true, will explicitly
   *     restrict users from specifying any nodes, and apply software update to all nodes (where
   *     applicable) within the instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> applySoftwareUpdateAsync(
      InstanceName instance, List<String> nodeIds, boolean applyAll) {
    ApplySoftwareUpdateRequest request =
        ApplySoftwareUpdateRequest.newBuilder()
            .setInstance(instance == null ? null : instance.toString())
            .addAllNodeIds(nodeIds)
            .setApplyAll(applyAll)
            .build();
    return applySoftwareUpdateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates software on the selected nodes of the Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   String instance = InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString();
   *   List<String> nodeIds = new ArrayList<>();
   *   boolean applyAll = true;
   *   Instance response =
   *       cloudMemcacheClient.applySoftwareUpdateAsync(instance, nodeIds, applyAll).get();
   * }
   * }</pre>
   *
   * @param instance Required. Resource name of the Memcached instance for which software update
   *     should be applied.
   * @param nodeIds Nodes to which we should apply the update to. Note all the selected nodes are
   *     updated in parallel.
   * @param applyAll Whether to apply the update to all nodes. If set to true, will explicitly
   *     restrict users from specifying any nodes, and apply software update to all nodes (where
   *     applicable) within the instance.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> applySoftwareUpdateAsync(
      String instance, List<String> nodeIds, boolean applyAll) {
    ApplySoftwareUpdateRequest request =
        ApplySoftwareUpdateRequest.newBuilder()
            .setInstance(instance)
            .addAllNodeIds(nodeIds)
            .setApplyAll(applyAll)
            .build();
    return applySoftwareUpdateAsync(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates software on the selected nodes of the Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ApplySoftwareUpdateRequest request =
   *       ApplySoftwareUpdateRequest.newBuilder()
   *           .setInstance(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .addAllNodeIds(new ArrayList<String>())
   *           .setApplyAll(true)
   *           .build();
   *   Instance response = cloudMemcacheClient.applySoftwareUpdateAsync(request).get();
   * }
   * }</pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final OperationFuture<Instance, OperationMetadata> applySoftwareUpdateAsync(
      ApplySoftwareUpdateRequest request) {
    return applySoftwareUpdateOperationCallable().futureCall(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates software on the selected nodes of the Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ApplySoftwareUpdateRequest request =
   *       ApplySoftwareUpdateRequest.newBuilder()
   *           .setInstance(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .addAllNodeIds(new ArrayList<String>())
   *           .setApplyAll(true)
   *           .build();
   *   OperationFuture<Instance, OperationMetadata> future =
   *       cloudMemcacheClient.applySoftwareUpdateOperationCallable().futureCall(request);
   *   // Do something.
   *   Instance response = future.get();
   * }
   * }</pre>
   */
  public final OperationCallable<ApplySoftwareUpdateRequest, Instance, OperationMetadata>
      applySoftwareUpdateOperationCallable() {
    return stub.applySoftwareUpdateOperationCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD.
  /**
   * Updates software on the selected nodes of the Instance.
   *
   * <p>Sample code:
   *
   * <pre>{@code
   * // This snippet has been automatically generated and should be regarded as a code template only.
   * // It will require modifications to work:
   * // - It may require correct/in-range values for request initialization.
   * // - It may require specifying regional endpoints when creating the service client as shown in
   * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
   * try (CloudMemcacheClient cloudMemcacheClient = CloudMemcacheClient.create()) {
   *   ApplySoftwareUpdateRequest request =
   *       ApplySoftwareUpdateRequest.newBuilder()
   *           .setInstance(InstanceName.of("[PROJECT]", "[LOCATION]", "[INSTANCE]").toString())
   *           .addAllNodeIds(new ArrayList<String>())
   *           .setApplyAll(true)
   *           .build();
   *   ApiFuture<Operation> future =
   *       cloudMemcacheClient.applySoftwareUpdateCallable().futureCall(request);
   *   // Do something.
   *   Operation response = future.get();
   * }
   * }</pre>
   */
  public final UnaryCallable<ApplySoftwareUpdateRequest, Operation> applySoftwareUpdateCallable() {
    return stub.applySoftwareUpdateCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListInstancesPagedResponse
      extends AbstractPagedListResponse<
          ListInstancesRequest,
          ListInstancesResponse,
          Instance,
          ListInstancesPage,
          ListInstancesFixedSizeCollection> {

    public static ApiFuture<ListInstancesPagedResponse> createAsync(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ApiFuture<ListInstancesResponse> futureResponse) {
      ApiFuture<ListInstancesPage> futurePage =
          ListInstancesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          input -> new ListInstancesPagedResponse(input),
          MoreExecutors.directExecutor());
    }

    private ListInstancesPagedResponse(ListInstancesPage page) {
      super(page, ListInstancesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListInstancesPage
      extends AbstractPage<
          ListInstancesRequest, ListInstancesResponse, Instance, ListInstancesPage> {

    private ListInstancesPage(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ListInstancesResponse response) {
      super(context, response);
    }

    private static ListInstancesPage createEmptyPage() {
      return new ListInstancesPage(null, null);
    }

    @Override
    protected ListInstancesPage createPage(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ListInstancesResponse response) {
      return new ListInstancesPage(context, response);
    }

    @Override
    public ApiFuture<ListInstancesPage> createPageAsync(
        PageContext<ListInstancesRequest, ListInstancesResponse, Instance> context,
        ApiFuture<ListInstancesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListInstancesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListInstancesRequest,
          ListInstancesResponse,
          Instance,
          ListInstancesPage,
          ListInstancesFixedSizeCollection> {

    private ListInstancesFixedSizeCollection(List<ListInstancesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListInstancesFixedSizeCollection createEmptyCollection() {
      return new ListInstancesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListInstancesFixedSizeCollection createCollection(
        List<ListInstancesPage> pages, int collectionSize) {
      return new ListInstancesFixedSizeCollection(pages, collectionSize);
    }
  }
}
