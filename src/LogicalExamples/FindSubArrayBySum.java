package LogicalExamples;

/**
 * Created by sdodia on 6/7/17.
 */
public class FindSubArrayBySum {
    public int[] difsums(int s, int[] arr){
        int tmp=0;
        int a =0;
        int last=0;
        int i=0;
        boolean b = true;
        System.out.println("Length of Arr: "+arr.length);
        while(b){
            if(tmp<s) {
                tmp += arr[i];
                if(i<arr.length-1) {
                    i++;
                }
                else if(tmp == s){
                    last = i+1;
                    break;
                }else if(tmp > s){
                    tmp=0;
                    a++;
                    i=a;
                    b=true;
                }
                else{
                    break;
                }
                //b = true;
            }
            else if(tmp == s){
                last = i;
                break;
            }else if(tmp > s) {
                tmp=0;
                a++;
                i=a;
                b=true;
            }else{
                break;
            }
        }
        int[] res;
        if(last==0){
            res = new int[]{-1};
        }else{
            res = new int[]{a+1, last};
        }
        return res;
    }

    public static void main(String args[]){
        FindSubArrayBySum fsas = new FindSubArrayBySum();
        int[] arr = {4, 8, 9, 10, 3, 8};
        int s = 21;
        int[] arr1 = {1, 2, 3, 1, 4, 5, 6, 7, 8, 9, 10};
        int s1 = 15;
        //Test1
        int[] res1 = fsas.difsums(s, arr);
        for (int i:res1) {
            System.out.print(i+" ");
        }
        System.out.println();
        //Test2
        int[] res2 = fsas.difsums(s1, arr1);
        for (int i:res2) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Test3
        int[] arr2 = {142, 112, 54, 69, 148, 45, 63, 158, 38, 60, 124, 142, 130, 179, 117, 36, 191, 43, 89, 107, 41, 143, 65, 49, 47, 6, 91, 130, 171, 151, 7,
                102, 194, 149, 30, 24, 85, 155, 157, 41, 167, 177, 132, 109, 145, 40, 27, 124, 138, 139, 119, 83, 130, 142, 34, 116, 40, 59, 105, 131, 178, 107,
                74, 187, 22, 146, 125, 73, 71, 30, 178, 174, 98, 113};
        int s2 = 665;
        int[] res3 = fsas.difsums(s2, arr2);
        for (int i:res3) {
            System.out.print(i+" ");
        }
        System.out.println();

        //Test4
        int[] arr3 = {135, 101, 170, 125, 79, 159, 163, 65, 106, 146, 82, 28, 162, 92, 196, 143, 28, 37, 192, 5, 103, 154, 93, 183, 22, 117, 119, 96, 48, 127,
                172, 139, 70, 113, 68, 100, 36, 95, 104, 12, 123, 134};
        int s3 = 468;
        int[] res4 = fsas.difsums(s3, arr3);
        for (int i:res4) {
            System.out.print(i+" ");
        }
    }
}
