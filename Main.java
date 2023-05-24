public class Main {
    public static int isPalindrome(String s) {
        s= s.toLowerCase();
        // Write your code here
        int left=0;
        int right =s.length()-1;
        while(left<=right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                System.out.println(s.charAt(left));
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                System.out.println(s.charAt(right));
                right--;
            }

            else if(s.charAt(left)==s.charAt(right)) {
                left++;
                right--;
            }
            else{
                return 0;
            }
        }
        return 1;

    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        int result = isPalindrome(s);
        System.out.println(result);
        System.out.println(Character.isLetterOrDigit(':'));
    }
}
