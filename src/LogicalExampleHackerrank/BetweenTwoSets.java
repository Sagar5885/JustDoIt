package LogicalExampleHackerrank;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by sdodia on 7/19/17.
 */
public class BetweenTwoSets {
    static int getTotalX(int[] a, int[] b){
        // derive x values 1st
        Set<Integer> xs = new TreeSet<Integer>();
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a.length; j++){
                xs.add(a[i]*a[j]);
            }
        }

        int res = 0;
        for(int x: b){
            if(check(xs, x)){
                res++;
            }
        }

        return res;
    }

    static boolean check(Set<Integer> a, int b){
        for(Integer x : a){
            if(b%x!=0){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
