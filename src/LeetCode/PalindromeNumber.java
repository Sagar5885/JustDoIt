package LeetCode;

public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        try {
            if (x >= 0) {
                String s = String.valueOf(x);
                if (s.length() > 1) {
                    if(s.equals(reverseStr(s))){
                        return true;
                    }else {
                        return false;
                    }
                } else {
                    return true;
                }
            } else {
                return false;
            }
        }catch(Exception ex){
            return false;
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
        System.out.println(isPalindrome(0));
    }
}
