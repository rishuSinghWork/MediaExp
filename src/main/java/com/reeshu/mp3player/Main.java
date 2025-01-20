package com.reeshu.mp3player;

public class Main {
    public static void main(String[] args) {
        String filePath = "src/main/resources/sample3s.mp3";
        MP3Decoder decoder = new MP3Decoder(filePath);
        MediaOutput output = new MediaOutput();
        MediaPlayer player = new MP3Player(decoder, output);

        player.play();
    }
}


