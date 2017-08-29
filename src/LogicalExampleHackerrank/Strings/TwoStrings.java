package LogicalExampleHackerrank.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 8/23/17.
 */
public class TwoStrings {
    static String twoStrings(String A, String B) {
        Set<Integer> lettersA = buildLetters(A);
        Set<Integer> lettersB = buildLetters(B);

        for (int letterA : lettersA) {
            if (lettersB.contains(letterA)) {
                return "YES";
            }
        }
        return "NO";
    }

    static Set<Integer> buildLetters(String str) {
        return str.chars().collect(HashSet<Integer>::new, Set::add, Set::addAll);
    }

//    static String twoStrings(String s1, String s2){
//    String res = "NO";
//    int i=0;
//    while(true){
//        if(s2.contains(s1.charAt(i)+"")){
//            res = "YES";
//            break;
//        }
//        i++;
//        if(i == s1.length()){
//            break;
//        }
//    }
//    return res;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result = twoStrings(s1, s2);
            System.out.println(result);
        }
    }
}
