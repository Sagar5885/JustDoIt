/**
 * Created by sdodia on 5/31/17.
 */
public class MyFirstLamdaEx {

    public static void main(String args[]){

        //None lamda implementation
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In run method, without lambda expression");
            }
        }).start();

        //Using lamda expression
        new Thread(() -> System.out.println("In run method, lambda expression")).start();
    }
}
