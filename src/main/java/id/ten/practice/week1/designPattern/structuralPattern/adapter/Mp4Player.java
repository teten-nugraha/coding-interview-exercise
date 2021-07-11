package id.ten.practice.week1.designPattern.structuralPattern.adapter;

/**
 * Package: id.ten.practice.week1.designPattern.structuralPattern.adapter
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 10:28 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // do nothing
    }

    @Override
    public void playmp4(String fileName) {
        System.out.println("Playing mp4 file. Name: "+fileName);
    }
}
