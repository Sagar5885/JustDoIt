package LeetCode;

import java.util.Arrays;

public class ThreeSumClosestClass {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        int sum;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (sum == target) {
                    return sum;
                } else {
                    if (Math.abs(result - target) > Math.abs(sum - target)) {
                        result = sum;
                    }
                    if (sum < target) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String args[]){
        int[] nums = {-3,-2,-5,3,-4}; //{-1, 2, 1, -4}, {-3,-2,-5,3,-4} => {-5,-4,-3,-2,3,-2,-3,-4,-5}
        int target = -1;//1, -1

        System.out.println(threeSumClosest(nums, target));
    }
}
