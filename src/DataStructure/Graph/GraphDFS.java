package DataStructure.Graph;

import java.util.*;

public class GraphDFS {
    private static HashMap<Character, ArrayList<Character>> graph = new HashMap<>();

    //With Stack
//    public static void depthFirstPrints(HashMap<Character, ArrayList<Character>> graph, Character ch){
//        Stack<Character> st = new Stack<>();
//        st.push(ch);
//
//        while (st.size() >0){
//            Character cur = st.pop();
//            System.out.println(cur);
//            for(char c: graph.get(cur)){
//                st.push(c);
//            }
//        }
//    }

    //With Recursion
    public static void depthFirstPrints(HashMap<Character, ArrayList<Character>> graph, Character ch){
        System.out.println(ch);
        for(Character c: graph.get(ch)){
            depthFirstPrints(graph, c);
        }
    }

    public static void main(String args[]){
        graph.put('a', new ArrayList<>(Arrays.asList('b', 'c')));
        graph.put('b', new ArrayList<>(Arrays.asList('d')));
        graph.put('c', new ArrayList<>(Arrays.asList('e')));
        graph.put('d', new ArrayList<>(Arrays.asList('f')));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());

        depthFirstPrints(graph, 'a');

    }


}
