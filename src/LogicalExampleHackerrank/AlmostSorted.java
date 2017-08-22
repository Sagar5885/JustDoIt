package LogicalExampleHackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/18/17.
 */
public class AlmostSorted {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; ++i){
            arr[i] = sc.nextInt();
        }

        //Print output
        System.out.print(solve(arr, n));
    }

    private static String solve(final int[] A, final int N){
        int l = 0;
        int r = N - 1;

        //Check for out of place index from the left
        while(l < r && A[l] <= A[l+1]){
            ++l;
        }

        //Check if array already sorted
        if(l == r){
            return "yes";
        }

        //Check for out of place index from the right
        while(r > l && A[r] >= A[r-1]){
            --r;
        }

        //Check if swapping or reversing would NOT sort the array
        if((l > 0 && A[r] < A[l-1]) || (r < N-1 && A[l] > A[r+1])){
            return "no";
        }

        //Check if we're dealing with a reversal
        int m;
        for(m = l+1; m < r && A[m] >= A[m+1]; ++m){}
        if(m == r){
            return "yes\n" + ((r-l < 2) ? "swap " : "reverse ") + (l+1) + " " + (r+1);
        }

        //Check if we're NOT dealing with a swap
        if(m-l > 1 || A[l] < A[r-1] || A[r] > A[l+1]){
            return "no";
        }

        //Check if we're dealing with a swap
        for(int k = r-1; m < k && A[m] <= A[m+1]; ++m){}
        return (r-m > 1) ? "no" : "yes\nswap " + (l+1) + " " + (r+1);
    }
}
