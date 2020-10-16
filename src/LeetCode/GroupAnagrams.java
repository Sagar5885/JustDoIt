package LeetCode;

import java.util.*;

public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null){
            return Collections.EMPTY_LIST;
        }

        Map<String, List<String>> mp = new HashMap<>();

        for(String str:strs){
            String t = sort(str);
            if(!mp.containsKey(t)){
                mp.put(t, new ArrayList<>());
            }
            mp.get(t).add(str);
        }

        return new ArrayList<>(mp.values());
    }

    private static String sort(String str) {
        char[] a = str.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }

    public static void main(String args[]){
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(strs));
    }
}
