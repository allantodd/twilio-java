/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.numbers.v2.regulatorycompliance;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.MoreObjects;
import com.twilio.base.Resource;
import com.twilio.converter.Converter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EndUserType extends Resource {
    private static final long serialVersionUID = 122060765056135L;

    /**
     * Create a EndUserTypeReader to execute read.
     *
     * @return EndUserTypeReader capable of executing the read
     */
    public static EndUserTypeReader reader() {
        return new EndUserTypeReader();
    }

    /**
     * Create a EndUserTypeFetcher to execute fetch.
     *
     * @param pathSid The unique string that identifies the End-User Type resource
     * @return EndUserTypeFetcher capable of executing the fetch
     */
    public static EndUserTypeFetcher fetcher(final String pathSid) {
        return new EndUserTypeFetcher(pathSid);
    }

    /**
     * Converts a JSON String into a EndUserType object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return EndUserType object represented by the provided JSON
     */
    public static EndUserType fromJson(final String json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EndUserType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a EndUserType object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return EndUserType object represented by the provided JSON
     */
    public static EndUserType fromJson(final InputStream json, final ObjectMapper objectMapper) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, EndUserType.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String friendlyName;
    private final String machineName;
    private final List<Map<String, Object>> fields;
    private final URI url;

    @JsonCreator
    private EndUserType(@JsonProperty("sid")
                        final String sid,
                        @JsonProperty("friendly_name")
                        final String friendlyName,
                        @JsonProperty("machine_name")
                        final String machineName,
                        @JsonProperty("fields")
                        final List<Map<String, Object>> fields,
                        @JsonProperty("url")
                        final URI url) {
        this.sid = sid;
        this.friendlyName = friendlyName;
        this.machineName = machineName;
        this.fields = fields;
        this.url = url;
    }

    /**
     * Returns The The unique string that identifies the End-User Type resource.
     *
     * @return The unique string that identifies the End-User Type resource
     */
    public final String getSid() {
        return this.sid;
    }

    /**
     * Returns The A human-readable description of the End-User Type resource.
     *
     * @return A human-readable description of the End-User Type resource
     */
    public final String getFriendlyName() {
        return this.friendlyName;
    }

    /**
     * Returns The A machine-readable description of the End-User Type resource.
     *
     * @return A machine-readable description of the End-User Type resource
     */
    public final String getMachineName() {
        return this.machineName;
    }

    /**
     * Returns The The required information for creating an End-User..
     *
     * @return The required information for creating an End-User.
     */
    public final List<Map<String, Object>> getFields() {
        return this.fields;
    }

    /**
     * Returns The The absolute URL of the End-User Type resource.
     *
     * @return The absolute URL of the End-User Type resource
     */
    public final URI getUrl() {
        return this.url;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        EndUserType other = (EndUserType) o;

        return Objects.equals(sid, other.sid) &&
               Objects.equals(friendlyName, other.friendlyName) &&
               Objects.equals(machineName, other.machineName) &&
               Objects.equals(fields, other.fields) &&
               Objects.equals(url, other.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sid,
                            friendlyName,
                            machineName,
                            fields,
                            url);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                          .add("sid", sid)
                          .add("friendlyName", friendlyName)
                          .add("machineName", machineName)
                          .add("fields", fields)
                          .add("url", url)
                          .toString();
    }
}