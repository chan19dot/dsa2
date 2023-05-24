public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
        int zeroPointer = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                //swapWithZeroPointer
                nums[zeroPointer++] = nums[i];

            }

        }
        while(zeroPointer<nums.length){
            nums[zeroPointer++]=0;
        }
    }

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}
