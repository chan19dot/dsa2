/*
* Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.


* Note that it is the kth smallest element in the sorted order, not the kth distinct element.


* You must find a solution with a memory complexity better than O(n2).

* Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8

* Output: 13

* Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and the 8th smallest number is 13
*
* */


import java.util.ArrayList;
import java.util.List;

public class KthSmallestInMatrix {


    public static int solution(int[][]matrix, int k){
        List<Integer> res = new ArrayList<>();
        int i=0,j=1;
        while(k>0){
            if (matrix[i][matrix[i].length - 1] < matrix[i + 1][0]) {
                for(int x: matrix[i]){
                    res.add(x);
                }
                k -= matrix.length;
                i++;
            }
            else{
                j=1;

                while(matrix[i][matrix[i].length - j] > matrix[i + 1][0]){
//                    res.add(matrix[i][matrix[i].length - j]);
                    j++;
                }
                k-=j;
                for(int idx=0;idx<matrix[i].length-j;idx++){
                    res.add(matrix[i][idx]);
                }
                for(int idx=0;idx<j;idx++){
                    res.add(matrix[i+1][idx]);
                }
                for(int idx=matrix[i].length-j; idx<matrix[i].length;idx++){
                    res.add(matrix[i][idx]);
                }
                for(int idx=j;idx<matrix[i+1].length;idx++){
                    res.add(matrix[i+1][idx]);
                }
            }
        }
        for(int y: res){
            System.out.println(y);
        }
        return res.get(res.size()-1);
    }

    public static int findKthSmallestInMatrix(int[][] matrix, int k){
        int i=0,j=1;
        while(k>0) {
                if(i>=matrix.length-1){
                    break;
                }
                if (matrix[i][matrix[i].length - 1] < matrix[i + 1][0]) {
                    k -= matrix.length;
                }
                else{
                    j=1;
                    while(matrix[i][matrix[i].length - j] > matrix[i + 1][0]){
                        j++;
                    }
                    k-=j;
                }
                i++;

            }


        return matrix[i][k];
    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n= matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];

        while(low < high){
            int mid = low + (high - low)/2;
            int count = lessEqual(matrix,mid);
            if(count < k){
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return low;

    }
    public static int lessEqual(int[][] matrix, int target){
        int count = 0 , len = matrix.length, i = len-1, j=0;

        while(i >=0 && j<len){
            if(matrix[i][j] > target){
                i--;
            }
            else
            {
                count = count + i +1;
                j++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2},{1,3}};
//        System.out.println(findKthSmallestInMatrix(matrix,2));

        System.out.println(solution(matrix, 2));
//        System.out.println(matrix.length);
    }
}
