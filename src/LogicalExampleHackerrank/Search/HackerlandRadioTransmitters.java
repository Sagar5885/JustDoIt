package LogicalExampleHackerrank.Search;

import java.util.*;

/**
 * Created by sdodia on 9/20/17.
 */
public class HackerlandRadioTransmitters {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        for(int i=0; i<n; i++){
            set.add(sc.nextInt());
        }
        List<Integer> list = new ArrayList(set);

        System.out.print(solve(n, k, list));
    }

    public static int solve(int n, int k, List<Integer> list){
        int total = list.get(list.size()-1) - list.get(0)+1;
        int k1 = k*2 + 1;
        int m = total/k1;

        if(m*k1 < total){
            return m+1;
        }else {
            return m;
        }
    }
}
