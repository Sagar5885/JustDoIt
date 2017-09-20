package LogicalExampleHackerrank.Sorting;

import java.util.Scanner;

/**
 * Created by sdodia on 9/12/17.
 */
public class Quicksort1Partition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        StringBuilder sb = new StringBuilder("");
        for(int i = 1; i < n; i++){
            int num = sc.nextInt();
            if(num < m)
            {
                System.out.print(num+" ");
                continue;
            }
            else
                sb.append(num+" ");
        }
        System.out.print(m+" "+sb.toString());
    }
}
