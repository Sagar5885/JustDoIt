package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/26/17.
 */
public class InsertNodeAtSpecPosOfLinkedList {
    Node InsertNth(Node head, int data, int position) {
        Node node = head;
        if (position == 0){
            node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }
        else {
            while(--position > 0){
                node = node.next;
            }
            Node i = node.next;
            node.next = new Node();
            node.next.data = data;
            node.next.next = i;
            return head;
        }
    }
}
