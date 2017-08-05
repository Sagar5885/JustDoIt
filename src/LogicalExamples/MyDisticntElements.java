package LogicalExamples;

import java.util.*;

/**
 * Created by sdodia on 5/28/17.
 */
public class MyDisticntElements {
    public static void printDistinctElements(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean isDistinct = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isDistinct = true;
                    break;
                }
            }
            if(!isDistinct){
                System.out.print(arr[i]+" ");
            }
        }
    }

    public static void printDistinctElements1(Integer[] arr){
        Set<Integer> set = new HashSet<Integer>();
        Collections.addAll(set, arr);
        System.out.println();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }

    public static void printDistinctElements2(Integer[] arr){
        Set<Integer> mySet = new HashSet<Integer>(Arrays.asList(arr));
        System.out.println();
        Iterator it = mySet.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }
    }

    public static void main(String args[]){
        int[] nums = {5,2,7,2,4,7,8,2,3};
        MyDisticntElements.printDistinctElements(nums);

        Integer[] nums1 = {5,2,7,2,4,7,8,2,3};
        MyDisticntElements.printDistinctElements1(nums1);

        MyDisticntElements.printDistinctElements2(nums1);
    }
}
