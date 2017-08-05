package LogicalExamples;

/**
 * Created by sdodia on 5/28/17.
 */
public class SwapTwoNo {

    public void Swaping(int a, int b){
        System.out.println("A: "+a);
        System.out.println("B: "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping: ");
        System.out.println("A: "+a);
        System.out.println("B: "+b);
    }

    public static void main(String args[]){
        SwapTwoNo sp = new SwapTwoNo();
        sp.Swaping(5, 6);
    }
}
