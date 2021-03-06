package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/21/17.
 */
public class BonAppetit {
    static String bonAppetit(int n, int k, int b, int[] ar) {
        int actual = 0;
        int total = 0;

        for (int i=0; i<ar.length; i++) {
            if(i!=k){
                actual += ar[i];
            }
            total += ar[i];
        }

        if(actual/2 == b){
            return "Bon Appetit";
        }else {
            return String.valueOf((total-actual)/2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int b = in.nextInt();
        String result = bonAppetit(n, k, b, ar);
        System.out.println(result);
    }
}
