/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * A mapping between a single group defined by the identity provider (IdP) you're federating with
 * and a single IAM Service {@link Group} in Oracle Cloud Infrastructure.
 * For more information about group mappings and what they're for, see
 * [Identity Providers and Federation](https://docs.cloud.oracle.com/Content/Identity/Concepts/federation.htm).
 * <p>
 * A given IdP group can be mapped to zero, one, or multiple IAM Service groups, and vice versa.
 * But each `IdPGroupMapping` object is between only a single IdP group and IAM Service group.
 * Each `IdPGroupMapping` object has its own OCID.
 * <p>
 **Note:** Any users who are in more than 50 IdP groups cannot be authenticated to use the Oracle
 * Cloud Infrastructure Console.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = IdpGroupMapping.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class IdpGroupMapping {
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

        @com.fasterxml.jackson.annotation.JsonProperty("idpId")
        private String idpId;

        public Builder idpId(String idpId) {
            this.idpId = idpId;
            this.__explicitlySet__.add("idpId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
        private String idpGroupName;

        public Builder idpGroupName(String idpGroupName) {
            this.idpGroupName = idpGroupName;
            this.__explicitlySet__.add("idpGroupName");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("groupId")
        private String groupId;

        public Builder groupId(String groupId) {
            this.groupId = groupId;
            this.__explicitlySet__.add("groupId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public IdpGroupMapping build() {
            IdpGroupMapping __instance__ =
                    new IdpGroupMapping(
                            id,
                            idpId,
                            idpGroupName,
                            groupId,
                            compartmentId,
                            timeCreated,
                            lifecycleState,
                            inactiveStatus);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(IdpGroupMapping o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .idpId(o.getIdpId())
                            .idpGroupName(o.getIdpGroupName())
                            .groupId(o.getGroupId())
                            .compartmentId(o.getCompartmentId())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .inactiveStatus(o.getInactiveStatus());

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
     * The OCID of the `IdpGroupMapping`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the `IdentityProvider` this mapping belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpId")
    String idpId;

    /**
     * The name of the IdP group that is mapped to the IAM Service group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("idpGroupName")
    String idpGroupName;

    /**
     * The OCID of the IAM Service group that is mapped to the IdP group.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("groupId")
    String groupId;

    /**
     * The OCID of the tenancy containing the `IdentityProvider`.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * Date and time the mapping was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The mapping's current state.  After creating a mapping object, make sure its `lifecycleState` changes
     * from CREATING to ACTIVE before using it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The mapping's current state.  After creating a mapping object, make sure its `lifecycleState` changes
     * from CREATING to ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * The detailed status of INACTIVE lifecycleState.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    Long inactiveStatus;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
