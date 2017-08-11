package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/8/17.
 */
public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();

            System.out.println(solve(n, c, m));
        }
    }

    public static int solve(int n, int c, int m){
        int tmp1 = n/c;
        int tmp2 = tmp1-m;
        while (tmp2 >= 0) {
            tmp1++;
            tmp2++;
            tmp2 = tmp2 - m;
        }
        return tmp1;
    }
}
