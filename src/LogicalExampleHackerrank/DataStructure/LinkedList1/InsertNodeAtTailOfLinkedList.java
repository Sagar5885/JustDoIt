package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/26/17.
 */
public class InsertNodeAtTailOfLinkedList {
    Node Insert(Node head,int data) {
// This is a "method-only" submission.
// You only need to complete this method.
        if (head == null){
            head = new Node();
            head.data = data;
        }
        else {
            Node node = head;
            while (node.next != null){
                node = node.next;
            }
            node.next = new Node();
            node.next.data = data;
        }
        return head;
    }
}
