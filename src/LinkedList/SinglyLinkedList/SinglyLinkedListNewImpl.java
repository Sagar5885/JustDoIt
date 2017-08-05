package LinkedList.SinglyLinkedList;

import LinkedList.*;

/**
 * Created by sdodia on 6/15/17.
 */
public class SinglyLinkedListNewImpl<T> {
    private NodeNew<T> start;
    private NodeNew<T> end;

    public void add(T ele){
        NodeNew<T> nnd = new NodeNew<T>();
        nnd.setValue(ele);
        System.out.println("Adding new element in linkedlist: "+ele);
        if(start == null){
            start = nnd;
            end = nnd;
        }else{
            end.setNextValue(nnd);
            end = nnd;
        }
    }

    public void addAfter(T ele, T eleafter){
        NodeNew<T> tmp = start;
        NodeNew<T> refNode = null;
        System.out.println("Traversing all nodes");

        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(eleafter) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextValue();
        }

        if(refNode != null){
            NodeNew<T> nd = new NodeNew<T>();
            nd.setValue(ele);
            nd.setNextValue(tmp.getNextValue());
            if(tmp == end){
                end = nd;
            }
            tmp.setNextValue(nd);
        }else {
            System.out.println("Unable to find the given element...");
        }
    }

    public boolean check(T ele){
        NodeNew<T> tmp = start;
        while (true){
            if(tmp == null){
                break;
            }
            if(tmp.getValue() == ele){
                return true;
            }
            tmp = tmp.getNextValue();
        }
        return false;
    }

    public void traverse(){
        NodeNew<T> tmp = start;
        while (true){
            if(tmp == null){
                break;
            }
            System.out.print(tmp.getValue()+" ");
            tmp = tmp.getNextValue();
        }
    }
}
