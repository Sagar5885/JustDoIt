package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LongestPalindromicSubstring {

    static String longestPalSubstr(String str) {
        if(str.isEmpty()){
            return "";
        }
        int n = str.length();
        boolean table[][] = new boolean[n][n];

        int maxLength = 1;
        for (int i = 0; i < n; ++i)
            table[i][i] = true;

        int start = 0;
        for (int i = 0; i < n - 1; ++i) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                table[i][i + 1] = true;
                start = i;
                maxLength = 2;
            }
        }

        for (int k = 3; k <= n; ++k) {

            for (int i = 0; i < n - k + 1; ++i)
            {
                int j = i + k - 1;

                if (table[i + 1][j - 1] && str.charAt(i) ==
                        str.charAt(j)) {
                    table[i][j] = true;

                    if (k > maxLength) {
                        start = i;
                        maxLength = k;
                    }
                }
            }
        }

        return str.substring(start, start + maxLength);
    }

    public static boolean isPelindrom(String s){
        if(reverseStr(s).equals(s)){
            return true;
        }else {
            return false;
        }
    }

    public static String reverseStr(String s){
        String res = "";
        for(int i=s.length()-1; i>=0; i--){
            res += s.charAt(i);
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(longestPalSubstr("cbbd"));//bb, ccc, b, babad, cbbd, abb
//civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth
    }

    public static String sol(String s){
        String res = "";

//        if(s.length()>1 && !isPelindrom(s)) {
//            for (int i = 0; i < s.length(); i++) {
//                String tmp1 = s.substring(0, s.length() - i);
//                String tmp2 = s.substring(i, s.length());
//
//                if (isPelindrom(tmp1) && (res.length() < tmp1.length())) {
//                    res = tmp1;
//                }
//
//                if (isPelindrom(tmp2) && (res.length() < tmp2.length())) {
//                    res = tmp2;
//                }
//
//                if(i<s.length()/2){
//                    String tmp3 = s.substring(i, s.length() - i);
//                    if (isPelindrom(tmp3) && (res.length() < tmp3.length())) {
//                        res = tmp3;
//                    }
//                }
//            }
//        }else {
//            return s;
//        }

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                String tmp = s.substring(i,j);
                if(isPelindrom(tmp) && tmp.length()>res.length()){
                    res = tmp;
                }
            }
        }

//        List<String> resl = getAllSubStrings(s);
//        for (String str:resl) {
//            if(isPelindrom(str) && str.length()>res.length()){
//                res = str;
//            }
//        }

        return res;
    }

    public static List<String> getAllSubStrings(String s){
        List<String> resl = new ArrayList<>();

        for(int i=0; i<s.length(); i++){
            for(int j=i+1; j<=s.length(); j++){
                resl.add(s.substring(i,j));
            }
        }

        return resl;
    }
}
