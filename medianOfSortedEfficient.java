public class medianOfSortedEfficient {
    public static  double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l = nums1.length + nums2.length;
        int i=0,m=0,n=0;;
        int median = l/2 +1;
        while((i<median)){
            if((m<nums1.length)&&(n<nums2.length)){
                if(nums1[m]<nums2[n]){
                    m++;
                }
                else{
                    n++;
                }
            }
            else{
                if(m<nums1.length){
                    m++;
                }
                else{
                    n++;
                }
            }
            i++;
        }
return 0;
    }

    public static void main(String[] args) {
        System.out.println(findMedianSortedArrays(new int[]{1,2},new int[]{3,4}));
    }

}
