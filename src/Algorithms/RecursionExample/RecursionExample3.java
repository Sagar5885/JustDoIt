package Algorithms.RecursionExample;

/**
 * Created by sdodia on 9/2/17.
 */
public class RecursionExample3 {
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }else {
            return (n * factorial(n-1));
        }
    }

    public static void main(String args[]){
        System.out.println("Factorial of 5: "+factorial(6));
    }
}
