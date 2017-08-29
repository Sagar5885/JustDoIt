package LogicalExampleHackerrank.Strings;

import java.util.*;

/**
 * Created by sdodia on 8/23/17.
 */
public class GameofThronesI {
    static String gameOfThrones(String s){
        String res = "YES";

        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        List<Character> list = new ArrayList<Character>(set);

        int oddchs = 0;
        for(int i=0; i<list.size(); i++){
            if(howmany(list.get(i), s)%2 != 0){
                oddchs++;
            }
            if(oddchs > 1){
                res = "NO";
                break;
            }
        }

        return res;
    }

    static int howmany(char c, String s){
        int res =0;
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
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
