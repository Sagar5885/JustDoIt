package String;

import java.util.Scanner;

/**
 * Created by sdodia on 7/4/17.
 */
public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length() == b.length()){
            for (char c:a.toLowerCase().toCharArray()) {
                if(!(countOccurrences(b.toLowerCase(), c) == countOccurrences(a.toLowerCase(), c))){
                    return false;
                }else {
                    return true;
                }
            }
        }else {
            return false;
        }
        return false;
    }

    public static int countOccurrences(String haystack, char needle)
    {
        int count = 0;
        for (int i=0; i < haystack.length(); i++)
        {
            if (haystack.charAt(i) == needle)
            {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
