package LinkedList;

import LinkedList.SinglyLinkedList.SinglyLinkedListNewImpl;
import org.testng.annotations.Test;

/**
 * Created by sdodia on 5/27/17.
 */
public class TestSinglyLinkedListImpl {

    @Test
    public void Test1(){
        SinglyLinkedListImpl<Integer> slint = new SinglyLinkedListImpl<Integer>();

        slint.add(11);
        slint.add(22);
        slint.add(33);
        slint.add(44);
        slint.add(55);
        slint.add(55);
        slint.add(33);
        slint.addAfter(5, 55);
        slint.deleteFront();
        slint.deleteAfter(44);
        slint.addAfter(5, 55);
        slint.traverse();
        slint.reverse();
        slint.traverse();
//        System.out.println();
//        System.out.println("Check Has Cycle or not: "+slint.HasCycle());
        System.out.println();
        System.out.println(slint.check(5));
        System.out.println(slint.check(6));
        slint.addAtHead(1);
        slint.traverse();
        System.out.println();
        slint.removeDup();
        slint.traverse();
//        System.out.println();
//        System.out.println("Check Has Cycle or not: "+slint.HasCycle());
    }

    //@Test
    public void test2(){
        SinglyLinkedListNewImpl<String> slintn = new SinglyLinkedListNewImpl<String>();
        slintn.add("Sagar");
        slintn.add("Dodia");
        System.out.println("Check Dodia got added or not: "+slintn.check("Sagar"));
        slintn.addAfter("N", "Sagar");
        System.out.println("Check N got added or not: "+slintn.check("N"));
        System.out.println("Check all elements from Linkedlist: ");
        slintn.traverse();
    }
}
