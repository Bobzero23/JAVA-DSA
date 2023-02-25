package LeetCode;

public class BestTimeToBuyAndSellStock_121 {


    static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minProfit = Integer.MAX_VALUE;

        for(int i = 0; i < prices.length; i++) {
            if (prices[i] < minProfit) {
                minProfit = prices[i];
            } else if (prices[i] - minProfit > maxProfit) {
                maxProfit = prices[i] - minProfit;
            }
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int [] prices = {7,1,5,3,6,4};

        int result = maxProfit(prices);
        System.out.println(result);
    }
}
