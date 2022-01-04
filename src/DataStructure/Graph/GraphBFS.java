package DataStructure.Graph;

import java.util.*;

public class GraphBFS {
    private static HashMap<Character, ArrayList<Character>> graph = new HashMap<>();

    //With Queue
    public static void breadthFirstPrints(HashMap<Character, ArrayList<Character>> graph, Character source){
        Queue<Character> queue = new LinkedList<Character>();
        queue.add(source);
        while (queue.size() > 0){
            Character cur = queue.poll();
            System.out.println(cur);
            for(Character c: graph.get(cur)){
                queue.add(c);
            }
        }
    }

    public static void main(String args[]){
        graph.put('a', new ArrayList<>(Arrays.asList('c', 'b')));
        graph.put('b', new ArrayList<>(Arrays.asList('d')));
        graph.put('c', new ArrayList<>(Arrays.asList('e')));
        graph.put('d', new ArrayList<>(Arrays.asList('f')));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());

        breadthFirstPrints(graph, 'a');

    }

}
