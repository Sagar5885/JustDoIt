package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/7/17.
 */
public class TaumAndBday {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();

            System.out.println(solve(b,w,x,y,z));
        }
    }

    public static long solve(long b, long w, long x, long y, long z){
        long res = b*x + w*y;
        if(x<y){
            long tmp1 = b*x + w*x + w*z;
            if(tmp1 < res){
                res = tmp1;
            }
        }
        if(x>y){
            long tmp1 = b*y + w*y + b*z;
            if(tmp1 < res){
                res = tmp1;
            }
        }
        return res;
    }
}
