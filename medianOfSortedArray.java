public class medianOfSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int[] nums = new int[l];
        int nums1Pointer=0;
        int nums2Pointer=0;
        int pointer=0;
        while(((nums1Pointer<nums1.length) && (nums2Pointer<nums2.length)) && (pointer<((l/2)+1))){
            if(nums1[nums1Pointer]<nums2[nums2Pointer]){
                nums[pointer] = nums1[nums1Pointer];
                nums1Pointer++;
            }
            else{
                nums[pointer] = nums2[nums2Pointer];
                nums2Pointer++;
            }
            pointer++;
        }

        if (pointer<((l/2)+1)) {

            for (int i = nums2Pointer; i < nums2.length; i++) {
                nums[pointer] = nums2[i];
                pointer++;
                if(pointer>=((l/2)+1)){
                    break;
                }

            }

            for (int i = nums1Pointer; i < nums1.length; i++) {
                nums[pointer] = nums1[i];
                pointer++;
                if(pointer>=((l/2)+1)){
                    break;
                }
            }
        }
        for (int i : nums) {
        System.out.print(i);
        }
        System.out.println();


        if(l%2 ==0){
            l=l/2;
            System.out.println(l);
            System.out.println(nums[l]);
            System.out.println(nums[l-1]);
            return ((double)(nums[l]+nums[l-1]))/2;
        }
        l=l/2;

        return nums[l];

    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }
}
