package id.ten.practice.week1.leetcode.array;

import java.util.Arrays;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/11/2021
 * Time: 1:28 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 *
 * For the input array 123, the new array is 124.
 * For the input array 99, the new array is 100.
 * For the input array 9, the new array is 10.
 * For the empty array [ ], the new array is [1].
 *
 */
public class PlusOne {
    public static void main(String[] args) {
        int ar1[] = {99};
        int[]plusOne = makePlusOne(ar1);
        System.out.println(Arrays.toString(plusOne));
    }

    private static int[] makePlusOne(int[] digits) {
        if(digits == null || digits.length ==0)  {
            int[]temp={1};
            return temp;
        }

        int carry=1;
        int i;
        for(i = digits.length-1; i >= 0; i--) {
            if(digits[i] == 9) {
                digits[i] = 0;
            }else{
                carry += digits[i];
                digits[i] = carry;
                break;
            }
        }

        if(i < 0) {
            int[]result = new int[digits.length+1];
            result[0]=1;
            return  result;
        }else{
            return digits;
        }
    }
}
