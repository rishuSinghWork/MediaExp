package com.reeshu.mp3player;

import javax.sound.sampled.*;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.BufferedInputStream;
import javazoom.jl.player.Player;


public class MediaOutput {
    public void play(String filePath) {
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(filePath))) {
            Player player = new Player(inputStream);
            System.out.println("Playing MP# file: " + filePath);
            player.play();
        } catch (Exception e) {
            System.err.println("Error playing MP3 file: " + e.getMessage());
        }
    }
}

