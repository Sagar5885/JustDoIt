package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class BeautifulBinaryString {
    static int minSteps(int n, String B){
        int res = 0;
        if(B.equals("010")){
            res++;
        }
        if(n>3 && B.contains("010")){
            for(int i=0; i<n-2; i++){
                String tmp = B.substring(i, i+3);
                if(tmp.equals("010")){
                    res++;
                    i++;
                    i++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}
