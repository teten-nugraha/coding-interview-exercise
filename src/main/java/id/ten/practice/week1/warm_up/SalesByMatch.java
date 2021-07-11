package id.ten.practice.week1.warm_up;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Project: practice for experiment
 * Package: id.ten.practice.week1.warm_up
 * <p>
 * User: TetenNugraha
 * Date: 6/21/2021
 * Time: 11:59 AM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class SalesByMatch {

    public static void main(String[] args) throws Exception {
        int target = 3;
        int[]values={1,2,1};
        System.out.println("There is a "+calculateCouple(target, values));
    }

    /**
     * method ini untuk menghitung jumlah pasangan yang ada dalam array
     * disimpan dalam Set jika data blm ada d colection maka di tambahkan
     * jika sudah ada maka d remove dan di tambah 1 artinya sudah menemukan pasangannya
     *
     * @param target
     * @param values
     * @return
     * @throws Exception
     */
    private static int calculateCouple(int target, int[] values) throws Exception {
        if(target != values.length) {
            throw new Exception("Not match");
        }
        int pairs = 0;
        Set<Integer> sets = new HashSet<>();
        for (int i : values) {
            if(!sets.contains(i)) {
                sets.add(i);
            }else{
                sets.remove(i);
                ++pairs;
            }
        }
        return pairs;
    }

}
