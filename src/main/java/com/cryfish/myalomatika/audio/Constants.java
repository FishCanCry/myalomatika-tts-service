package com.cryfish.myalomatika.audio;
public interface Constants {

    /**
     * 1.0 - slow voice
     * 3.0 - very fast voice
     */

    VoiceSpeedList voiceSpeedList = new VoiceSpeedList(){{
        add(new VoiceSpeed(1, 1000, 1300, "1.5"));
        add(new VoiceSpeed(1, 1300, "1.3"));

        add(new VoiceSpeed(2, 1000, 1300, "1.4"));
        add(new VoiceSpeed(2, 1300, 1500, "1.4"));
        add(new VoiceSpeed(2, 1500, 1700, "1.3"));
        add(new VoiceSpeed(2, 1700, 2000, "1.3"));
        add(new VoiceSpeed(2, 2000, 2300, "1.3"));
        add(new VoiceSpeed(2, 2300, 2500, "1.3"));
        add(new VoiceSpeed(2, 2500, 2700, "1.3"));
        add(new VoiceSpeed(2, 2700, 3000, "1.3"));

        add(new VoiceSpeed(3, 2000, 2300, "2.5"));
        add(new VoiceSpeed(3, 2300, 2500, "2.5"));
        add(new VoiceSpeed(3, 2500, 2700, "2.3"));
        add(new VoiceSpeed(3, 2700, 3000, "2.3"));

        add(new VoiceSpeed(4, 2000, 2300, "2.8"));
        add(new VoiceSpeed(4, 2300, 2500, "2.8"));
        add(new VoiceSpeed(4, 2500, 2700, "2.6"));
        add(new VoiceSpeed(4, 2700, 3000, "2.6"));
    }};

}
