package LeetCode;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;

public class ThreeSumClosestClass {
    public static int threeSumClosest(int[] nums, int target) {
        List<Integer> allSums = allSums(nums);
        int min = abs(allSums.get(0)-target);
        int res = 0;
        for(int i=1; i<allSums.size(); i++){
            int tmp = abs(allSums.get(i)-target);
            if(min > tmp){
                res = allSums.get(i);
            }
        }
        return res;
    }

    public static List<Integer> allSums(int[] nums){
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                for(int k=j+1; k<nums.length; k++){
                    int tmp = nums[i]+nums[j]+nums[k];
                    if(!res.contains(tmp)){
                        res.add(tmp);
                    }
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }
}
