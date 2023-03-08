package LogicalExampleHackerrank;

//import com.sun.deploy.util.StringUtils;

import java.util.*;

/**
 * Created by sdodia on 8/11/17.
 */
public class HappyLadybugs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();

            String res = "NO";
            if(b.contains("_")){
                if(check1(b)){
                    res = "YES";
                }
            }

            System.out.println(res);
        }
    }

    public static Set<Character> distChar(String s){
        Set<Character> chlst = new HashSet<Character>();
        char[] ch = s.toCharArray();
        for (char c:ch) {
            if(c != '_') {
                chlst.add(Character.valueOf(c));
            }
        }
        return chlst;
    }

    public static int countch(String s, char c){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                res++;
            }
        }
        return res;
    }

    public static boolean check1(String s){
        Set<Character> chlst = distChar(s);

        for (Character c:chlst) {
            if(countch(s,c)>=2){
            }else {
                return false;
            }
        }
        return true;
    }
}
