package LogicalExamples;

/**
 * Created by sdodia on 6/10/17.
 */
public class FindFirstSubStringOcc {
    public int findFirstSubstringOccurrence(String s, String x) {
        int res=0;
        char[] s1 = s.toCharArray();
        char[] x1 = x.toCharArray();
        String tmp="";

        if(!s.equals(" ") && s != null && !x.equals(" ") && x!=null) {
            if (s.contains(x)) {
                for (int i = 0; i < s1.length; i++) {
                    if (x1[0] == s1[i]) {
                        for (int j = 0; j < x.length(); j++) {
                            tmp += s1[i + j];
                        }
                        if (tmp.equals(x)) {
                            res = i;
                            break;
                        } else {
                            tmp = "";
                        }
                    }
                }
            } else {
                res = -1;
            }
        }else {
            res = -1;
        }
        return res;
    }

    public static void main(String args[]){
        FindFirstSubStringOcc fs = new FindFirstSubStringOcc();
        String s1 = "CodefightsIsAwesome";
        String x1 = "ISA";
        System.out.println("Find First Substring Occurrence1: "+fs.findFirstSubstringOccurrence(s1, x1));

        String s2 = "CodefightsIsAwesome";
        String x2 = "IsA";
        System.out.println("Find First Substring Occurrence2: "+fs.findFirstSubstringOccurrence(s2, x2));

        String s3 = "sst";
        String x3 = "st";
        System.out.println("Find First Substring Occurrence3: "+fs.findFirstSubstringOccurrence(s3, x3));

        String s4 = "abcdefghabcdefghi";
        String x4 = "ghi";
        System.out.println("Find First Substring Occurrence4: "+fs.findFirstSubstringOccurrence(s4, x4));

        String s5 = "ffbefbdbacbccecaceddcbcaeaebfedfcfdbeecffdbbf";
        String x5 = "cb";
        System.out.println("Find First Substring Occurrence5: "+fs.findFirstSubstringOccurrence(s5, x5));
    }
}
