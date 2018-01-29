package LogicalExamples;

/**
 * Created by sdodia on 6/6/17.
 */
public class Palindrome {
    public boolean revstrcheck(String a){
        char[] tmp = a.toCharArray();
        String res = "";
        for(int i = a.length()-1; i>=0; i--){
            res += tmp[i];
        }

        boolean b = false;
        if(res.toLowerCase().equals(a.toLowerCase())){
            b = true;
        }
        return b;
    }

    boolean testIt(String s, int k) {
        if (s.length() <= 1) {
            return true;
        }

        while (s.charAt(0) == s.charAt(s.length()-1)) {
            s = s.substring(1, s.length()-1);

            if (s.length() <= 1) {
                return true;
            }
        }

        if (k == 0) {
            return false;
        }

        return testIt(s.substring(0, s.length() - 1), k - 1) || testIt(s.substring(1, s.length()), k - 1);
    }

    public static void main(String args[]){
        Palindrome p1 = new Palindrome();
        int k = 1;

        String m = "madam";
        System.out.println("String m status of Palindrome: "+p1.revstrcheck(m));

        String n = "Sagas";
        System.out.println("Value of K: "+k);
        System.out.println("String n status of K-Palindrome: "+p1.revstrcheck(n));
    }
}
