package LogicalExampleHackerrank.Search;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 9/22/17.
 */
public class IceCreamParlor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }

            for (int i = 0; i < n; i++) {
                if (list.contains(m - list.get(i)) && i != list.indexOf(m - list.get(i))) {
                    if(i<list.indexOf(m - list.get(i))) {
                        System.out.println((i + 1) + " " + (list.indexOf(m - list.get(i)) + 1));
                    }else {
                        System.out.println((list.indexOf(m - list.get(i)) + 1)+" "+(i + 1));
                    }
                    break;
                }
            }
        }
    }
}
