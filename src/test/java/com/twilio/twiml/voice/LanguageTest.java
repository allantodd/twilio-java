/**
 * This code was generated by
 * \ / _    _  _|   _  _
 *  | (_)\/(_)(_|\/| |(/_  v1.0.0
 *       /       /
 */

package com.twilio.twiml.voice;

import com.twilio.twiml.GenericNode;
import org.junit.Assert;
import org.junit.Test;

/**
 * Test class for {@link Language}
 */
public class LanguageTest {
    @Test
    public void testEmptyElement() {
        Language elem = new Language.Builder().build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Language/>",
            elem.toXml()
        );
    }

    @Test
    public void testEmptyElementUrl() {
        Language elem = new Language.Builder().build();

        Assert.assertEquals("%3C%3Fxml+version%3D%221.0%22+encoding%3D%22UTF-8%22%3F%3E%3CLanguage%2F%3E", elem.toUrl());
    }

    @Test
    public void testElementWithParams() {
        Language elem = new Language.Builder()
            .code("code")
            .ttsProvider("tts_provider")
            .voice("voice")
            .transcriptionProvider("transcription_provider")
            .speechModel("speech_model")
            .build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Language code=\"code\" speechModel=\"speech_model\" transcriptionProvider=\"transcription_provider\" ttsProvider=\"tts_provider\" voice=\"voice\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithExtraAttributes() {
        Language elem = new Language.Builder().option("foo", "bar").option("a", "b").build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Language a=\"b\" foo=\"bar\"/>",
            elem.toXml()
        );
    }

    @Test
    public void testElementWithTextNode() {
        Language.Builder builder = new Language.Builder();

        builder.addText("Hey no tags!");

        Language elem = builder.build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Language>" +
            "Hey no tags!" +
            "</Language>",
            elem.toXml()
        );
    }

    @Test
    public void testMixedContent() {
        GenericNode.Builder child = new GenericNode.Builder("Child");
        child.addText("content");

        Language.Builder builder = new Language.Builder();

        builder.addText("before");
        builder.addChild(child.build());
        builder.addText("after");

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Language>" +
            "before" +
            "<Child>content</Child>" +
            "after" +
            "</Language>",
            builder.build().toXml()
        );
    }

    @Test
    public void testElementWithGenericNode() {
        GenericNode.Builder genericBuilder = new GenericNode.Builder("genericTag");
        genericBuilder.addText("Some text");
        GenericNode node = genericBuilder.build();

        Language.Builder builder = new Language.Builder();
        Language elem = builder.addChild(node).build();

        Assert.assertEquals(
            "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" +
            "<Language>" +
            "<genericTag>" +
            "Some text" +
            "</genericTag>" +
            "</Language>",
            elem.toXml()
        );
    }

    @Test
    public void testXmlAttributesDeserialization() {
        final Language elem = new Language.Builder()
            .code("code")
            .ttsProvider("tts_provider")
            .voice("voice")
            .transcriptionProvider("transcription_provider")
            .speechModel("speech_model")
            .build();

        Assert.assertEquals(
            Language.Builder.fromXml("<Language code=\"code\" speechModel=\"speech_model\" transcriptionProvider=\"transcription_provider\" ttsProvider=\"tts_provider\" voice=\"voice\"/>").build().toXml(),
            elem.toXml()
        );
    }
}