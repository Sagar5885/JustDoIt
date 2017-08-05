package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 6/21/17.
 */
public class Staircase {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
            for(int i=0; i<n; i++){
                String tmp = "";
                for(int j=0; j<n-i; j++){
                    tmp += " ";
                }
                for(int j=0; j<=i; j++) {
                    tmp += "#";
                }
                System.out.println(tmp);
            }
    }
}
