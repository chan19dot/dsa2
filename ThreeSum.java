import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        int a;
        for(int i=0;i<nums.length;i++){
            a=nums[i];
            int leftPointer= i+1;
            int rightPointer = nums.length-1;
            while(leftPointer<rightPointer){
                if(nums[leftPointer]+nums[rightPointer]+a == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(a);
                    l.add(nums[leftPointer]);
                    l.add(nums[rightPointer]);
                    res.add(l);
                    break;
                }
                else if(nums[leftPointer]+nums[rightPointer]+a <0){
                    leftPointer++;
                }
                else{
                    rightPointer--;
                }
            }



        }
        return res;


    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1,0,1,2,-1,-4};
        Arrays.sort(arr);
        for(int i: arr){
            System.out.print(i+ " ");
        }
        threeSum(arr);
    }
}
