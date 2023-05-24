package blind50;

import java.util.HashMap;
import java.util.HashSet;

public class containsDuplicate {

    public static boolean containsDuplicate(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i: arr){
            if(set.contains(i)){
                return true;
            }
            else{
                set.add(i);
            }
        }
        HashMap<Character,Integer>map = new HashMap<>();

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,4,1}));
    }
}
