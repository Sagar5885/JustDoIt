package FBLogicalExamples;

/**
 * Created by sdodia on 2/4/18.
 */
public class KadaneAlgoMaxSumSubArray {
    public static void main(String args[]){
        int[] arr = {-2, 3, 2, -1};
        System.out.println("Sum of max sub array using kadan's algo: "+maxSumKadanes(arr));
    }

    public static int maxSumBruntForce(int[] arr){
        int res = 0;



        return res;
    }

    public static int maxSumKadanes(int[] arr){
        int max_cur = arr[0];
        int max_glob = arr[0];
        for(int i=1; i<arr.length; i++){
            max_cur = Math.max(arr[i], (max_cur+arr[i]));
            if(max_cur > max_glob){
                max_glob = max_cur;
            }
        }
        return max_glob;
    }
}
