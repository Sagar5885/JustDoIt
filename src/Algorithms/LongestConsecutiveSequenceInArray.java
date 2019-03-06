package Algorithms;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LongestConsecutiveSequenceInArray {
    public static void main(String args[]){
        int[] arr = {2,1,6,9,4,3};
        System.out.println(solution(arr));
    }

    public static int solution(int[] arr){
        int longest = 0;

        Map<Integer, Boolean> mp = new HashMap<>();
        for (int i : arr) {
            mp.put(i, true);
        }

        Iterator it = mp.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry entry = (Map.Entry) it.next();
            //System.out.println(entry.getKey() + " = " + entry.getValue());
            if(!mp.containsKey((Integer) entry.getKey() - 1)){
                int current = (int) entry.getKey();
                int count = 1;
                while (mp.containsKey((Integer) entry.getKey() + 1)){
                    current++;
                    count++;
                }
                longest = Math.max(longest, count);
            }
            it.remove();
        }

        return longest;
    }
}
