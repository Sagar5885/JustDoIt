package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/27/17.
 */
public class PrintInReverse {
    void ReversePrint(Node head) {
        Node node = head;
        StringBuilder sb = new StringBuilder();
        while(node != null){
            sb.insert(0, Integer.toString(node.data)+"\n");
            node = node.next;
        }
        System.out.print(sb);
    }
}
