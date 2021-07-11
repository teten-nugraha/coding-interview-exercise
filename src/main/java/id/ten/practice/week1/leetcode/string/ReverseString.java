package id.ten.practice.week1.leetcode.string;

/**
 * Package: id.ten.practice.week1.leetcode.string
 * <p>
 * User: TetenNugraha
 * Date: 7/9/2021
 * Time: 1:07 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ReverseString {
    public static void main(String[] args) {
        final String value = "Teten";
        final char[]chars = value.toCharArray();
        final String reverse = doReverse(chars);
        System.out.println(reverse);
    }

    private static String doReverse(char[] chars) {
        int begin = 0;
        int end = chars.length-1;
        char temp;
        while(end > begin) {
            temp = chars[begin];
            chars[begin] = chars[end];
            chars[end] = temp;
            begin++;
            end--;
        }
        return new String(chars);
    }
}
