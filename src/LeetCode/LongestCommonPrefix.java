package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestCommonPrefix {
    public static String soluction3(String[] strs) {
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }

    public static void main(String args[]){
        String[] ls1 = {"flower", "flow", "flight"}; //{"ca", "a"}, {"flower", "flow", "flight"}

        String tmp = soluction3(ls1);
        System.out.println(tmp);
    }
}
