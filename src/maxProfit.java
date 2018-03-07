public class maxProfit {

    public static int maxProfit(int[] prices, int fee){
        int sell = 0;
        int own = -prices[0];

        for(int i = 1; i<prices.length; i++){
            sell = Math.max(sell, own+prices[i]-fee);
            own = Math.max(own, sell-prices[i]);

        }
        return sell;
    }
    public static void main(String[] args) {

        int[] prices = new int[]{1,9,2,7,11,8,30,11,30};
        int fee = 2;
        System.out.println(maxProfit(prices, fee));
    }

}
