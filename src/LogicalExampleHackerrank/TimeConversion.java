package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/22/17.
 */
public class TimeConversion {
    static String timeConversion(String s) {
        if(s.contains(":") && !s.isEmpty() && s != null)
        if(s.contains("AM") || s.contains("am")){
            return s.substring(0, (s.length()-2));
        }else if(s.contains("PM") || s.contains("pm")){
            String tmp = s.substring(0,2);
            if(tmp.contains(":")){
                tmp = ""+tmp.charAt(0);
            }
            Integer hour = Integer.parseInt(tmp);
            hour += 12;
            if(hour == 24){
                hour = 00;
            }
            String res = hour.toString();

            String t1 = "";
            if (s.substring(0,2).contains(":")) {
                t1 = s.substring(1, s.length()-2);
            }else{
                t1 = s.substring(2, s.length()-2);
            }

            String respm = res + t1;
            return respm;
        }else {
            return "Input String of Time is Invalid!";
        }
        else {
            return "Input String of Time is Invalid!";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
