package LogicalExampleHackerrank.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by sdodia on 8/24/17.
 */
public class SherlockValidStringCorrect {
    public static void main(String[] args) throws IOException {

        final char[] S = (new BufferedReader(new InputStreamReader(System.in))).readLine().toCharArray();

        System.out.print(isValid(S) ? "YES" : "NO");
    }

    private static boolean isValid(final char[] S){

        //If string contains less than two letters
        if(S.length < 2){
            return true;
        }

        //Create histogram of letters
        final int[] L = new int[26];
        for(int i = 0, N = S.length; i < N; ++L[S[i++] - 'a']){}

        //Sort the histogram
        Arrays.sort(L);

        //Ignore unseen letters
        int i;
        for(i = 0; i < 26 && L[i] == 0; ++i){}

        //If all letter frequencies are equal
        if(L[i] == L[25]){
            return true;
        }

        //If there's one letter above the rest by one
        if(L[25] > L[24]){
            return L[i] == L[24] && L[25] - L[24] == 1;
        }

        //If there's one letter below the rest by one or that can be removed
        return L[i] < L[i+1] && L[i+1] == L[25] && L[i] == 1;
    }
}
