package String;

import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * Created by sdodia on 7/5/17.
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
//        StringTokenizer defaultTokenizer = new StringTokenizer(s);
//        while (defaultTokenizer.hasMoreTokens())
//        {
//            System.out.println(defaultTokenizer.nextToken());
//        }

        s = s.replaceAll(",", "");
        s = s.replaceAll("!", "");
        String[] tokens = s.split("[_.@'? ]");
        System.out.println(tokens.length);
        for (String a:tokens) {
            System.out.println(a);
        }
        scan.close();
    }
}
