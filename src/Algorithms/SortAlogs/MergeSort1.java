package Algorithms.SortAlogs;

/**
 * Created by sdodia on 1/28/18.
 */
public class MergeSort1 {
    public static void main(String args[]) {
        int[] arr = generateRandomNoArray();
        printArray(arr);

        System.out.println();

        System.out.println("Array after Merge Sort: ");
        mergesort(arr);
        printArray(arr);
    }


    //Generate random Array
    public static int[] generateRandomNoArray(){
        int[] res = new int[10];
        for(int i=0; i<10; i++){
            res[i] = (int)(Math.random()*10)+10;
        }
        return res;
    }

    //Print array
    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            //System.out.print("| "+i+" | ");
            System.out.print(arr[i] + " | ");
            //System.out.println("----------");
        }
    }

    private static void mergesort(int[] arr) {
        mergesort(arr, new int[arr.length],0, arr.length-1);
    }

    private static void mergesort(int[] arr, int[] tmp,int left, int right) {
        if(left >= right){
            return;
        }
        int middle = (left+right)/2;
        mergesort(arr, tmp, left, middle);
        mergesort(arr, tmp, middle+1, right);
        mergeHalves(arr, tmp, left, right);
    }

    private static void mergeHalves(int[] arr, int[] tmp, int left, int right) {
        int leftEnd = ( right + left )/2;
        int rightstart = leftEnd + 1;
        int size = right-left+1;

        int leftIndex = left;
        int rightIndex = right;
        int index = left;

        while(leftIndex <= leftEnd && rightIndex <= right){
            if(arr[left] <= arr[right]){
                tmp[index] = arr[leftIndex];
                leftIndex++;
            }else {
                tmp[index] = arr[rightIndex];
                rightIndex++;
            }
            index++;
        }

        System.arraycopy(arr, leftIndex, tmp, index, leftEnd-leftIndex+1);
        System.arraycopy(arr, rightIndex, tmp, index, right-rightIndex+1);
        System.arraycopy(tmp, left, arr, left, size);
    }
}
