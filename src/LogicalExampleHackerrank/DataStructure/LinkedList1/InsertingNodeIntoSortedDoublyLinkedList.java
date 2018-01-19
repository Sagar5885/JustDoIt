package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/28/17.
 */
public class InsertingNodeIntoSortedDoublyLinkedList {
    NodeD SortedInsert(NodeD head,int data) {
        if(head == null){
            NodeD node = new NodeD();
            node.data = data;
            return node;
        }

        NodeD node = head;
        while(node != null){
            if(node.data >= data){
                NodeD i = new NodeD();
                i.data = data;
                i.prev = node.prev;
                i.next = node;
                node.prev = i;
                if(i.prev == null){
                    return i;
                }else {
                    i.prev.next = i;
                    return head;
                }
            }
            if(node.next == null){
                NodeD i = new NodeD();
                i.data = data;
                i.prev = node;
                i.next = null;
                node.next = i;
                break;
            }
            node = node.next;
        }
        return head;
    }
}
