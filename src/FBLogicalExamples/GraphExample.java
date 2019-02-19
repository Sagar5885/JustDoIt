package FBLogicalExamples;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by sdodia on 2/4/18.
 */
public class GraphExample {
    public static void main(String args[]){
        List<Integer> llist = new LinkedList<>();
        llist.add(10); llist.add(30); llist.add(60);
        llist.add(0, 108);
        System.out.println(llist);

        System.out.println();
        //Array of linkedlist
        List<Integer> l[] = new LinkedList[10];
        for(int i=0; i<10; i++) {
            l[i] = new LinkedList<>();
        }
            l[0].add(10); l[0].add(12); l[0].add(13);
            l[1].add(20); l[1].add(9);
            l[5].add(36); l[5].add(10);
            l[9].add(108);

        for(int i=0; i<10; i++){
            System.out.println(l[i]);
        }


        System.out.println();
        //Graph Object from bellow Graph class:
        Graph g = new Graph(10);
        g.addEdge(0, 2, 10);
        g.addEdge(0, 5, 15);
        g.addEdge(2, 5, 10);
        g.addEdge(9, 3, 16);
        System.out.println(g);

        System.out.println(g.isConnected(9,3));
        System.out.println(g.isConnected(2,3));
        System.out.println(g.isConnected(2,5));
        System.out.println(g.isConnected(0,5));
        System.out.println(g.isConnected(0,2));
    }
}

class Graph {

    class Edge {
        int v, w;

        public Edge(int v, int w) {
            this.v = v;
            this.w = w;
        }

        @Override
        public String toString() {
            return "("+ v + "," + w + ")";
        }
    }

    List<Edge> G[];
    public Graph(int n){
        G = new LinkedList[n];
        for(int i=0; i<G.length; i++){
            G[i] = new LinkedList<Edge>();
        }
    }

    public void addEdge(int u, int v, int w){
        G[u].add(0, new Edge(v, w));
    }

    public boolean isConnected(int u, int v){
        for(Edge i: G[u]){
            if(i.v == v){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i=0; i<G.length; i++){
            result += i+"=>"+G[i]+"\n";
        }

        return result;
    }
}