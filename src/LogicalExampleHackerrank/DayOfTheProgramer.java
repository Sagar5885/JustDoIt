package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/20/17.
 */
public class DayOfTheProgramer {
    static String solve(int year){
        String res = "";
        if(((year%4==0) && (year%100!=0)) || (year%400==0)){
            res = "12.09."+String.valueOf(year);
        }else {
            res = "13.09."+String.valueOf(year);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        String result = solve(year);
        System.out.println(result);
    }
}
