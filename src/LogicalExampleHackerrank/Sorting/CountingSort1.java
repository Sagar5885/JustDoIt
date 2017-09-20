package LogicalExampleHackerrank.Sorting;

import java.util.Scanner;

/**
 * Created by sdodia on 9/12/17.
 */
public class CountingSort1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] frequencies = new int[100];
        for(int i = 0; i < n; i++)
        {
            int num = input.nextInt();
            frequencies[num] = frequencies[num] + 1;
        }

        for(int i = 0; i < frequencies.length; i++)
        {
            System.out.print(frequencies[i]+" ");
        }
    }
}
