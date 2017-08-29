package LogicalExampleHackerrank.ArraysExs;

/**
 * Created by sdodia on 8/25/17.
 */
public class RemoveDups {
    public static void main(String[] args) {
        demo(new int[]{ 1,2,3,2,3,4,4,3,5,9,9,8,5});
        demo(new int[]{ 1});
        demo(new int[]{ 1,2,3});
    }
    public static void demo(int[] array){
        print("org",array, array.length);
        int newSize = removeDups(array);
        print("upd",array,newSize);
        System.out.println("=====================");
    }
    public static int removeDups(int[] array){
        if(array.length < 2){
            return array.length;
        }
        int eot=0;
        for(int i=1; i< array.length; i++){
            int elm = array[i];
            int j;
            for( j=0; array[j] != elm; j++){
                //intentionally blank
            }

            if( j == i ){ //not dup
                array[++eot] = array[i];
            }
        }
        return eot+1;
    }

    public static void print(String title,int[] array, int size){
        System.out.print(title+": ");
        int nsize = Math.min(array.length, size);
        for(int i=0; i < nsize; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println("");
    }
}
