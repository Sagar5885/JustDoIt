package LogicalExampleHackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 8/3/17.
 */
public class NonDivisibleSubset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        Set<Integer> res = pairAddn(ar, k);
        System.out.println(res.size());
    }

    public static Set<Integer> pairAddn(int[] ar, int k){
        Set<Integer> res = new HashSet<Integer>();

        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                if(i != j){
                    if((ar[i]+ar[j])%k != 0){
                        res.add(Integer.valueOf(ar[i]));
                        res.add(Integer.valueOf(ar[j]));
                    }
                }
            }
        }

        return res;
    }
}
