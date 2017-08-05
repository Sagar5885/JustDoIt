package LogicalExampleHackerrank.ArraysExs;

import java.util.Scanner;

/**
 * Created by sdodia on 7/11/17.
 */
public class JavaSubarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = in.nextInt();
        }

        int resct = 0;

        for(int i=0; i<ar.length; i++){
            int tmp = ar[i];
            if(tmp < 0){
                resct++;
            }
            for(int j=i+1; j<ar.length; j++){
                tmp += ar[j];
                if(tmp < 0){
                    resct++;
                }
            }
        }

        System.out.println(resct);
    }
}
