package LogicalExampleHackerrank.ArraysExs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 7/12/17.
 */
public class JavaArraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //1st set of input
        int n = in.nextInt();
        List<int[]> arlist = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            int tl = in.nextInt();
            int[] tmp = new int[tl];
            for(int j=0; j<tl; j++){
                tmp[j] = in.nextInt();
            }
            arlist.add(tmp);
        }

        //2nd set of input
        int n1 = in.nextInt();
        List<int[]> arlist1 = new ArrayList<>(n1);
        for(int i=0; i<n1; i++){
            int[] tmp = new int[2];
            tmp[0] = in.nextInt();
            tmp[1] = in.nextInt();
            arlist1.add(tmp);
        }

        //Result
        for(int i=0; i<arlist1.size(); i++){
            int[] tmp = arlist1.get(i);
            int[] tmp2 = arlist.get(tmp[0]-1);
            if(tmp2.length>tmp[1]-1) {
                System.out.println(tmp2[tmp[1]-1]);
            }else {
                System.out.println("ERROR!");
            }
        }
    }
}
