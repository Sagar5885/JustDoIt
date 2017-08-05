package LogicalExampleHackerrank.DataStructure;

import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class SparseArrays {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] strar1 = new String[n];
        for(int i=0; i<n; i++){
            strar1[i] = in.next();
        }

        int m = in.nextInt();
        String[] strar2 = new String[m];
        for(int i=0; i<m; i++){
            strar2[i] = in.next();
        }

        int[] res = new int[m];
        for(int i=0; i<strar2.length; i++){
            for(int j=0; j<strar1.length; j++){
                if(strar2[i].equals(strar1[j])) {
                    res[i]++;
                }
            }
        }

        for (int i:res) {
            System.out.println(i);
        }
    }
}
