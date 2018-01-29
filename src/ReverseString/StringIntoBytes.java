package ReverseString;

import java.util.Scanner;

/**
 * Created by sdodia on 1/24/18.
 */
public class StringIntoBytes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverse(str);
        System.out.println("Reverse String of "+str+" is: "+res);
    }

    private static String reverse(String str) {
        byte[] strbyte = str.getBytes();
        byte[] res = new byte[str.length()];
        for (int i=0; i<str.length(); i++) {
            res[i] = strbyte[str.length()-i-1];
        }
        return new String(res);
    }

}
