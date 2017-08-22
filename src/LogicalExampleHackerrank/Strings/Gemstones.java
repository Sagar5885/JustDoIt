package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class Gemstones {
    static int gemstones(String[] arr){
        int res=0;
        char[] ch = arr[0].toCharArray();
        for(int i=0; i<ch.length; i++){
            boolean tmp = true;
            for(int j=1; j<arr.length; j++){
                if(!arr[j].contains(ch[i]+"")){
                    tmp=false;
                }
            }
            if(tmp == true){
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}
