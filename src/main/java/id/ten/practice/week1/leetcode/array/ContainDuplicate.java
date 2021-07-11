package id.ten.practice.week1.leetcode.array;

import java.util.HashSet;
import java.util.Set;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/10/2021
 * Time: 4:24 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class ContainDuplicate {
    public static void main(String[] args) {

        boolean isDuplicate  =checkDuplicate(new int[]{1, 2, 3});
        System.out.println(isDuplicate);
    }

    private static boolean checkDuplicate(int[] ints) {
        Set<Integer> arrayUnique = new HashSet<>();
        boolean isUnique = false;
        for(Integer value: ints) {
            arrayUnique.add(value);
        }
        if(ints.length != arrayUnique.size()) {
            isUnique = true;
        }else{
            isUnique = false;
        }
        return isUnique;
    }
}
