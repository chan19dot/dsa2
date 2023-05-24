public class longestConsequence {

    public static int sequences(int nums[], int len){
        Boolean seqArray[]=new Boolean[len-1];
        int count=1;
        for(int i=1;i<len; i++){
            if(nums[i-1]>nums[i]){
                seqArray[i-1]= true;
            }
            else{
                seqArray[i-1]= false;
            }
        }
        int maxCount=0;
        for(int i =1;i<len-1;i++){
            if(seqArray[i]==true){
                if(seqArray[i-1]==true){
                    count++;
                }
                else{
                    maxCount= Math.max(maxCount,count);
                    count=1;
                }
            }
            else{
                if(seqArray[i-1]==false){
                    count++;
                }
                else{
                    maxCount= Math.max(maxCount,count);
                    count=1;
                }

            }

        }
        for(boolean b : seqArray){
            System.out.print(b);
        }
        maxCount = Math.max(maxCount,count);
        return maxCount;
    }

    public static void main(String[] args) {
        int len =6;
        int nums[]={100,4,200,1,3,2};
        System.out.println(sequences(nums,len));

    }
}
