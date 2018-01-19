package LogicalExampleHackerrank.Sorting;

import java.util.*;

/**
 * Created by sdodia on 9/21/17.
 */
public class ClosestNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i=0; i<n; i++){
            ar[i] = sc.nextInt();
        }

        Arrays.sort(ar);

        //Find lowest diff 1st
        List<Pair> listpair = new ArrayList<Pair>();
        int min = Math.abs(ar[0] - ar[1]);
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if( Math.abs(ar[i] - ar[j]) < min){
                    min = Math.abs(ar[i] - ar[j]);
                    listpair.clear();
                    listpair.add(new Pair(ar[i], ar[j]));
                }else if(Math.abs(ar[i] - ar[j]) == min){
                    listpair.add(new Pair(ar[i], ar[j]));
                }
            }
        }

        //Now we have lowest diff as min param find total no of pairs have this diff
//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j<n; j++){
//                if( Math.abs(ar[i] - ar[j]) == min){
//                    System.out.print(ar[i] + " " + ar[j]);
//                    System.out.print(" ");
//                }
//            }
//        }

        for (Pair p:listpair) {
            System.out.print(p.x + " " + p.y + " ");
        }
    }

    public static class Pair{
        public int x;
        public int y;
        public Pair(int x, int y){
            this.x = x;
            this.y = y;
        }
    }
}
