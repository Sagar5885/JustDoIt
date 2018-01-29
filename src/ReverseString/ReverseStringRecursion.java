package ReverseString;

import java.util.Scanner;

/**
 * Created by sdodia on 1/24/18.
 */
public class ReverseStringRecursion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverse(str);
        System.out.println("Reverse String of "+str+" is: "+res);
    }

    private static String reverse(String str) {
        if((str == null)||(str.length() <= 1)){
            return str;
        }else {
            return reverse(str.substring(1))+str.charAt(0);
        }
    }
}
