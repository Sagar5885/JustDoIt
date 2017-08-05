package LogicalExampleHackerrank;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by sdodia on 7/5/17.
 */
public class BigDecimalOrdering {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

//        //Input
//        Scanner userInput = new Scanner(System.in);
//        int arraySize = Integer.parseInt(userInput.nextLine());
//        String [] array = new String[arraySize];
//        for (int i = 0; i < arraySize; i++) {
//            array[i] = userInput.nextLine();
//        }

        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n+2];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        //Sorting (Selection)
        for (int i = 0; i < (s.length - 2); i++) {
            for (int k = (i + 1); k < s.length-2; k++) {
                if (new BigDecimal(s[i]).compareTo(new BigDecimal(s[k])) < 0) {
                    String tempValue = s[i];
                    s[i] = s[k];
                    s[k] = tempValue;
                }
            }
        }

        for (int i = 0; i < s.length-2; i++) {
            System.out.println(s[i]);
        }
    }
}
