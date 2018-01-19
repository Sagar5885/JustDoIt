package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/26/17.
 */
public class DeleteNode {
    Node Delete(Node head, int position) {
        Node node = head;
        if (position == 0){
            return node.next;
        }
        else {
            while(--position > 0){
                node = node.next;
            }
            node.next = node.next.next;
            return head;
        }
    }
}
