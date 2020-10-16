package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        if (intervals.length == 0) {
            return ans.toArray(new int[ans.size()][]);
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] cur = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= cur[1]) {
                cur[1] = Math.max(intervals[i][1], cur[1]);
            } else {
                ans.add(cur);
                cur = intervals[i];
            }
        }
        ans.add(cur);
        return ans.toArray(new int[ans.size()][]);
    }

    public static void main(String args[]){
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] output_arr = merge(intervals);
        System.out.println(output_arr[0][0]);
        System.out.println(output_arr[0][1]);
        System.out.println(output_arr[1][0]);
        System.out.println(output_arr[1][1]);
        System.out.println(output_arr[2][0]);
        System.out.println(output_arr[2][1]);
    }
}
