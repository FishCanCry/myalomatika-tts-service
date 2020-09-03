package com.cryfish.myalomatika.audio;

import org.apache.http.client.utils.URIBuilder;
import org.apache.log4j.Logger;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

import static com.cryfish.myalomatika.audio.Constants.voiceSpeedList;

public class Sound {

    private static final Logger log = Logger.getLogger(Sound.class);

    private static String KEY = "fc911872-536d-400f-b852-27cb5214fb0c";
    public static String DEFAULT_VOICE_SPEED = "1.3";
    public static double MAX_SPEED = 3000;

    public static InputStream getVoice(String number, double speed) {
        try {
            String voiceSpeed = voiceSpeedList.getVoiceSpeed(String.valueOf(Math.abs(Integer.parseInt(number))).length(), speed);

            URIBuilder builder = new URIBuilder();
            builder.setScheme("https");
            builder.setHost("tts.voicetech.yandex.net");
            builder.setPath("generate");
            builder.addParameter("text", number);
            builder.addParameter("format", "wav");
            builder.addParameter("lang", "ru-RU");
            builder.addParameter("speaker", "alyss");
            builder.addParameter("emotion", "good");
            builder.addParameter("key", KEY);
            builder.addParameter("speed", voiceSpeed);
            URL url = builder.build().toURL();

            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();

            log.debug("Sending 'GET' request to URL : " + url);
            log.debug("Response Code : " + responseCode);

            return (responseCode == HttpURLConnection.HTTP_OK) ? con.getInputStream() : null;
        } catch (Exception e) {
            log.debug("Error during getting voice : " + e);
            return null;
        }
    }

}
