package LogicalExamples;

import java.util.Arrays;

/**
 * Created by sdodia on 6/7/17.
 */
public class CountPairsWithDifference {
    public static void main(String args[]){
        Integer k=3;
        Integer[] a = {1, 6, 8, 2, 4, 9, 12};
        Integer[] res = new Integer[a.length];
        Integer j=0;
        for(Integer i=0; i<a.length; i++){
            Integer tmp1 = a[i]+k;
            if(Arrays.asList(a).contains(tmp1)){
                res[j] = a[i];
                //res[j++] = tmp1;
                j++;
            }
            Integer tmp2 = a[i]-k;
            if(Arrays.asList(a).contains(tmp2)){
                if(!Arrays.asList(res).contains(a[i])) {
                    res[j] = a[i];
                    //res[j + 1] = tmp1;
                    j++;
                }
            }
        }

        for(Integer l=0; l<res.length; l++){
            System.out.print(res[l]+" ");
        }
    }
}
