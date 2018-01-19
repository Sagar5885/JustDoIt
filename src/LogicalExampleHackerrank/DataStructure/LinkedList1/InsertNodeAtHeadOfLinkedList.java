package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/26/17.
 */
public class InsertNodeAtHeadOfLinkedList {
    Node Insert(Node head,int data) {
        Node node = new Node();
        node.data = data;
        node.next = head;
        return node;
    }
}
