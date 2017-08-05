package LinkedList.SinglyLinkedList;

/**
 * Created by sdodia on 6/15/17.
 */
public class NodeNew<T> implements Comparable<T> {

    private T value;
    private NodeNew<T> nextValue;


    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeNew<T> getNextValue() {
        return nextValue;
    }

    public void setNextValue(NodeNew<T> nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public int compareTo(T o) {
        if(o == this.value){
            return 0;
        } else {
            return 1;
        }
    }
}
