package String;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sdodia on 7/5/17.
 */
public class RegexDuplicateWords {
    public static void main(String[] args) {

        String regex = "(^|\\s)([^\\s]+)\\s\\2(\\s|$)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);

            while (m.find()) {
                input = m.replaceFirst(m.group(1)+m.group(2)+m.group(3));m = p.matcher(input);
            }

            // Prints the modified sentence.
            System.out.println(input);
        }
    }
}
