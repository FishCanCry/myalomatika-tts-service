package com.cryfish.myalomatika.audio;

public class VoiceSpeed {

    private int digit;
    private double min;
    private double max;
    private String speedVoice;

    public VoiceSpeed(int digit, double min, String speedVoice) {
        this.digit = digit;
        this.min = min;
        this.speedVoice = speedVoice;
    }

    public VoiceSpeed(int digit, double min, double max, String speedVoice) {
        this.digit = digit;
        this.min = min;
        this.max = max;
        this.speedVoice = speedVoice;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public double getMin() {
        return min;
    }

    public void setMin(double min) {
        this.min = min;
    }

    public double getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getSpeedVoice() {
        return speedVoice;
    }

    public void setSpeedVoice(String speedVoice) {
        this.speedVoice = speedVoice;
    }
}
