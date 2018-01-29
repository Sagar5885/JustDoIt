package Collections;

import java.util.PriorityQueue;

/**
 * Created by sdodia on 1/29/18.
 */
public class PriorityQueueDemo {
    public static void main(String args[]){
        PriorityQueue<String> pq1 = new PriorityQueue<String>(15, new MyComparator());
        pq1.add("Sagar Dodia");
        pq1.add("Sagar Dodia Narendrasinh");
        pq1.add("Sagar Dodia N");
        pq1.add("sdodia");

        while (pq1.size() != 0){
            System.out.println(pq1.poll());
        }
    }
}
