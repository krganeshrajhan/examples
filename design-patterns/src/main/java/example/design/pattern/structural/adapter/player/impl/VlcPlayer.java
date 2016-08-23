package example.design.pattern.structural.adapter.player.impl;

import example.design.pattern.structural.adapter.player.AdvancedMediaPlayer;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {
        //do nothing
    }
}
