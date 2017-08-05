package LogicalExamples;

import java.awt.*;
import java.util.Iterator;

/**
 * Created by sdodia on 6/1/17.
 */
public class ReArrangeArr {

    public void rearrange(int arr[]) {
        int n = arr.length;
        int[] temp = new int[n];

        for (int i=0,j=0;i<n/2;i++)
        {
            temp[j] = arr[n-1-i];
            temp[j+1] = arr[i];
            j+=2;
        }
        if (n%2 != 0)
        {
            temp[n-1] = arr[(n/2)];
        }
        for (int i=0; i<n; i++)
            arr[i] = temp[i];
    }

    public void reArr(int[] arr){
        int n = arr.length;
        int temp[] = new int[n];
        int small=0, large=n-1;

        boolean flag = true;
        for (int i=0; i<n; i++)
        {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];
            flag = !flag;
        }

        for (int i=0; i<n; i++)
            arr[i] = temp[i];
    }

    public static void main(String args[]){
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Before Re Arrange: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        ReArrangeArr raa = new ReArrangeArr();
        raa.reArr(arr);
        System.out.println("After Re Arrange 1st approach: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int arr1[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println();
        raa.rearrange(arr1);
        System.out.println("After Re Arrange 2nd approach: ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
