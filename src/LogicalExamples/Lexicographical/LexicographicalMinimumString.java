package LogicalExamples.Lexicographical;

/**
 * Created by sdodia on 6/3/17.
 */
public class LexicographicalMinimumString
{

    public static void main(String[] args)
    {
        String [] testStrings = {"ABCD", "ACACAB", "CABABC", "ABABCABA", "AAA"};
        for (String s : testStrings)
        {
            System.out.println ("\n\n=========================");
            System.out.println ("Input: " + s);
            System.out.println (s + ": " + lexMin(s));
        }
    }


    static String lexMin(String str)
    {
        String str2 = str + str;

        int offset = 0;
        int answer = 0;

        for (int i = 1; i < str2.length(); i++)
        {
            if (str2.charAt(i) < str2.charAt(answer))
            {
                // New lexicographical minimum found.
                // Reset all parameters here.
                answer = i;
                offset = 0;
            }
            else if (str2.charAt(i) == str2.charAt(answer + offset))
            {
                // Keep moving the offset till this new string matches the previous answer
                offset++;
            }
            else if (str2.charAt(i) < str2.charAt(answer + offset))
            {
                // In the new match, some character is found which is lower
                // than the character at same offset in the previous answer.
                // So new answer becomes the lexicographical minimum, discard
                // the previous answer in favor of the new answer.
                answer = i - offset;
                offset = 0;
                i = answer;
            }
            else
            {
                // In the new match, some character is found which is higher
                // than the character at same offset in the previous answer.
                // So new answer cannot be the lexicographical minimum, discard it.
                offset = 0;
            }

            // Debug prints
            System.out.println ("-------------------------");
            System.out.println ("i="+i + ", answer=" + answer + ", offset="+offset);
            System.out.println (getSpace(i)+"i");
            System.out.println (str2);
            System.out.println (getSpace(answer) + str2.substring(answer, answer+str.length()));
            if (offset > 0)
                System.out.println (getSpace(i-offset+1) + str2.substring(i-offset+1, i+1));
            System.out.println ();
        }

        return str2.substring(answer, answer+str.length());

    }


    static String getSpace(int answer)
    {
        String s = "";
        while (answer-- > 0)
            s += " ";
        return s;
    }

}
