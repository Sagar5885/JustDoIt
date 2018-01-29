package Algorithms.SortAlogs;

/**
 * Created by sdodia on 1/28/18.
 */
public class QuickSortSol1 {
    public static void main(String args[]) {
        int[] arr = generateRandomNoArray();
        printArray(arr);

        System.out.println();

        System.out.println("Array after quick sort: ");
        quicksort(arr);
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

    //Basic parent method
    public static void quicksort(int[] arr){
        quicksort(arr, 0, arr.length-1);
    }

    //Main method which get call in parent
    public static void quicksort(int[] arr, int left, int right){
        if(left >= right){
            return;
        }
        //pivot value array's middle index value
        int pivot = arr[(left+right)/2];
        int index = partition(arr, left, right, pivot);
        quicksort(arr, left, index-1);
        quicksort(arr, index, right);
    }

    //Partition logic for array using left, right and pivot:
    private static int partition(int[] arr, int left, int right, int pivot) {
        while (left <= right){
            //graually get left towards pivot
            while (arr[left] < pivot){
                left++;
            }
            //gradually get right towards pivot
            while (arr[right] > pivot){
                right--;
            }
            //swap left and righ if left less then or equal to right
            if(left <= right){
                swapvalues(arr, left, right);
                left++;
                right--;
            }
        }
        return left;
    }

    //Swap two values of array method:
    private static void swapvalues(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }
}
