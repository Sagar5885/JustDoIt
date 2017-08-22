package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class CaesarCipher {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            sb.append(encrypt(ch, k));
        }

        System.out.println(sb);



//        StringBuilder sb = new StringBuilder();
//        char[] ch = s.toCharArray();
//        for (char c:ch) {
//            if(Character.isLetter(c)) {
//                int ascii = (int) c;
//                ascii = ascii + k;
//                if(Character.isUpperCase(c)) {
//                    if(ascii>=90){
//                        ascii = ascii - 90+64;
//                    }
//                    String tmp = Character.toString((char) ascii);
//                    sb.append(tmp);
//                }else {
//                    if(ascii>=122){
//                        ascii = ascii - 122+96;
//                    }
//                    String tmp = Character.toString((char) ascii);
//                    sb.append(tmp);
//                }
//            }else {
//                sb.append(c);
//            }
//        }
//
//        System.out.println(sb.toString());
    }

    private static char encrypt(char ch, int K) {
        if (!Character.isLetter(ch)) {
            return ch;
        }
        char base = Character.isLowerCase(ch) ? 'a' : 'A';
        return (char) ((ch - base + K) % 26 + base);
    }
}
