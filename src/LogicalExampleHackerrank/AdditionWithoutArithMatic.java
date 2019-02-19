package LogicalExampleHackerrank;

import java.io.*;
public class AdditionWithoutArithMatic {

    public static void main(String args[]){
        int a = 110;
        int b = 294;

        while(b != 0) {
            int carry = a & b;
            System.out.println(carry);

            a = a ^ b;
            System.out.println(a);

            b = carry << 1;
            System.out.println(b);
        }

        System.out.println(a);
    }
}
