package LogicalExampleHackerrank.DataStructure;

import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class ArraysDS {

    static public int[] reversearr(int n, int[] ar){
        int[] res = new int[ar.length];
        for(int i=0; i<ar.length; i++){
            res[ar.length-1-i] = ar[i];
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int[] result = reversearr(n, ar);
        for (int i:result) {
            System.out.print(i+" ");
        }

    }
}
