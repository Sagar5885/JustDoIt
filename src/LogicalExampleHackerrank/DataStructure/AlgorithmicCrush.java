package LogicalExampleHackerrank.DataStructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 6/23/17.
 */
public class AlgorithmicCrush {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] arN = new int[N];

        int M = sc.nextInt();
        int max1 = 0;
        for(int i=0; i<M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int k = sc.nextInt();

            for(int j=a; j<b; j++){
                arN[j] += k;
                if(max1<arN[j]){
                    max1 = arN[j];
                }
            }
        }
        System.out.print(max1);
    }
}
