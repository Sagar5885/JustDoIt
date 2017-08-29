package LogicalExampleHackerrank.Strings;

import java.util.*;

/**
 * Created by sdodia on 8/23/17.
 */
public class Anagram {

    static int anagram(String s){
        int res = 0;
        if(s.length()%2 == 0) {
            char[] ch1 = s.substring(0,s.length()/2).toCharArray();
            char[] ch2 = s.substring(s.length()/2, s.length()).toCharArray();
            Set<Character> setch1 = new HashSet<Character>();
            for (char c:ch1) {
                setch1.add(c);
            }

            List<Character> list = new ArrayList<Character>(setch1);
            for (int i=0; i<list.size(); i++) {
                int tmp1 = 0;
                int tmp2 = 0;
                for (int j = 0; j < s.length() / 2; j++) {
                    if (list.get(i) == ch1[j]) {
                        tmp1++;
                    }
                    if (list.get(i) == ch2[j]) {
                        tmp2++;
                    }
                }
                if(tmp1>tmp2) {
                    res += (tmp1 - tmp2);
                }
            }
        }else {
            res = -1;
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}
