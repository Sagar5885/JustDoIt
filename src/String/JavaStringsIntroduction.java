package String;

import java.util.Scanner;

/**
 * Created by sdodia on 7/4/17.
 */
public class JavaStringsIntroduction {
    public static void JavaStrIntro(String a, String b){
        int res1 = a.length()+b.length();
        int tmp = a.compareTo(b);
        String res2 = "";
        if(tmp > 0){
            res2 = "No";
        }else if(tmp == 0){
            res2 = "Yes/No";
        }else{
            res2 = "Yes";
        }

        String res3 = (a.charAt(0)+"").toUpperCase()+a.substring(1)+" "+(b.charAt(0)+"").toUpperCase()+b.substring(1);

        //Print all
        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        JavaStrIntro(A, B);
        /* Enter your code here. Print output to STDOUT. */

    }
}
