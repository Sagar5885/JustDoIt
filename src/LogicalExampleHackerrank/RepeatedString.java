package LogicalExampleHackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sdodia on 8/3/17.
 */
public class RepeatedString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();

        System.out.println(solve(s, n));

//        if(s.length()==1){
//            if(s.charAt(0) == 'a'){
//                System.out.println(n);
//            }else {
//                System.out.println(0);
//            }
//        }else if(n < s.length()){
//            System.out.println(howmanya(s.substring(0, (int) n)));
//        }else {
//            int h1 = howmanya(s);
//            int div = (int) n/s.length();
//            int mod = (int) n%s.length();
//            int mod1 = howmanya(s.substring(0, mod));
//
//            int tmp1 = h1 * div;
//            tmp1 += mod1;
//            System.out.println(tmp1);
//        }
    }

//    public static int howmanya(String str){
//        int res = 0;
//        char[] ch = str.toCharArray();
//        for (char c:ch) {
//            if(c=='a'){
//                res++;
//            }
//        }
//        return res;
//    }

    static long solve(String s, long n) {
        return n / s.length() * count(s, 'a') + count(s.substring(0, (int) (n % s.length())), 'a');
    }

    static int count(String s, char target) {
        return (int) s.chars().filter(c -> c == target).count();
    }
}
