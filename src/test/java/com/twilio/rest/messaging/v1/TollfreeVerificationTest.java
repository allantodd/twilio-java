/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.rest.messaging.v1;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.twilio.Twilio;
import com.twilio.converter.DateConverter;
import com.twilio.converter.Promoter;
import com.twilio.exception.TwilioException;
import com.twilio.http.HttpMethod;
import com.twilio.http.Request;
import com.twilio.http.Response;
import com.twilio.http.TwilioRestClient;
import com.twilio.rest.Domains;
import mockit.Mocked;
import mockit.NonStrictExpectations;
import org.junit.Before;
import org.junit.Test;

import java.net.URI;

import static com.twilio.TwilioTest.serialize;
import static org.junit.Assert.*;

public class TollfreeVerificationTest {
    @Mocked
    private TwilioRestClient twilioRestClient;

    @Before
    public void setUp() throws Exception {
        Twilio.init("AC123", "AUTH TOKEN");
    }

    @Test
    public void testFetchRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Tollfree/Verifications/HHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TollfreeVerification.fetcher("HHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testFetchResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"customer_profile_sid\": \"BU3344409f7e067e279523808d267e2d85\",\"trust_product_sid\": \"BU3344409f7e067e279523808d267e2d88\",\"regulated_item_sid\": \"RA3344409f7e067e279523808d267e2d89\",\"date_created\": \"2021-01-27T14:18:35Z\",\"date_updated\": \"2021-01-27T14:18:36Z\",\"business_name\": \"Agent\",\"business_street_address\": \"927 Terrace St\",\"business_street_address2\": \"Unit 4\",\"business_city\": \"Tempe\",\"business_state_province_region\": \"AZ\",\"business_postal_code\": \"85281\",\"business_country\": \"USA\",\"business_website\": \"www.ghost.com\",\"business_contact_first_name\": \"Vikram\",\"business_contact_last_name\": \"Amar\",\"business_contact_email\": \"vikram@gmail.com\",\"business_contact_phone\": \"+16504988765\",\"notification_email\": \"vikram@gmail.com\",\"use_case_categories\": [\"2FA\",\"MARKETING\"],\"use_case_summary\": \"test\",\"production_message_sample\": \"test1\",\"opt_in_image_urls\": [\"https://zipwhiptestbusiness.com/images/image1.jpg\",\"https://zipwhiptestbusiness.com/images/image2.jpg\"],\"opt_in_type\": \"VERBAL\",\"message_volume\": \"1,000\",\"additional_information\": \"info\",\"tollfree_phone_number_sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"TWILIO_APPROVED\",\"url\": \"https://messaging.twilio.com/v1/Tollfree/Verifications/HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"resource_links\": {\"customer_profile\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BU3344409f7e067e279523808d267e2d85\",\"trust_product\": \"https://trusthub.twilio.com/v1/TrustProducts/BU3344409f7e067e279523808d267e2d88\",\"channel_endpoint_assignment\": \"https://trusthub.twilio.com/v1/TrustProducts/BU3344409f7e067e279523808d267e2d88/ChannelEndpointAssignments/RA3344409f7e067e279523808d267e2d89\"}}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(TollfreeVerification.fetcher("HHXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").fetch());
    }

