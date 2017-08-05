package Overloading1;

/**
 * Created by sdodia on 12/29/16.
 */
public class MyClass {
    int height;

    MyClass(){
        System.out.println("Bricks");
        int height = 0;
    }

    MyClass( int i){
        System.out.println("Building a new house which is "+i+" taller!");
        int height = 1;
    }

    void info(){
        System.out.println("House is "+height+" feet tall!");
    }

    void info(String s){
        System.out.println(s + " House is "+height+" feet tall!");
    }
}
