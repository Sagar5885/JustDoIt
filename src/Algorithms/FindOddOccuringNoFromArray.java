package Algorithms;

import java.util.ArrayList;
import java.util.List;

public class FindOddOccuringNoFromArray {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,3,2,1,2,3,2,3};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr){
        List<Integer> res = new ArrayList<>();
        for (int i : arr) {
            if(res.contains(i)){
                res.remove(new Integer(i));
            }else {
                res.add(i);
            }
        }

        return res.get(0);
    }
}
