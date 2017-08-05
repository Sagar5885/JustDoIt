package LogicalExampleHackerrank;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;

/**
 * Created by sdodia on 7/24/17.
 */
public class ClimbingLeaderboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] scores = new int[n];
        for(int scores_i=0; scores_i < n; scores_i++){
            scores[scores_i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] alice = new int[m];
        for(int alice_i=0; alice_i < m; alice_i++){
            alice[alice_i] = in.nextInt();
        }

//        //Int[] to Integer[]
//        Integer[] in1 = Arrays.stream( scores ).boxed().toArray( Integer[]::new );
//        //Integer[] to List<Integer>
//        List<Integer> ls = Arrays.asList(in1);
//        //List<Integer> to TreeSet<Integer>
//        Set< Integer > set = new TreeSet< Integer >(ls);

        Arrays.sort(scores);
        int[] scoresres = removeDuplicates(scores);

        for (int i:alice) {
            System.out.println(findPlace(i, scoresres));
        }

    }

    public static int[] removeDuplicates(int[] input){

        int j = 0;
        int i = 1;
        //return if the array length is less than 2
        if(input.length < 2){
            return input;
        }
        while(i < input.length){
            if(input[i] == input[j]){
                i++;
            }else{
                input[++j] = input[i++];
            }
        }
        int[] output = new int[j+1];
        for(int k=0; k<output.length; k++){
            output[k] = input[k];
        }

        for (int k = 0; k < output.length / 2; k++) {
            int temp = output[k];
            output[k] = output[output.length - 1 - k];
            output[output.length - 1 - k] = temp;
        }

        return output;
    }

    public static int findPlace(int a, int[] ar){

        if(a > ar[ar.length-1]){
            //if(a > Arrays.stream(ar).max().getAsInt()){
            return 1;
        }else if(a < Arrays.stream(ar).max().getAsInt()){
            return ar.length+1;
        }else {
            for (int i=1; i<ar.length; i++) {
                if(a > ar[i] && a < ar[i+1]){
                    return i;
                }
            }
        }
        return 0;
    }
}
