package id.ten.practice.week1.string.day1;

import java.util.Arrays;

/**
 * Package: id.ten.practice.week1.string.day1
 * <p>
 * User: TetenNugraha
 * Date: 7/5/2021
 * Time: 4:07 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class SortString {
    public static void main(String[] args) {
        final String input = "teten";
        final String output = sort(input);
        System.out.println(output);
    }

    private static String sort(String input) {
        final char[]chars = input.toCharArray();
        Arrays.sort(chars);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length-1; i++) {
            sb.append(chars[i]);
        }
        return sb.reverse().toString();
    }
}
