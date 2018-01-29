package LogicalExampleHackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sdodia on 1/25/18.
 */
public class TwoCharacters2 {
    static int twoCharaters(String s) {
        int count = 0;
        int total = distintChars(s).size();
        if(total <= 2){
            count = s.length();
        }else {
                StringBuffer sb = new StringBuffer();
                sb.append(RemoveTwoChar(s, s.charAt(0), s.charAt(1)));
                StringBuffer tmpsb = new StringBuffer();
                for (int i = 1; i <total - 1; i++) {
                    tmpsb.append(RemoveTwoChar(s, s.charAt(0), s.charAt(1)));
                    if(sb.length() > tmpsb.length()){
                        sb.delete(0, sb.length());
                        sb.append(tmpsb);
                    }
                }
            count = sb.length();
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt();
        String s = in.next();
        int result = twoCharaters(s);
        System.out.println(result);
        in.close();
    }

    public static Set<Character> distintChars(String str){
        Set<Character> set = new TreeSet<>();
        for (char c:str.toCharArray()) {
            if(!set.contains(c)) {
                set.add(c);
            }
        }
        return set;
    }

    public static String RemoveTwoChar(String str, char c1, char c2){
        String res = "";
        for (char c:str.toCharArray()) {
            if(c != c1 && c != c2){
                res += c;
            }
        }
        return res;
    }
}
