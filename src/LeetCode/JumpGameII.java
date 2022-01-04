package LeetCode;

public class JumpGameII {
    public static int jump(int[] nums) {
        int pos = 0;
        int des = 0;
        int jump = 0;
        for(int i=0; i<nums.length-1; i++){
            des = Math.max(des, i+nums[i]);//2 4

            if(pos == i){ //0, 2, 4
                pos = des;
                jump++;
            }
        }

        return jump;
    }

    public static void main(String args[]){
       int[] nums = {2,3,1,1,4};
       System.out.println(jump(nums));
    }
}
