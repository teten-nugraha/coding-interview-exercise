package id.ten.practice.week1.designPattern.structuralPattern.adapter;

/**
 * Package: id.ten.practice.week1.designPattern.structuralPattern.adapter
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 10:32 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String filename) {
        if(audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Playing mp3 file. Name: "+filename);
        }else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, filename);
        }else{
            System.out.println("Invalid media "+ audioType+" format not supported");
        }
    }
}
