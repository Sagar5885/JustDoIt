package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/20/17.
 */
public class BreakingTheRecords {
    static int[] getRecord(int[] s){
        int[] res = new int[2];
        res[0] = 0;
        res[1] = 0;
        if(s != null){
            if(s.length == 1){
                res = new int[]{s[0], s[0]};
            }else{
                int max = s[0];
                int min = s[0];
                for(int n:s){
                    if(max<n){
                        max = n;
                        res[0]++;
                    }
                    if(min>n){
                        min = n;
                        res[1]++;
                    }
                }

            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}
