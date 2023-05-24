import java.util.ArrayList;
import java.util.List;

public class productSum2 {

    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static void main(String[] args) {
        String s = "[5,2,[7,-1],3,[6,[-13,8],4]]";
        List<Integer> numbers = new ArrayList<>();
        int prod=0;
        int res=0;
        for(int i=0;i<s.length();i++){
            String num ="";
            if(s.charAt(i)=='['){
                prod++;
            }
            else if(s.charAt(i)==']'){
                prod--;
            }
            else {
                while (s.charAt(i) != ',') {
                    num += s.charAt(i);
                    if(s.charAt(i+1)==']'){
                        break;
                    }
                    i++;
                }
                if(num.length()>0){
                    res+= Integer.valueOf(num)*factorial(prod);
                }

            }
        }
        System.out.println(res);
    }
}
