package LogicalExampleHackerrank.DataStructure;

import java.util.Scanner;

/**
 * Created by sdodia on 6/23/17.
 */
public class AlgorithmicCrush2 {

    static class Operation {
        public int a;
        public int b;
        public int k;

        public Operation(int a, int b, int k) {
            this.a = a;
            this.b = b;
            this.k = k;
        }

        public String toString() {
            return "[" + a + ", " + b + ", " + k + "]";
        }
    }

    public static long crush(int n, int m, Operation[] ops) {
        long[] crushState = new long[n+1];
        for(int i=0; i < crushState.length; i++) {
            crushState[i] = 0;
        }

        for(int i=0; i < m; i++) {
            crushState[ops[i].a-1] += ops[i].k;
            crushState[ops[i].b] -= ops[i].k;
        }

        long max = crushState[0];
        long sum = max;
        for(int i=1; i < n; i++) {
            sum += crushState[i];
            if(sum > max) {
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Operation[] ops = new Operation[m];

        for(int i=0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();
            ops[i] = new Operation(a, b, k);
        }

        long max = crush(n, m, ops);
        System.out.println(max);
    }
}
