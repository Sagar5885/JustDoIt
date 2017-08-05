package LogicalExamples;

/**
 * Created by sdodia on 6/4/17.
 */
public class ProductExpectSelf {
    public int[] productExceptSelf1(int[] nums) {
        int[] result = new int[nums.length];

        int[] t1 = new int[nums.length];
        int[] t2 = new int[nums.length];

        t1[0]=1;
        t2[nums.length-1]=1;

        //scan from left to right
        for(int i=0; i<nums.length-1; i++){
            t1[i+1] = nums[i] * t1[i];
        }

        //scan from right to left
        for(int i=nums.length-1; i>0; i--){
            t2[i-1] = t2[i] * nums[i];
        }

        //multiply
        for(int i=0; i<nums.length; i++){
            result[i] = t1[i] * t2[i];
        }

        return result;
    }

    public int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];

        result[nums.length-1]=1;
        for(int i=nums.length-2; i>=0; i--){
            result[i]=result[i+1]*nums[i+1];
        }

        int left=1;
        for(int i=0; i<nums.length; i++){
            result[i]=result[i]*left;
            left = left*nums[i];
        }

        return result;
    }

    public int actualrtn(int[] a, int m){
        int[] result = new int[a.length];

        result[a.length-1]=1;
        for(int i=a.length-2; i>=0; i--){
            result[i]=result[i+1]*a[i+1];
        }

        int left=1;
        for(int i=0; i<a.length; i++){
            result[i]=result[i]*left;
            left = left*a[i];
        }

        int[] tmp = new int[result.length];
        for(int i=0; i<result.length; i++){
            tmp[i] = result[i]%m;
        }
        int tmp1 =0;
        for(int i=0; i<tmp.length; i++){
            tmp1 += tmp[i];
        }
        int result1 = tmp1%m;
        return result1;
    }

    public static void main(String args[]){
        ProductExpectSelf pes = new ProductExpectSelf();
        int[] a = {1,2,3,4};

        int[] res1 = pes.productExceptSelf1(a);
        System.out.println("");
        for (int i:res1) {
            System.out.print(i+" ");
        }
        System.out.println("Actual Product Expect Self Solution: "+pes.actualrtn(a, 12));

//        int[] res2 = pes.productExceptSelf2(a);
//        System.out.println("");
//        for (int i:res2) {
//            System.out.print(i+" ");
//        }
//
//        System.out.println();
//        System.out.println("Actual Product Expect Self Solution: "+pes.actualrtn(a, 12));
//        int[] nums = {52, 40, 2, 78, 49, 70, 39, 26, 58, 58, 52, 93, 80, 64, 33, 72, 29, 17, 81, 83, 48, 9, 49, 82, 67, 76, 54, 64, 6, 48, 16, 82, 67, 56, 32, 98, 14, 47, 48, 26, 56, 54, 80, 13, 32, 18, 4, 73, 45, 65};
//        int m= 530;
//        System.out.println("Actual Product Expect Self Solution: "+pes.actualrtn(nums, m));
    }

}
