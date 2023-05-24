package blind50;

public class validAnagram {

    public static boolean isValidAnagram(String s, String t){
        int[] arr = new int[26];
        int sum=0;
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']+=1;
            arr[t.charAt(i)-'a']-=1;
        }

        for(int i=0;i<26;i++){
            if(arr[i]!=0){
                return false;
            }
        }


        return true;
    }

    public static void main(String[] args) {

        isValidAnagram("ab","ba");

    }
}
