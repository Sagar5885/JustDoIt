package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 7/20/17.
 */
public class MigratoryBirds {
    static int migratoryBirds(int n, int[] ar) {
        Set<Integer> mySet = new HashSet<Integer>();
        for (int i:ar) {
            mySet.add(Integer.valueOf(i));
        }
        int res = dupct(ar, Integer.valueOf(ar[0]));
        int value = ar[0];
        for (Integer i:mySet) {
            int tmp = dupct(ar, i);
            if(tmp>res){
                res = tmp;
                value = i;
            }
        }
        return value;
    }

    static int dupct(int[] ar, Integer tmp){
        int ct = 0;
        for (int i:ar) {
            if(tmp == Integer.valueOf(i)){
                ct++;
            }
        }
        return ct;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
