package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/27/17.
 */
public class CycleDetection {
    boolean hasCycle(Node head) {
        if(head == null){
            return false;
        }

        Node tmp1 = head;
        Node tmp2 = head;

        while(tmp1 != null && tmp1.next != null){
            tmp1 = tmp1.next;
            tmp2 = tmp2.next.next;

            if(tmp1 == null || tmp2 == null){
                return false;
            }
            if(tmp1 == tmp2){
                return true;
            }
        }
        return false;
    }
}
