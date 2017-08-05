package LinkedList;

import org.testng.annotations.Test;

/**
 * Created by sdodia on 6/24/17.
 */
public class HackerRankLinkedListTest {

    @Test
    public void test1(){
        HackerRankLinkedList hrll = new HackerRankLinkedList();

        HackerRankLinkedList.Node head = null;

        hrll.InsertAtHead(head, 3);
        hrll.InsertAtHead(head, 2);
        hrll.InsertAtHead(head, 1);

        hrll.InsertAtTail(head, 4);
        hrll.InsertAtTail(head, 5);
        hrll.InsertAtTail(head, 7);

        hrll.Print(head);

        //hrll.InsertNth(head, 2, 6);
        hrll.Delete(head, 5);

        hrll.ReversePrint(head);
        hrll.Reverse(head);
        hrll.ReversePrint(head);

        HackerRankLinkedList hrll1 = new HackerRankLinkedList();
        HackerRankLinkedList.Node head1 = null;
        hrll1.InsertAtHead(head1, 3);
        hrll1.InsertAtHead(head1, 2);
        hrll1.InsertAtHead(head1, 1);

        hrll1.InsertAtTail(head1, 4);
        hrll1.InsertAtTail(head1, 6);
        hrll1.InsertAtTail(head1, 8);

        hrll1.CompareLists(head, head1);
        hrll1.MergeLists(head, head1);

        hrll1.GetNode(head, 2);
        hrll1.RemoveDuplicates(head);
        hrll1.HasCycle(head);




    }
}
