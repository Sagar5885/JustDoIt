package FBLogicalExamples;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdodia on 2/4/18.
 */
public class NumberSumOfTwoSquare {
    public static void main(String args[]){
        Integer a = 17;

        System.out.println(a+" is sum of two square: "+sol1(a));
        System.out.println();
        System.out.println(a+" is sum of three square: "+threeSquare(a));
    }

    public static boolean sol1(Integer a){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i*i<a; i++){
            list.add((Integer) i*i);
            for(Integer j: list){
                for(Integer k: list){
                    if(j+k == a){
                        System.out.println(a+" = "+j+" + "+k);
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean threeSquare(Integer a){
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i*i<a; i++){
            list.add((Integer) i*i);
            for(Integer j: list){
                for(Integer k: list){
                    for(Integer l: list) {
                        if (j + k + l== a) {
                            System.out.println(a + " = " + j + " + " + k+ " + "+l);
                            return true;
                        }
                    }
                }
            }
        }

        return false;
    }

}
