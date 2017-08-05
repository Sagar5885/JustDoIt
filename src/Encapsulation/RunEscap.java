package Encapsulation;

/**
 * Created by sdodia on 12/30/16.
 */
public class RunEscap {
    public static void main(String[] args){
        EncapTest escap = new EncapTest();
        escap.setAge(31);
        escap.setIdNum("Sagar-1985");
        escap.setName("Sagar");

        System.out.print("Name: "+escap.getName()+ ", Age: "+escap.getAge());
    }
}
