package LogicalExampleHackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sdodia on 8/5/17.
 */
public class MergeString {

//    public static void main(String[] args) throws IOException {
//        Scanner in = new Scanner(System.in);
//        final String fileName = System.getenv("OUTPUT_PATH");
//        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
//        String res;
//        String _a;
//        try {
//            _a = in.nextLine();
//        } catch (Exception e) {
//            _a = null;
//        }
//
//        String _b;
//        try {
//            _b = in.nextLine();
//        } catch (Exception e) {
//            _b = null;
//        }
//
//        res = mergeStrings(_a, _b);
//        bw.write(res);
//        bw.newLine();
//
//        bw.close();
//    }

    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        System.out.println(mergeStrings(a,b));
    }


    static String mergeStrings(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i=0; i < a.length(); i++) {
            sb.append(a.charAt(i));
            if (j < b.length()) {
                sb.append(b.charAt(j));
                j++;
            }
        }
        if (j < b.length()) {
            sb.append(b.substring(j));
        }
        String res = sb.toString();

        return res;
    }
}
