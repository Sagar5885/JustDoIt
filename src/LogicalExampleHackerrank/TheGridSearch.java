package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 8/11/17.
 */
public class TheGridSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }

            if(checkAll(G, P)){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }

    public static int[] check1st(String[] G, String[] P){
        int res[] = new int[2];

        for (int i=0; i<G.length; i++) {
            if(G[i].contains(P[0])){
                res[0] = i;
                res[1] = G[i].indexOf(P[0]);
            }
        }
        return res;
    }

    public static boolean checkAll(String[] G, String[] P){
        int[] tmp = check1st(G, P);
        int start = tmp[0];
        int index = tmp[1];
        if(start > 0){
            for(int i=0; i<P.length; i++){
                if((G[start+i].contains(P[i])) && (G[start+i].indexOf(P[i]) == index)){

                }else {
                    return false;
                }
            }
        }else {
            return false;
        }
        return true;
    }
}
