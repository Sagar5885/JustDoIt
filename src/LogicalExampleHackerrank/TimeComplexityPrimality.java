package LogicalExampleHackerrank;

import java.util.Scanner;

public class TimeComplexityPrimality {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int p = in.nextInt();
         for (int a0 = 0; a0 < p; a0++) {
             int n = in.nextInt();
             String res = "Prime";

             if(n == 1){
                 res = "Not prime";
             }else {
                 int i = 2;
                 while(i*i <=n){
                     if(n%i == 0){
                         res = "Not prime";
                     }
                     i++;
                 }
             }

             System.out.println(res);
         }
     }
}
