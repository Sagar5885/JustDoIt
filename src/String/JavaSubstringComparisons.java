package String;

import java.util.Scanner;

/**
 * Created by sdodia on 7/4/17.
 */
public class JavaSubstringComparisons {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        String[] strArr = new String[s.length()+1-k];

        for(int i=0; i<s.length()+1-k; i++){
            strArr[i] = s.substring(i, i+3);
        }

        smallest = strArr[0];
        largest = strArr[0];
        for (String s1:strArr) {
            int tmp1 = largest.compareTo(s1);
            int tmp2 = smallest.compareTo(s1);
            if(!(tmp1 > 0)){
                largest = s1;
            }
            if(tmp2 > 0){
                smallest = s1;
            }
        }

        return smallest + "\n" + largest;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
