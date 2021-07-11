package id.ten.practice.week1.leetcode.array;

import java.util.Arrays;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/10/2021
 * Time: 6:35 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ArrayRotateRight {
    private static void rightRotate(int[] inputArray, int n) {
        System.out.println("Input Array Before Rotation :");

        System.out.println(Arrays.toString(inputArray));

        int temp;
        temp = inputArray[inputArray.length - 1];

        for (int j = inputArray.length - 1; j > 0; j--) {
            inputArray[j] = inputArray[j - 1];
        }

        inputArray[0] = temp;

        for (int i = 1; i <= n; i++) {
        }

        System.out.println("Input Array After Right Rotation By " + n + " Positions :");

        System.out.println(Arrays.toString(inputArray));
    }

    public static void main(String[] args) {
        rightRotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 2);
    }
}
