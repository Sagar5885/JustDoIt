package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public static void main(String args[]){
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> subset = new ArrayList<>();
        dfs(subset, 0, candidates, new ArrayList(), target);

        return subset;
    }

    private static void dfs(List<List<Integer>> subset, int index, int[] candidates, ArrayList<Integer> current, int target) {
        if(target<0){
            return;
        }
        else if(target == 0){
            subset.add(new ArrayList<>(current));
            return;
        }

        for(int i=index; i<candidates.length; i++){
            current.add(candidates[i]);
            dfs(subset, i, candidates, current, target-candidates[i]);
            current.remove(current.size()-1);
        }
    }
}
