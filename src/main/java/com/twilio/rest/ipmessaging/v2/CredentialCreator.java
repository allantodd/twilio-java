/*
 * This code was generated by
 * ___ _ _ _ _ _    _ ____    ____ ____ _    ____ ____ _  _ ____ ____ ____ ___ __   __
 *  |  | | | | |    | |  | __ |  | |__| | __ | __ |___ |\ | |___ |__/ |__|  | |  | |__/
 *  |  |_|_| | |___ | |__|    |__| |  | |    |__] |___ | \| |___ |  \ |  |  | |__| |  \
 *
 * Twilio - Ip_messaging
 * This is the public Twilio REST API.
 *
 * NOTE: This class is auto generated by OpenAPI Generator.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.twilio.rest.ipmessaging.v2;

import com.twilio.base.Creator;
import com.twilio.constant.EnumConstants;
import com.twilio.exception.ApiConnectionException;
import com.twilio.exception.ApiException;
import com.twilio.exception.RestException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;

public class CredentialCreator extends Creator<Credential> {

    private Credential.PushService type;
    private String friendlyName;
    private String certificate;
    private String privateKey;
    private Boolean sandbox;
    private String apiKey;
    private String secret;

    public CredentialCreator(final Credential.PushService type) {
        this.type = type;
    }

    public CredentialCreator setType(final Credential.PushService type) {
        this.type = type;
        return this;
    }

    public CredentialCreator setFriendlyName(final String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    public CredentialCreator setCertificate(final String certificate) {
        this.certificate = certificate;
        return this;
    }

    public CredentialCreator setPrivateKey(final String privateKey) {
        this.privateKey = privateKey;
        return this;
    }

    public CredentialCreator setSandbox(final Boolean sandbox) {
        this.sandbox = sandbox;
        return this;
    }

    public CredentialCreator setApiKey(final String apiKey) {
        this.apiKey = apiKey;
        return this;
    }

    public CredentialCreator setSecret(final String secret) {
        this.secret = secret;
        return this;
    }

    @Override
    public Credential create(final TwilioRestClient client) {
        String path = "/v2/Credentials";

        path = path.replace("{" + "Type" + "}", this.type.toString());

        Request request = new Request(
            HttpMethod.POST,
            Domains.IPMESSAGING.toString(),
            path
        );
        request.setContentType(EnumConstants.ContentType.FORM_URLENCODED);
        addPostParams(request);
        Response response = client.request(request);
        if (response == null) {
            throw new ApiConnectionException(
                "Credential creation failed: Unable to connect to server"
            );
        } else if (!TwilioRestClient.SUCCESS.test(response.getStatusCode())) {
            RestException restException = RestException.fromJson(
                response.getStream(),
                client.getObjectMapper()
            );
            if (restException == null) {
                throw new ApiException(
                    "Server Error, no content",
                    response.getStatusCode()
                );
            }
            throw new ApiException(restException);
        }

        return Credential.fromJson(
            response.getStream(),
            client.getObjectMapper()
        );
    }

    private void addPostParams(final Request request) {
        if (type != null) {
            request.addPostParam("Type", type.toString());
        }
        if (friendlyName != null) {
            request.addPostParam("FriendlyName", friendlyName);
        }
        if (certificate != null) {
            request.addPostParam("Certificate", certificate);
        }
        if (privateKey != null) {
            request.addPostParam("PrivateKey", privateKey);
        }
        if (sandbox != null) {
            request.addPostParam("Sandbox", sandbox.toString());
        }
        if (apiKey != null) {
            request.addPostParam("ApiKey", apiKey);
        }
        if (secret != null) {
            request.addPostParam("Secret", secret);
        }
    }
}
