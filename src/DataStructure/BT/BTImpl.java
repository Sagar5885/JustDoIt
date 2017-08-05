package DataStructure.BT;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by sdodia on 6/30/17.
 */
public class BTImpl {
    public static Node root;

    public BTImpl(){
        this.root = null;
    }

    public void insetAt(Node n, int a){
        int[] a1 = {a};
        Node first = new Node(a1);
        if(root == null){
            root = first;
            return;
        }

        Node tmp = root;

        if(tmp == n){
            tmp.next.add(first);
        }else {
            List<Node> n1 = tmp.next;
            if(n1.contains(first)){

            }
            for (Node n2:n1) {
                if(n2 == n){
                    n2.next.add(first);
                }else {

                }
            }
        }
    }
}
