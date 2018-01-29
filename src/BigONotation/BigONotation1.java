package BigONotation;

/**
 * Created by sdodia on 1/28/18.
 */
public class BigONotation1 {

    private static int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;

    public static void main(String args[]){
        BigONotation1 test2 = new BigONotation1(100000);
        test2.generateRandomNoArray();

        BigONotation1 test3 = new BigONotation1(200000);
        test3.generateRandomNoArray();

        BigONotation1 test4 = new BigONotation1(300000);
        test4.generateRandomNoArray();

        test2.lenearSearchwithindexes(theArray, 20);
        test3.lenearSearchwithindexes(theArray, 20);
        test4.lenearSearchwithindexes(theArray, 20);

    }

    BigONotation1(int size){
        arraySize = size;
        theArray = new int[size];
    }

    public static int[] generateRandomNoArray(){
        int[] res = new int[10];
        for(int i=0; i<10; i++){
            res[i] = (int)(Math.random()*10)+10;
        }
        return res;
    }

    public static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            //System.out.print("| "+i+" | ");
            System.out.print(arr[i] + " |");
            //System.out.println("----------");
        }
    }


    //O(1)
    public void addItemInArray(int newItem){
        theArray[itemsInArray++] = newItem;
    }

    //O(N)
    public static void lenearSearchwithindexes(int[] arr, int v) {
        boolean vInArr = false;
        String indexsWithValue = "";
        startTime = System.currentTimeMillis();
        System.out.println("Value Found: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                vInArr = true;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        endTime = System.currentTimeMillis();
        System.out.println("Linear Search Took: "+(endTime-startTime));
    }

    //Similaraly
    //Buble Sort O(N^2) - which is very bad

    //Binary Search will be O(log N)

    //n(log n) - comparision of n! => log n + log (n-1) + ... + log(1)
}
