package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> subset = new ArrayList<List<Integer>>();
        boolean[] used = new boolean[nums.length];
        dfs(subset, nums, new ArrayList(), used);
        return subset;
    }

    private static void dfs(List<List<Integer>> subset, int[] nums, List<Integer> current, boolean[] used) {
        if(current.size() == nums.length){
            subset.add(new ArrayList(current));
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

    public static void main(String args[]){
        int[] nums = {1,2,3};
        System.out.println(permute(nums));
    }
}
