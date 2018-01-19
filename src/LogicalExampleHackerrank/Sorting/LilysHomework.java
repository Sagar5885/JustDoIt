package LogicalExampleHackerrank.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 9/21/17.
 */
public class LilysHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list1 = new ArrayList<Integer>(n);
        List<Integer> list2 = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            int tmp = sc.nextInt();
            list1.add(tmp);
            list2.add(tmp);
        }

        Collections.sort(list2);

        int count = 0;
        while(!(list1.equals(list2))){
            int[] one = new int[2];
            int tmp = 0;
            for(int i=0; i<n; i++){
                if(list1.get(i) != list2.get(i)){
                    one[tmp] = i;
                    tmp++;
                    if(tmp == 2){
                        break;
                    }
                }
            }

            Integer tmpl = list1.get(one[1]);
            list1.remove(one[1]);
            list1.add(one[1], list1.get(one[0]));
            list1.remove(one[0]);
            list1.add(one[0], tmpl);
            count++;
        }

        System.out.print(count);
    }
}
