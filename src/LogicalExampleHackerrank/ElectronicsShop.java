package LogicalExampleHackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by sdodia on 7/24/17.
 */
public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int s){
        int tmp = -1;
        for (int i:keyboards) {
            for (int j:drives) {
                if(i+j>tmp && i+j <s){
                    tmp = i+j;
                }
            }
        }
        return tmp;
    }

    static int getMoneySpent1(int[] keyboards, int[] drives, int s) {
        int result = -1;

        Arrays.sort(drives);

        for (int keyboard : keyboards) {
            int index = Arrays.binarySearch(drives, s - keyboard);
            if (index < 0) {
                index = -1 - index - 1;
            }

            if (index >= 0) {
                result = Math.max(result, keyboard + drives[index]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] drives = new int[m];
        for(int drives_i=0; drives_i < m; drives_i++){
            drives[drives_i] = in.nextInt();
        }
        //  The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
        int moneySpent = getMoneySpent1(keyboards, drives, s);
        System.out.println(moneySpent);
    }
}
