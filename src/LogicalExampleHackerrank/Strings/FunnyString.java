package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class FunnyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }

    static String funnyString(String s){
        String res = "Funny";

        int i=0;
        while(i<s.length()-1){
            int tmp1 = Math.abs(s.charAt(i) - s.charAt(i+1));
            int tmp2 = Math.abs(s.charAt(s.length()-1-i) - s.charAt(s.length()-1-(i+1)));
            if(tmp1 != tmp2){
                res = "Not Funny";
                break;
            }
            i++;
        }
        return res;
    }
}
