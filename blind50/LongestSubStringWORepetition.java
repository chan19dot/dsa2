package blind50;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LongestSubStringWORepetition {
    public static int lengthOfLongestSubstring(String s) {
        List<Character> set = new ArrayList<>();
        int res =0;
        int temp=0;
        for(char i: s.toCharArray()){
            if(!set.add(i)){
                res=Math.max(res,temp);
                temp=1;
                set.clear();
                set.add(i);
            }
            else{
                temp++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("dvdf"));
    }
}
