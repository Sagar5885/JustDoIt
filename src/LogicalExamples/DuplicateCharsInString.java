package LogicalExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by sdodia on 5/28/17.
 */
public class DuplicateCharsInString {

    public void findDupCahr(String str){
        Map<Character, Integer> dupMap = new HashMap<Character, Integer>();
        char[] ch = str.toCharArray();

        for(Character chr:ch){
            if(dupMap.containsKey(chr)){
                dupMap.put(chr, dupMap.get(chr)+1);
            }else{
                dupMap.put(chr, 1);
            }
        }
        Set<Character> keys = dupMap.keySet();
        for(Character chr:keys){
            if(dupMap.get(chr) >1){
                System.out.println(chr+" ====> "+dupMap.get(chr));
            }
        }
    }

    public static void main(String args[]){
        DuplicateCharsInString dcs = new DuplicateCharsInString();
        dcs.findDupCahr("Sagar working on Java as of now!");
    }
}
