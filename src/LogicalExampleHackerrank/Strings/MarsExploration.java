package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class MarsExploration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        int res = 0;
        char[] ch = S.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(((i+1)%3 == 1) || ((i+1)%3 == 0)){
                if(ch[i] != 'S'){
                    res++;
                }
            }
            if(((i+1)%3 == 2) && (ch[i] != 'O')){
                res++;
            }
        }

        System.out.println(res);
    }
}
