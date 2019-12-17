/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.apigateway;

import com.oracle.bmc.apigateway.requests.*;
import com.oracle.bmc.apigateway.responses.*;

/**
 * Collection of helper methods to produce {@link com.oracle.bmc.waiter.Waiter}s for different
 * resources of Deployment.
 * <p>
 * The default configuration used is defined by {@link com.oracle.bmc.waiter.Waiters.Waiters#DEFAULT_POLLING_WAITER}.
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@lombok.RequiredArgsConstructor
public class DeploymentWaiters {
    private final java.util.concurrent.ExecutorService executorService;
    private final Deployment client;

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the default configuration.
     *
     * @param request the request to send
     * @param targetStates the desired states to wait for. If multiple states are provided then the waiter will return once the resource reaches any of the provided states
     * @return a new {@code Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDeploymentRequest, GetDeploymentResponse> forDeployment(
            GetDeploymentRequest request,
            com.oracle.bmc.apigateway.model.Deployment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one targetState must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null targetState values are not permitted");

        return forDeployment(
                com.oracle.bmc.waiter.Waiters.DEFAULT_POLLING_WAITER, request, targetStates);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param targetState the desired state to wait for
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDeploymentRequest, GetDeploymentResponse> forDeployment(
            GetDeploymentRequest request,
            com.oracle.bmc.apigateway.model.Deployment.LifecycleState targetState,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy) {
        org.apache.commons.lang3.Validate.notNull(targetState, "The targetState cannot be null");

        return forDeployment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetState);
    }

    /**
     * Creates a new {@link com.oracle.bmc.waiter.Waiter} using the provided configuration.
     *
     * @param request the request to send
     * @param terminationStrategy the {@link com.oracle.bmc.waiter.TerminationStrategy} to use
     * @param delayStrategy the {@link com.oracle.bmc.waiter.DelayStrategy} to use
     * @param targetStates the desired states to wait for. The waiter will return once the resource reaches any of the provided states
     * @return a new {@code com.oracle.bmc.waiter.Waiter} instance
     */
    public com.oracle.bmc.waiter.Waiter<GetDeploymentRequest, GetDeploymentResponse> forDeployment(
            GetDeploymentRequest request,
            com.oracle.bmc.waiter.TerminationStrategy terminationStrategy,
            com.oracle.bmc.waiter.DelayStrategy delayStrategy,
            com.oracle.bmc.apigateway.model.Deployment.LifecycleState... targetStates) {
        org.apache.commons.lang3.Validate.notEmpty(
                targetStates, "At least one target state must be provided");
        org.apache.commons.lang3.Validate.noNullElements(
                targetStates, "Null target states are not permitted");

        return forDeployment(
                com.oracle.bmc.waiter.Waiters.newWaiter(terminationStrategy, delayStrategy),
                request,
                targetStates);
    }

    // Helper method to create a new Waiter for Deployment.
    private com.oracle.bmc.waiter.Waiter<GetDeploymentRequest, GetDeploymentResponse> forDeployment(
            com.oracle.bmc.waiter.BmcGenericWaiter waiter,
            final GetDeploymentRequest request,
            final com.oracle.bmc.apigateway.model.Deployment.LifecycleState... targetStates) {
        final java.util.Set<com.oracle.bmc.apigateway.model.Deployment.LifecycleState>
                targetStatesSet = new java.util.HashSet<>(java.util.Arrays.asList(targetStates));

        return new com.oracle.bmc.waiter.internal.SimpleWaiterImpl<>(
                executorService,
                waiter.toCallable(
                        com.google.common.base.Suppliers.ofInstance(request),
                        new com.google.common.base.Function<
                                GetDeploymentRequest, GetDeploymentResponse>() {
                            @Override
                            public GetDeploymentResponse apply(GetDeploymentRequest request) {
                                return client.getDeployment(request);
                            }
                        },
                        new com.google.common.base.Predicate<GetDeploymentResponse>() {
                            @Override
                            public boolean apply(GetDeploymentResponse response) {
                                return targetStatesSet.contains(
                                        response.getDeployment().getLifecycleState());
                            }
                        },
                        targetStatesSet.contains(
                                com.oracle.bmc.apigateway.model.Deployment.LifecycleState.Deleted)),
                request);
    }
}
