package com.cryfish.myalomatika.audio;

import javax.sound.sampled.UnsupportedAudioFileException;
import java.util.ArrayList;

import static com.cryfish.myalomatika.audio.Sound.DEFAULT_VOICE_SPEED;
import static com.cryfish.myalomatika.audio.Sound.MAX_SPEED;

public class VoiceSpeedList extends ArrayList<VoiceSpeed> {

    public String getVoiceSpeed(int digit, double speed) throws UnsupportedAudioFileException {
        if (speed >= getMaxLimit(digit)) {
            return DEFAULT_VOICE_SPEED;
        }
        for (VoiceSpeed voiceSpeed : this) {
            if (digit == voiceSpeed.getDigit()
                    && voiceSpeed.getMin() <= speed && speed < voiceSpeed.getMax()) {
                return voiceSpeed.getSpeedVoice();
            }
        }
        throw new UnsupportedAudioFileException();
    }

    public double getMaxLimit(int digit) {
        for (VoiceSpeed voiceSpeed : this) {
            if (digit == voiceSpeed.getDigit()
                    && voiceSpeed.getMax() == 0) {
                return voiceSpeed.getMin();
            }
        }
        return MAX_SPEED;
    }
}
