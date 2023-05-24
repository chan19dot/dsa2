import java.util.HashMap;
import java.util.Map;

public class FindAndReplaceInString {

    public static String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        Map<Integer,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<indices.length;i++){
            if(s.startsWith(sources[i], indices[i])){
                map.put(indices[i],i);
            }
        }
        for(int i=0;i<s.length();){
            if(map.containsKey(i)){
                sb.append(targets[map.get(i)]);
                i+= sources[map.get(i)].length(); // this is to replace [a] of [abc] with targets [eee]
            }
            else{
                sb.append(s.charAt(i));
                i++;
            }
        }


        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println(findReplaceString("abcd",new int[]{0, 2},new String[]{"ab","ec"},new String[]{"eee","ffff"}));
    }
}
