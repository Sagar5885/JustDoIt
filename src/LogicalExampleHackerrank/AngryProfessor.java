package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/25/17.
 */
public class AngryProfessor {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int total = 0;
            for(int j=0; j<n; j++){
                int tmp = sc.nextInt();
                if(tmp <= 0){
                    total++;
                }
            }
            if(total >= k){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}
