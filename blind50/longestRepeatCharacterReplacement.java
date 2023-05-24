package blind50;

import java.util.*;
import java.util.Map;

public class longestRepeatCharacterReplacement {

    public static int characterReplacement(String s, int k) {
        Map count = new HashMap<>();
        int res = 0;
        int l=0;
        int r=0;
        for(;r<s.length();r++){
            count.put(s.charAt(r), count.getOrDefault(s.charAt(r),0));
            int mostFrequentChar = getMostFrequentCharVal(count);
            while((r-l+1) -mostFrequentChar >= k){
                l++;
            }
            res= Integer.max(res, r-l+1);
        }
        return res;
    }

    public static int getMostFrequentCharVal(Map<Character, Integer> map){
        int max=0;
        for(char c : map.keySet()){
            max = map.get(c)>max?map.get(c): max;
        }
        List<String> str = new ArrayList<>(8);
        return max;
    }
}
