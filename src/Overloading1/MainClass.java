package Overloading1;

/**
 * Created by sdodia on 12/29/16.
 */
public class MainClass {

    public static void main(String[] args){
        MyClass t = new MyClass(0);
        t.info();
        t.info("Sagar's");

        //Overloaded Custructor
        new MyClass();
    }
}
