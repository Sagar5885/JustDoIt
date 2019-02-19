package LogicalExamples;

import java.util.ArrayList;
import java.util.List;

public class FindLongestEvenStringsFromString {
    public static List<String> solution(String s){
        String[] splited = s.split("\\s+");
        int max = 0;
        List<String> res = new ArrayList<String>();

        for (String str:splited) {
            if(str.length()%2 == 0 && (str.length() > max)){
                max = str.length();
                res.clear();
            }
            if(max == str.length()){
                res.add(str);
            }
        }

        return res;
    }

    public static void main(String args[]){
        String s = "this is a nice day";
        List<String> res = solution(s);
        System.out.println(res);
    }
}