    @Test
    public void testReadRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.GET,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Tollfree/Verifications");

            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TollfreeVerification.reader().read();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testReadResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"meta\": {\"page\": 0,\"page_size\": 50,\"first_page_url\": \"https://messaging.twilio.com/v1/Tollfree/Verifications?Status=TWILIO_APPROVED&TollfreePhoneNumberSid=PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&PageSize=50&Page=0\",\"previous_page_url\": null,\"next_page_url\": null,\"key\": \"verifications\",\"url\": \"https://messaging.twilio.com/v1/Tollfree/Verifications?Status=TWILIO_APPROVED&TollfreePhoneNumberSid=PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa&PageSize=50&Page=0\"},\"verifications\": [{\"sid\": \"HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"customer_profile_sid\": \"BU3344409f7e067e279523808d267e2d85\",\"trust_product_sid\": \"BU3344409f7e067e279523808d267e2d88\",\"regulated_item_sid\": \"RA3344409f7e067e279523808d267e2d89\",\"date_created\": \"2021-01-27T14:18:35Z\",\"date_updated\": \"2021-01-27T14:18:36Z\",\"business_name\": \"Agent\",\"business_street_address\": \"927 Terrace St\",\"business_street_address2\": \"Unit 4\",\"business_city\": \"Tempe\",\"business_state_province_region\": \"AZ\",\"business_postal_code\": \"85281\",\"business_country\": \"USA\",\"business_website\": \"www.ghost.com\",\"business_contact_first_name\": \"Vikram\",\"business_contact_last_name\": \"Amar\",\"business_contact_email\": \"vikram@gmail.com\",\"business_contact_phone\": \"+16504988765\",\"notification_email\": \"vikram@gmail.com\",\"use_case_categories\": [\"2FA\",\"MARKETING\"],\"use_case_summary\": \"test\",\"production_message_sample\": \"test1\",\"opt_in_image_urls\": [\"https://zipwhiptestbusiness.com/images/image1.jpg\",\"https://zipwhiptestbusiness.com/images/image2.jpg\"],\"opt_in_type\": \"VERBAL\",\"message_volume\": \"1,000\",\"additional_information\": \"info\",\"tollfree_phone_number_sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"status\": \"TWILIO_APPROVED\",\"url\": \"https://messaging.twilio.com/v1/Tollfree/Verifications/HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"resource_links\": {\"customer_profile\": \"https://trusthub.twilio.com/v1/CustomerProfiles/BU3344409f7e067e279523808d267e2d85\",\"trust_product\": \"https://trusthub.twilio.com/v1/TrustProducts/BU3344409f7e067e279523808d267e2d88\",\"channel_endpoint_assignment\": \"https://trusthub.twilio.com/v1/TrustProducts/BU3344409f7e067e279523808d267e2d88/ChannelEndpointAssignments/RA3344409f7e067e279523808d267e2d89\"}}]}", TwilioRestClient.HTTP_STATUS_CODE_OK);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        assertNotNull(TollfreeVerification.reader().read());
    }

    @Test
    public void testCreateRequest() {
        new NonStrictExpectations() {{
            Request request = new Request(HttpMethod.POST,
                                          Domains.MESSAGING.toString(),
                                          "/v1/Tollfree/Verifications");
            request.addPostParam("BusinessName", serialize("business_name"));
            request.addPostParam("BusinessWebsite", serialize("business_website"));
            request.addPostParam("NotificationEmail", serialize("notification_email"));
            request.addPostParam("UseCaseCategories", serialize(Promoter.listOfOne("use_case_categories")));
            request.addPostParam("UseCaseSummary", serialize("use_case_summary"));
            request.addPostParam("ProductionMessageSample", serialize("production_message_sample"));
            request.addPostParam("OptInImageUrls", serialize(Promoter.listOfOne("opt_in_image_urls")));
            request.addPostParam("OptInType", serialize(TollfreeVerification.OptInType.VERBAL));
            request.addPostParam("MessageVolume", serialize("message_volume"));
            request.addPostParam("TollfreePhoneNumberSid", serialize("PNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX"));
            twilioRestClient.request(request);
            times = 1;
            result = new Response("", 500);
            twilioRestClient.getAccountSid();
            result = "AC123";
        }};

        try {
            TollfreeVerification.creator("business_name", "business_website", "notification_email", Promoter.listOfOne("use_case_categories"), "use_case_summary", "production_message_sample", Promoter.listOfOne("opt_in_image_urls"), TollfreeVerification.OptInType.VERBAL, "message_volume", "PNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
            fail("Expected TwilioException to be thrown for 500");
        } catch (TwilioException e) {}
    }

    @Test
    public void testCreateResponse() {
        new NonStrictExpectations() {{
            twilioRestClient.request((Request) any);
            result = new Response("{\"sid\": \"HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"account_sid\": \"ACaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"regulated_item_sid\": null,\"customer_profile_sid\": \"BU3344409f7e067e279523808d267e2d85\",\"trust_product_sid\": null,\"status\": \"PENDING_REVIEW\",\"date_created\": \"2021-01-27T14:18:35Z\",\"date_updated\": \"2021-01-27T14:18:36Z\",\"business_name\": \"Agent\",\"business_street_address\": \"927 Terrace St\",\"business_street_address2\": \"Unit 4\",\"business_city\": \"Tempe\",\"business_state_province_region\": \"AZ\",\"business_postal_code\": \"85281\",\"business_country\": \"USA\",\"business_website\": \"www.ghost.com\",\"business_contact_first_name\": \"Vikram\",\"business_contact_last_name\": \"Amar\",\"business_contact_email\": \"vikram@gmail.com\",\"business_contact_phone\": \"+16504988765\",\"notification_email\": \"vikram@gmail.com\",\"use_case_categories\": [\"2FA\",\"MARKETING\"],\"use_case_summary\": \"test\",\"production_message_sample\": \"test1\",\"opt_in_image_urls\": [\"https://zipwhiptestbusiness.com/images/image1.jpg\",\"https://zipwhiptestbusiness.com/images/image2.jpg\"],\"opt_in_type\": \"VERBAL\",\"message_volume\": \"1,000\",\"additional_information\": \"info\",\"tollfree_phone_number_sid\": \"PNaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\",\"resource_links\": {},\"url\": \"https://messaging.twilio.com/v1/Tollfree/Verifications/HHaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa\"}", TwilioRestClient.HTTP_STATUS_CODE_CREATED);
            twilioRestClient.getObjectMapper();
            result = new ObjectMapper();
        }};

        TollfreeVerification.creator("business_name", "business_website", "notification_email", Promoter.listOfOne("use_case_categories"), "use_case_summary", "production_message_sample", Promoter.listOfOne("opt_in_image_urls"), TollfreeVerification.OptInType.VERBAL, "message_volume", "PNXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX").create();
    }
}