package id.ten.practice.week1.string.day1;

/**
 * Package: id.ten.practice.week1.string.day1
 * <p>
 * User: TetenNugraha
 * Date: 7/5/2021
 * Time: 1:50 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class CekPalindrome1 {
    public static void main(String[] args) {
        String test = "yasna";
        boolean isPalindrome=  cekPalindrome(test);
        System.out.println(isPalindrome);
    }

    private static boolean cekPalindrome(String test) {
        int i=0;
        int j = test.length()-1;
        while(i < j) {
            if(test.charAt(i) != test.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
