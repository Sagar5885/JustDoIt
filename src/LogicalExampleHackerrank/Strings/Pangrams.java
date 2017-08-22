package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class Pangrams {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();

        String res = "pangram";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int i=0;
       while(i<alphabet.length-1){
            if(!s.toLowerCase().contains(alphabet[i]+"")){
                res = "not pangram";
                break;
            }
           i++;
        }

        System.out.print(res);
    }
}
