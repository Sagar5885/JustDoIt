package LogicalExampleHackerrank.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 9/21/17.
 */
public class FindTheMedian {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        for(int i=0; i<n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        if(n%2 == 0){
            float f1 = (list.get(n/2)+list.get(n/2+1))/2;
            System.out.print(f1);
        }else {
            System.out.println(list.get(n/2));
        }
    }
}
