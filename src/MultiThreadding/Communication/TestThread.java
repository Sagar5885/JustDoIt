package MultiThreadding.Communication;

/**
 * Created by sdodia on 3/26/17.
 */
public class TestThread {
    public static void main(String[] args) {
        Chat m = new Chat();
        new T1(m);
        new T2(m);
    }
}
