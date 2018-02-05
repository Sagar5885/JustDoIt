package FBLogicalExamples;

import java.util.Scanner;

/**
 * Created by sdodia on 2/3/18.
 */
public class StringToInteger {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str+" Equivalent no is: "+strToint(str));
    }

    public static int strToint(String str){
        int res = 0;

        char[] chstr = str.toCharArray();
        for(int i=0; i<str.length(); i++){
            res += Character.getNumericValue(chstr[str.length()-1-i]) * Math.pow(10, i);
        }

        if(res < 0){
            res = (int) Math.pow(10, str.length()-1) + res;
        }

        return res;
    }
}
