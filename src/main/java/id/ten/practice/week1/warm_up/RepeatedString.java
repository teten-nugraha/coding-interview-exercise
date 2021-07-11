package id.ten.practice.week1.warm_up;

/**
 * Package: id.ten.practice.week1.warm_up
 * <p>
 * User: TetenNugraha
 * Date: 7/5/2021
 * Time: 10:20 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class RepeatedString {
    public static void main(String[] args) {
        final String value= "aba";
        final long count = repeatedString(value, 10);
        System.out.println(count);
    }

    private static long repeatedString(String value, long n) {
        int strLength = value.length();
        long q = 0;
        long r = 0;
        q = n/strLength;
        r = n%strLength;
        long partialStrLen = (r==0) ? 0 : r;
        long aCount =
                q * getLetterCount(value, value.length()) + getLetterCount(value,partialStrLen);
            return aCount;
    }

    private static long getLetterCount(String value, long length) {
        long count = 0;
        for (int i = 0; i < length; i++) {
            if(value.charAt(i) == 'a') count++;
        }
        return count;
    }
}
