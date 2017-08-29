package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/26/17.
 */
public class RichieRich {
    static String richieRich(String s, int n, int k){
        String res = "";

        char[] ch = s.toCharArray();

        //find total min no of changes needed in string to make it palindrome
        int changes = 0;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            if (ch[i] != ch[j]) {
                changes++;
            }
        }

        if(changes > k){
            return "-1";
        }

        int extrak = k - changes;
        int i = 0;
        int j = ch.length - 1;
        for (; i <= j; i++, j--) {
            if (ch[i] != ch[j]) {
                char maxv = (char) Math.max(ch[i], ch[j]);
                if (maxv != '9' && extrak - 1 >= 0) {
                    ch[i] = '9';
                    ch[j] = '9';
                    extrak--;
                } else {
                    ch[i] = maxv;
                    ch[j] = maxv;
                    changes--;
                }
            } else {
                char maxChar = (char) Math.max(ch[i], ch[j]);
                if (maxChar != '9' && extrak - 2 >= 0) {
                    ch[i] = '9';
                    ch[j] = '9';
                    extrak -= 2;
                }
            }
        }

        if (extrak != 0 && i - 1 == j + 1) {
            ch[i - 1] = '9';
        }

        res = new String(ch);

        return res;
    }
    private static String largestPalindrome(String number, int k) {
        char[] chars = number.toCharArray();
        int minChange = 0;
        for (int i = 0, j = chars.length - 1; i < j; i++, j--) {
            if (chars[i] != chars[j]) {
                minChange++;
            }
        }
        if (minChange > k) {
            return "-1";
        }
        int changeBoth = k - minChange;
        int i = 0;
        int j = chars.length - 1;
        for (; i <= j; i++, j--) {
            if (chars[i] != chars[j]) {
                char maxChar = (char) Math.max(chars[i], chars[j]);
                if (maxChar != '9' && changeBoth - 1 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth--;
                } else {
                    chars[i] = maxChar;
                    chars[j] = maxChar;
                    minChange--;
                }
            } else {
                char maxChar = (char) Math.max(chars[i], chars[j]);
                if (maxChar != '9' && changeBoth - 2 >= 0) {
                    chars[i] = '9';
                    chars[j] = '9';
                    changeBoth -= 2;
                }
            }
        }
        if (changeBoth != 0 && i - 1 == j + 1) {
            chars[i - 1] = '9';
        }
        String palindrome = new String(chars);
        return palindrome;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        String number = in.next();
        System.out.println(richieRich(number,n, k));
    }

}
