package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/30/17.
 */
public class Visa2 {

    //Utopian Tree
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<ar.length; i++){
            ar[i] = in.nextInt();
        }

        int[] res = growth1(ar);
        for(int i=0; i<res.length; i++){
            System.out.println(res[i]);
        }
    }

    public static int growth(int ar){
        if(ar%2==0){
            return ar+1;
        }else {
            return ar+ar;
        }
    }

    public static int[] growth1(int[] input){
        int[] res = new int[input.length];
        for (int i=0; i<input.length; i++) {
            int tmp = input[i];
            if(tmp == 0){
                res[i] = 1;
            }else {
                res[i] = 1;
                for(int j=1; j<=tmp; j++){
                    res[i] = growth(res[i]);
                }
            }
        }

        return res;
    }
}
