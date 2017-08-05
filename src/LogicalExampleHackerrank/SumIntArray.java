package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/20/17.
 */
public class SumIntArray {
    static int simpleArraySum(int n, int[] ar) {
        int tmp = 0;
        for(int a : ar){
            tmp += a;
        }
        return tmp;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = simpleArraySum(n, ar);
        System.out.println(result);
    }
}
