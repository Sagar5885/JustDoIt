package LogicalExampleHackerrank;

import java.security.MessageDigest;
import java.util.Scanner;

/**
 * Created by sdodia on 7/17/17.
 */
public class JavaMD5 {
    public static void main(String[]args){
        Scanner cin=new Scanner(System.in);
        String s=cin.nextLine();
        try{
            MessageDigest md=MessageDigest.getInstance("MD5");
            md.update(s.getBytes());
            byte[] digest=md.digest();
            for(byte b:digest)System.out.printf("%02x",b);
        }catch(Exception e){}
    }
}
