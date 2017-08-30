package String;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by sdodia on 8/30/17.
 */
public class StringTokenizerExample {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        List<String> list = getTockens1(s);

        for (String str:list) {
            System.out.println(str);
        }

        System.out.println("Java 8 Implementation");

        List<String> list2 = getTockens2(s);

        for (String str:list2) {
            System.out.println(str);
        }
    }

    public static List<String> getTockens1(String s){
        List<String> list = new ArrayList<String>();

        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreElements()){
            list.add(st.nextToken());
        }

        return list;
    }

    public static List<String> getTockens2(String s){
        return Collections.list(new StringTokenizer(s, " ")).stream().map(token -> (String) token).collect(Collectors.toList());
    }
}
