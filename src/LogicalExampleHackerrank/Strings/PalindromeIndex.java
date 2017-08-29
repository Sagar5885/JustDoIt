package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/23/17.
 */
public class PalindromeIndex {
    private static boolean isPalindrome(final char[] C, final int A, final int B){
        for(int i = A, j = B-1; i < j; ++i, --j){
            if (C[i] != C[j]){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            final char[] C = s.toCharArray();
            final int N = C.length;
            int c = -1;
            for(int i = 0, j = N-1; i < j; ++i, --j){
                if (C[i] != C[j]){
                    c = isPalindrome(C, i+1, j+1) ? i : j;
                    break;
                }
            }
            System.out.println(c);
        }
    }
}
