package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by sdodia on 8/8/17.
 */
public class BeautifulTriplets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        int res =0;
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++) {
//                if(i != j) {
//                    if (dotheyhavetripplet(ar[i], ar[j], ar, d)) {
//                        res++;
//                    }
//                }
//            }
//        }

//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++) {
//                for(int k=0; k<n; k++) {
//                    if (dotheyhavetripplet1(ar[i], ar[j], ar[k], d)) {
//                        res++;
//                    }
//                }
//            }
//        }

        for (int i:ar) {
            if(dotheyhavetripplet2(i, ar, d)){
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean dotheyhavetripplet(int a, int b, int[] ar, int d){
        boolean res = false;
        for (int i:ar) {
            if(i != a && i != b){
                if((b-a == d) && (i-b == d)){
                    res = true;
                }
            }
        }
        return res;
    }

    public static boolean dotheyhavetripplet1(int a, int b, int c, int d){
        boolean res = false;
        if(c != a && c != b && a != b){
            if((b-a == d) && (c-b == d)){
                res = true;
            }
        }
        return res;
    }

    public static boolean dotheyhavetripplet2(int a, int[] ar, int d){
        boolean res = false;

        List<Integer> list = IntStream.of(ar).boxed().collect(Collectors.toList());
        if(list.contains(a+d) && list.contains(a+(2*d))){
            res = true;
        }

        return res;
    }

}
