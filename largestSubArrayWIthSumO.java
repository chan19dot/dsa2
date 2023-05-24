import java.util.*;

public class largestSubArrayWIthSumO {

    public static int maxLen(int n, List<Integer> arr){
        int sum=0;
        int mLen=0;
        HashMap<Integer,Integer> map = new HashMap();
        for(int i=0;i<n;i++){
            sum+=arr.get(i);

            if(arr.get(i)==0 && mLen==0){
                mLen=1;
            }

            if(sum==0){
                mLen=i+1;
            }

            if(!map.containsKey(sum)){
                map.put(sum,i);
            }
            else{
                mLen= Math.max(mLen, i-map.get(sum));
            }
        }
        return mLen;
    }

    public static void main(String[] args) {
        Integer[] arra = {15, -2, 2, -8, 1, 7, 10, 23};
        int n =8;
        List<Integer> arr = Arrays.asList(arra);
        System.out.println(maxLen(n,arr));
    }
}
