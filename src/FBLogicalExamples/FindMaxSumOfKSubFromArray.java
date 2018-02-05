package FBLogicalExamples;

/**
 * Created by sdodia on 2/2/18.
 */
public class FindMaxSumOfKSubFromArray {

    public static void main(String args[]){
        int[] arr = {1, 3, 2, 4, 7, 6, 5, 10, 8, 12, 12};
        int k = 2;

        //System.out.println("Max sum of k sub array from array is: "+sol1(arr, k));
        System.out.println("Max sum of k sub array from array is: "+sol2(arr, k));
    }

    private static void swapvalues(int[] arr, int i, int i1) {
        int tmp = arr[i];
        arr[i] = arr[i1];
        arr[i1] = tmp;
    }

    public static int sol2(int[] arr, int k){
        int res = 0;
        int tmp = arr.length-1;
        for(int i=arr.length-1; i>0; i--){
            if(i >= arr.length-k) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]) {
                        swapvalues(arr, j, j + 1);
                    }
                }
                res += arr[tmp];
                tmp--;
            }else {
                break;
            }
        }
        return res;
    }

//    public static int sol1(int[] arr, int k){
//        //We can use any fasted sorting alorithm - here we are using buble-sort
//        bubbleSort(arr);
//        int res = 0;
//        for(int i=arr.length-k; i<arr.length; i++){
//            res += arr[i];
//        }
//        return res;
//    }
//
//    public static void bubbleSort(int[] arr){
//        for(int i=arr.length-1; i>0; i--){
//            for(int j=0; j<i; j++){
//                if(arr[j] > arr[j+1]){
//                    //For assending above condition change to '<'
//                    swapvalues(arr, j, j+1);
//                }
//            }
//        }
//    }
}
