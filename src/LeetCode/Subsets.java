package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void main(String args[]){
        int[] nums = {1,2,3};
        System.out.println(subsets2(nums));
    }


    //Solution1
    public static List<List<Integer>> subsets1(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        compute(0,new ArrayList<Integer>(), nums, result);
        return result;
    }

    static void compute(int i,ArrayList<Integer> al, int[] nums, List<List<Integer>> result){
        if(i==nums.length){
            result.add(new ArrayList<Integer>(al));
            return;
        }
        compute(i+1,al, nums, result);
        al.add(nums[i]);
        compute(i+1,al, nums, result);
        al.remove(new Integer(nums[i]));
    }

    //Solution2 - similar
    public static List<List<Integer>> subsets2(int[] nums) {
        List<List<Integer>> subset = new ArrayList<List<Integer>>();
        dfs(subset, 0, nums, new ArrayList());
        return subset;
    }

    private static void dfs(List<List<Integer>> subset, int index, int[] nums, List<Integer> current) {
        subset.add(new ArrayList(current));
        for(int i=index; i< nums.length; i++){
            current.add(nums[i]);//[1]
            dfs(subset, i+1, nums, current);
            current.remove(current.size()-1);//[2] [3]
        }
    }

}

