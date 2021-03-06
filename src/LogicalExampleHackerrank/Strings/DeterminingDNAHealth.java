package LogicalExampleHackerrank.Strings;

import java.util.*;

/**
 * Created by sdodia on 8/22/17.
 */
public class DeterminingDNAHealth {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] genes = new String[n];
        for(int genes_i=0; genes_i < n; genes_i++){
            genes[genes_i] = in.next();
        }
        int[] health = new int[n];
        for(int health_i=0; health_i < n; health_i++){
            health[health_i] = in.nextInt();
        }
        int s = in.nextInt();
        Set<Integer> set = new TreeSet<>();
        for(int a0 = 0; a0 < s; a0++){
            int first = in.nextInt();
            int last = in.nextInt();
            String d = in.next();

            Integer res = 0;

            for(int i=first; i<=last; i++){
                int tmp = check1(d, genes[i]);
                if(tmp > 0){
                    for(int j=0; j<tmp; j++){
                        res += health[i];
                    }
                }
            }
            set.add(res);
        }
        List<Integer> list = new ArrayList<>();
        list.addAll(set);
        System.out.print(list.get(0)+" "+list.get(list.size()-1));
    }

    public static int check1(String d, String g){
        int res = 0;
        if(d.contains(g)){
            if(g.length()>1){
                int tmp = d.length()-g.length();
                for(int i=0; i<=tmp; i++){
                    String tmp1 = d.substring(i, g.length()+i);
                    if(tmp1.equals(g)){
                        res++;
                    }
                }
            }else {
                char[] ch = d.toCharArray();
                for(char c:ch){
                    if((c+"").equals(g)){
                        res++;
                    }
                }
            }
        }

        return res;
    }
}
