package LogicalExampleHackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by sdodia on 7/26/17.
 */
public class ExtraLongFactorials {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger tmp = BigInteger.valueOf(1);

        for(int i=1; i<=n; i++){
            tmp = tmp.multiply(BigInteger.valueOf(i));
        }
        System.out.println(tmp);
    }
}
