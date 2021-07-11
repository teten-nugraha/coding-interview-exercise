package id.ten.practice.week1.warm_up;

/**
 * Package: id.ten.practice.week1.warm_up
 * <p>
 * User: TetenNugraha
 * Date: 6/29/2021
 * Time: 2:44 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CountingValley {

    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        int jumlahValley = countingValley(steps, path);
        System.out.println(jumlahValley);
    }

    private static int countingValley(int steps, String path) {
        int level = 0;
        int valley = 0;
        for (int i = 0; i < steps; i++) {
            if(path.charAt(i) == 'U') {
                level++;
            }else if(path.charAt(i) == 'D') {
                if(level == 0) {
                    valley++;
                }
                level--;
            }

        }
        return valley;
    }

}
