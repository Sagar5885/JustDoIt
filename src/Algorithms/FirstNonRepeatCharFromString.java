package Algorithms;

import java.util.HashMap;

public class FirstNonRepeatCharFromString {
    public static void main(String args[]){
        HashMap<Character, Integer> mp = new HashMap<>();
        String ip = "aaafcdcdf";
        char res = 0;
        
        for(char c: ip.toCharArray()){
            if(mp.containsKey(c)){
                int tmp = mp.get(c) + 1;
                mp.put(c, tmp);
            }else {
                mp.put(c, 1);
            }
        }
        
        for(int i = 0; i<ip.toCharArray().length; i++){
            if(mp.get(ip.charAt(i)) == 1){
                res = ip.charAt(i);
                break;
            }
        }
        
        System.out.println(res);
    }
}
