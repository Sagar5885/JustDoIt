package LogicalExamples;

/**
 * Created by sdodia on 5/24/17.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DuplicateNumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for (int i = 1; i < 11; i++) {
            numbers.add(i);
        }
        numbers.add(9);
        numbers.add(5);
        numbers.add(2);
        Collections.sort(numbers);
        for(int i=1; i<numbers.size(); i++){
            for(int j = i+1; j<numbers.size(); j++){
                if(numbers.get(i) == numbers.get(j)){
                    System.out.println(numbers.get(i));
                }
            }
        }
        // if="" (numbers.get(i)="=numbers.get(j))" {="" system.out.println(numbers.get(i));="" }="" }="" }="" }="" }="">

    }
}