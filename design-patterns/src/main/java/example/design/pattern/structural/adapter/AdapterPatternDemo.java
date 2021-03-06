package example.design.pattern.structural.adapter;

import example.design.pattern.structural.adapter.player.impl.AudioPlayer;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }
}