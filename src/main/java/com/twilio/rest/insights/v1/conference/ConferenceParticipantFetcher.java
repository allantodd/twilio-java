/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1.conference;

import com.twilio.base.Fetcher;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class ConferenceParticipantFetcher extends Fetcher<ConferenceParticipant> {
    private final String pathConferenceSid;
    private final String pathParticipantSid;
    private String events;
    private String metrics;

    /**
     * Construct a new ConferenceParticipantFetcher.
     *
     * @param pathConferenceSid The conference_sid
     * @param pathParticipantSid The participant_sid
     */
    public ConferenceParticipantFetcher(final String pathConferenceSid,
                                        final String pathParticipantSid) {
        this.pathConferenceSid = pathConferenceSid;
        this.pathParticipantSid = pathParticipantSid;
    }

    /**
     * The events.
     *
     * @param events The events
     * @return this
     */
    public ConferenceParticipantFetcher setEvents(final String events) {
        this.events = events;
        return this;
    }

    /**
     * The metrics.
     *
     * @param metrics The metrics
     * @return this
     */
    public ConferenceParticipantFetcher setMetrics(final String metrics) {
        this.metrics = metrics;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the fetch.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Fetched ConferenceParticipant
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public ConferenceParticipant fetch(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.GET,
            Domains.INSIGHTS.toString(),
            "/v1/Conferences/" + this.pathConferenceSid + "/Participants/" + this.pathParticipantSid + ""
        );

        addQueryParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("ConferenceParticipant fetch failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return ConferenceParticipant.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested query string arguments to the Request.
     *
     * @param request Request to add query string arguments to
     */
    private void addQueryParams(final Request request) {
        if (events != null) {
            request.addQueryParam("Events", events);
        }

        if (metrics != null) {
            request.addQueryParam("Metrics", metrics);
        }
    }
}