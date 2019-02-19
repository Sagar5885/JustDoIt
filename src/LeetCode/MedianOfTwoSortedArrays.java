package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MedianOfTwoSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int i = 0;
        int j = 0;
        int count;
        double m1 = 0, m2 = 0;
        int m = nums1.length;
        int n = nums2.length;

        if((m+n)%2 == 1) {
            for (count = 0; count <= (n+m)/2; count++) {
                if(i<m && j<n){
                    if(nums1[i]>nums2[j]){
                        m1 = nums2[j];
                        j++;
                    }else {
                        m1 = nums1[i];
                        i++;
                    }
                }
                else if(i<m){
                    m1 = nums1[i];
                    i++;
                }
                else if(j<n) {
                    m1 = nums2[j];
                    j++;
                }
            }
            return m1;
        }
        else {
            for (count = 0; count <= (n+m)/2; count++) {
                m2 = m1;

                if(i<m && j<n){
                    if(nums1[i]>nums2[j]){
                        m1 = nums2[j];
                        j++;
                    }else {
                        m1 = nums1[i];
                        i++;
                    }
                }
                else if(i<m){
                    m1 = nums1[i];
                    i++;
                }
                else if(j<n) {
                    m1 = nums2[j];
                    j++;
                }
            }
            return (m1+m2)/2;
        }
    }

    public static void main(String args[]){
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }
}
