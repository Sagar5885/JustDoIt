package LogicalExampleHackerrank.DataStructure;

import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class LeftRotation {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] ar = new int[n];
        int[] res = new int[n];
        if(d>n){
            System.out.print("Invalid input for left rotation!");
        }else {
            for (int ar_i = 0; ar_i < n; ar_i++) {
                ar[ar_i] = in.nextInt();
            }

            int k=0;
            for(int i = d; i<n; i++){
                res[k] = ar[i];
                k++;
            }

            for(int i=0; i<d; i++){
                res[k] = ar[i];
                k++;
            }
        }

        for (int i:res) {
            System.out.print(i+" ");
        }
    }
}
