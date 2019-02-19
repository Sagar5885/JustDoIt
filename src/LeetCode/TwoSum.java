package LeetCode;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];

        for(int i=0; i<nums.length-1; i++){
            for(int j= i+1; j<nums.length; j++){
                if((nums[i]+nums[j]) == target){
                    res[0] = i;
                    res[1] = j;
                    break;
                }
            }
        }
        
        return res;
    }

    public static void main(String args[]){
        int[] nums = {1, 2, 11, 15, 9, 7};
        int target = 9;

        int[] res = twoSum(nums, target);

        System.out.println(res[0]+","+res[1]);
    }
}
