package LogicalExampleHackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sdodia on 6/20/17.
 */
public class PlusMinus {

    static public double[] plms(int n, int[] ar){
        double[] res = new double[3];
        int pos = 0;
        int neg = 0;
        int zrs = 0;

        for (int a:ar) {
            if(a>0){
                pos++;
            }else if(a<0){
                neg++;
            }else {
                zrs++;
            }
        }

        res[0] = ((double) pos/n);
        res[1] = ((double) neg/n);
        res[2] = ((double) zrs/n);

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        double[] result = plms(n, ar);
        for (double a:result) {
            System.out.println(a);
        }
    }
}
