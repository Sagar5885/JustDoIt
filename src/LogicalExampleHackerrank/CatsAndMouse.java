package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/24/17.
 */
public class CatsAndMouse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();

            int xz = Math.abs(z-x);
            int yz = Math.abs(z-y);
            if(xz<yz){
                System.out.println("Cat A");
            }else if(xz>yz){
                System.out.println("Cat B");
            }else {
                System.out.println("Mouse C");
            }
        }
    }
}
