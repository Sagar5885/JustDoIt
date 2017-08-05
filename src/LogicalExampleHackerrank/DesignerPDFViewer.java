package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sdodia on 7/25/17.
 */
public class DesignerPDFViewer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();

        Map<Character, Integer> aToz = new HashMap<Character, Integer>();
        aToz.put('a', 1);
        aToz.put('b', 2);
        aToz.put('c', 3);
        aToz.put('d', 4);
        aToz.put('e', 5);
        aToz.put('f', 6);
        aToz.put('g', 7);
        aToz.put('h', 8);
        aToz.put('i', 9);
        aToz.put('j', 10);
        aToz.put('k', 11);
        aToz.put('l', 12);
        aToz.put('m', 13);
        aToz.put('n', 14);
        aToz.put('o', 15);
        aToz.put('p', 16);
        aToz.put('q', 17);
        aToz.put('r', 18);
        aToz.put('s', 19);
        aToz.put('t', 20);
        aToz.put('u', 21);
        aToz.put('v', 22);
        aToz.put('w', 23);
        aToz.put('x', 24);
        aToz.put('y', 25);
        aToz.put('z', 26);

        char[] wordch = word.toCharArray();
        int max = 0;
        for (char c:wordch) {
            int tmp = h[aToz.get(c)-1];
            if(tmp > max){
                max = tmp;
            }
        }

        System.out.print(max*wordch.length);
    }
}
