package LogicalExampleHackerrank.Sorting;

import java.util.Scanner;

/**
 * Created by sdodia on 9/11/17.
 */
public class InsertionSortPart1 {

    public static void insertIntoSorted(int[] ar) {
        int tmp = ar[ar.length-1];
        for(int i=ar.length-2; i>=0; i--){
            if(tmp >= ar[i]){
                ar[i+1] = tmp;
                printArray(ar);
                break;
            }
            ar[i+1] = ar[i];
            printArray(ar);
        }
        if(tmp < ar[0]){
            ar[0] = tmp;
            printArray(ar);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertIntoSorted(ar);
    }


    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
