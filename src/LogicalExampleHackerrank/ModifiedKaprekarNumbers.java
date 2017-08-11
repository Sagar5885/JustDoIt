package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/8/17.
 */
public class ModifiedKaprekarNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        List<Integer> l1 = solve(n1, n2);
        for (Integer i:l1) {
            System.out.print(i+" ");
        }

    }

    public static List<Integer> solve(int a, int b){
        List<Integer> res = new ArrayList<Integer>();
        for(int i=a; i<=b; i++){
            if(check(i)){
                res.add(i);
            }
        }
        return res;
    }

    public static boolean check(int a){
        int tmp = a*a;
        String tmps = String.valueOf(tmp);
        int a1 = tmps.length()/2;
        String tmps1 = tmps.substring(0, a1);
        String tmps2 = tmps.substring(a1, tmps.length());

        int tmp1 = 0;
        int tmp2 = 0;
        if(tmps1.length()>0){
            if(tmps1.charAt(0) != 0){
                tmp1 = Integer.parseInt(tmps1);
            }
        }

        if(tmps2.length()>0){
            if(tmps2.charAt(0) != 0){
                tmp2 = Integer.parseInt(tmps2);
            }
        }

        int res = tmp1+tmp2;

        if(a == res){
            return true;
        }else {
            return false;
        }
    }

}
