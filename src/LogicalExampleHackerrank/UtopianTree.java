package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/25/17.
 */
public class UtopianTree {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for (int i=0; i<n; i++) {
            int tmp = in.nextInt();
            if(tmp == 0){
                System.out.println(1);
            }else {
                int res = 1;
                for(int j=1; j<=tmp; j++){
                    res = growth(res);
                }
                System.out.println(res);
            }
        }

    }

    public static int growth(int ar){
            if(ar%2==0){
                return ar+1;
            }else {
                return ar+ar;
            }
    }
}
