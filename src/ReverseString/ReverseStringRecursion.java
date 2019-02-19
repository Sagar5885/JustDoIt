package ReverseString;

import java.util.Scanner;

/**
 * Created by sdodia on 1/24/18.
 */
public class ReverseStringRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverseRec(str);
        System.out.println("Reverse String of "+str+" is: "+res);
    }

    private static String reverse(String str) {
        if((str == null)||(str.length() <= 1)){
            return str;
        }else {
            String tmp = str.substring(1);
            return reverse(tmp)+str.charAt(0);
        }
    }

    public static String reverseRec(String s) {

        if(s == null) return null;
        if(s.length() < 2) return s;
        int n = s.length()/2;
        String tmp1 = s.substring(n);
        String tmp2 = s.substring(0,n);
        return reverseRec(tmp1)+ reverseRec(tmp2);

    }
}
