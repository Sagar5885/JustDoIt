package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/27/17.
 */
public class SherlockAndSquares {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int tmp1 = sc.nextInt();
            int tmp2 = sc.nextInt();
            int res = 0;
            for(int j=tmp1; j<=tmp2; j++){
                if(checkSq(j)){
                    res++;
                }
            }
            System.out.println(res);
        }
    }

    public static boolean checkSq(int n){
        //double sqrt = Math.sqrt(n);
        double sqrt = sqroot(n);
        if((sqrt - (int)sqrt) == 0){
            return true;
        }else {
            return false;
        }
    }

    public static double sqroot(int n){
        double sqrt = n/2;
        double t;
        do {
            t = sqrt;
            sqrt = (t + (n/t))/2;
        }while ((t-sqrt) != 0);

        return sqrt;
    }

}
