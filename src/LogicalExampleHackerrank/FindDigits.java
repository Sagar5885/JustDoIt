package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/26/17.
 */
public class FindDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();
            //System.out.println(divBy(tmp));
            System.out.println((tmp+"").chars().filter(digit -> digit != '0' && tmp % (digit - '0') == 0).count());
        }
    }

    public static int divBy(int n){
        int res = 0;
        while (true) {
            int tmp = n % 10;
            if(tmp != 0) {
                if (n % tmp == 0) {
                    res++;
                }
            }
            n = n / 10;
            if(n<1){
                break;
            }
        }

        return res;
    }
}
