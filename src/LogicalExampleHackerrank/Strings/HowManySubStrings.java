package LogicalExampleHackerrank.Strings;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Created by sdodia on 9/20/17.
 */
public class HowManySubStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int q = in.nextInt();
        String s = in.next();
        for(int a0 = 0; a0 < q; a0++){
            int left = in.nextInt();
            int right = in.nextInt();
            if(left == right){
                System.out.println(1);
            }else{
                String str = s.substring(left,right+1);
                System.out.println(countofsubstr(str));
            }
        }
    }
    public static int countofsubstr(String str){
        Set<String> setstr = new HashSet<>();

        for(int i=0; i<=str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                setstr.add(str.substring(i,j));
            }
        }
        return setstr.size();
    }
}
