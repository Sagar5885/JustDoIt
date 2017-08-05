package LogicalExamples;

/**
 * Created by sdodia on 5/28/17.
 * Bubble sort is a simple sorting algorithm that works by repeatedly stepping through the list to be sorted, comparing each pair of adjacent items and swapping
 * them if they are in the wrong order. The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. The algorithm
 * gets its name from the way smaller elements bubble to the top of the list. Because it only uses comparisons to operate on elements, it is a comparison sort.
 * You can see the code implementation below: - See more at: http://www.java2novice.com/java-interview-programs/bubble-sort/#sthash.4KNdFSEa.dpuf
 */

public class MyBubbleSort {

    public static void bubble_str(int[] arr){
        int n = arr.length;
        int k;
        for(int m=n; m >= 0; m--){
            for(int i=0; i<n-1; i++){
                k = i+1;
                if(arr[i] > arr[k]){
                    swapArray(i, k, arr);
                }
            }
            printall(arr);
        }
    }

    public static void swapArray(int a, int b, int[] arr){
        int tmp;
        tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void printall(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println("\n");
    }

    public static void main(String arrs[]){
        int[] ip = {4, 2, 9, 6, 23, 12, 34, 0, 1};
        bubble_str(ip);
    }
}
