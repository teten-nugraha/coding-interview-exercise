package id.ten.practice.week1.leetcode.array;

/**
 * Package: id.ten.practice.week1.leetcode.array
 * <p>
 * User: TetenNugraha
 * Date: 7/9/2021
 * Time: 12:01 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public class BestTimeForBuyAndSell {
    public static void main(String[] args) {
        int[] nums = new int[]{7,6,4,3,1};
        int profit = findProfit(nums);
        System.out.println("Profit nya adalah = "+profit);
    }

    private static int findProfit(int[] prices) {
        int profit = 0;
        int length = prices.length;

        if(length == 0 ) profit = 0;

        for (int i = 1; i < length; i++) {
            if(prices[i] > prices[i-1]) {
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
}
