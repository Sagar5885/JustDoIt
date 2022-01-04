package LeetCode;

public class Temporary {
    public static void main(String args[]){
        int[] arr = {4, 1, 10, -3, 12};
        //selectionSort(arr);
        //insertionSort(arr);
        quickSort(arr, 0, arr.length-1);
        for(int i: arr){
            System.out.print(i+" ");
        }
    }

    public static void selectionSort(int[] arr){
        int len = arr.length;
        for(int i=0; i<len-1; i++){

            //Indentify small no compare to current
            int minIndx = i;
            for(int j=i+1; j<len; j++){
                if(arr[j]<arr[minIndx]){
                    minIndx = j;
                }
            }

            //Swap
            int tmp = arr[minIndx];
            arr[minIndx] = arr[i];
            arr[i] = tmp;
        }
    }

    public static void insertionSort(int[] arr){
        //Move (Swap) min element to 1st/beginning position
        int len = arr.length;
        for(int i=0; i<len; i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = key;
        }
    }

    public static void quickSort(int[] arr, int low, int high){
        //Compare with pivot
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        //pivot as last index
        int pivot = arr[high];

        //index of smaller element
        int i = (low-1);

        for(int j=low; j<high; j++){
            //If current element is smaller than equal to pivot
            //swap arr[i] and arr[j]
            if(arr[j] <= pivot){
                i++;
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
}
