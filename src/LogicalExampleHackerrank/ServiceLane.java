package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/9/17.
 */
public class ServiceLane {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arn = new int[n];
        for(int i=0; i<n; i++){
            arn[i] = sc.nextInt();
        }
        for(int i=0; i<t; i++){
            int I = sc.nextInt();
            int J = sc.nextInt();

            System.out.println(solve(I, J, arn));
        }
    }

    private static int solve(int i, int j, int[] ar) {
        int min = ar[i];
        for(int k = i+1; k<=j; k++){
            if(min > ar[k]){
                min = ar[k];
            }
        }
        return min;
    }
}
