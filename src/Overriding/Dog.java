package Overriding;

/**
 * Created by sdodia on 12/29/16.
 */
public class Dog extends Animal{

    public void move(){
        super.move();
        System.out.println(s + " Dog run!");
    }
}
