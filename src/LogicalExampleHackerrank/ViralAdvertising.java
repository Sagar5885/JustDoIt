package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/26/17.
 */
public class ViralAdvertising {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int v = 5;
        int total = 0;
        for(int i=0; i<n; i++){
            int tmp = v/2;
            total += tmp;
            int tmp1 = tmp * 3;
            v = tmp1;
        }

        System.out.println(total);
    }
}
