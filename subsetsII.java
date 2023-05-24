import java.util.*;

public class subsetsII {

    public static List<List<Integer>> subsetsWithDup(int n, List<Integer> matrix) {
        // Write your code here
        List<List<Integer>> result = new ArrayList<List<Integer>>();

        for(int num=(1<<n); num>=0; num--){
            List<Integer> subResult = new ArrayList<Integer>();
            for(int i=0; i<n;i++){
                if((num & 1<<(n-i-1)) !=0){
                    subResult.add(matrix.get(i));
                }
            }
            if(!subResult.isEmpty()){
                result.add(subResult);
            }

        }
        return result;



    }

    public static void main(String[] args) {
        Integer[] arr = {};
        List<Integer> a = Arrays.asList(arr);
        System.out.println(subsetsWithDup(0,a));

    }
}
