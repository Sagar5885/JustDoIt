package LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourSum {
    public static void main(String args[]){
        int[] nums = {-3,-2,-1,0,0,1,2,3};//[-3,-2,-1,0,0,1,2,3], {1, 0, -1, 0, -2, 2}
        int target = 0;

        System.out.println(fourSum(nums, target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<nums.length-3; i++){
            for(int j=i+1; j<nums.length-2; j++){
                for(int k=j+1; k<nums.length-1; k++){
                    for(int l=k+1; l<nums.length; l++){
                        List<Integer> tmp = new ArrayList<>();
                        if(nums[i]+nums[j]+nums[k]+nums[l] == target){
                            tmp.add(nums[i]);
                            tmp.add(nums[j]);
                            tmp.add(nums[k]);
                            tmp.add(nums[l]);
                            Collections.sort(tmp);
                            if(!res.contains(tmp)){
                                res.add(tmp);
                            }
                        }
                    }
                }
            }
        }

        return res;
    }
}
