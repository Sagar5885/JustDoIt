package LeetCode.RemoveNthNodeFromEndofList;

import LinkedList.HackerRankLinkedList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null )return head;
        ListNode temp = head;
        ListNode mover = head;
        while(n>0){
            temp = temp.next;
            n--;
        }
        if(temp ==null){
            return head.next;
        }
        while(temp.next !=null){
            temp = temp.next;
            mover = mover.next;
        }
        mover.next = mover.next.next;

        return head;
    }

}
