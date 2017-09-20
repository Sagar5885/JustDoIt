package Algorithms.RecursionExample;

/**
 * Created by sdodia on 9/2/17.
 */
public class RecursionExample2 {
    static int count = 0;
    public static void p(){
        count++;
        if(count <= 5){
            System.out.println("Hello: "+count);
            p();
        }
    }
    public static void main(String args[]){
        p();
    }
}
