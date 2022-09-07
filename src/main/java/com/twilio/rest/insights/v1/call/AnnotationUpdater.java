/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.insights.v1.call;

import com.twilio.base.Updater;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

/**
 * PLEASE NOTE that this class contains beta products that are subject to
 * change. Use them with caution.
 */
public class AnnotationUpdater extends Updater<Annotation> {
    private final String pathCallSid;
    private Annotation.AnsweredBy answeredBy;
    private Annotation.ConnectivityIssue connectivityIssue;
    private String qualityIssues;
    private Boolean spam;
    private Integer callScore;
    private String comment;
    private String incident;

    /**
     * Construct a new AnnotationUpdater.
     *
     * @param pathCallSid The SID of the call.
     */
    public AnnotationUpdater(final String pathCallSid) {
        this.pathCallSid = pathCallSid;
    }

    /**
     * Which entity answered the call as determined by Answering Machine Detection.
     * Use this to provide feedback on Answering Machine Detection accuracy.
     * Possible enumerated values, one of: human, machine. human indicates the call
     * was answered by a person. machine indicates the call was answered by an
     * answering machine..
     *
     * @param answeredBy Indicates the answering entity as determined by Answering
     *                   Machine Detection.
     * @return this
     */
    public AnnotationUpdater setAnsweredBy(final Annotation.AnsweredBy answeredBy) {
        this.answeredBy = answeredBy;
        return this;
    }

    /**
     * Specify if the call had any connectivity issues. Possible enumerated values,
     * one : no_connectivity_issue, invalid_number, caller_id, dropped_call,
     * number_reachability..
     *
     * @param connectivityIssue Indicates if the call had any connectivity issue
     * @return this
     */
    public AnnotationUpdater setConnectivityIssue(final Annotation.ConnectivityIssue connectivityIssue) {
        this.connectivityIssue = connectivityIssue;
        return this;
    }

    /**
     * Specify if the call had any subjective quality issues. Possible values, one
     * or more of:  no_quality_issue, low_volume, choppy_robotic, echo, dtmf,
     * latency, owa, static_noise. Use comma separated values to indicate multiple
     * quality issues for the same call.
     *
     * @param qualityIssues Indicates if the call had audio quality issues.
     * @return this
     */
    public AnnotationUpdater setQualityIssues(final String qualityIssues) {
        this.qualityIssues = qualityIssues;
        return this;
    }

    /**
     * Specify if the call was a spam call. Use this to provide feedback on whether
     * calls placed from your account were marked as spam, or if inbound calls
     * received by your account were unwanted spam. Is of type Boolean: true, false.
     * Use true if the call was a spam call..
     *
     * @param spam Call spam indicator
     * @return this
     */
    public AnnotationUpdater setSpam(final Boolean spam) {
        this.spam = spam;
        return this;
    }

    /**
     * Specify the call score. This is of type integer. Use a range of 1-5 to
     * indicate the call experience score, with the following mapping as a reference
     * for rating the call [5: Excellent, 4: Good, 3 : Fair, 2 : Poor, 1: Bad]..
     *
     * @param callScore Call Score
     * @return this
     */
    public AnnotationUpdater setCallScore(final Integer callScore) {
        this.callScore = callScore;
        return this;
    }

    /**
     * Specify any comments pertaining to the call. This of type string with a max
     * limit of 100 characters. Twilio does not treat this field as PII, so don’t
     * put any PII in here..
     *
     * @param comment User comments
     * @return this
     */
    public AnnotationUpdater setComment(final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Associate this call with an incident or support ticket. This is of type
     * string with a max limit of 100 characters. Twilio does not treat this field
     * as PII, so don’t put any PII in here..
     *
     * @param incident Call tag for incidents or support ticket
     * @return this
     */
    public AnnotationUpdater setIncident(final String incident) {
        this.incident = incident;
        return this;
    }

    /**
     * Make the request to the Twilio API to perform the update.
     *
     * @param client TwilioRestClient with which to make the request
     * @return Updated Annotation
     */
    @Override
    @SuppressWarnings("checkstyle:linelength")
    public Annotation update(final TwilioRestClient client) {
        Request request = new Request(
            HttpMethod.POST,
            Domains.INSIGHTS.toString(),
            "/v1/Voice/" + this.pathCallSid + "/Annotation"
        );

        addPostParams(request);
        Response response = client.request(request);

        if (response == null) {
            throw new ApiConnectionException("Annotation update failed: Unable to connect to server");
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(response.getStream(), client.getObjectMapper());
            if (restException == null) {
                throw new ApiException("Server Error, no content");
            }
            throw new ApiException(restException);
        }

        return Annotation.fromJson(response.getStream(), client.getObjectMapper());
    }

    /**
     * Add the requested post parameters to the Request.
     *
     * @param request Request to add post params to
     */
    private void addPostParams(final Request request) {
        if (answeredBy != null) {
            request.addPostParam("AnsweredBy", answeredBy.toString());
        }

        if (connectivityIssue != null) {
            request.addPostParam("ConnectivityIssue", connectivityIssue.toString());
        }

        if (qualityIssues != null) {
            request.addPostParam("QualityIssues", qualityIssues);
        }

        if (spam != null) {
            request.addPostParam("Spam", spam.toString());
        }

        if (callScore != null) {
            request.addPostParam("CallScore", callScore.toString());
        }

        if (comment != null) {
            request.addPostParam("Comment", comment);
        }

        if (incident != null) {
            request.addPostParam("Incident", incident);
        }
    }
}