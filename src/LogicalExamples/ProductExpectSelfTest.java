package LogicalExamples;

import org.testng.annotations.Test;

/**
 * Created by sdodia on 6/4/17.
 */
public class ProductExpectSelfTest {
    @Test
    public void test1(){
        ProductExpectSelf pes = new ProductExpectSelf();
        int[] a = {37, 50, 50, 6, 8, 54, 7, 64, 2, 64, 67, 59, 22, 73, 33, 53, 43, 77, 56, 76, 59, 96, 64, 100, 89, 38, 64, 73, 85, 96, 65, 50, 62, 4, 82, 57, 98,
                61, 92, 55, 80, 53, 80, 55, 94, 9, 73, 89, 83, 80};
        int m = 67;
        System.out.println("Actual Product Expect Self Solution: "+pes.actualrtn(a, m));

        int[] res2 = pes.productExceptSelf2(a);
        System.out.println("");
        for (int i:res2) {
            System.out.print(i+" ");
        }

//        int[] res1 = pes.productExceptSelf1(a);
//        System.out.println("");
//        for (int i:res1) {
//            System.out.print(i+" ");
//        }
    }

    @Test
    public void test2(){
        ProductExpectSelf pes = new ProductExpectSelf();
        int[] a = {52, 40, 2, 78, 49, 70, 39, 26, 58, 58, 52, 93, 80, 64, 33, 72, 29, 17, 81, 83, 48, 9, 49, 82, 67, 76, 54, 64, 6, 48, 16, 82, 67, 56, 32, 98, 14,
                47, 48, 26, 56, 54, 80, 13, 32, 18, 4, 73, 45, 65};
        int m = 530;
        System.out.println("Actual Product Expect Self Solution: "+pes.actualrtn(a, m));

        int[] res2 = pes.productExceptSelf2(a);
        System.out.println("");
        for (int i:res2) {
            System.out.print(i+" ");
        }

        int[] res1 = pes.productExceptSelf1(a);
        System.out.println("");
        for (int i:res1) {
            System.out.print(i+" ");
        }
    }
}
