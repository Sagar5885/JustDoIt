package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/27/17.
 */
public class GetNodeValue {
    int GetNode(Node head,int n) {
        int res = 0;

        Node node = head;
        while(node != null){
            node = node.next;
            res++;
        }
        res -= n;
        while(--res > 0){
            head = head.next;
        }

        return head.data;
    }
}
