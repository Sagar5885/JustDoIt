package LeetCode;

public class LongestSubstringWithoutRepeatingCharacters {
    public static int sol(String s){
        String tmp = "";
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(!tmp.contains(s.charAt(i)+"")) {
                tmp += s.charAt(i);
            }else {
                if(tmp.length()>res){
                    res = tmp.length();
                }
                tmp = tmp.substring(tmp.indexOf(s.charAt(i))+1, tmp.length())+s.charAt(i);
            }
        }
        if(tmp.length()>res){
            res = tmp.length();
        }
        return res;
    }

    public static void main(String args[]){
        System.out.println(sol("pwwkew"));//aabaab!bb, pwwkew, bbbb, abcabcbb
    }
}
