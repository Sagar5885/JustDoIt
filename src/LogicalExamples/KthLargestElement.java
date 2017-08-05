package LogicalExamples;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by sdodia on 6/6/17.
 */
public class KthLargestElement {

    public Set<Integer> sortit(int[] a){
        Set<Integer> set = new HashSet<Integer>();
        int i = 0;
        for (int value : a) {
            set.add(Integer.valueOf(value));
        }
        return set;
    }

    public int kthLargestElement(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        int i = 0;
        for (int value : nums) {
            set.add(Integer.valueOf(value));
        }

        Integer[] res2 = new Integer[set.size()];
        int j=0;
        for (Integer in:set) {
            System.out.print(in+" ");
            res2[j] = in;
            j++;
        }

        if(res2.length==1){
            return res2[0];
        }else if(res2.length<k){
            return nums[k];
        }else {
            return res2[set.size()-k];
        }
    }


    public static void main(String args[]){
        KthLargestElement kle = new KthLargestElement();
        int[] nums = {7, 6, 5, 4, 10, 3, 2, 1, 5, 1, -1, 0};
        Set<Integer> res = new HashSet<Integer>();
        res = kle.sortit(nums);
        Integer[] res2 = new Integer[res.size()];
        int i=0;
        for (Integer in:res) {
            System.out.print(in+" ");
            res2[i] = in;
            i++;
        }
        System.out.println("Larget Element: "+res2[res.size()-1]);
        int a = 2;
        System.out.println("ath Larget Element: "+res2[res.size()-a]);
        int b = 3;
        System.out.println("bth Larget Element: "+kle.kthLargestElement(nums, b));

        int[] nums1 = {3, 3, 3, 3, 3, 3, 3, 3, 3};
        int c = 8;
        System.out.println("cth Larget Element: "+kle.kthLargestElement(nums1, c));

        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int d = 4;
        System.out.println("dth Larget Element: "+kle.kthLargestElement(nums2, d));

    }
}
