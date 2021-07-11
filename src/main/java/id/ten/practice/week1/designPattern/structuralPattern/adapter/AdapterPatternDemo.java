package id.ten.practice.week1.designPattern.structuralPattern.adapter;

/**
 * Package: id.ten.practice.week1.designPattern.structuralPattern.adapter
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 10:34 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.play("mp3","beyond the horizon.mp3");
        audioPlayer.play("mp4","alone.mp4");
        audioPlayer.play("vlc","far far.vlc");
        audioPlayer.play("avi","media.avi");
    }
}
