package LeetCode;

import java.util.*;

public class ThreeSumClass {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    List<Integer> tmp = new ArrayList<>();
                    if((nums[i]+nums[j]+nums[k]) == 0){
                        tmp.add(nums[i]); tmp.add(nums[j]); tmp.add(nums[k]);
                    }
                    Collections.sort(tmp);
                    if(!res.contains(tmp) && !tmp.isEmpty()){
                        res.add(tmp);
                    }
                }
            }
        }
        return res;
    }

    public static List<List<Integer>> threeSum1(int[] nums) {
        HashSet<List<Integer>> cache = new HashSet<>();
        if (nums == null || nums.length < 3) return new ArrayList<>();;

        Arrays.sort(nums);

        for(int firstI = 0; firstI < nums.length-2; firstI++) {
            int secondI = firstI+1;
            int thirtI = nums.length-1;

            int sum = 0;
            while (secondI < thirtI) {
                sum = nums[firstI] + nums[secondI] + nums[thirtI];
                if (sum == 0) {
                    List<Integer> subRes = Arrays.asList(nums[firstI], nums[secondI], nums[thirtI]);
                    cache.add(subRes);
                    secondI++;
                }
                else if (sum > 0) thirtI--;
                else secondI++;
            }
        }

        return new ArrayList<>(cache);
    }

    public static void main(String args[]){
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> res = threeSum1(nums);
        System.out.println(res);
    }
}
