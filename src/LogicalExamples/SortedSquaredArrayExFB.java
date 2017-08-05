package LogicalExamples;

import java.util.Arrays;

/**
 * Created by sdodia on 6/3/17.
 */
public class SortedSquaredArrayExFB {
    public static int[] sortedSquaredArray(int[] array) {
        int[] arr = new int[array.length];
        arr = posarr(array);
        int[] result = new int[array.length];
        for(int j=0; j<arr.length; j++){
            result[j] = arr[j] * arr[j];
        }
        return result;
    }

    public static int[] posarr(int[] a){
        int[] b = new int[a.length];
        for(int i=0; i<a.length; i++){
            if(a[i] < 0){
                b[i] = a[i] * -1;
            }else {
                b[i] = a[i];
            }
        }
        Arrays.sort(b);
        return b;
    }

    public static void main(String args[]){
        int[] ar = {-6, -4, 1, 2, 3, 5};
        int[] res = new int[ar.length];
        res = sortedSquaredArray(ar);
        System.out.print("Sorted Squared Array: ");
        for (int a:res) {
            System.out.print(a+" ");
        }
    }
}
