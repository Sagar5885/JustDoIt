package LogicalExampleHackerrank.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class HackerRankInAString {
    public static void main(String[] args) {

        List<Character> chlst = new ArrayList<>();
        chlst.add('h'); chlst.add('a'); chlst.add('c'); chlst.add('k'); chlst.add('e');
        chlst.add('r'); chlst.add('r'); chlst.add('a'); chlst.add('n'); chlst.add('k');

        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            if(s.length()>=10) {
                if (check(s, chlst)) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }else {
                System.out.println("NO");
            }
        }
    }

    public static boolean check(String s, List<Character> chlst){
        boolean res = false;

        //StringBuilder sb = new StringBuilder();
        String sb = "";
        int li = 0;
        int chi = 0;

        while(s.length()>chi){
            if((chlst.get(li)+"").equalsIgnoreCase(s.charAt(chi)+"")){
                //sb.append(chlst.get(li));
                sb += chlst.get(li);
                li++;
            }
            chi++;
        }

        if(sb.equalsIgnoreCase("HackerRank")){
            res = true;
        }
        return res;
    }
}
