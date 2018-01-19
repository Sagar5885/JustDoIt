package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class HackerRankInAString2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(check(s));
        }
    }

    private static String checkIfIsHacker(String s) {

        String str = "hackerrank";
        if (s.length() < str.length()) {
            return "NO";
        }
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (j < str.length() && s.charAt(i) == str.charAt(j)) {
                j++;
            }
        }
        return (j == str.length() ? "YES" : "NO");

    }

    public static String check(String s){
        String ms = "hackerrank";
        if(s.length() < ms.length()){
            return "NO";
        }else {
            int j = 0;
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == ms.charAt(j) && j < ms.length()) {
                    sb.append(s.charAt(i));
                    j++;
                }
            }
            if(sb.toString().equalsIgnoreCase(ms)){
                return "YES";
            }else {
                return "NO";
            }
        }
    }
}
