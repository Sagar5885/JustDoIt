package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/21/17.
 */
public class MinMaxSum {
    static public int[] minmax(int[] ar){
        int min = 0;
        int max = 0;
        int[] res = new int[2];

        int tmp = ar[0];
        for(int i=1; i<ar.length; i++){
            if(tmp>ar[i]){
                min += ar[i];
            }else {
                min += tmp;
                tmp = ar[i];
            }
        }

        int tmp1 = ar[0];
        for(int i=1; i<ar.length; i++){
            if(tmp1<ar[i]){
                max += ar[i];
            }else {
                max += tmp;
                tmp = ar[i];
            }
        }

        res[0] = min;
        res[1] = max;

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        int[] res = minmax(arr);

        for (int i:res) {
            System.out.print(i+" ");
        }
    }
}
