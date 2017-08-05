package LogicalExamples;

/**
 * Created by sdodia on 6/4/17.
 */
public class PressingButtons2 {
    public String[] perCombStr(String buttons) {
        String[] num = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        if (buttons.length()>0) {
            char[] tmp1 = buttons.toCharArray();
            int[] tmp2 = new int[tmp1.length];
            int p = 0;
            for (char k : tmp1) {
                tmp2[p] = Integer.parseInt(""+k)-2;
                p++;
            }
            String[] a = new String[tmp1.length];
            for (int i = 0; i < tmp2.length; i++) {
                a[i] = num[(tmp2[i])];
            }

            int len = 1;
            for(int i=0; i<a.length; i++){
                len *= a[i].length();
            }
            String[] res = new String[len];

            if(a.length ==4) {
                int k = 0;
                for (int j = 0; j < a[0].length(); j++) {
                    for (int i = 0; i < a[1].length(); i++) {
                        for (int m = 0; m < a[2].length(); m++) {
                            for(int n = 0; n < a[3].length(); n++) {
                                res[k] = "" + a[0].charAt(j) + a[1].charAt(i) + a[2].charAt(m) +a[3].charAt(n);
                                k++;
                            }
                        }
                    }
                }
                return res;
            }else if(a.length ==3) {
                int k = 0;
                for (int j = 0; j < a[0].length(); j++) {
                    for (int i = 0; i < a[1].length(); i++) {
                        for (int m = 0; m < a[2].length(); m++) {
                            res[k] = "" + a[0].charAt(j) + a[1].charAt(i) + a[2].charAt(m);
                            k++;
                        }
                    }
                }
                return res;
            } else if(a.length ==2) {
                int k = 0;
                for (int j = 0; j < a[0].length(); j++) {
                    for (int i = 0; i < a[1].length(); i++) {
                        res[k] = "" + a[0].charAt(j) + a[1].charAt(i);
                        k++;
                    }
                }
                return res;
            }else if(a.length ==1){
                int k = 0;
                for (int j = 0; j < a[0].length(); j++) {
                    res[k] = "" + a[0].charAt(j);
                    k++;
                }
                return res;
            }
            else {
                return res;
            }
        }else {
            String[] result = new String[buttons.length()];
            return result;
        }
    }

    public static void main(String args[]){
        PressingButtons2 pb = new PressingButtons2();
        String a = "42";
        String[] result = pb.perCombStr(a);
        for (String l: result) {
            System.out.print(l+" ");
        }

        System.out.println();

        String a1 = "4";
        String[] result1 = pb.perCombStr(a1);
        for (String l: result1) {
            System.out.print(l+" ");
        }

        System.out.println();

        String b1 = "8888";
        String[] result2 = pb.perCombStr(b1);
        for (String l: result2) {
            System.out.print(l+" ");
        }
    }
}
