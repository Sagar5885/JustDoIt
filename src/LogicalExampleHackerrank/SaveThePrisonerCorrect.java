package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/29/17.
 */
public class SaveThePrisonerCorrect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for (int tc = 0; tc < T; tc++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int S = sc.nextInt();

            System.out.println((S + M - 2) % N + 1);
        }

        sc.close();
    }
}
