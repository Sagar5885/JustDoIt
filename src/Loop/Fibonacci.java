package Loop;

/**
 * Created by sdodia on 12/29/16.
 */
public class Fibonacci {
    public static void main(String[] args){
        int limit = 20;

        long[] series = new long[limit];
        series[0] = 0;
        series[1] = 1;

        for(int i=2; i<limit; i++){
            series[i] = series[i-1] + series[i-2];
        }

        System.out.print("Fibonacci Seriese upto "+limit+": ");
        for(int i=0; i<limit; i++){
            System.out.print(series[i]+ " ");
        }
    }
}
