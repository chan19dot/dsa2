public class replaceInPlace {
    public static int removeDuplicates(int[] nums) {
        int temp =nums[0];
        int count=1;
        int idx=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=temp){
                temp=nums[i];
                nums[count++]=temp;
            }
        }
        for (int i :
             nums) {
            System.out.print(i+ " ");

        }
        System.out.println();
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[] {94,95,96,96,97});
    }
}
