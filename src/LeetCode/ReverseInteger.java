package LeetCode;

public class ReverseInteger {
    public static int reverse(int x) {
        try {
            if (x > 0) {
                String s = String.valueOf(x);
                if (s.length() > 1) {
                    String tmp = reverseStr(s);
                    return Integer.parseInt(tmp);
                } else {
                    return x;
                }
            } else {
                String s = String.valueOf(x);
                if (s.length() > 2) {
                    String tmp = s.charAt(0) + reverseStr(s.substring(1, s.length()));
                    return Integer.parseInt(tmp);
                } else {
                    return x;
                }
            }
        }catch(Exception ex){
            return 0;
        }
    }

    public static String reverseStr(String s){
        String res = "";
        for(int i=s.length()-1; i>=0; i--){
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String args[]){
        int a = 1534236469;
        System.out.println(reverse(a));
    }
}
