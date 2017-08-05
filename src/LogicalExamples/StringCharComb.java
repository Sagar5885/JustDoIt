package LogicalExamples;

/**
 * Created by sdodia on 6/16/17.
 */
public class StringCharComb {
    public String[] conv(String[] a){
        int len = 1;
        for(int i=0; i<a.length; i++){
            len *= a[i].length();
        }
        String[] res = new String[len];

//        if(a.length>2){
//            String[] tmp = new String[len];
//            tmp = twoStrCov(a[0], a[1]);
//            String[][] tmp1 = new String[tmp.length][len];
//            int i=2;
//            int k=0;
//            while(true){
//                for(int j=0; j<tmp.length; j++){
//                tmp1[j] =  twoStrCov(tmp[j], a[i]);
//                }
//
//                i++;
//                if(i<a.length){
//                    tmp = tmp1;
//                    continue;
//                }else{
//                    return tmp1;
//                }
//            }
//        }


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
        }
        else if(a.length ==2) {
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
    }

    public String[] twoStrCov(String[] a){
        int len = a[0].length()*a[1].length();
        String[] res = new String[len];
        int k=0;
        for (int j = 0; j < a[0].length(); j++) {
            for (int i = 0; i <a[1].length(); i++) {
                res[k] = "" + a[0].charAt(j) + a[1].charAt(i);
                k++;
            }
        }
        return res;
    }

    public static void main(String[] args){
        StringCharComb sc = new StringCharComb();

        //Test1
        System.out.println("Four Strings: ");
        String[] str2 = {"abc", "abc", "abc", "abc"};
        String[] res2 = sc.conv(str2);
        for (String s:res2) {
            System.out.print(s+" ");
        }
        System.out.println();

        //Test2
        System.out.println("Three Strings: ");
        String[] str1 = {"abc", "def", "ghi"};
        String[] res1 = sc.conv(str1);
        for (String s:res1) {
            System.out.print(s+" ");
        }
        System.out.println();

        //Test3
        System.out.println("Two Strings: ");
        String[] str3 = {"abc", "def"};
        String[] res3 = sc.conv(str3);
        for (String s:res3) {
            System.out.print(s+" ");
        }
        System.out.println();

        //Test4
        System.out.println("One Strings: ");
        String[] str4 = {"def"};
        String[] res4 = sc.conv(str4);
        for (String s:res4) {
            System.out.print(s+" ");
        }
        System.out.println();
    }
}
