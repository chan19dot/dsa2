public class concatenationOfBinaryString {

    public static int concatenatedBinary(int n) {
        final long m = (long) (1e9+7);
        long result =0;
        int binaryDigits=0;
        for(int i=1;i<=n;i++){
            if((i&(i-1))==0){ //if i is power of 2 allocate the changes of bits to shift
                binaryDigits++;
            }
            result = ((result<<binaryDigits)+i)%m;
        }
        return (int) result;
    }
    public static void main(String[] args) {
        System.out.println(concatenatedBinary(17));
        }

    }

