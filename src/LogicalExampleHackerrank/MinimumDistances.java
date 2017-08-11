package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * Created by sdodia on 8/8/17.
 */
public class MinimumDistances {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }

        HashMap<Integer,Integer> distances = new HashMap<>();

        int minDistance = -1;

        for(int i = 0; i < n; i++)
        {
            if(distances.containsKey(A[i]))
            {
                int distance = Math.abs(distances.get(A[i]) - i);

                if( distance < minDistance || minDistance == -1)
                {
                    minDistance = distance;
                }

                distances.put(A[i], i);
            }
            else
            {
                distances.put(A[i], i);
            }
        }

        System.out.println(minDistance);


//        List<Integer> l1 = new ArrayList<Integer>();
//        for(int i=0; i<n-1; i++){
//            for(int j=i; j<n; j++){
//                if(i!=j){
//                    if(A[i] == A[j]){
//                        l1.add(j-i);
//                    }
//                }
//            }
//        }
//
//        if(l1.size() > 0) {
//            System.out.println(l1.stream().min(Integer::min).get());
//        }else {
//            System.out.println(-1);
//        }
    }
}
