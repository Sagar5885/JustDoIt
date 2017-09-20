package LogicalExamples;

import java.util.Scanner;

/**
 * Created by sdodia on 9/19/17.
 * We need to find it out how much max water can contain in the hight of array
 */
public class HightOfWaterInArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        //Now we have array with different hights in sequence
        //Condition water can contain if it have space in between to hights

        System.out.println("Result: "+waterheight(ar));
    }

    public static int waterheight(int[] ar){
        int res = 0;
        int containlimit = 0;
        if(talestleft(ar) > talestright(ar)){
            containlimit = talestright(ar);
        }else {
            containlimit = talestleft(ar);
        }

        int start = 0;
        int end = ar.length-1;
        for(int i=0; i<ar.length; i++){
            if(ar[i] == talestleft(ar)){
                start = i;
            }
            if(ar[i] == talestright(ar)){
                end = i;
            }
        }

        if(Math.abs(start-end) > 0){
            if(start > end){
                int tmp = end;
                end = start;
                start = tmp;
            }
            for(int i=start+1; i<=end-1; i++){
                res += containlimit - ar[i];
            }
        }

        return res;
    }

    public static int talestleft(int[] ar){
        int res = ar[ar.length-1];

        for(int i=ar.length-2; i>0; i--){
            if(res < ar[i]){
                res = ar[i];
            }
        }

        return res;
    }

    public static int talestright(int[] ar){
        int res = ar[0];

        for(int i=0; i<ar.length-1; i++){
            if(res < ar[i]){
                res = ar[i];
            }
        }

        return res;
    }
}
