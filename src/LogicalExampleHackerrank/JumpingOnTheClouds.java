package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/4/17.
 */
public class JumpingOnTheClouds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }

        int res =0;
        int i=0;
        while(i <= n-1){
            if(i+2 <=n-1 && c[i+2] == 0){
                i = i+2;
                res++;
            }else if(i+1 <= n-1 && c[i+1] == 0){
                i = i+1;
                res++;
            }else{
                //System.out.println("Wrong Input!");
                break;
            }
        }

        System.out.println(res);
    }
}
