package id.ten.practice.week1.string.day1;

import java.util.Arrays;

/**
 * Package: id.ten.practice.week1.string.day1
 * <p>
 * User: TetenNugraha
 * Date: 7/5/2021
 * Time: 1:56 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CekAnagram1 {
    public static void main(String[] args) {
        final String value1 = "geeksforgeeks";
        final String value2 = "geeksforgeeks1";
        final boolean isAnagram  =cekAnagram(value1, value2);
        System.out.println(isAnagram);
    }

    private static boolean cekAnagram(String value1, String value2) {
        char a[]=value1.toCharArray();
        char b[]=value2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(String.valueOf(a).equalsIgnoreCase(String.valueOf(b))){
            return true;
        }
        return false;
    }
}
