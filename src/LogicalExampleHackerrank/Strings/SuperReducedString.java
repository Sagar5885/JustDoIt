package LogicalExampleHackerrank.Strings;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sdodia on 8/20/17.
 */
public class SuperReducedString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!stack.isEmpty() && ch == stack.peek()) {
                stack.pop();
            } else {
                stack.push(ch);
            }
        }

        if (stack.isEmpty()) {
            System.out.println("Empty String");
        } else {
            for (char ch : stack) {
                System.out.print(ch);
            }
        }

    }
}
