package LogicalExampleHackerrank.DataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sdodia on 7/13/17.
 */
public class JavaStack {
    static boolean isBallanced(String paranString)
    {
        List<String> closingParan =  Arrays.asList("}", ")", "]");
        boolean isBallanced = true;
        ArrayList<String> stack = new ArrayList<String>();
        if(paranString.length()>0){
            for(int i = 0;i<paranString.length();i++){
                String paran = paranString.substring(i,i+1);
                if(stack.size() == 0 && closingParan.contains(paran)){
                    isBallanced=false;
                    break;
                }else{
                    if(paran.equals("{") || paran.equals("(") || paran.equals("[")){
                        stack.add(paran);
                    }else{
                        String stackParan = stack.get(stack.size()-1);
                        if((stackParan.equals("{") && paran.equals("}")) || (stackParan.equals("(") && paran.equals(")") || (stackParan.equals("[") && paran.equals("]")))) {
                            stack.remove(stack.size()-1);
                        }else{
                            isBallanced = false;
                            break;
                        }
                    }
                }
            }
        }
        if(stack.size()>0) isBallanced = false;
        return isBallanced;
    }

    public static void main(String []argh)
    {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input=sc.next();
            //Complete the code
            if(isBallanced(input)){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }

    }
}
