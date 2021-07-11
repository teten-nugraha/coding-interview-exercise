package id.ten.practice.week1;

import java.util.HashMap;
import java.util.Map;

/**
 * Project: practice for experiment
 * Package: id.ten.practice.week1
 * <p>
 * User: TetenNugraha
 * Date: 6/18/2021
 * Time: 4:06 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 *
 */
public class TwoSum {

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[]twoSumBruteForce(int[]nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0 + 1; j < nums.length ; j++) {
                if(nums[j] == target - nums[i]) {
                    return new int[]{i, j};
                }
            }
        }
        throw  new IllegalArgumentException("No two solution");
    }

    /**
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSumTwoPassHashTable(int[]nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement) && map.get(complement) != i) {
                return new int[]{i, map.get(complement)};
            }
        }
        throw  new IllegalArgumentException("No two solution");
    }

    public static void main(String[] args) {
        int[]nums = {2,7,11};
        int[]idx = twoSumBruteForce(nums, 9);
        int[]idx2= twoSumTwoPassHashTable(nums, 9);
        System.out.println(idx);
    }
}
