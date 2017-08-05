package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int n, int[] ar) {
        int max = 0;
        for(int i: ar){
            if(max<ar[i]){
                max = ar[i];
            }
        }

        int howmany = 0;
        for(int i: ar){
            if(ar[i]==max){
                howmany++;
            }
        }

        return howmany;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
