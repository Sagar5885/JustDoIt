package LinkedList;

import java.awt.*;

/**
 * Created by sdodia on 5/27/17.
 */
public class SinglyLinkedListImpl<T> {

    private Node<T> head;
    private Node<T> tail;

    public void add(T element){
        Node<T> nd = new Node<T>();
        nd.setValue(element);
        System.out.println("Adding element: "+element);

        if(head == null){
            head = nd;
            tail = nd;
        }else{
            tail.setNextRef(nd);
            tail = nd;
        }
    }

    public void addAtHead(T element){
        Node<T> tmp = new Node<T>();
        tmp.setValue(element);

        Node<T> tmp1 = head;
        head = tmp;
        head.setNextRef(tmp1);
    }

    public void addAfter(T element, T after){
        Node<T> tmp = head;
        Node<T> refNode = null;
        System.out.println("Traversing all nodes");

        while(true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                //found the target node, add after this node
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }

        if(refNode != null){
            Node<T> nd = new Node<T>();
            nd.setValue(element);
            nd.setNextRef(tmp.getNextRef());
            if(tmp == tail){
                tail = nd;
            }
            tmp.setNextRef(nd);
        }else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void deleteFront(){
        if(head == null){
            System.out.println("Underflow...");
        }
        Node<T> tmp = head;
        head = tmp.getNextRef();
        if(head == null){
            tail = null;
        }
        System.out.println("Deleted: "+tmp.getValue());
    }

    public void removeDup(){
        Node<T> nd1 = null;
        Node<T> nd2 = null;
        Node<T> dup = null;

        nd1 = head;

        while(nd1 != null && nd1.getNextRef() != null){
            nd2 = nd1;
            while (nd2.getNextRef() != null){
                if(nd1.getValue() == nd2.getNextRef().getValue()){
                    dup = nd2.getNextRef();
                    nd2.setNextRef(nd2.getNextRef().getNextRef());
                    //System.gc();
                }else{
                    nd2 = nd2.getNextRef();
                }
            }
            nd1 = nd1.getNextRef();
        }
    }

    public void deleteAfter(T after){
        Node<T> tmp = head;
        Node<T> refNode = null;
        System.out.println("Traversing all nodes");

        while (true){
            if(tmp == null){
                break;
            }
            if(tmp.compareTo(after) == 0){
                refNode = tmp;
                break;
            }
            tmp = tmp.getNextRef();
        }

        if(refNode != null){
            tmp = refNode.getNextRef();
            refNode.setNextRef(tmp.getNextRef());

            if(refNode.getNextRef() == null){
                tail = refNode;
            }
            System.out.println("Deleted: "+tmp.getValue());
        }else {
            System.out.println("Unable to find the given element...");
        }
    }

    public void traverse() {
        Node<T> tmp = head;
        while (true){
            if (tmp == null) {
                break;
            }
            System.out.print(tmp.getValue()+" ");
            tmp = tmp.getNextRef();
        }
    }

    public void reverse(){

        System.out.println("\nreversing the linked list\n");
        Node<T> prev = null;
        Node<T> current = head;
        Node<T> next = null;
        while(current != null){
            next = current.getNextRef();
            current.setNextRef(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }


    public boolean check(T element){
        Node<T> tmp = head;
        while (true){
            if(tmp == null){
                break;
            }
            if(tmp.getValue() == element){
                return true;
            }
            tmp = tmp.getNextRef();
        }
        return false;
    }

    //Need to fix this
    public boolean HasCycle(){
        if (head == null){
            return false;
        }

        Node<T> tmp1 = head;
        Node<T> tmp2 = head.getNextRef();
        while (tmp1 != null && tmp1.getNextRef() != null){
            tmp1.setNextRef(tmp1.getNextRef());
            tmp2.setNextRef(tmp2.getNextRef().getNextRef());

            if(tmp1.getValue() == null || tmp2.getValue() == null){
                return false;
            }
            if(tmp1.getValue() == tmp2.getValue()){
                return true;
            }
        }
        return false;
    }
}
