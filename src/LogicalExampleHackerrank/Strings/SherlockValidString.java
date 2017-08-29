package LogicalExampleHackerrank.Strings;

import java.util.*;

/**
 * Created by sdodia on 8/24/17.
 */
public class SherlockValidString {
    static String isValid(String s){
        Set<Character> setch = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            setch.add(s.charAt(i));
        }

        if(setch.size()>1) {
            Set<Integer> seti = new HashSet<Integer>();
            List<Integer> listi = new ArrayList<Integer>();
            for (Character c : setch) {
                seti.add(count(s, c));
                listi.add(count(s, c));
            }

            if(seti.size() == 1){
                return "YES";
            }
            if (!(seti.size() > 2)) {
                return "NO";
            } else {
                List<Integer> setlist = new ArrayList<>(seti);
                int tmp = Math.abs(setlist.get(0) - setlist.get(1));
                if(tmp <=1){
                    return "YES";
                }else {
                    return "NO";
                }
            }
        }else {
            int tmp = count(s, s.charAt(0));
            if(tmp <= 2){
                return "YES";
            }else {
                return "NO";
            }
        }
    }

    static int count(String s, char c){
        int res = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
