package LogicalExampleHackerrank.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/28/17.
 */
public class CommonChild {
    static int commonChild(String s1, String s2){
        int res = 0;

        return res;
    }

    static int child(String str1, String str2){
        int L[][] = new int[str1.length()+1][str2.length()+1];
        for(int i=0;i<=str1.length();i++){
            for(int j=0;j<=str2.length();j++){
                if(i==0 || j==0)
                    L[i][j]=0;
                else if(str1.charAt(i-1)==str2.charAt(j-1)){
                    L[i][j] = L[i-1][j-1]+1;
                }
                else{
                    L[i][j] = Math.max(L[i-1][j],L[i][j-1]);
                }
            }
        }
        return L[str1.length()][str2.length()];
    }

    static List<Character> commons(String s1, String s2){
        List<Character> list = new ArrayList<>();

        for(int i=0; i<s1.length(); i++){
            if(s2.contains(s1.charAt(i)+"")){
                list.add(s1.charAt(i));
            }
        }

        return list;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = in.next();
        int result = child(s1, s2);
        System.out.println(result);
    }
}
