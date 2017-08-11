package LogicalExampleHackerrank;

import java.util.*;

/**
 * Created by sdodia on 8/10/17.
 */
public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            Set<Integer> list = solve(n, a, b);
            for (Integer l1:list) {
                System.out.print(l1+" ");
            }
            System.out.println();
        }
    }

    public static Set<Integer> solve(int n, int a, int b){
        Set<Integer> list = new TreeSet<Integer>();
        int j=n-1;
        for(int i=0; i<=n-1; i++){
            int tmp = 0;
            for(int ai=0; ai<i; ai++){
                tmp += a;
            }
            for(int bi=0; bi<j; bi++){
                tmp += b;
            }
            j--;
            list.add(Integer.valueOf(tmp));
        }
        return list;
    }

}
