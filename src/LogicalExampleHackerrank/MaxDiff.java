package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/5/17.
 */
public class MaxDiff {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(maxDifference4(ar));
    }

    static int maxDifference1(int[] a) {
        int d1 = a[1] - a[0];

        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[j] - a[i] > d1){
                    d1 = a[j] - a[i];
                }
            }
        }
        return d1;
    }

    static int maxDifference2(int[] a) {
        if(a.length>1) {
            int d1 = a[1] - a[0];
            int min = a[0];
            int i;
            for (i = 1; i < a.length; i++) {
                if (a[i] - min > d1)
                    d1 = a[i] - min;
                if (a[i] < min)
                    min = a[i];
            }
            if (d1 >= 0) {
                return d1;
            } else {
                return -1;
            }
        }else {
            return -1;
        }
    }

    static int maxDifference3(int[] a) {
        int tmp[] = new int[a.length - 1];
        for (int i = 0; i < a.length - 1; i++)
            tmp[i] = a[i + 1] - a[i];

        int d1 = tmp[0];
        for (int i = 1; i < a.length - 1; i++)
        {
            if (tmp[i - 1] > 0)
                tmp[i] += tmp[i - 1];
            if (d1 < tmp[i])
                d1 = tmp[i];
        }
        return d1;
    }

    static int maxDifference4(int[] a) {
        int tmp = a[1]-a[0];
        int tmp1 = tmp;
        int d1 = tmp1;

        for(int i=1; i<a.length-1; i++)
        {
            tmp = a[i+1]-a[i];

            if (tmp1 > 0)
                tmp1 += tmp;
            else
                tmp1 = tmp;

            if (tmp1 > d1)
                d1 = tmp1;
        }

        return d1;
    }
}
