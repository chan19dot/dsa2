package blind50;

public class MaxProfit {

    public static int maxProfit(int[] prices) {

        int profit=0;
        int left =0;
        int right =1;
        if(prices.length>1){
            while(right<prices.length){
                if(prices[left]<prices[right]){
                    profit= Math.max(prices[right]-prices[left],profit);
                }
                else{
                    left=right;
                }
                right+=1;


            }
        }
        return profit;

    }

    public static void main(String[] args) {
        maxProfit(new int[]{7,1,5,3,6,4});
    }

}
