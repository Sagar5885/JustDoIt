package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/25/17.
 */
public class BeautifulDaysMovies {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int d = sc.nextInt();
        int res = 0;
        for(int i=n1; i<=n2; i++){
            if(evenlyDiv(i, d)){
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean evenlyDiv(int n, int d){
        if((Math.abs(n-reversenum(n)))%d == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int reversenum(int n){
        int res = 0;
        while (n != 0){
            res = res * 10;
            res = n%10 + res;
            n = n/10;
        }
        return res;
    }
}
