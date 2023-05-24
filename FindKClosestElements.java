
import java.util.*;

public class FindKClosestElements {
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int idx=0;
        List<Integer> res = new ArrayList();
        for(int i: arr){
            if(i==k){
                break;
            }
            idx++;
        }
        int i=idx-1;
        int j=idx+1;
        res.add(arr[idx]);
        while(k-1>0){
            int a = (i<0)?i:arr[i] ;
            int b = (j>arr.length-1)?j:arr[j];
            if(i<0){
                res.add(b);
            }

            else if(j>arr.length-1){
                res.add(a);
            }
            else if((x-a)<(b-x)){
                res.add(a);
                i--;
            }
            else if ((x-a)==(b-x)){
                res.add(a);
                i--;
            }
            else{
                res.add(b);
                j++;
            }
            k--;
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {
       // System.out.println(findClosestElements({},));
    }
}
