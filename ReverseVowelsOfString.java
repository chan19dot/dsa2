import java.util.*;

public class ReverseVowelsOfString {

    public static String reverseVowels(String s) {
        //swap with two pointers keep aeiou and AEIOU in a list
        Set<Character> vowels = new HashSet<>();
        char[] result = s.toCharArray();

        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('u');
        vowels.add('o');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(vowels.contains(s.charAt(left))){
                if (vowels.contains(s.charAt(right))) {
                    result[right]= s.charAt(left);
                    result[left]= s.charAt(right);
                    left++;
                }
                right--;
                }
            else
                left++;
        }
        for(char i : result)
            System.out.print(i);
        System.out.println();
        return result.toString();

    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }


}

