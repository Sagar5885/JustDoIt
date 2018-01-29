package LogicalExamples;

/**
 * Created by sdodia on 1/26/18.
 */
public class SmallestLargestElementDiffArray {
    public static void main(String args[]){
        int[] arr = {2, 5, 9, 6, 8, 10, 13, 7, 11, 4, 4};
        printArray(arr);
        System.out.println();
        System.out.println(largestSmalllestDiff(arr));
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " | ");
        }
    }

    public static int largestSmalllestDiff(int[] arr){
        int[] res = new int[2];
        res[0] = arr[0];
        res[1] = arr[0];

        for(int i=1; i<arr.length; i++){
            if(res[0] < arr[i]){
                res[0] = arr[i];
            }
            if(res[1] > arr[i]){
                res[1] = arr[i];
            }
        }
        return res[0]-res[1];
    }
}
