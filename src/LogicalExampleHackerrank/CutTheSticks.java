package LogicalExampleHackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by sdodia on 7/28/17.
 */
public class CutTheSticks {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> l1 = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            l1.add(Integer.valueOf(sc.nextInt()));
        }

        List<Integer> tmp = l1;
        Integer max = l1.stream().max(Integer::compare).get();
        //Integer max = l1.stream().max(Integer::max).get();

        while (max > 0) {
            tmp = removezeroorless(tmp);
            if(tmp.size()!=0) {
                max = tmp.stream().max(Integer::compare).get();
                Integer min = tmp.stream().min(Integer::compare).get();
                System.out.println(tmp.size());
                tmp = minsub(min, tmp);
            }else {
                break;
            }
        }

    }

    public static List<Integer> removezeroorless(List<Integer> list){
        List<Integer> res = new ArrayList<Integer>();

        for (Integer i:list) {
            if (i <= 0) {
            } else {
                res.add(i);
            }
        }
        return res;
    }

    public static List<Integer> minsub(Integer min, List<Integer> list){
        List<Integer> l2 = new ArrayList<Integer>();
        for (Integer i:list) {
            l2.add(i-min);
        }

        return l2;
    }
}
