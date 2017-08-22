package LogicalExampleHackerrank.Strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/21/17.
 */
public class SeparateTheNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++) {
            String s = in.next();
            boolean valid = false;
            long firstx = -1;
            // Try each possible starting number
            for (int i=1; i<=s.length()/2; ++i) {
                long x = Long.parseLong(s.substring(0,i));
                firstx = x;
                // Build up sequence starting with this number
                String test = Long.toString(x);
                while (test.length() < s.length()) {
                    test += Long.toString(++x);
                }
                // Compare to original
                if (test.equals(s)) {
                    valid = true;
                    break;
                }
            }
            System.out.println(valid ? "YES " + firstx : "NO");
        }
    }

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int q = in.nextInt();
//        for(int a0 = 0; a0 < q; a0++){
//            String s = in.next();
//            if(s.charAt(0) == '0' || s.length()==1){
//                System.out.println("NO");
//            }else {
//                List<Integer> list = check1(s);
//                if(testIncremnt(list)){
//                    System.out.println("YES "+list.get(0));
//                }
//            }
//        }
//    }
//
//    public static List<Integer> check1(String s){
//        List<Integer> list = new ArrayList<>();
//        char[] ch = s.toCharArray();
//        for (char c:ch) {
//            list.add(Integer.parseInt(c+""));
//        }
//        return list;
//    }
//
//    public static List<Integer> check21(String s){
//        List<Integer> list = new ArrayList<>();
//        char[] ch = s.toCharArray();
//        for(int i=0; i<ch.length; i++){
//            if(!(i+1<ch.length)) {
//                list.add(Integer.parseInt(ch[i] + ""));
//            }else {
//                list.add(Integer.parseInt(ch[i] + ch[i + 1] + ""));
//            }
//            i++;
//        }
//        return list;
//    }
//
//    public static List<Integer> check22(String s){
//        List<Integer> list = new ArrayList<>();
//        char[] ch = s.toCharArray();
//        for(int i=0; i<ch.length; i++){
//            if(!(i+1<ch.length)) {
//                list.add(Integer.parseInt(ch[i] + ""));
//            }else {
//                list.add(Integer.parseInt(ch[i] + ch[i + 1] + ""));
//            }
//            i++;
//        }
//        return list;
//    }
//
//    public static boolean testIncremnt(List<Integer> a){
//        boolean res = true;
//        int i=1;
//        while(i<a.size()){
//            if(a.get(i-1)-a.get(i) != 1){
//                res = false;
//                break;
//            }
//            i++;
//        }
//        return res;
//    }
}
