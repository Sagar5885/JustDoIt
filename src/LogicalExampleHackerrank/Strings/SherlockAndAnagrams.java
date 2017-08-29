package LogicalExampleHackerrank.Strings;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 8/26/17.
 */
public class SherlockAndAnagrams {
    static int sherlockAndAnagrams(String s){
        int res = 0;
        //if(eligible(s)){
            for(int i=0; i<s.length(); i++){
                for(int j=i+1; j<s.length(); j++){
                    if(s.charAt(i) == s.charAt(j)){
                        if(i != j){
                            res++;
                            if(j != i+1){
                                res++;
                            }
                            if(j-i>1) {
                                int tmp = i+((j-i)/2+1);
                                String sb1 = s.substring(i, tmp);
                                String sb2 = new StringBuilder(s.substring(tmp, j+1)).reverse().toString();
                                if (sb1.equals(sb2)) {
                                    res++;
                                }
                            }
                        }
                    }
                }
            }
        //}
        return res;
    }

    private static int sherlockAndAnagrams1(String str) {
        int count = 0;
        int n = str.length();
        for (int step = 1; step < n; step++) {
            for (int i = 0; i < n; i++) {
                if (i + step > n) {
                    break;
                }
                char[] sub1 = str.substring(i, i + step).toCharArray();
                Arrays.sort(sub1);
                for (int j = i + 1; j < n; j++) {
                    if (j + step > n) {
                        break;
                    }
                    char[] sub2 = str.substring(j, j + step).toCharArray();
                    Arrays.sort(sub2);
                    if (Arrays.equals(sub1, sub2)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = sherlockAndAnagrams1(s);
            System.out.println(result);
        }
    }
}
