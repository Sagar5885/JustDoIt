package LogicalExampleHackerrank.ArraysExs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 7/12/17.
 */
public class JavaList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        List<Integer> l1 = new ArrayList<Integer>(n);
        for(int i = 0; i<n; i++){
            l1.add(sc.nextInt());
        }

        //Ops
        int o1 = sc.nextInt();
       while (o1>-1) {
           String s = sc.nextLine();
           if (s.equals("Insert")) {
               int m = sc.nextInt();
               int k = sc.nextInt();
               l1.add(m, k);
               System.out.println("Inserted");
           } else if (s.equals("Delete")) {
               int m = sc.nextInt();
               l1.remove(m);
               System.out.println("Deleted");
           }
           o1--;
       }

        //Op
        for(int i = 0; i<l1.size(); i++){
            System.out.print(l1.get(i)+" ");
        }
    }
}
