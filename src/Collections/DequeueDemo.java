package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by sdodia on 1/29/18.
 */
public class DequeueDemo {
    public static void main(String args[]){
        Deque<String> dq = new ArrayDeque<String>();
        dq.add("Carrot");
        dq.add("Potato");
        dq.add("Tomato");
        dq.add("Onion");
        dq.add("Cabage");
        dq.add("Coliflower");

        System.out.println(dq);
        //Remove first and last
        System.out.println(dq.removeLast());
        System.out.println(dq.removeFirst());
        System.out.println(dq);
        System.out.println(dq.element());
        System.out.println(dq.pollLast());
        System.out.println(dq);
        System.out.println(dq.peek());
        System.out.println(dq);
    }
}
