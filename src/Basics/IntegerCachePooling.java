package Basics;

/**
 * Created by sdodia on 1/31/18.
 */
public class IntegerCachePooling {
    static int a = 1111;
    static {
        a = a-- - --a;
    }
    {a= a++ + ++a;}//This will not going to executed because its not static block

    public static void main(String args[]){
        System.out.println("Cache Pooling for interger equal or bellow 127: ");
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("Check i1 and i2 are equal or not: "+(i1 == i2));

        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("Check i3 and i4 are equal or not: "+(i3 == i4));

        Integer i5 = 125;
        Integer i6 = 125;
        System.out.println("Check i5 and i6 are equal or not: "+(i5 == i6));

        System.out.println("Same logic for character range is -127 to 127 but not applicable to Fload and Double.");

        System.out.println();
        System.out.println();

        System.out.println(Double.MIN_VALUE);
        System.out.println(Math.min(Double.MIN_VALUE, 0.0d));

        System.out.println();
        System.out.println();

        long lwithL = 1000 * 60 * 60 * 24 * 365L;
        long lwithoutL = 1000 * 60 * 60 * 24 * 365;

        System.out.println(lwithL);
        System.out.println(lwithoutL);

        System.out.println();
        System.out.println();
        System.out.println("Pring class's static variable a here: "+a);
    }
}
