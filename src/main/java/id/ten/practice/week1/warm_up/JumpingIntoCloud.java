package id.ten.practice.week1.warm_up;

/**
 * Package: id.ten.practice.week1.warm_up
 * <p>
 * User: TetenNugraha
 * Date: 6/29/2021
 * Time: 3:23 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class JumpingIntoCloud {

    public static void main(String[] args) {
        int[]c = {0,0,1,0,0,1,0};
        int count = jumpingOnClouds2(c);
        System.out.println(count);
    }

    private static int jumpingOnClouds(int[] c) {
        int step=0;
        int cumulus=0;
        while(cumulus < c.length-1) {
            int thunderstorm = 1;
            if((cumulus+2 < c.length) && (c[cumulus+2] != thunderstorm)) {
                cumulus=cumulus+2;
            }else{
                cumulus++;
            }
            step++;
        }
        return step;
    }

    private static int jumpingOnClouds2(int[] clouds) {
        int step=0;
        int nextCumulus=0;
        int thunderstorm=1;
        while(nextCumulus < clouds.length-1) {
            if((nextCumulus+2 < clouds.length) && (clouds[nextCumulus+2] != 1)) {
                nextCumulus=nextCumulus+2;
            }else{
                nextCumulus=nextCumulus+1;
            }
            step++;
        }
        return step;
    }
}
