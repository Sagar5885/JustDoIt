package LogicalExamples;

import java.awt.*;

/**
 * Created by sdodia on 5/28/17.
 */
public class MyFiboNacci {
    public int[] fib(int a){
        int[] result = new int[a];
        result[0] = 0;
        result[1] = 1;
        for(int i=2; i<a; i++){
            result[i] = result[i-1] + result[i-2];
        }
        return result;
    }

    public static void main(String args[]){
        MyFiboNacci mf = new MyFiboNacci();
        mf.fib(15);
        System.out.println("Fibonacci Seriese:");
        for(int i=0; i<mf.fib(15).length; i++){
            System.out.print(mf.fib(15)[i]+" ");
        }
    }
}
