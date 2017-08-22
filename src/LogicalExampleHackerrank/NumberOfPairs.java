package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/16/17.
 */
public class NumberOfPairs {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print(check1(a,k));
        //System.out.print(getPairsCount(a,k));
    }

//    static int check1(int[] a, int k){
//        int res=0;
//
//
//        return res;
//    }

    static int check1(int[] a, int k){
        int res=0;
        if(a.length>1) {
            List<String> lstr = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                for (int j = i+1; j < a.length; j++) {
                    if (i != j) {
                        if(!lstr.contains(a[i]+""+a[j]) && !lstr.contains(a[j]+""+a[i])){
                            if (a[i]+a[j] == k) {
                                res++;
                                lstr.add(a[i]+""+a[j]);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    static int check(int[] a, int k){
        int res=0;
        if(a.length>1) {
            List<Integer> ls = new ArrayList<Integer>();
            for (int i = 0; i < a.length; i++) {
                int tmp = k - a[i];
                for (int j = 0; j < a.length; j++) {
                    if (i != j) {
                        if (!ls.contains(i) && !ls.contains(j)) {
                            if (tmp == a[j]) {
                                res++;
                                ls.add(i);
                                ls.add(j);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    static int getPairsCount(int[] a, int n)
    {
        HashMap<Integer, Integer> h1 = new HashMap<Integer, Integer>();

        for (int i=0; i<a.length; i++){

            if(!h1.containsKey(a[i])) {
                h1.put(a[i], 0);
            }
            h1.put(a[i], h1.get(a[i])+1);
        }
        int res = 0;

        for (int i=0; i<a.length; i++)
        {
            res += h1.get(n-a[i]);

            if (n-a[i] == a[i])
                res--;
        }

        return res/2;
    }
}
