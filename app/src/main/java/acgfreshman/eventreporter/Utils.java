package acgfreshman.eventreporter;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import org.apache.commons.codec.binary.Hex;

public class Utils {
    public static String username= null;
    public static String md5Encryption(final String input){
        String result = "";
        try{
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.reset();
            messageDigest.update(input.getBytes(Charset.forName("UTF8")));
            byte[] resultByte = messageDigest.digest();
            result = new String(Hex.encodeHex(resultByte));
        }catch(Exception ex){
            ex.printStackTrace();
        }
        return result;
    }
}
