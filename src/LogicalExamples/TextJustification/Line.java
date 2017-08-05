package LogicalExamples.TextJustification;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sdodia on 6/2/17.
 */
public class Line {
    List<String> words;
    int totalLength;

    Line(){
        words = new ArrayList<String>();
        totalLength = 0;
    }

    void addWord(String word){
        words.add(word);
        totalLength += word.length();
    }

    int wordCount(){
        return words.size();
    }

    int totalNonSpaceLetterLength(){
        return totalLength;
    }

    int minimumLength(){
        return totalLength + words.size() - 1;
    }
}
