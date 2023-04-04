public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {
        int[]  prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    static int maxProfit(int[] prices) {

        int mini = prices[0];
        int max = Integer.MIN_VALUE;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<mini) mini = prices[i];
            max=Math.max(prices[i]-mini,max);
        }
        return max;
    }
}
