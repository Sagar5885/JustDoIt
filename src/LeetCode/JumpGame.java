package LeetCode;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int lastIndxPos = nums.length-1;
        for(int i = nums.length-1; i>=0; i--){
            if(i+nums[i] >= lastIndxPos){
                lastIndxPos = i;
            }
        }
        return lastIndxPos == 0;
    }

    public static void main(String args[]){
        //int[] nums = {2,3,1,1,4};
        int[] nums = {3,2,1,0,4};
        System.out.println(canJump(nums));
    }
}
