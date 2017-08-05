package LogicalExamples;

import org.testng.annotations.Test;

/**
 * Created by sdodia on 5/25/17.
 */
public class LookAndSayUsingForLoop {



    public String LookAndSayUsingForLoop1(String number){
        if (null == number || number.isEmpty())
        {
            return "";
        }
        int firstCharPosition = 0;
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < number.length(); i++)
        {
            if (number.charAt(firstCharPosition) != number.charAt(i))
            {
                final String digitsFound = number.substring(firstCharPosition, i);
                stringBuilder.append(digitsFound.length()).append(number.charAt(firstCharPosition));
                firstCharPosition = i; // set the new first char position
            }
        }
        stringBuilder.append(number.substring(firstCharPosition, number.length()).length()).append(number.charAt(firstCharPosition));
        return stringBuilder.toString();
    }

    @Test
    public LookAndSayUsingForLoop(){
        System.out.println(LookAndSayUsingForLoop1("21"));

        String result1 = "10";
        System.out.print(result1 + " ");
        for (int i = 1; i < 10; i++)
        {
            result1 = LookAndSayUsingForLoop1(result1);
            System.out.print(result1 + " ");
        }
    }

}
