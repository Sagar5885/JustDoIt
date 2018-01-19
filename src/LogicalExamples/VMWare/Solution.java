package LogicalExamples.VMWare;

/**
 * Created by sdodia on 9/25/17.
 */
public class Solution {
    public static void main(String args[]){
        int[] arr = {15, 12, 18, 14, 16, 17, 4, 3, 5, 2};

        int max = 0;
        if(arr[arr.length-1] > arr[arr.length-2]){
            max = arr[arr.length-1];
        }else {
            max = arr[arr.length-2];
        }
        arr[arr.length-2] = arr[arr.length-1];
        for(int i=arr.length-3; i>=0; i--){
            int tmp = max;
            if(max < arr[i]){
                max = arr[i];
            }
            arr[i] = tmp;
        }
        arr[arr.length-1]=-1;

        for(int i: arr){
            System.out.print(i+" ");
        }

        // for(int i=0; i<arr.length; i++){
        //     if(i == arr.length-1){
        //         arr[i] = -1;
        //         System.out.print(arr[i]+" ");
        //     }else{
        //         arr[i] = solve(arr, i+1, arr.length-1);
        //         System.out.print(arr[i]+" ");
        //     }
        // }
    }

// public static int solve(int[] ar, int start, int end){
//     int res = ar[start];

//     for(int i=start; i<=end; i++){
//         if(res<ar[i]){
//             res = ar[i];
//         }
//     }

//     return res;
// }
}
