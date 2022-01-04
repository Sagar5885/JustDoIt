package Collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sdodia on 1/29/18.
 */
public class QueueDemo {
    public static void main(String args[]){
        Queue<String> queue = new LinkedList<>();
        queue.add("Apple");
        queue.add("Orange");
        queue.add("Mango");
        queue.add("Banana");
        queue.add("Grapes");
        queue.add("Pinaple");

        System.out.println(queue);

        //Remove 1st one
        System.out.println(queue.remove());
        System.out.println(queue);

        //Get 1st element
        System.out.println(queue.element());

        //Get and Remove
        System.out.println(queue.poll());
        System.out.println(queue);

        //Peak use instead of element in case queue is empty it will return null
        System.out.println(queue.peek());
        System.out.println(queue);
    }
}
