/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.core.requests;

import com.oracle.bmc.core.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder", buildMethodName = "buildWithoutInvocationCallback")
@lombok.Getter
public class ConnectRemotePeeringConnectionsRequest extends com.oracle.bmc.requests.BmcRequest {

    /**
     * The OCID of the remote peering connection (RPC).
     */
    private String remotePeeringConnectionId;

    /**
     * Details to connect peering connection with peering connection from remote region
     */
    private ConnectRemotePeeringConnectionsDetails connectRemotePeeringConnectionsDetails;

    public static class Builder {
        private com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                invocationCallback = null;
        private com.oracle.bmc.retrier.RetryConfiguration retryConfiguration = null;

        /**
         * Set the invocation callback for the request to be built.
         * @param invocationCallback the invocation callback to be set for the request
         * @return this builder instance
         */
        public Builder invocationCallback(
                com.oracle.bmc.util.internal.Consumer<javax.ws.rs.client.Invocation.Builder>
                        invocationCallback) {
            this.invocationCallback = invocationCallback;
            return this;
        }

        /**
         * Set the retry configuration for the request to be built.
         * @param retryConfiguration the retry configuration to be used for the request
         * @return this builder instance
         */
        public Builder retryConfiguration(
                com.oracle.bmc.retrier.RetryConfiguration retryConfiguration) {
            this.retryConfiguration = retryConfiguration;
            return this;
        }

        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ConnectRemotePeeringConnectionsRequest o) {
            remotePeeringConnectionId(o.getRemotePeeringConnectionId());
            connectRemotePeeringConnectionsDetails(o.getConnectRemotePeeringConnectionsDetails());
            invocationCallback(o.getInvocationCallback());
            retryConfiguration(o.getRetryConfiguration());
            return this;
        }

        /**
         * Build the instance of ConnectRemotePeeringConnectionsRequest as configured by this builder
         *
         * Note that this method takes calls to {@link Builder#invocationCallback(com.oracle.bmc.util.internal.Consumer)} into account,
         * while the method {@link Builder#buildWithoutInvocationCallback} does not.
         *
         * This is the preferred method to build an instance.
         *
         * @return instance of ConnectRemotePeeringConnectionsRequest
         */
        public ConnectRemotePeeringConnectionsRequest build() {
            ConnectRemotePeeringConnectionsRequest request = buildWithoutInvocationCallback();
            request.setInvocationCallback(invocationCallback);
            request.setRetryConfiguration(retryConfiguration);
            return request;
        }
    }
}
