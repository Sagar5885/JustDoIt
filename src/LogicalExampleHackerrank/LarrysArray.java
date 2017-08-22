package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 8/17/17.
 */
public class LarrysArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();
            int[] ar = new int[n];
            for(int j=0; j<n; j++){
                ar[j] = sc.nextInt();
            }

            if(ar.length>3){
                int k=0;
                String res = "NO";
                while(k<ar.length-2){
                    int[] tmp = getarr(ar, k);
                    if(check1(tmp) && check2(tmp)){
                        int[] artmp = new int[ar.length];
                        artmp = copyArr(ar);
                        artmp[k] = tmp[0];
                        artmp[k+1] = tmp[1];
                        artmp[k+2] = tmp[2];
                        if(check2(artmp)){
                            res = "YES";
                        }else {
                            res = "NO";
                        }
                    }
                    k++;
                }
                System.out.println(res);
            }else {
                if(check1(ar) && check2(ar)){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }
    }

    public static boolean check1(int[] a){
        boolean res = false;
//        if((a[0]<a[1] && a[1]<a[2]) || (a[2]<a[0] && a[0]<a[1]) || (a[1]<a[2] && a[2]<a[0])){
//            res = true;
//        }

        int[] tmp = new int[a.length];
        if((a[0]<a[1] && a[1]<a[2])){
            res = true;
        }else if((a[2]<a[0] && a[0]<a[1])){
            res = true;
            tmp[0] = a[2];
            tmp[1] = a[0];
            tmp[2] = a[1];
            a[0] = tmp[0];
            a[1] = tmp[1];
            a[2] = tmp[2];
        }else if((a[1]<a[2] && a[2]<a[0])) {
            res = true;
            tmp[0] = a[1];
            tmp[1] = a[2];
            tmp[2] = a[0];
            a[0] = tmp[0];
            a[1] = tmp[1];
            a[2] = tmp[2];
        }else {
            res = false;
        }

        return res;
    }

    public static boolean check2(int[] a){
        boolean res = true;
        int[] tmp = new int[a.length];
        tmp = copyArr(a);
        Arrays.sort(tmp);
        for (int i=0; i<a.length; i++) {
            if (a[i] != tmp[i]) {
                res = false;
            }
        }
        return res;
    }

    public static int[] getarr(int[] ar, int n){
        int[] tmp = new int[3];
        tmp[0] = ar[n];
        tmp[1] = ar[n+1];
        tmp[2] = ar[n+2];
        return tmp;
    }

    public static int[] copyArr(int[] a){
        int[] res = new int[a.length];

        int j=0;
        for (int i:a) {
            res[j] = i;
            j++;
        }

        return res;
    }
}
