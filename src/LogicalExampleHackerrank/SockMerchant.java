package LogicalExampleHackerrank;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 7/22/17.
 */
public class SockMerchant {
    static int sockMerchant(int n, int[] ar) {
        int res=0;
        Set<Integer> mySet = new HashSet<Integer>();
        for (int i:ar) {
            mySet.add(Integer.valueOf(i));
        }
        for (Integer i:mySet) {
            if(count(i,ar)>1){
                res = res + count(i,ar)/2;
            }
        }
        return res;
    }

    static int count(int n, int[] ar){
        int res=0;
        for (int a:ar) {
            if(a == n){
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = sockMerchant(n, ar);
        System.out.println(result);
    }
}
