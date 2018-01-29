package ReverseString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 1/24/18.
 */
public class CharacterCollectionReverseString {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String res = reverse(str);
        System.out.println("Reverse String of "+str+" is: "+res);
    }

    public static String reverse(String str){
        String res = "";

        List<Character> chlist = new ArrayList<Character>();
        for (char c:str.toCharArray()) {
            chlist.add(c);
        }
        Collections.reverse(chlist);
        for (char c:chlist) {
            res += c;
        }
        return res;
    }
}
