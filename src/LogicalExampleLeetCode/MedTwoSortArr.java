package LogicalExampleLeetCode;

import com.sun.deploy.util.ArrayUtil;

import java.util.Arrays;

/**
 * Created by sdodia on 6/21/17.
 */
public class MedTwoSortArr {

    public double median(int[] nums1, int[] nums2){
        int len = nums1.length+nums2.length;
        int[] numres = new int[len];
        for(int i=0; i<nums1.length; i++){
            numres[i] = nums1[i];
        }
        for(int i=0; i<nums2.length; i++){
            numres[nums1.length+i] = nums2[i];
        }
        Arrays.sort(numres);

        if(numres.length%2==0){
            System.out.println("Odd: "+numres.length);
            int a =  numres.length/2;
            double m = (double) (numres[a-1]+numres[a])/2;
            return m;
        }else{
            System.out.println("Even: "+numres.length);
            int a =  numres.length/2;
            double m = (double) numres[a];
            return m;
        }
    }

    public static void main(String args[]){
        MedTwoSortArr mtsa = new MedTwoSortArr();

        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {6, 7, 8, 9, 10};
        System.out.println("Median of both int arrays: "+mtsa.median(a1, a2));

    }
}
