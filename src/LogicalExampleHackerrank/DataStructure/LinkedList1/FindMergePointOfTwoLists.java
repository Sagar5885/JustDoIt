package LogicalExampleHackerrank.DataStructure.LinkedList1;

/**
 * Created by sdodia on 9/27/17.
 */
public class FindMergePointOfTwoLists {
    int FindMergeNode(Node headA, Node headB){
        int headALen = 0, headBLen = 0;
        Node headACopy = headA, headBCopy = headB;
        while(headACopy != null){
            headACopy = headACopy.next;
            headALen++;
        }
        while(headBCopy != null){
            headBCopy = headBCopy.next;
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
            if(headA == headB){
                return headA.data;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return -1;
    }
}
