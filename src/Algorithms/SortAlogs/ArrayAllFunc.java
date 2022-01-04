package Algorithms.SortAlogs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdodia on 1/26/18.
 */
public class ArrayAllFunc {
    public static void main(String args[]){
        int[] arr = generateRandomNoArray();
        printArray(arr);

        System.out.println();
        System.out.println("Get index of 15 : "+getIndexValue(arr, 15));

        System.out.println("Does random array has 14? : "+checkContains(arr, 14));

        System.out.println("After deleting 14: ");
        deleteValue(arr, 14);
        printArray(arr);

        System.out.println();
        System.out.println("Insert 3 at last: ");
        insertValueAtLastIndex(arr, 3);
        printArray(arr);

        System.out.println();
        List<Integer> lst = lenearSearchwithindexes(arr, 10);
        System.out.println("All indexs of occurance of 10 in given array: ");
        for(Integer i: lst){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Bubble Sort: ");
        bubbleSort(arr);
        printArray(arr);

        System.out.println();
        System.out.println("Binary Search : ");
        System.out.println(binarySearchForValue(arr, 3));

        System.out.println();
        System.out.println("Generate new Array: ");
        int[] arr1 = generateRandomNoArray();
        printArray(arr1);
        selectionSort(arr1);
        System.out.println();
        System.out.println("After Selection Sorting: ");
        printArray(arr1);
        System.out.println();

        System.out.println();
        System.out.println("Generate new Array: ");
        int[] arr3 = generateRandomNoArray();
        printArray(arr3);
        insertionSort(arr3);
        System.out.println();
        System.out.println("After Insertion Sorting: ");
        printArray(arr3);
    }

    public static int[] generateRandomNoArray(){
        int[] res = new int[10];
        for(int i=0; i<10; i++){
            res[i] = (int)(Math.random()*10)+10;
        }
        return res;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            //System.out.print("| "+i+" | ");
            System.out.print(arr[i] + " |");
            //System.out.println("----------");
        }
    }

    public static int getIndexValue(int[] arr, int v){
        int res = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == v){
                res = i;
                break;
            }
        }
        return res;
    }

    public static boolean checkContains(int[] arr, int v){
        boolean res = false;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == v){
                res = true;
                break;
            }
        }

        return res;
    }

    public static void deleteValue(int[] arr, int v){
        if(checkContains(arr, v)){
            int tmp = 0;
            for(int i=0; i<arr.length; i++){
                if(arr[i] == v){
                    tmp = i;
                    break;
                }
            }
            for(int i=tmp; i<arr.length-1; i++){
                arr[i] = arr[i+1];
            }

        }else {
            System.out.println("Value is already not there in array so no need to delete!");
        }
    }

    public static void insertValueAtLastIndex(int[] arr, int v){
        arr[arr.length-1] = v;
    }

    public static List<Integer> lenearSearchwithindexes(int[] arr, int v) {
        List<Integer> lst = new ArrayList<>();
        if (checkContains(arr, v)) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == v) {
                    lst.add(i);
                }
            }
        }
        return lst;
    }

    public static void bubbleSort(int[] arr){
        for(int i=arr.length-1; i>0; i--){
            for(int j=0; j<i; j++){
                if(arr[j] > arr[j+1]){
                    //For assending above condition change to '<'
                    swapvalues(arr, j, j+1);
                }
            }
        }
    }

    private static void swapvalues(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }

    //if you change bubble sort to assending then I have to change bellow binary Search
    public static boolean binarySearchForValue(int[] arr, int v){
        boolean res = false;
        int lowindx = 0;
        int highindx = arr.length-1;
        while (lowindx <= highindx){
            int middleindx = (highindx+lowindx)/2;
            if(arr[middleindx] < v) {
                lowindx = middleindx + 1;
            }else if(arr[middleindx] > v){
                highindx = middleindx - 1;
            }else {
                System.out.println("Find match for value in given array at: "+middleindx);
                lowindx = highindx + 1;
                res = true;
            }
        }
        return res;
    }

    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int min = i;
            for(int j = i; j<arr.length; j++) {
                if(arr[min] > arr[j]){
                    //To do assending order change comp to '<'
                    min = j;
                }
            }
            swapvalues(arr, i, min);
        }
    }

    //Insertion Sort is go through loop with check each
    //element to previous one (left side of array) and swap if needed
    //- It's very fast
    //- It useful for only small data set
    //-runs on O(n^2)
    public static void insertionSort(int[] arr){
        for(int i=1; i<arr.length; i++){
            int j = i;
            int tmp = arr[i];
            while ((j>0) && (arr[j-1]>tmp)){
                arr[j] = arr[j-1];
                j--;
            }
            arr[j] = tmp;
        }
    }
}
