package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 7/26/17.
 */
public class AppendAndDelete {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int k = in.nextInt();

        if(s.equals(t)){
            if(k%2==0){
                System.out.println("YES");
            }else {
                if(k>=s.length()+t.length()){
                    System.out.println("YES");
                }else {
                    System.out.println("NO");
                }
            }
        }else {
            StringBuffer s1 = new StringBuffer();
            s1.append(s);
            int i=0;
            while (!t.contains(s1)){
                s1.deleteCharAt(s1.length()-1);
                i++;
                if(i == s1.length()){
                    break;
                }
            }
            int i1 = t.length() - s1.length();
            if(i+i1<=k){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }
        }
    }
}
