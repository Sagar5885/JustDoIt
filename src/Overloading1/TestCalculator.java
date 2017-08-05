package Overloading1;

/**
 * Created by sdodia on 12/29/16.
 */
public class TestCalculator {

    public static void main (String[] args){
        Calculator cal = new Calculator();

        cal.Sum(10,20);
        cal.Sum(10,20,30);

        cal.Mul(10,20);
        cal.Mul(10,20,30);

        cal.Div(20,10);
        cal.Mod(21,10);
    }
}
