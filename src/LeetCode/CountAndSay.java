package LeetCode;

public class CountAndSay {
    public static String countAndSay(int n) {
        String res = "1";
        if(n<=0){
            return "";
        }
        while(n>1){
            StringBuilder cur = new StringBuilder();
            for(int i=0; i<res.length(); i++){
                int count = 1;
                while(i+1<res.length() && res.charAt(i) == res.charAt(i+1)){
                    ++count;
                    ++i;
                }
                cur.append(count).append(res.charAt(i));
            }
            res = cur.toString();
            --n;
        }

        return res;
    }

    public static void main(String args[]){
        System.out.println(countAndSay(2));
    }
}
