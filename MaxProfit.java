public class MaxProfit {
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {

        int out=0;
        for(int j=0;j<worker.length;j++){
            int temp=Integer.MIN_VALUE;
            for(int i=0;i<difficulty.length;i++){
                if(difficulty[i]<=worker[j]){
                    if(temp<profit[i]){
                        temp=profit[i];
                    }
                }
            }

            out+=temp;
        }
        if(out<0){
            return 0;
        }
        return out;
    }

    public static void main(String[] args) {
        int[] difficulty = new int[]{64,88,97};
        int[] profit = new int[]{53,86,89};
        int[] worker = new int[]{98,11,6};

        System.out.println(maxProfitAssignment(difficulty,profit,worker));
    }
}
