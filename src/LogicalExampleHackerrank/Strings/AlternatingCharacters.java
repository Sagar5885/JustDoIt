package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class AlternatingCharacters {
    static int alternatingCharacters(String s){
        int res=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}
