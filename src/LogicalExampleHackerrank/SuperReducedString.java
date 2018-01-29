package LogicalExampleHackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by sdodia on 1/24/18.
 */
public class SuperReducedString {
    static String super_reduced_string(String s){
        Stack<Character> st = new Stack<>();
        for (char c:s.toCharArray()) {
            if(!st.isEmpty() && c == st.peek()){
                st.pop();
            }else {
                st.push(c);
            }
        }

        String res = "";
        if(st.isEmpty()){
           return "Empty String";
        }else {
            for (char c:st) {
                res += c;
            }
            return res;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}
