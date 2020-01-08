/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.streaming.model;

/**
 * A message in a stream.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180418")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Message.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class Message {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("stream")
        private String stream;

        public Builder stream(String stream) {
            this.stream = stream;
            this.__explicitlySet__.add("stream");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("partition")
        private String partition;

        public Builder partition(String partition) {
            this.partition = partition;
            this.__explicitlySet__.add("partition");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private byte[] key;

        public Builder key(byte[] key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("value")
        private byte[] value;

        public Builder value(byte[] value) {
            this.value = value;
            this.__explicitlySet__.add("value");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("offset")
        private Long offset;

        public Builder offset(Long offset) {
            this.offset = offset;
            this.__explicitlySet__.add("offset");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
        private java.util.Date timestamp;

        public Builder timestamp(java.util.Date timestamp) {
            this.timestamp = timestamp;
            this.__explicitlySet__.add("timestamp");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Message build() {
            Message __instance__ = new Message(stream, partition, key, value, offset, timestamp);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Message o) {
            Builder copiedBuilder =
                    stream(o.getStream())
                            .partition(o.getPartition())
                            .key(o.getKey())
                            .value(o.getValue())
                            .offset(o.getOffset())
                            .timestamp(o.getTimestamp());

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
     * The name of the stream that the message belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("stream")
    String stream;

    /**
     * The ID of the partition where the message is stored.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("partition")
    String partition;

    /**
     * The key associated with the message, expressed as a byte array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    byte[] key;

    /**
     * The value associated with the message, expressed as a byte array.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("value")
    byte[] value;

    /**
     * The offset of the message, which uniquely identifies it within the partition.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("offset")
    Long offset;

    /**
     * The timestamp indicating when the server appended the message to the stream.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timestamp")
    java.util.Date timestamp;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
