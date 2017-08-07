package LogicalExampleHackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 8/4/17.
 */
public class EqualizeTheArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
            set.add(Integer.valueOf(ar[i]));
        }

        int res = howmany(ar, ar[0]);
        for (Integer i:set) {
            if(res < howmany(ar, i)){
                res = howmany(ar, i);
            }
        }

        System.out.println(ar.length-res);
    }

    public static int howmany(int[] ar, int a){
        int res = 0;
        for (int i:ar) {
            if(i == a){
                res++;
            }
        }
        return res;
    }
}
