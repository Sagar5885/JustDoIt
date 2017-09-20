package LogicalExampleHackerrank.Sorting;

import java.util.Scanner;

/**
 * Created by sdodia on 9/11/17.
 */
public class InsertionSortPart2 {
    public static void insertionSortPart2(int[] ar)
    {
        for(int i=1; i<ar.length; i++){
            for(int j=i; j>0; j--){
                if(ar[j-1] <= ar[j]){
                    printArray(ar);
                    break;
                }
                else {
                    int tmp = ar[j];
                    ar[j] = ar[j-1];
                    ar[j-1] = tmp;
                    if(j-1 == 0){
                        printArray(ar);
                    }
                }
            }
        }
    }



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt();
        }
        insertionSortPart2(ar);

    }
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
