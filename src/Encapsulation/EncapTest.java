package Encapsulation;

/**
 * Created by sdodia on 12/30/16.
 */
public class EncapTest {

    private String Name;
    private String idNum;
    private int age;

    public String getName() {
        return Name;
    }

    public String getIdNum() {
        return idNum;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setIdNum(String idNum) {
        this.idNum = idNum;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
