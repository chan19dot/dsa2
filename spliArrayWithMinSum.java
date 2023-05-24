import java.util.Arrays;

public class spliArrayWithMinSum {


        int[] nums;
        public  int splitArray(int[] nums, int m) {
            this.nums = nums;
            int low = 0, high = 0, min = Integer.MAX_VALUE;
            for(int i=0;i<nums.length;i++){
                low = Math.max(low, nums[i]);
                high += nums[i];
            }
            while(low <= high) {
                int mid = (low + high) / 2;
                if(isSplitable(mid, m)){
                    min = Math.min(min, mid);
                    high = mid - 1;
                }
                else low = mid + 1;
            }
            return min;
        }

        private  boolean isSplitable(int mid, int m){
            int count = 0, i=0;
            while(i < nums.length){
                int val = 0;
                while(i < nums.length && nums[i] + val <= mid) val += nums[i++];
                count++;
            }
            return count <= m;
        }




    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int k=2;
        int partitions =nums.length/k;
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;){
            int count = partitions;
            int temp= 0;
            while(i<nums.length && count>0){
                temp+=nums[i];
                count--;
                i++;
            }
            i--;
            if(temp>sum){
                sum= temp;
            }
        }
        System.out.println(sum);
    }
}
