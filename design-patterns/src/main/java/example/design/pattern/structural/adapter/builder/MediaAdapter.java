package example.design.pattern.structural.adapter.builder;

import example.design.pattern.structural.adapter.player.AdvancedMediaPlayer;
import example.design.pattern.structural.adapter.player.MediaPlayer;
import example.design.pattern.structural.adapter.player.impl.Mp4Player;
import example.design.pattern.structural.adapter.player.impl.VlcPlayer;

/**
 * Created by 1532082 on 7/11/2016.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType){

        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlayer = new VlcPlayer();

        }else if (audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer = new Mp4Player();
        }
    }

    public void play(String audioType, String fileName) {

        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlayer.playVlc(fileName);
        }
        else if(audioType.equalsIgnoreCase("mp4")){
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}
