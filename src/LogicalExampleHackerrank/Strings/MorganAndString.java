package LogicalExampleHackerrank.Strings;

import java.util.Scanner;

/**
 * Created by sdodia on 9/7/17.
 */
public class MorganAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<t; i++){
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();

            System.out.println(lexicographicalstr1(s1, s2));
        }
    }

    public static String lexicographicalstr(String s1, String s2){
        StringBuffer sb = new StringBuffer();

        int i = 0;
        int j = 0;
        while (true){
            if(s1.charAt(i) < s2.charAt(j)){
                sb.append(s1.charAt(i));
                i++;
                if(i == s1.length()){
                    break;
                }
            }else {
                sb.append(s2.charAt(j));
                j++;
                if(j == s2.length()){
                    break;
                }
            }
        }

        if(i != s1.length()){
            sb.append(s1.substring(i, s1.length()));
        }
        if(j != s2.length()){
            sb.append(s2.substring(j, s2.length()));
        }

        return sb.toString();
    }

    public static String lexicographicalstr1(String s1, String s2){
        int i = 0, j = 0;
        StringBuffer sb = new StringBuffer();

        while(i < s1.length() && j < s2.length()) {
            if (s1.charAt(i) < s2.charAt(j)) {
                sb.append(s1.charAt(i++));
            } else if (s1.charAt(i) > s2.charAt(j)) {
                sb.append(s2.charAt(j++));
            } else {
                int x = i, y = j;
                char a = s1.charAt(i);
                for(; x < s1.length() && y < s2.length(); x++, y++) {
                    if (s1.charAt(x) != s2.charAt(y)) {
                        break;
                    } else if (s1.charAt(x) > a) {
                        sb.append(s1.substring(i, x)).append(s2.substring(j, y));
                        i = x; j = y;
                        a = s1.charAt(x);
                    }
                }

                if (x == s1.length()) {
                    sb.append(s2.charAt(j));
                    j++;
                } else if (y == s2.length()) {
                    sb.append(s1.charAt(i));
                    i++;
                } else {
                    if (s1.charAt(x) < s2.charAt(y)) {
                        sb.append(s1.charAt(i));
                        i++;
                    } else {
                        sb.append(s2.charAt(j));
                        j++;
                    }
                }
            }
        }

        return sb.append(s1.substring(i)).append(s2.substring(j)).toString();
    }
}
