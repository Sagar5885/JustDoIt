package LogicalExampleHackerrank.ArraysExs;

import java.util.Random;

/**
 * Created by sdodia on 8/25/17.
 */
public class Scrammble {
    public static void main(String[] args) {
        //randomDemo();
        char[] array = { '1','2','3','4','5'};
        scrammbleDemo(array,50);
    }
    public static void scrammbleDemo(char[] array, int nTimes){
        print("Initial",array);
        for(int i=0; i<nTimes; i++){
            scrammbleDemo(array);
        }
    }
    public static void scrammbleDemo(char[] array){
        array = scrammble(array);
        print("scrammble",array);
    }
    public static char[] scrammble(char[] array){
        Random r = new Random();
        int size=array.length;
        for(int i=0; i<array.length-1; i++){
            int index = r.nextInt(size);

            //swap
            char t = array[size-1];
            array[size-1] = array[index];
            array[index] = t;

            --size;
        }
        return array;
    }
    public static void print(String title,char[] array){
        System.out.print(title+": ");
        for(char c: array){
            System.out.print(c+" ");
        }
        System.out.println("");
    }

    public static void randomDemo(){
        Random r = new Random();
        for(int i=0; i<10; i++){
            System.out.println(r.nextInt(10));
        }
    }
}
