package LogicalExampleHackerrank.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 9/21/17.
 */
public class FraudulentActivityNotifications {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);

        int res = 0;
        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();
            if(i >= d){
                if(tmp >= getMedian(list)*2){
                    res++;
                }
                list.remove(0);
                list.add(tmp);
            }else {
                list.add(tmp);
            }
        }

        System.out.println(res);
    }

    public static double getMedian(List<Integer> list){
        Collections.sort(list);

        if(list.size()%2 == 0){
            double f1 = (list.get(list.size()/2)+list.get((list.size()/2)+1))/2;
            return f1;
        }else {
            return list.get(list.size()/2);
        }
    }
}
