
import java.util.*;

public class longestSequence {

    public static int longestSequence(int n, List<Integer> arr){
        int maxStreak=0;
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i: arr){
            s.add(i);
        }
        for(int i :s){
            if(!s.contains(i-1)){
                int streak=1;
                int num =i;
                while(s.contains(num+1)) {
                    streak += 1;
                    num += 1;
                }
            maxStreak=Math.max(streak,maxStreak);
            }
        }
    return maxStreak;
    }

    public static void main(String[] args) {
        int n = 6;
        Integer nums[]= {100,4,200,1,3,2};
        List<Integer> arr = Arrays.asList(nums);
        System.out.println(longestSequence(n,arr));
    }
}
