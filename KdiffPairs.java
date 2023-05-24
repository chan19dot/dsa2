import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class KdiffPairs {

    public static int findPairsArray(int[] nums, int k) {
        HashMap<Integer,Integer> s = new HashMap<Integer,Integer>();
        int res=0;
        for(int i:nums){
            s.put(i,s.getOrDefault(i,0)+1);
        }
        for(int i: nums){
            if(s.containsKey(Math.abs(k+i))){
                if(s.get(Math.abs(k+i))>0) {
                    s.put(i, s.get(Math.abs(k - i)) - 1);
                    res++;
                }
            }
        }

        return res;

    }

    public static int findPairs(int[] nums, int k) {
        HashSet<Integer> numbers = new HashSet<>();
        HashSet<Integer> found = new HashSet<>();

        for(int i: nums){
            if(numbers.contains(i+k)){
                found.add(i);
            }
            if(numbers.contains(i-k)){
                found.add(i-k);
            }
            numbers.add(i);
        }
        return found.size();

    }

    public static void main(String[] args) {
        System.out.println(findPairs(new int[]{3,1,4,1,5}, 2));

        String orgName="abc organisation";
        String res =titleCase(orgName);
//        for(String i: orgName.split(" ")){
//            char capLetter = i.charAt(0);
//            res+= i.replace(capLetter,Character.toUpperCase(capLetter));
//        }
        System.out.println(res);
        System.out.println(2&1);

    }

    public static String titleCase(String orgName){
        if(orgName==null || orgName.isEmpty()){
            return orgName;
        }
        StringBuilder org = new StringBuilder();
        boolean convertNext = true;
        for(char ch: orgName.toCharArray()){
            if(Character.isSpaceChar(ch)){
                convertNext= true;
            }
            else if(convertNext){
                ch = Character.toTitleCase(ch);
                convertNext = false;
            }
            else{
                ch = Character.toLowerCase(ch);
            }
            org.append(ch);
        }
        return org.toString();
    }
}
