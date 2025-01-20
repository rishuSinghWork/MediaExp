package com.reeshu.mp3player;

public class MP3Player implements MediaPlayer {
    private final MP3Decoder decoder;
    private final MediaOutput output;

    public MP3Player(MP3Decoder decoder, MediaOutput output) {
        this.decoder = decoder;
        this.output = output;
    }

    @Override
    public void play() {
        output.play(decoder.getFilePath());
    }

    @Override
    public void pause() {
        System.out.println("Pause functionality not implemented yet.");
    }

    @Override
    public void stop() {
        System.out.println("Stop functionality not implememnted yet.");
    }
}



