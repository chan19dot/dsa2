import java.util.*;

public class nextBiggestDigit {

    /*
    *
    *
     public void swap(int[] nums, int left, int right){
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;

    }

    public void reverse(int[] nums, int idx){
        int left = idx;
        int right = nums.length-1;
        while(left < right){
            swap(nums, left, right);
            left++;
            right--;
        }
    }


    public void nextPermutation(int[] nums) {
        int idx = nums.length-2;
        while(idx>=0){
            if(nums[idx]<nums[idx+1]){
                break;
            }
            idx--;
        }

       if(idx>=0){
           for(int i =nums.length-1;i>idx;i--){
               if(nums[i]>nums[idx]){
                   swap(nums,idx,i);
                   break;
               }
           }
       }
        reverse(nums,idx+1);
    *
    *
    *
    *
    * */





    public static void swap(List<Integer> nums, int idx, int pdx){
        int bali = nums.get(idx);
        nums.set(idx, nums.get(pdx));
        nums.set(pdx, bali);
    }


    public static void reverse(List<Integer> nums ){
        int i=0;
        int j= nums.size()-1;
        while(i<j){
            int fruit = nums.get(i);
            nums.set(i,nums.get(j));
            nums.set(j,fruit);
            i++;
            j--;
        }
    }

    public  static void reverse(List<Integer> nums, int idx){
        int left = idx;
        int right = nums.size()-1;
        while(left<right){
            swap(nums,left,right);
            left++;
            right--;
        }
    }

    public static void findNextGreatest(List<Integer> nums){
        int idx=nums.size()-2;
        while(idx>=0){
            if(nums.get(idx)<nums.get(idx+1)){
                break;
            }
            idx--;
        }
        if(idx>=0){
            for(int i=nums.size()-1; i>idx;i--){
                if(nums.get(i)>nums.get(idx)){
                    swap(nums,i,idx);
                    break;
                }
            }
        }
        reverse(nums, idx+1);
    }

    public static int nge_func(int n) {
        // Write your code here
        int bali = n;
        List<Integer> nums = new ArrayList();
        while (bali > 0) {
            nums.add(bali%10);
            bali= (int) bali/10;
            System.out.println(bali);
        }
        reverse(nums);
      //  System.out.println(nums);
        findNextGreatest(nums);
      //  System.out.println(nums);
        String res="";
        for(int i:nums){
            res+=i;
        }

        System.out.println(Integer.valueOf(res));
        return Integer.valueOf(res);
    }

    public static void main(String[] args) {
        nge_func(44342);
    }
}
