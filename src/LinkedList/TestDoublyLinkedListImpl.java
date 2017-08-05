package LinkedList;

import org.testng.annotations.Test;

/**
 * Created by sdodia on 5/28/17.
 */
public class TestDoublyLinkedListImpl {

    @Test
    public void test1(){
        DoublyLinkedListImpl dll = new DoublyLinkedListImpl();

        dll.addFirst("b");
        dll.addFirst("a");
        dll.addLast("c");
        dll.addLast("d");
        System.out.println("Size of Doubly Linked List: "+dll.size());
        System.out.println("Check isEmpty: "+dll.isEmpty());
        dll.iterateForward();
        dll.iterateBackward();

        dll.removeFirst();
        dll.removeLast();
        System.out.println("Size of Doubly Linked List: "+dll.size());
        System.out.println("Check isEmpty: "+dll.isEmpty());
        dll.iterateForward();
        dll.iterateBackward();

    }
}
