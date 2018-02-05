package LogicalExampleHackerrank.ArraysExs;

/**
 * Created by sdodia on 1/31/18.
 */
public class RemoveDuplicate {
    public static void main(String args[]){
        int[] arr = {1, 2, 3, 2, 3, 4, 4, 3, 5, 9, 9, 8, 5};
        removDupWithoutUsingAnyCollection(arr);
        int i=0;
        while(true){
            System.out.print(arr[i]+" ");
            i++;
            if(arr[i] == arr[i-1]){
                break;
            }
        }
    }

    public static void removDupWithoutUsingAnyCollection(int[] arr) {
        for (int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-1; j++){
                if(i != j && arr[i] == arr[j]){
                    for(int k = j; k < arr.length -1; k++){
                        arr[k] = arr[k + 1];
                    }
                }
            }
        }
    }
}
