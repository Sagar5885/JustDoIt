package ReverseString;

import java.util.Scanner;

/**
 * Created by sdodia on 1/24/18.
 */
public class StringToCharacterArrayReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverse(str);
        System.out.println("Reverse String of "+str+" is: "+res);
    }

    public static String reverse(String str){
        String res = "";
        for(int i=str.length()-1; i>=0; i--){
            res += str.charAt(i);
        }
        return res;
    }
}
