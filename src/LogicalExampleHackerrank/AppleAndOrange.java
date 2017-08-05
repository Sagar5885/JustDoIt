package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/22/17.
 */
public class AppleAndOrange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        int appres=0;
        int orgres=0;

        for (int i:apple) {
            if(a+i>=7 && a+i<=11){
                appres++;
            }
        }

        for (int i:orange) {
            if(a+i>=7 && a+i<=11){
                orgres++;
            }
        }

        System.out.println(appres);
        System.out.println(orgres);
    }
}
