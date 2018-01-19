package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/27/17.
 */
public class Reverse {
    Node Reverse(Node head) {
        if (head == null){
            return null;
        }
        Node node = null;
        while(head != null){
            Node i = node;
            node = new Node();
            node.data = head.data;
            node.next = i;
            head = head.next;
        }
        return node;
    }
}
