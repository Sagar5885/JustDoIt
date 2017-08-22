package LogicalExamples;

import java.util.Scanner;

/**
 * Created by sdodia on 8/15/17.
 */
public class EbayIntQuestion1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "1";
        System.out.println(s);
        for(int i=0; i<n; i++){
            s = check(s);
            System.out.println(s);
        }
    }

    public static String check(String s){
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        char tmp = ch[0];
        int in = 1;
        if(s.length()>1) {
            for (int i = 1; i < s.length(); i++) {
                if (ch[i] == tmp) {
                    in++;
                } else {
                    sb.append(in);
                    sb.append(tmp);
                    tmp = ch[i];
                    in = 1;
                }
            }
            sb.append(in);
            sb.append(tmp);
        }else {
            sb.append("1");
            sb.append(s);
        }

        return sb.toString();
    }
}
