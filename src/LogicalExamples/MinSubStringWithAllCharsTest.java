package LogicalExamples;

import org.testng.annotations.Test;

/**
 * Created by sdodia on 6/4/17.
 */
public class MinSubStringWithAllCharsTest {
    @Test
    public void test1(){
        MinSubStringWithAllChars ms = new MinSubStringWithAllChars();
        String result =  ms.shortestSubstrContainingAllChars("edacbbaca", "aba");
        System.out.println("Output for string-acbbaca to pattern-aba : "+result);
    }
}
