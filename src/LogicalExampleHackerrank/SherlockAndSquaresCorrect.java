package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/27/17.
 */
public class SherlockAndSquaresCorrect {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(Math.max(0, sqrtToFloor(B) - sqrtToCeil(A) + 1));
        }
    }

    static int sqrtToNearest(int number) {
        return (int) Math.round(Math.sqrt(number));
    }

    static int sqrtToFloor(int number) {
        int result = sqrtToNearest(number);
        if (result * result > number) {
            result--;
        }
        return result;
    }

    static int sqrtToCeil(int number) {
        int result = sqrtToNearest(number);
        if (result * result < number) {
            result++;
        }
        return result;
    }
}
