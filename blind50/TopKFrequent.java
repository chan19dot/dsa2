package blind50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        for(int j : map.keySet()){
            if(map.get(j)>=k){
                res.add(j);
            }
        }
        int[] result= new int[res.size()];
        for(int i=0;i<res.size();i++){
            result[i]= res.get(i);
        }
        return result;

    }
}
