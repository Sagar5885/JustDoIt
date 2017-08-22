package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/20/17.
 */
public class CamelCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();

        int res = 1;
        char[] ch = s.toCharArray();
        for (char c:ch) {
            if(Character.isUpperCase(c)){
                res++;
            }
        }
        System.out.print(res);
    }
}
