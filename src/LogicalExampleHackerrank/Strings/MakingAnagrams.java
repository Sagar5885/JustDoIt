package LogicalExampleHackerrank.Strings;

import java.util.*;

/**
 * Created by sdodia on 8/23/17.
 */
public class MakingAnagrams {
    static int makingAnagrams(String s1, String s2){
        int res = 0;
        String s = s1+s2;

        //List of unique character in both strings
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++){
            set.add(s.charAt(i));
        }
        List<Character> list = new ArrayList<Character>(set);

        for(int i=0; i<list.size(); i++){
            int tmp1 = howmany(list.get(i), s1);
            int tmp2 = howmany(list.get(i), s2);

            res += Math.abs(tmp1 - tmp2);
        }

        return res;
    }

    static int howmany(char c, String s){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(c == s.charAt(i)){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = makingAnagrams(s1, s2);
        System.out.println(result);
    }
}
