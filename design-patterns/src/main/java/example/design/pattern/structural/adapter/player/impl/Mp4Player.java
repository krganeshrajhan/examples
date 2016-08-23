package example.design.pattern.structural.adapter.player.impl;

import example.design.pattern.structural.adapter.player.AdvancedMediaPlayer;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class Mp4Player implements AdvancedMediaPlayer {

    public void playVlc(String fileName) {
        //do nothing
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+ fileName);
    }
}
