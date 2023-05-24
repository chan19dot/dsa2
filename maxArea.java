import java.util.*;

public class maxArea {

    public static int maxArea(int n, List<Integer> height) {
        // Write your code here
        int leftPointer =0;
        int rightPointer = n-1;
        int waterStored =0;
        while(rightPointer>leftPointer){
            waterStored = Math.max(Math.min(height.get(rightPointer),height.get(leftPointer))*(rightPointer-leftPointer),waterStored);
            if(height.get(leftPointer)>= height.get(rightPointer)){
                rightPointer--;
            }
            else{
                leftPointer++;
            }
        }
        return waterStored;

    }

    public static void main(String[] args) {
        Integer[] arr = {1,2,3,1,1,1,3,1,1,1,2};
        int len = arr.length;
        List<Integer> height = Arrays.asList(arr);
        System.out.println(maxArea(len,height));
    }

}

