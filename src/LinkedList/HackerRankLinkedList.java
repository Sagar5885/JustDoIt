package LinkedList;

/**
 * Created by sdodia on 6/24/17.
 */
public class HackerRankLinkedList {

    class Node {
        int data;
        Node next;
    }

    //Print the elements of a linked list
    void Print(Node head) {
        if (head == null){
            return;
        }
        Node node = head;
        while(true){
            System.out.println(node.data);
            if (node.next != null){
                node = node.next;
            }
            else {
                break;
            }
        }

    }

    //Insert a node at the tail of a linked list
    Node InsertAtTail(Node head,int data) {
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

    //Insert a node at the head of a linked list
    Node InsertAtHead(Node head,int x) {
        Node node = new Node();
        node.data = x;
        node.next = head;
        return node;
    }

    //Insert a node at a specific position in a linked list
    Node InsertNth(Node head, int data, int position) {
        Node node = head;
        if (position == 0){
            node = new Node();
            node.data = data;
            node.next = head;
            return node;
        }
        else {
            while(--position > 0){
                node = node.next;
            }
            Node i = node.next;
            node.next = new Node();
            node.next.data = data;
            node.next.next = i;
            return head;
        }
    }

    //Delete a Node
    Node Delete(Node head, int position) {
        // Complete this method
        Node node = head;
        if (position == 0){
            return node.next;
        }
        while (--position > 0){
            node = node.next;
        }
        node.next = node.next.next;
        return head;

    }

    //Print in Reverse
    void ReversePrint(Node head) {
        // This is a "method-only" submission.
        // You only need to complete this method.
        Node node = head;
        StringBuilder s = new StringBuilder();
        while (node != null){
            s.insert(0, Integer.toString(node.data)+'\n');
            node = node.next;
        }
        System.out.print(s);
    }

    //Reverse a linked list
    Node Reverse(Node head) {
        if (head == null){
            return null;
        }
        Node node = null;
        while(head != null){
            Node i = node;
            node = new Node();
            node.data = head.data;
            node.next = i;
            head = head.next;
        }
        return node;
    }

    //Compare two linked lists
    int CompareLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if (headA == null && headB == null){
            return 1;
        }
        while (headA.data == headB.data){
            if(headA.next == null){
                if(headB.next == null){
                    return 1;
                }
                else {
                    return 0;
                }
            }
            headA = headA.next;
            headB = headB.next;
        }
        return 0;
    }

    //Merge two sorted linked lists
    Node MergeLists(Node headA, Node headB) {
        // This is a "method-only" submission.
        // You only need to complete this method
        if (headA == null){
            return headB;
        }
        if (headB == null){
            return headA;
        }
        if (headA.data < headB.data){
            headA.next = MergeLists(headA.next, headB);
            return headA;
        }
        else {
            headB.next = MergeLists(headA, headB.next);
            return headB;
        }
    }

    //Get Node Value
    int GetNode(Node head,int n) {
        int nodes = 0;
        Node i = head;
        while(i != null){
            i = i.next;
            nodes++;
        }
        nodes -= n;
        while(--nodes > 0){
            head = head.next;
        }
        return head.data;
    }

    //Delete duplicate-value nodes from a sorted linked list
    Node RemoveDuplicates(Node head) {
        Node node = head;
        if(head == null){
            return null;
        }
        while(head.next != null){
            if (head.data == head.next.data){
                head.next = head.next.next;
            }
            else {
                head = head.next;
            }
        }
        return node;
    }

    //Cycle Detection
    int HasCycle(Node head) {
        if (head == null){
            return 0;
        }
        Node tortoise = head;
        Node hare = head;

        while(tortoise != null && tortoise.next != null) {
            tortoise = tortoise.next;
            hare = hare.next.next;

            if(hare == null || tortoise == null) {
                return 0;
            }
            if(hare == tortoise){
                return 1;
            }
        }
        return 0;
    }

    //Find Merge Point of Two Lists
    int FindMergeNode(Node headA, Node headB) {
        int headALen = 0, headBLen = 0;
        Node headAcopy = headA, headBcopy = headB;
        while(headAcopy != null){
            headAcopy = headAcopy.next;
            headALen++;
        }
        while(headBcopy != null){
            headBcopy = headBcopy.next;
            headBLen++;
        }
        while(headALen > headBLen){
            headA = headA.next;
            headALen--;
        }
        while(headBLen > headALen){
            headB = headB.next;
            headBLen--;
        }
        while(headA != null){
            if (headA == headB){
                return headA.data;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return -1;
    }
}
