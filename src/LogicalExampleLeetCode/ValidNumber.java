package LogicalExampleLeetCode;

/**
 * Created by sdodia on 6/26/17.
 */
public class ValidNumber {

    public static boolean isNumeric(String s)
    {
        if(s.charAt(s.length()-1)=='f' || s.charAt(s.length()-1)=='D' ){
            return false;
        }else
        {
            try {
                double d = Double.parseDouble(s);
            } catch (NumberFormatException nfe) {
                return false;
            }
            return true;
        }
    }

    public static void main(String args[]){
        String a1 = "2e10";
        String a2 = "1 a";
        String a3 = "abc";
        String a4 = "0";
        String a5 = "0.1";
        String a6 = "3";
        String a7 = "959440.94f";

        System.out.println("2e10 is VN or not: "+isNumeric(a1));
        System.out.println("1 a is VN or not: "+isNumeric(a2));
        System.out.println("abc is VN or not: "+isNumeric(a3));
        System.out.println("0 is VN or not: "+isNumeric(a4));
        System.out.println("0.1 is VN or not: "+isNumeric(a5));
        System.out.println("3 is VN or not: "+isNumeric(a6));
        System.out.println("959440.94f is VN or not: "+isNumeric(a7));

    }
}
