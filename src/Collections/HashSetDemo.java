package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by sdodia on 3/23/17.
 */

public class HashSetDemo {
    public static void main(String args[]) {
        // create a hash set
        HashSet hs = new HashSet();

        // add elements to the hash set
        hs.add("B");
        hs.add("A");
        hs.add("D");
        hs.add("E");
        hs.add("C");
        hs.add("F");
        System.out.println(hs);

        // create a LinkedHashSet
        LinkedHashSet hs1 = new LinkedHashSet();

        // add elements to the hash set
        hs1.add("B");
        hs1.add("A");
        hs1.add("D");
        hs1.add("E");
        hs1.add("C");
        hs1.add("F");
        System.out.println(hs1);
    }
}
