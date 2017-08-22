package LogicalExampleHackerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 8/14/17.
 */
public class EmasSupercomputer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();
        String[] artwod = new String[n];
        for(int i=0; i<n; i++){
            artwod[i] = sc.nextLine();
        }

        List<Integer> res = check(artwod);
        int tmp = 1;
        for (Integer i:res) {
            tmp *= i;
        }

        System.out.println(tmp);
    }

    public static List<Integer> check(String[] strar){
        List<Integer> res = new ArrayList<Integer>();

        List<String> tmp = new ArrayList<String>();
        for(int i=1; i<strar.length-1; i++){
            for(int j=1; j<strar[i].length()-1; j++){
                int res1 = 1;
                    if(strar[i].charAt(j) == 'G' && strar[i+1].charAt(j) == 'G' && strar[i-1].charAt(j) == 'G'
                            && strar[i].charAt(j+1) == 'G' && strar[i].charAt(j-1) == 'G'){
                        int i1 = i;
                        List<String> tmplst = new ArrayList<String>();
                        if(i>1 || j>1){
                            if(j<i){
                                i1 = j;
                            }
                        }
                        tmplst.add(i+""+j);
                        for(int k=1; k<=i1; k++){
                            tmplst.add((i)+""+(j-k));
                            tmplst.add((i)+""+(j+k));
                            tmplst.add((i-k)+""+(j));
                            tmplst.add((i+k)+""+(j));
                        }
//                        if(!tmp.contains((i)+""+(j-1)) && !tmp.contains((i-1)+""+(j)) && !tmp.contains((i+1)+""+(j))
//                                && !tmp.contains(i+""+j) && !tmp.contains((i)+""+(j+1))){
                        if(checklists(tmp, tmplst)){
                            res1 += 4;
                            tmp.add(i+""+j); tmp.add((i-1)+""+(j)); tmp.add((i+1)+""+(j));
                            tmp.add((i)+""+(j-1)); tmp.add((i)+""+(j+1));
                        }

                    }
                res.add(res1);
            }
        }

        return res;
    }

    public static boolean checklists(List<String> a, List<String> b){
        boolean res = true;
        for (String bs:b) {
            if(a.contains(bs)){
                res = false;
            }
        }
        return res;
    }
}
//Check this out CPP solution
//https://github.com/c650/hackerrank-solutions/blob/master/Algorithms/Implementation/ema-supercomputer.cpp