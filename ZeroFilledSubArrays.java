import java.util.*;




public class ZeroFilledSubArrays {

    static long sumOfNnumbers(long n){
        return (n* (n+1))/2; }

    static public long zerofilledSubArray(int[] nums){
        long count =0;
        long ans=0L;

            for(int num: nums){
            if(num==0){
                count++;
            }
            else{
                ans+= sumOfNnumbers(count);
                count=0;
            }
        }
        if(count>0){
            ans+= sumOfNnumbers(count);
        }
        return ans;
    }

    static public void main(String[] args){
        int[] nums = new int[]{0,0,0,0,0,0,0,0};
        System.out.println(zerofilledSubArray(nums));

    }
}
