package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/16/17.
 */
public class KDiffNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.println(check(a,k));
    }

    static int check(int[] a, int k){
        int res = 0;
        for(int i=0; i<a.length; i++){
            int tmp = a[i]+k;
            for(int j=0; j<a.length;j++){
                if(i!=j){
                    if(tmp == a[j]){
                        res++;
                    }
                }
            }
        }
        return res;
    }

}
