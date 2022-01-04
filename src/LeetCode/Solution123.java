package LeetCode;

import java.util.*;

public class Solution123 {
    public static String solutionEhealth(){
        Map<String, Integer> mp = new HashMap<>();
        String res = "";
        int Max_count = 1;
        Map<String, String> mpFeed = new HashMap<>();
        mpFeed.put("stephen.marquard@uct.ac.za Sat May 10 09:14:16 2020", "Lead form for is not getting created");
        mpFeed.put("louis@media.berkeley.edu Sun May 11 09:14:26 2020", "Comparison of quotes is not showing");
        mpFeed.put("zqian@umich.edu Mon May 12 09:14:36 2020", "Medicare supplements pricing is not opening on chrome browser");
        mpFeed.put("ray@media.wisconsin.edu Tue May 13 09:14:46 2020", "Payment processing not confirmed after checkout");
        mpFeed.put("cwen@iupui.edu Tue May 14 09:14:56 2020", "Lead form for is not getting created");
        for(Map.Entry<String,String> entry : mpFeed.entrySet()){
            if(mp.containsKey(entry.getValue())){
                int tmp1 = mp.get(entry.getValue());
                tmp1++;
                if(tmp1 > Max_count){
                    Max_count = tmp1;
                    res = entry.getValue();
                }
            }else{
                mp.put(entry.getValue(), 1);
            }
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(solutionEhealth());
    }
}
