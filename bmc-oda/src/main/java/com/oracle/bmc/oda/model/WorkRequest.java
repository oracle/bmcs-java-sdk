/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.oda.model;

/**
 * The description of work request, including its status.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = WorkRequest.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class WorkRequest {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
        private String odaInstanceId;

        public Builder odaInstanceId(String odaInstanceId) {
            this.odaInstanceId = odaInstanceId;
            this.__explicitlySet__.add("odaInstanceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
        private RequestAction requestAction;

        public Builder requestAction(RequestAction requestAction) {
            this.requestAction = requestAction;
            this.__explicitlySet__.add("requestAction");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("status")
        private Status status;

        public Builder status(Status status) {
            this.status = status;
            this.__explicitlySet__.add("status");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
        private String statusMessage;

        public Builder statusMessage(String statusMessage) {
            this.statusMessage = statusMessage;
            this.__explicitlySet__.add("statusMessage");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("resources")
        private java.util.List<WorkRequestResource> resources;

        public Builder resources(java.util.List<WorkRequestResource> resources) {
            this.resources = resources;
            this.__explicitlySet__.add("resources");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
        private Float percentComplete;

        public Builder percentComplete(Float percentComplete) {
            this.percentComplete = percentComplete;
            this.__explicitlySet__.add("percentComplete");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
        private java.util.Date timeAccepted;

        public Builder timeAccepted(java.util.Date timeAccepted) {
            this.timeAccepted = timeAccepted;
            this.__explicitlySet__.add("timeAccepted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
        private java.util.Date timeStarted;

        public Builder timeStarted(java.util.Date timeStarted) {
            this.timeStarted = timeStarted;
            this.__explicitlySet__.add("timeStarted");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
        private java.util.Date timeFinished;

        public Builder timeFinished(java.util.Date timeFinished) {
            this.timeFinished = timeFinished;
            this.__explicitlySet__.add("timeFinished");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequest build() {
            WorkRequest __instance__ =
                    new WorkRequest(
                            id,
                            compartmentId,
                            odaInstanceId,
                            requestAction,
                            status,
                            statusMessage,
                            resources,
                            percentComplete,
                            timeAccepted,
                            timeStarted,
                            timeFinished);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequest o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .odaInstanceId(o.getOdaInstanceId())
                            .requestAction(o.getRequestAction())
                            .status(o.getStatus())
                            .statusMessage(o.getStatusMessage())
                            .resources(o.getResources())
                            .percentComplete(o.getPercentComplete())
                            .timeAccepted(o.getTimeAccepted())
                            .timeStarted(o.getTimeStarted())
                            .timeFinished(o.getTimeFinished());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The identifier of the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The identifier of the compartment that contains the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The identifier of the Digital Assistant instance to which this work request pertains.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("odaInstanceId")
    String odaInstanceId;
    /**
     * The type of the operation that's associated with the work request.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum RequestAction {
        CreateOdaInstance("CREATE_ODA_INSTANCE"),
        UpgradeOdaInstance("UPGRADE_ODA_INSTANCE"),
        DeleteOdaInstance("DELETE_ODA_INSTANCE"),
        PurgeOdaInstance("PURGE_ODA_INSTANCE"),
        RecoverOdaInstance("RECOVER_ODA_INSTANCE"),
        ChangeOdaInstanceCompartment("CHANGE_ODA_INSTANCE_COMPARTMENT"),
        CreateAssociation("CREATE_ASSOCIATION"),
        DeleteAssociation("DELETE_ASSOCIATION"),
        UpdateEntitlementsForCacct("UPDATE_ENTITLEMENTS_FOR_CACCT"),
        LookupOdaInstancesForCacct("LOOKUP_ODA_INSTANCES_FOR_CACCT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, RequestAction> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestAction v : RequestAction.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        RequestAction(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestAction create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'RequestAction', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The type of the operation that's associated with the work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestAction")
    RequestAction requestAction;
    /**
     * The status of current work request.
     **/
    @lombok.extern.slf4j.Slf4j
    public enum Status {
        Accepted("ACCEPTED"),
        InProgress("IN_PROGRESS"),
        Succeeded("SUCCEEDED"),
        Failed("FAILED"),
        Canceling("CANCELING"),
        Canceled("CANCELED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, Status> map;

        static {
            map = new java.util.HashMap<>();
            for (Status v : Status.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Status(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Status create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Status', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The status of current work request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    Status status;

    /**
     * A short message that provides more detail about the current status.
     * For example, if a work request fails, then this may include information
     * about why it failed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("statusMessage")
    String statusMessage;

    /**
     * The resources that this work request affects.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("resources")
    java.util.List<WorkRequestResource> resources;

    /**
     * Percentage of the request completed.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("percentComplete")
    Float percentComplete;

    /**
     * The date and time that the request was created, as described in
     * [RFC 3339](https://tools.ietf.org/rfc/rfc3339), section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeAccepted")
    java.util.Date timeAccepted;

    /**
     * The date and time that the request was started, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339), CKQ
     * section 14.29.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeStarted")
    java.util.Date timeStarted;

    /**
     * The date and time that the object finished, as described in [RFC 3339](https://tools.ietf.org/rfc/rfc3339). CKQ
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeFinished")
    java.util.Date timeFinished;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
