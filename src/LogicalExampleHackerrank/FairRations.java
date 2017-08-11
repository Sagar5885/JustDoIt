package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/10/17.
 */
public class FairRations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }

        int res = 0;
        if(B[0]%2 != 0){
            B[0]++;
            res++;
            B[1]++;
            res++;
        }

        for(int i=1; i<N-1; i++){
            if(B[i]%2 != 0){
                if(B[i-1]%2 != 0){
                    B[i]++;
                    res++;
                    B[i-1]++;
                    res++;
                }else {
                    B[i]++;
                    res++;
                    B[i+1]++;
                    res++;
                }
            }
        }
        if(B[N-1]%2 == 0){
            System.out.println(res);
        }else {
            System.out.println("NO");
        }
    }
}
