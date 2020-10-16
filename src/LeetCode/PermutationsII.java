package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsII {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> subset = new ArrayList<List<Integer>>();
        boolean[] used = new boolean[nums.length];
        dfs(subset, nums, new ArrayList(), used);
        return subset;
    }

    private static void dfs(List<List<Integer>> subset, int[] nums, List<Integer> current, boolean[] used) {
        if(current.size() == nums.length){
            if(!subset.contains(current)){
                subset.add(new ArrayList(current));
            }
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if(used[i] == true){
                continue;
            }
            current.add(nums[i]);
            used[i] = true;
            dfs(subset, nums, current, used);
            current.remove(current.size() - 1);
            used[i] = false;
        }
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> subset = new ArrayList<List<Integer>>();
        if(nums.length == 0 || nums == null){
            return subset;
        }
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        List<Integer> perm = new ArrayList<>();
        helper(nums, perm, used, subset);
        return subset;
    }

    private static void helper(int[] nums, List<Integer> perm, boolean[] used, List<List<Integer>> subset) {
        if(perm.size() == nums.length){
            subset.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(used[i]){
                continue;
            }
            used[i] = true;
            perm.add(nums[i]);
            helper(nums, perm, used, subset);
            perm.remove(perm.size()-1);
            used[i] = false;
            while(i+1<nums.length && nums[i] == nums[i+1]){
                ++i;
            }
        }
    }

    public static void main(String args[]){
        int[] nums = {1,1,2};
        System.out.println(permuteUnique(nums));
    }
}
