package Algorithms.RecursionExample;

/**
 * Created by sdodia on 9/2/17.
 */
public class RecursionExample4 {
    static int n1=0,n2=1,n3=0;
    public static void printFibo(int count){
        if(count>0){
            n3 = n1+n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibo(count-1);
        }
    }

    public static int printFibo2(int count){
        if(count == 0){
            return 0;
        }
        else if(count == 1){
            return 1;
        }
        return printFibo2(count - 1) + printFibo2(count - 2);
    }

    public static int totalFibo(int count){
        if(count <= 1){
            return count;
        }
        return totalFibo(count - 1) + totalFibo(count - 2);
    }

    public static void main(String args[]){
        int count = 15;
        //System.out.print(n1+" "+n2);
        //printFibo(count);
        for (int i=0; i<count; i++) {
            System.out.print(printFibo2(i)+" ");
        }

        System.out.println();
        System.out.println(totalFibo(count));
    }
}
