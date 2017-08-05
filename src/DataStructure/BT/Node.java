package DataStructure.BT;

import java.util.Collection;
import java.util.List;

/**
 * Created by sdodia on 6/30/17.
 */
public class Node {
    int[] data;
    List<Node> next;

    public Node(int[] data){
        this.data = data;
        next = null;
    }
}
