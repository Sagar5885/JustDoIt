package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 7/25/17.
 */
public class HurdleRace {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        if(k <  Arrays.stream(height).max().getAsInt()){
           System.out.println(Arrays.stream(height).max().getAsInt() - k);
        }else {
            System.out.println(0);
        }
    }
}
