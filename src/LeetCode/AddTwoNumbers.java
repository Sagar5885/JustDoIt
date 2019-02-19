package LeetCode;

public class AddTwoNumbers {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resl = null;
        ListNode tmp = null;
        ListNode prev = null;

        int sum = 0;
        int carry = 0;

        while(l1 != null || l2 != null){

            sum = sum/10;
            sum += carry;
            carry = 0;

            if(l1 != null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2 != null){
                sum += l2.val;
                l2 = l2.next;
            }

            if(sum >= 10){
                carry = 1;
            }
            sum = sum % 10;

            tmp = new ListNode(sum);
            if(resl == null){
                resl = tmp;
            }else {
                prev.next = tmp;
            }

            prev = tmp;
        }

        if (carry > 0) {
            tmp.next = new ListNode(carry);
        }
        return resl;
    }

    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();

        linkedList.head1 = new ListNode(9);//5
//        linkedList.head1.next = new ListNode(4);
//        linkedList.head1.next.next = new ListNode(3);
        printAll(linkedList.head1);

        linkedList.head2 = new ListNode(9);//5
//        linkedList.head2.next = new ListNode(6);
//        linkedList.head2.next.next = new ListNode(4);
        printAll(linkedList.head2);

        ListNode rs = addTwoNumbers(linkedList.head1, linkedList.head2);
        System.out.print("Resultant List is ");
        printAll(rs);
    }

    public static void printAll(ListNode node){
        while(node != null){
            System.out.print(node.val +" ");
            node = node.next;
        }
        System.out.println();
    }
}

