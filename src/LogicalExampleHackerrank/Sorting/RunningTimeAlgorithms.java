package LogicalExampleHackerrank.Sorting;

import java.util.Scanner;

/**
 * Created by sdodia on 9/11/17.
 */
public class RunningTimeAlgorithms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        ar[0] = sc.nextInt();

        for(int i=1; i<n; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(solve(ar));
    }

    public static int solve(int[] a){
        int count = 0;

        for(int i=1; i<a.length; i++){
            int value = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > value){
                a[j+1] = a[j];
                j = j-1;
            }
            a[j+1] = value;
            count += i-(j+1);
        }

        return count;
    }
}
