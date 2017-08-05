package Generic;

/**
 * Created by sdodia on 3/25/17.
 */
public class Box<T> {
    private T t;

    public void add(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }

    public static void main(String args[]){
        Box<Integer> intBox = new Box<Integer>();
        Box<String> strBox = new Box<String>();

        intBox.add(1);
        strBox.add("Sagar");

        System.out.println(intBox.get());
        System.out.println(strBox.get());

        intBox.add(new Integer(10));
        strBox.add(new String("Hello World"));

        System.out.printf("Integer Value :%d\n\n", intBox.get());
        System.out.printf("String Value :%s\n", strBox.get());
    }
}
