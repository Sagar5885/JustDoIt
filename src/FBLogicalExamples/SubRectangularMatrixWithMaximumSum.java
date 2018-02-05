package FBLogicalExamples;

/**
 * Created by sdodia on 2/4/18.
 */
public class SubRectangularMatrixWithMaximumSum {
    public static void main(String args[]){
        int input[][] = {{ 2,  1, -3, -4,  5},
                { 0,  6,  3,  4,  1},
                { 2, -2, -1,  4, -5},
                {-3,  3,  1,  0,  3}};
        SubRectangularMatrixWithMaximumSum saw = new SubRectangularMatrixWithMaximumSum();
        System.out.println(saw.maxSum(input));
    }

    class Result {
        int maxSum;
        int leftBound;
        int rightBound;
        int upBound;
        int downBound;

        @Override
        public String toString() {
            return "Result [" +
                    "maxSum=" + maxSum +
                    ", leftBound=" + leftBound +
                    ", rightBound=" + rightBound +
                    ", upBound=" + upBound +
                    ", downBound=" + downBound +
                    ']';
        }
    }

    public Result maxSum(int[][] arr){
        int rowsl = arr.length;
        int colsl = arr[0].length;
        int[] tmp = new int[rowsl];

        Result res = new Result();

        for(int left = 0; left<colsl; left++){
            for(int i=0; i<rowsl; i++){
                tmp[i] = 0;
            }

            for(int right = left; right<colsl; right++){
                for(int j=0; j<rowsl; j++){
                    tmp[j] += arr[j][right];
                }
                KadaneResult kadaneResult = kadane(tmp);
                if(kadaneResult.maxSum > res.maxSum ){
                    res.maxSum = kadaneResult.maxSum;
                    res.leftBound = left;
                    res.rightBound = right;
                    res.upBound = kadaneResult.start;
                    res.downBound = kadaneResult.end;
                }
            }
        }

        return res;
    }

    class KadaneResult{
        int maxSum;
        int start;
        int end;

        public KadaneResult(int maxSum, int start, int end) {
            this.maxSum = maxSum;
            this.start = start;
            this.end = end;
        }
    }

    private KadaneResult kadane(int[] arr){
        int max = 0;
        int maxStart = -1;
        int maxEnd = -1;
        int currentStart = 0;
        int maxSoFar = 0;
        for(int i=0; i < arr.length; i++){
            maxSoFar += arr[i];
            if(maxSoFar < 0){
                maxSoFar = 0;
                currentStart = i+1;
            }
            if(max < maxSoFar){
                maxStart = currentStart;
                maxEnd = i;
                max = maxSoFar;
            }
        }
        return new KadaneResult(max, maxStart, maxEnd);
    }
}
