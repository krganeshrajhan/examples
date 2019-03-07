package example.java.algorithms.paradigm.greedy;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int buyPrice = 0;
        for(int i=0; i<prices.length-1;i++) {
            if(prices[i+1] > prices[i] && (i<prices.length-2 && prices[i+2] <= prices[i+1])) {
                maxProfit += prices[i+1] - buyPrice;
                buyPrice = 0;
                i++;
            } else if(prices[i+1] > prices[i] && buyPrice ==0 ) {
                buyPrice =0;
            } else {
                buyPrice =0;
            }
        }
        return maxProfit;
    }

    public static void main(String[][] args) {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        System.out.println(b.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}
