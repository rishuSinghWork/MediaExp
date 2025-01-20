package com.reeshu.mp3player;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class MP3Decoder {
    private final String filePath;

    public MP3Decoder(String filePath) {
        this.filePath = filePath;
    }
   
    public String getFilePath() {
        return filePath;
    }


    public BufferedInputStream decode() throws Exception {
        System.out.println("Decoding MP3 file: " + filePath);
        return new BufferedInputStream(new FileInputStream(filePath));
    }
    
}

