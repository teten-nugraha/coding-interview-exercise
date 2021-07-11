package id.ten.practice.week1.leetcode.array;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/9/2021
 * Time: 11:12 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicateValueFromSortedArray {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2};
        int newLength = removeDuplicates(nums);

        System.out.println("Length of array after removing duplicates = " + newLength);

        System.out.print("Array = ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;
        for (int i = 0; i < nums.length; i++) {

            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            nums[j++] = nums[i];

        }
        return j;
    }
}
