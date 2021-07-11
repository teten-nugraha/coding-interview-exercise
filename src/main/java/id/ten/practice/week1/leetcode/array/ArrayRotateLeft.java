package id.ten.practice.week1.leetcode.array;

import java.util.Arrays;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/10/2021
 * Time: 4:16 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ArrayRotateLeft {
    public static void main(String[] args) {
        leftRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
    }

    private static void leftRotate(int[] inputArray, int countRotate) {

        System.out.println("Before = "+Arrays.toString(inputArray));

        final int arrLength = inputArray.length;
        int firstElement;
        for (int i = 1; i <= countRotate; i++) {
            firstElement  = inputArray[0];

            for (int j = 0; j < arrLength-1; j++) {
                inputArray[j] = inputArray[j+1];
            }

            inputArray[arrLength-1]  =firstElement;
        }

        System.out.println("After = "+Arrays.toString(inputArray));
    }
}
