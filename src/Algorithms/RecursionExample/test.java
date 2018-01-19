package Algorithms.RecursionExample;

/**
 * Created by sdodia on 9/22/17.
 */
public class test {
    public static int fact1(int n){
        if(n==1){
            return 1;
        }else {
            return (n * fact1(n-1));
        }
    }

    public static void main(String args[]){
        System.out.println("Factorial of 5: "+fact1(5));
    }
}
