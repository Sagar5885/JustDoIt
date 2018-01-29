package Collections;

import java.util.Comparator;

/**
 * Created by sdodia on 1/29/18.
 */
public class MyComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
