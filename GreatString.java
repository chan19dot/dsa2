public class GreatString {

    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder();
        int sbPointer=0;
        for(int i=0;i<s.length();i++){
            if(sbPointer>0 && (Math.abs(sb.charAt(sbPointer-1)- s.charAt(i))==32)){
                sb.deleteCharAt(--sbPointer);
            }
            else{
                sb.append(s.charAt(i));
                sbPointer++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeGood("LeeEetcode"));
    }


}
