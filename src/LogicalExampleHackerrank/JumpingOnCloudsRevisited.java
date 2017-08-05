package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/26/17.
 */
public class JumpingOnCloudsRevisited {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int res = 100;
        for(int i=0; i<c.length;){
            if(c[i] == 1){
                res = res - 3;
            }else {
                res = res - 1;
            }
            for(int j=0; j<k; j++){
                i++;
            }

        }
        System.out.println(res);
    }
}
