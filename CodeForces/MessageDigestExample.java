package CodeForces;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

public class MessageDigestExample {

    public static void main(String[] args) {
//        String message ="happy";
//
//        MessageDigest md = MessageDigest.getInstance("SHA-256");
//
//        byte[] hash = md.digest(message.getBytes());
//
//        byte[] truncatedHash = new byte[8];
//
//        System.arraycopy(hash,0,truncatedHash,0,8);
//        System.out.println(Arrays.toString(truncatedHash));
//
//        System.out.println(Base64.getUrlEncoder().encodeToString(truncatedHash));

        String FB="FB";
        String Ea="Ea";

        System.out.println(FB.hashCode());
        System.out.println(Ea.hashCode());
        Map<String,String> map = new HashMap<>();
        map.put(FB, "FB");
        map.put(Ea, "Ea");

        System.out.println(map.get(FB));




    }
}
