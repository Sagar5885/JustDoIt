package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/6/17.
 */
public class ACMICPCTeam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] ar = new int[n][m];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                ar[i][j] = sc.nextInt();
            }
        }

        //Sol:
        int max = 0;
        int total = 0;
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                int tmp = getMax(ar[i], ar[j]);
                if(tmp > max){
                    max = tmp;
                    total = 1;
                }else if (tmp == max){
                    total++;
                }
            }
        }

        System.out.println(max);
        System.out.println(total);
    }



    public static int getMax(int[] a, int[] b){
        int res = 0;

        for(int i=0; i<a.length; i++){
            if(check(a[i], b[i])){
                res++;
            }
        }

        return res;
    }

    public static boolean check(int a, int b){
        if((a == 1 && b == 1) || (a == 1 && b ==0) || (a == 0 && b == 1)){
            return true;
        }else {
            return false;
        }
    }
}
