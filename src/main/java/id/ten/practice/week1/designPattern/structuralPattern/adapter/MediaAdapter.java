package id.ten.practice.week1.designPattern.structuralPattern.adapter;

/**
 * Package: id.ten.practice.week1.designPattern.structuralPattern.adapter
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 10:29 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class MediaAdapter implements MediaPlayer {

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audiotype) {
        if(audiotype.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer = new VlcPlayer();
        }else if(audiotype.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(filename);
        }else if(audioType.equalsIgnoreCase("mp4")) {
            advancedMediaPlayer.playmp4(filename);
        }
    }
}
