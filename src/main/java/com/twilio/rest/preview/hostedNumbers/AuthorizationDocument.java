/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Preview
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.preview.hostedNumbers;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.base.Resource;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import java.util.Map;
import java.util.Objects;
import lombok.ToString;
import lombok.ToString;

@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class AuthorizationDocument extends Resource {

    private static final long serialVersionUID = 7314983531290L;

    public static AuthorizationDocumentCreator creator(
        final List<String> hostedNumberOrderSids,
        final String addressSid,
        final String email,
        final String contactTitle,
        final String contactPhoneNumber
    ) {
        return new AuthorizationDocumentCreator(
            hostedNumberOrderSids,
            addressSid,
            email,
            contactTitle,
            contactPhoneNumber
        );
    }

    public static AuthorizationDocumentFetcher fetcher(final String pathSid) {
        return new AuthorizationDocumentFetcher(pathSid);
    }

    public static AuthorizationDocumentReader reader() {
        return new AuthorizationDocumentReader();
    }

    public static AuthorizationDocumentUpdater updater(final String pathSid) {
        return new AuthorizationDocumentUpdater(pathSid);
    }

    /**
     * Converts a JSON String into a AuthorizationDocument object using the provided ObjectMapper.
     *
     * @param json Raw JSON String
     * @param objectMapper Jackson ObjectMapper
     * @return AuthorizationDocument object represented by the provided JSON
     */
    public static AuthorizationDocument fromJson(
        final String json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AuthorizationDocument.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    /**
     * Converts a JSON InputStream into a AuthorizationDocument object using the provided
     * ObjectMapper.
     *
     * @param json Raw JSON InputStream
     * @param objectMapper Jackson ObjectMapper
     * @return AuthorizationDocument object represented by the provided JSON
     */
    public static AuthorizationDocument fromJson(
        final InputStream json,
        final ObjectMapper objectMapper
    ) {
        // Convert all checked exceptions to Runtime
        try {
            return objectMapper.readValue(json, AuthorizationDocument.class);
        } catch (final JsonMappingException | JsonParseException e) {
            throw new ApiException(e.getMessage(), e);
        } catch (final IOException e) {
            throw new ApiConnectionException(e.getMessage(), e);
        }
    }

    private final String sid;
    private final String addressSid;
    private final AuthorizationDocument.Status status;
    private final String email;
    private final List<String> ccEmails;
    private final ZonedDateTime dateCreated;
    private final ZonedDateTime dateUpdated;
    private final URI url;
    private final Map<String, String> links;

    @JsonCreator
    private AuthorizationDocument(
        @JsonProperty("sid") final String sid,
        @JsonProperty("address_sid") final String addressSid,
        @JsonProperty("status") final AuthorizationDocument.Status status,
        @JsonProperty("email") final String email,
        @JsonProperty("cc_emails") final List<String> ccEmails,
        @JsonProperty("date_created") final String dateCreated,
        @JsonProperty("date_updated") final String dateUpdated,
        @JsonProperty("url") final URI url,
        @JsonProperty("links") final Map<String, String> links
    ) {
        this.sid = sid;
        this.addressSid = addressSid;
        this.status = status;
        this.email = email;
        this.ccEmails = ccEmails;
        this.dateCreated = DateConverter.iso8601DateTimeFromString(dateCreated);
        this.dateUpdated = DateConverter.iso8601DateTimeFromString(dateUpdated);
        this.url = url;
        this.links = links;
    }

    public final String getSid() {
        return this.sid;
    }

    public final String getAddressSid() {
        return this.addressSid;
    }

    public final AuthorizationDocument.Status getStatus() {
        return this.status;
    }

    public final String getEmail() {
        return this.email;
    }

    public final List<String> getCcEmails() {
        return this.ccEmails;
    }

    public final ZonedDateTime getDateCreated() {
        return this.dateCreated;
    }

    public final ZonedDateTime getDateUpdated() {
        return this.dateUpdated;
    }

    public final URI getUrl() {
        return this.url;
    }

    public final Map<String, String> getLinks() {
        return this.links;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AuthorizationDocument other = (AuthorizationDocument) o;

        return (
            Objects.equals(sid, other.sid) &&
            Objects.equals(addressSid, other.addressSid) &&
            Objects.equals(status, other.status) &&
            Objects.equals(email, other.email) &&
            Objects.equals(ccEmails, other.ccEmails) &&
            Objects.equals(dateCreated, other.dateCreated) &&
            Objects.equals(dateUpdated, other.dateUpdated) &&
            Objects.equals(url, other.url) &&
            Objects.equals(links, other.links)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(
            sid,
            addressSid,
            status,
            email,
            ccEmails,
            dateCreated,
            dateUpdated,
            url,
            links
        );
    }

    public enum Status {
        OPENED("opened"),
        SIGNING("signing"),
        SIGNED("signed"),
        CANCELED("canceled"),
        FAILED("failed");

        private final String value;

        private Status(final String value) {
            this.value = value;
        }

        public String toString() {
            return value;
        }

        @JsonCreator
        public static Status forValue(final String value) {
            return Promoter.enumFromString(value, Status.values());
        }
    }
}
