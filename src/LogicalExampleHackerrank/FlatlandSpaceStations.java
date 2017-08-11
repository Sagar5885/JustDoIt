package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/9/17.
 */
public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<m; i++){
            list.add(Integer.valueOf(sc.nextInt()));
        }

        int tmp = getmindist(list, 0);
        if(n>0){
            for(int i=1; i<n; i++){
                if(getmindist(list, i) > tmp){
                    tmp = getmindist(list, i);
                }
            }
        }

        System.out.println(tmp);

    }

    public static int getmindist(List<Integer> l1, int a){
        int res = Math.abs(l1.get(0)-a);
        if(!l1.contains(Integer.valueOf(a))){
            for (Integer l:l1) {
                if(Math.abs(a-l)<res){
                    res = Math.abs(a-l);
                }
            }
        }else {
            res = 0;
        }
        return res;
    }

}
