package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/27/17.
 */
public class DeleteDuplicateValueNodesFromSortedLinkedlist {
    Node RemoveDuplicates(Node head) {
        Node node = head;
        if(head == null){
            return head;
        }
        while(head.next != null){
            if(head.data == head.next.data){
                head.next = head.next.next;
            }else {
                head = head.next;
            }
        }
        return node;
    }
}
