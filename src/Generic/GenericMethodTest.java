package Generic;

/**
 * Created by sdodia on 3/25/17.
 */
public class GenericMethodTest {

    //Generic Method printArray
    public static <E> void printArray(E[] inputArray){
        //Display Array element
        for(E element: inputArray){
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String args[]){
        Integer[] intArr = {1, 2, 3, 4, 5};
        Double[] doubArr = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArr = {'H', 'E', 'L', 'L', 'O'};
        String[] strArr = {"Sagar", "Hiral", "Suhani", "Dodia"};

        System.out.println("Array Integer contains: ");
        printArray(intArr);

        System.out.println("Array Double contains: ");
        printArray(doubArr);

        System.out.println("Array Character contains: ");
        printArray(charArr);

        System.out.println("Array String contains: ");
        printArray(strArr);
    }
}
