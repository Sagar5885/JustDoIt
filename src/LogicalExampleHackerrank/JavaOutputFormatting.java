package LogicalExampleHackerrank;

import java.util.Scanner;

/**
 * Created by sdodia on 10/2/17.
 */
public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            //Complete this line
            String xs = "";
            if(x/10 == 0){
                xs = "00"+x;
            }else if(x/100 == 0){
                xs = "0"+x;
            }else {
                xs = ""+x;
            }

            String s2 = "";
            int len = 15 - s1.length();
            for(int j=0; j<len; j++){
                s2 += " ";
            }

            System.out.println(s1+s2+xs);
        }
        System.out.println("================================");
    }
}
