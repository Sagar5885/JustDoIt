package LogicalExampleHackerrank.Sorting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 9/21/17.
 */
public class ClosestNumbers2 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<Integer>(n);
        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        Collections.sort(list);

        List<Pair> pairs = new ArrayList<Pair>();
        int mindiff = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++){
            int a = list.get(i);
            int b = list.get(i-1);
            int diff = a - b;
            diff = (diff < 0) ? -diff : diff;
            if (diff < mindiff){
                mindiff = diff;
                pairs.clear();
                pairs.add(new Pair(b, a));
            } else if (diff == mindiff){
                pairs.add(new Pair(b, a));
            }
        }

        for (Pair p : pairs){
            System.out.print(p.x + " " + p.y + " ");
        }
    }

    public static class Pair{
        public int x;
        public int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
