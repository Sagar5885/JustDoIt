package LogicalExamples;

import java.util.*;

/**
 * Created by sdodia on 6/19/17.
 */
public class FirstDuplicate {
    public int firstDuplicate(int[] a) {
        Set<Integer> set = new LinkedHashSet<Integer>();
        List<Integer> list1 = new ArrayList<Integer>();

        for(int i=0; i<a.length; i++){
            int k=0;
            int start = 0;
            int end = 0;
            for(int j=0; j<a.length; j++){
                if(!set.contains(a[j])) {
                    if (a[i] == a[j]) {
                        start = i;
                        k++;
                        if (k >= 2) {
                            set.add(Integer.valueOf(a[i]));
                            end = j;
                        }
                        if ((end - start) >= 1) {
                            list1.add(Integer.valueOf(end - start));
                        }
                    }
                }
            }
        }

        if(set.isEmpty()){
            return -1;
        }else {

            List<Integer> list2 = new ArrayList<Integer>(set);
//            for (Integer s : list2) {
//                System.out.println(s);
//            }
//            System.out.println();
//
//            for (Integer s : list1) {
//                System.out.println(s);
//            }
//            System.out.println();

            int tmp = 0;
            for (int i = 0; i < list1.size(); i++) {
                for (int j = 0; j < list1.size(); j++) {
                    if (list1.get(i) > list1.get(j)) {
                        tmp = j;
                    }
                }
            }

            return list2.get(tmp);
        }
    }

    public static void main(String args[]){
        FirstDuplicate fd = new FirstDuplicate();

        System.out.println("Test1: ");
        //Test1
        int[] a = {2, 3, 3, 1, 5, 2, 1};
        System.out.println(fd.firstDuplicate(a));

        System.out.println("Test2: ");
        //Test2
        int[] b = {2, 4, 3, 5, 1};
        System.out.println(fd.firstDuplicate(b));

        System.out.println("Test3: ");
        //Test3
        int[] c = {3, 3, 3};
        System.out.println(fd.firstDuplicate(c));

    }
}
