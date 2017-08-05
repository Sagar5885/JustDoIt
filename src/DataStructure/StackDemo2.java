package DataStructure;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by sdodia on 3/24/17.
 */
public class StackDemo2 {

    static void showpush(Stack st, String a) {
        st.push(new String(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + st);
    }

    static void showpop(Stack st) {
        System.out.print("pop -> ");
        String a = (String) st.pop();
        System.out.println(a);
        System.out.println("stack: " + st);
    }

    public static void main(String args[]) {
        Stack st = new Stack();
        System.out.println("stack: " + st);
        showpush(st, "{");
        showpush(st, "(");
        showpush(st, "[");
        showpush(st, "]");
        showpush(st, ")");
        showpush(st, "}");
        showpop(st);
        showpop(st);
        showpop(st);
        showpop(st);
        showpop(st);
        showpop(st);
        try {
            showpop(st);
        }catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}
