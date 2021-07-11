package id.ten.practice.week1.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/10/2021
 * Time: 7:45 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int ar1[] = {4,9,5};
        int ar2[] = {9,4,9,8,4};
        int[] intr  = intersect(ar1, ar2);
        System.out.println(Arrays.toString(intr));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> list = new ArrayList<Integer>();
        int p1=0, p2=0;
        while(p1<nums1.length && p2<nums2.length){
            if(nums1[p1]<nums2[p2]){
                p1++;
            }else if(nums1[p1]>nums2[p2]){
                p2++;
            }else{
                list.add(nums1[p1]);
                p1++;
                p2++;

            }
        }

        int[] result = new int[list.size()];
        int i=0;
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }
        return result;
    }

}
