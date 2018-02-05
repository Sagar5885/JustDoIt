package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 1/30/18.
 */
public class KPalindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int k = sc.nextInt();

        if(kPalindrome(str, k)){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }

    public static boolean kPalindrome(String str, int k) {
        if(str.length() <= 1){
            return true;
        }
        while(str.charAt(0) == str.charAt(str.length()-1)){
            str = str.substring(1, str.length()-1);

            if(str.length() <= 1){
                return true;
            }
        }
        if(k == 0){
            return false;
        }
        return kPalindrome(str.substring(0, str.length()-1), k-1) || kPalindrome(str.substring(1, str.length()), k-1);
    }

}
