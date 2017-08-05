package LogicalExamples.TextJustification;

import org.testng.annotations.Test;

import java.util.Iterator;

/**
 * Created by sdodia on 6/2/17.
 */
public class TextJustificationTest {

    @Test
    public void test1(){
        String[] str = {"This", "is", "an", "example", "of", "text", "justification."};
        int L = 16;
        TextJustification textJustification = new TextJustification();
        for (String s: textJustification.fullJustify(str, L)) {
            System.out.println(s);
        }
    }
}
