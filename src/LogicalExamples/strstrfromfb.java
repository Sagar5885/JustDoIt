package LogicalExamples;

/**
 * Created by sdodia on 6/3/17.
 */
public class strstrfromfb {
    public static int strstr(String s, String x){
        int t;
            if(s.contains(x)){
                t = strcheck(s, x);
            }else {
                t = -1;
            }
        return t;
    }

    public static int strcheck(String s, String x){
        int tmp = 0;
        char[] s1 = s.toCharArray();
        char[] x1 = x.toCharArray();
        char[] tmpar = new char[x1.length];
        for(int i=0; i<s1.length; i++){
            if(x1[0] == s1[i]){
                tmp = i;
                for(int j=0; j<x1.length; j++){
                    tmpar[j] = s1[i+j];
                }
                if(tmpar.equals(x1)){
                    return tmp;
                }
            }
        }
        return tmp;
    }

    public static void main(String args[]){
        String s1 = "CodefightswesomeIA";
        String s2 = "CodefightsIsAwesome";
        String x1 = "IA";
        String x2 = "IsA";

        System.out.println("Response of strstr for s1 and x1: "+strstr(s1, x1));
        System.out.println("Response of strstr for s1 and x2: "+strstr(s1, x2));
        System.out.println("Response of strstr for s2 and x1: "+strstr(s2, x1));
        System.out.println("Response of strstr for s2 and x2: "+strstr(s2, x2));
    }
}
