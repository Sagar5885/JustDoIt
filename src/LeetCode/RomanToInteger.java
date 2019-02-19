package LeetCode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.abs;

public class RomanToInteger {

    public static int romanToInt(String s) {
        //Map of Data
        Map<Character, Integer> map = new HashMap<>();
        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int res = 0;
        for(int i=0; i<s.length(); i++){
            if((i+1 < s.length()) && (map.get(s.charAt(i)) < map.get(s.charAt(i+1)))){
                res = res + map.get(s.charAt(i+1)) - map.get(s.charAt(i));
                i++;
            }else{
                res = res + map.get(s.charAt(i));
            }
        }

        return res;
    }

    public static void main(String args[]){
        String s = "MCMXCIV";//MCMXCIV, III, IV
        System.out.println(romanToInt(s));
    }
}
