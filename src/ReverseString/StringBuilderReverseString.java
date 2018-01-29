package ReverseString;

import java.util.Scanner;

/**
 * Created by sdodia on 1/24/18.
 */
public class StringBuilderReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverse(str);
        System.out.println("Reverse String of "+str+" is: "+res);
    }

    private static String reverse(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }

}
