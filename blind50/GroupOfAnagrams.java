package blind50;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupOfAnagrams {
//    public List<List<String>> groupAnagrams(String[] strs) {
//        Map<int[], List<String>> map = new HashMap<>();
//        for(int i = 0; i< strs.length; i++){
//            int[] chars = new int[26];
//            for(char c: strs[i].toCharArray()){
//                chars[c-'a']+=1;
//            }
//            if(map.containsKey(chars)){
//                List<String> temp = map.get(chars);
//                temp.add(strs[i]);
//                int [] characs = chars;
//                map.put(characs, temp);
//            }
//            else{
//                List<String> temp = new ArrayList<>();
//                temp.add(strs[i]);
//                map.put(chars,temp);
//            }
//        }
//        List<List<String>> res = new ArrayList<>();
//        for(List<String> s : map.values()){
//            res.add(s);
//            s.
//        }
//        return res;
//    }
    public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> res = new ArrayList<>();
            if (strs.length == 0) return res;
            HashMap<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] hash = new char[26];
                for (char c : s.toCharArray()) {
                    hash[c - 'a']++;
                }
                String key = new String(hash);
                map.computeIfAbsent(key, k -> new ArrayList<>());
                map.get(key).add(s);
            }
            res.addAll(map.values());
            return res;
}


}
