package LogicalExampleLeetCode;

/**
 * Created by sdodia on 6/27/17.
 */
public class ClosestPalindrome {
    public String nearestPalindromic(String n) {
        if(n.length()>1) {
            Integer n1 = Integer.parseInt(n);
            Integer tmp1 = n1;
            Integer tmp2 = n1;

            String tmpres1 = "";
            String tmpres2 = "";
            while (true) {
                tmp1--;
                String tmp1s = String.valueOf(tmp1);
                if (tmp1s.equals(reverseStr(tmp1s))) {
                    tmpres1 = tmp1s;
                    break;
                }
            }

            while (true) {
                tmp2++;
                String tmp1s = String.valueOf(tmp2);
                if (tmp1s.equals(reverseStr(tmp1s))) {
                    tmpres2 = tmp1s;
                    break;
                }
            }

            if ((n1 - Integer.parseInt(tmpres1)) > (Integer.parseInt(tmpres2) - n1)) {
                return tmpres2;
            } else {
                return tmpres1;
            }
        }else {
            Integer n1 = Integer.parseInt(n);
            n1--;
            String res = String.valueOf(n1);
            return res;
        }
    }

    public String reverseStr(String a){
        char[] tmp = a.toCharArray();
        String res = "";
        for(int i = a.length()-1; i>=0; i--){
            res += tmp[i];
        }
        return res;
    }

    public static void main(String args[]){
        ClosestPalindrome cp = new ClosestPalindrome();
        String a1 = "123";
        System.out.println("Closest Palindrome for 123: "+cp.nearestPalindromic(a1));

        String a2 = "1";
        System.out.println("Closest Palindrome for 1: "+cp.nearestPalindromic(a2));

        String a3 = "11";
        System.out.println("Closest Palindrome for 11: "+cp.nearestPalindromic(a3));

        String a4 = "214748364";
        System.out.println("Closest Palindrome for 214748364: "+cp.nearestPalindromic(a4));

//        //Time out use case:
//        String a5 = "2147483647";
//        System.out.println("Closest Palindrome for 2147483647: "+cp.nearestPalindromic(a5));
    }
}
