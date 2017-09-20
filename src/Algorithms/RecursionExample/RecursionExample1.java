package Algorithms.RecursionExample;

/**
 * Created by sdodia on 9/2/17.
 */
public class RecursionExample1 {
    public static void p(){
        System.out.println("Hello Recursion");
        p();
    }

    public static void main(String args[]){
        p();
    }
}
