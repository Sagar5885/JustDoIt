package LogicalExamples;

/**
 * Created by sdodia on 6/9/17.
 */
public class SwapLexOrder {
    public String swapLexOrder(String str, int[][] pairs) {
        char[] c = str.toCharArray();
        char tmp = ' ';
        String[] stmp = new String[pairs.length];
        boolean bv = true;
        String res = "";

        if(str == " " || str == null){
            res = "";
        }
        else if(str.length()==1){
            res = str;
        }else {
            while (bv) {
                res = new String(c);
                for (int i = 0; i < pairs.length; i++) {
                    int a = pairs[i][0] - 1;
                    int b = pairs[i][1] - 1;

                    tmp = c[a];
                    c[a] = c[b];
                    c[b] = tmp;

                    stmp[i] = new String(c);
                }
                for (int j = 0; j < stmp.length; j++) {
                    if (stmp[j].equals(str)) {
                        bv = false;
                        break;
                    } else {
                        bv = true;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String args[]){
        SwapLexOrder slo = new SwapLexOrder();
        String str = "abdc";
        int[][] pairs = {{1, 4},
                         {3, 4}};

        String res = slo.swapLexOrder(str, pairs);
        System.out.println("Result: "+res);

        String str1 = "acxrabdz";
        int[][] pairs1 = {{1,3},
                          {6,8},
                          {3,8},
                          {2,7}};

        String res1 = slo.swapLexOrder(str1, pairs1);
        System.out.println("Result1: "+res1);
    }
}
