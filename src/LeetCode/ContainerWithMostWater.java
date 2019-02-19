package LeetCode;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int res = 0;
        int wth = 0;
        int hgt = 0;
        for(int i=0; i<height.length-1; i++){
            for(int j=i+1; j<height.length; j++){
                if(height[i] < height[j]){
                    hgt = height[i];
                }else {
                    hgt = height[j];
                }
                wth = j-i;

                if(res<(wth*hgt)){
                    res = wth*hgt;
                }
            }
        }

        return res;
    }

    public static void main(String args[]){
        int[] arr = {1,8,6,2,5,4,8,3,7};//
        System.out.println(maxArea(arr));
    }
}
