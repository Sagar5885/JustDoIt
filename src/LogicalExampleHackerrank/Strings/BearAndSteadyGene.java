package LogicalExampleHackerrank.Strings;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by sdodia on 8/29/17.
 */
public class BearAndSteadyGene {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();

//        int res = replaceStrCount(s, n);
//        while(!check(s)){
//            res += replaceStrCount(s, n);
//        }

//        System.out.println(res);

        solve(n, s);

    }

    public static boolean check(String s){
        int gcount = getcount(s, 'G');
        if(gcount != 2){
            return false;
        }
        int tcount = getcount(s, 'T');
        if(tcount != 2){
            return false;
        }
        int ccount = getcount(s, 'C');
        if(ccount != 2){
            return false;
        }
        int acount = getcount(s, 'A');
        if(acount != 2){
            return false;
        }

        return true;
    }

    public static int getcount(String s, char c){
        int res = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == c){
                res++;
            }
        }
        return res;
    }

    public static int replaceStrCount(String s, int n){
        int count1 = 0;

        while(!check(s)) {

            int gcount = getcount(s, 'G');
            int tcount = getcount(s, 'T');
            int ccount = getcount(s, 'C');
            int acount = getcount(s, 'A');
            char tmp1 = 'A';

            //Get min Sub string need to add
            StringBuilder sb = new StringBuilder();
            if (gcount < 2) {
                int tmp = 2 - gcount;
                for (int i = 0; i < tmp; i++) {
                    sb.append('G');
                }
            } else {
                tmp1 = 'G';
            }

            if (tcount < 2) {
                int tmp = 2 - tcount;
                for (int i = 0; i < tmp; i++) {
                    sb.append('T');
                }
            } else {
                tmp1 = 'T';
            }

            if (ccount < 2) {
                int tmp = 2 - ccount;
                for (int i = 0; i < tmp; i++) {
                    sb.append('C');
                }
            } else {
                tmp1 = 'C';
            }

            if (acount < 2) {
                int tmp = 2 - acount;
                for (int i = 0; i < tmp; i++) {
                    sb.append('A');
                }
            } else {
                tmp1 = 'A';
            }

            int counttmp1 = 0;
            int startindex = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == tmp1) {
                    if (counttmp1 < 2) {
                        counttmp1++;
                    } else {
                        startindex = i;
                        break;
                    }
                }
            }

            String stmp1 = s.substring(0, startindex);
            String stmp2 = sb.toString();
            //String stmp2 = s.substring(startindex,startindex+sb.length());
            String stmp3 = s.substring(startindex + sb.length(), s.length());

            s = stmp1 + stmp2 + stmp3;
            //s.replaceAll(s, stmp1 + stmp2 + stmp3);
            count1 += sb.length();
        }

        return count1;
    }

    static final String GENES = "ACGT";

    static void solve(int n, String s) throws IOException {
        int[] a = new int[n];

        int need = n / 4;

        int[] cnt = new int[4];
        for (int i = 0; i < n; i++) {
            a[i] = GENES.indexOf(s.charAt(i));
            cnt[a[i]]++;
        }

        if (cnt[0] == need && cnt[1] == need && cnt[2] == need && cnt[3] == need) {
            System.out.println(0);
            return;
        }

        int low = 0;
        int high = n;

        outer: while (high - low > 1) {
            int mid = (low + high) >> 1;

            int[] tmp = cnt.clone();
            for (int i = 0; i < mid; i++) {
                tmp[a[i]]--;
            }

            if (tmp[0] <= need && tmp[1] <= need && tmp[2] <= need && tmp[3] <= need) {
                high = mid;
                continue outer;
            }

            for (int i = mid; i < n; i++) {
                tmp[a[i - mid]]++;
                tmp[a[i]]--;

                if (tmp[0] <= need && tmp[1] <= need && tmp[2] <= need && tmp[3] <= need) {
                    high = mid;
                    continue outer;
                }
            }

            low = mid;
        }

        System.out.println(high);

    }
}
