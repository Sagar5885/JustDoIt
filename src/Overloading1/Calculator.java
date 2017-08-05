package Overloading1;

/**
 * Created by sdodia on 12/29/16.
 */
public class Calculator {

    void Sum(int a, int b) { System.out.println("Two Integers: "+(a+b)); }
    void Sum(int a, int b, int c) { System.out.println("Three Integers: "+(a+b+c)); }

    void Mul(int a, int b) { System.out.println("Two Integers: "+a*b); }
    void Mul(int a, int b, int c) { System.out.println("Three Integers: "+a*b*c); }

    void Div(int a, int b) { System.out.println(a/b); }

    void Mod(int a, int b) { System.out.println(a%b); }
}
