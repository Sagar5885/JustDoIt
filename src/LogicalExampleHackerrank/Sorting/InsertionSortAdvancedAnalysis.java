package LogicalExampleHackerrank.Sorting;

import java.util.Scanner;

/**
 * Created by sdodia on 9/21/17.
 */
public class InsertionSortAdvancedAnalysis {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++){
                ar[j] = sc.nextInt();
            }

            int count = 0;
            while(true){
                int tmp = doit(ar);
                if(tmp != 0) {
                    count += tmp;
                }else {
                    break;
                }
            }

            System.out.println(count);
        }
    }

    public static int doit(int[] ar){
        int res = 0;

        for(int i=0; i<ar.length-1; i++){
            if(ar[i] > ar[i+1]){
                res++;
                int tmp = ar[i];
                ar[i] = ar[i+1];
                ar[i+1] = tmp;
            }
        }

        return res;
    }

}
