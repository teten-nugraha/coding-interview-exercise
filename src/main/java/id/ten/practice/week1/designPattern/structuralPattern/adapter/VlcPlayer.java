package id.ten.practice.week1.designPattern.structuralPattern.adapter;

/**
 * Package: id.ten.practice.week1.designPattern.structuralPattern.adapter
 * <p>
 * User: TetenNugraha
 * Date: 7/6/2021
 * Time: 10:27 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+fileName);
    }

    @Override
    public void playmp4(String fileName) {
        // do nothing
    }
}
