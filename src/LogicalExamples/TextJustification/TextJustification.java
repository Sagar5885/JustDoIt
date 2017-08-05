package LogicalExamples.TextJustification;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by sdodia on 6/2/17.
 */
public class TextJustification {

    private String getSlot(int i){
        char[] cs = new char[i];
        Arrays.fill(cs, ' ');
        return new String(cs);
    }

    private List<Line> parseToLines(String[] words, int L){
        List<Line> lines = new ArrayList<Line>();
        Line currentLine = new Line();
        lines.add(currentLine);

        for(String word: words){
            if(currentLine.minimumLength()+word.length() < L){
                currentLine.addWord(word);
            }else{
                currentLine = new Line();
                lines.add(currentLine);
                currentLine.addWord(word);
            }
        }
        return lines;
    }

    private List<String> fillLines(List<Line> lines, int L) {
        List<String> output = new ArrayList<String>();
        for (int i = 0; i < lines.size(); i++) {
            Line line = lines.get(i);
            if (line.wordCount() == 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(line.words.get(0));
                sb.append(getSlot(L - line.totalNonSpaceLetterLength()));
                output.add(sb.toString());
            } else if (i == lines.size() - 1) {
                StringBuilder sb = new StringBuilder();
                sb.append(line.words.get(0));
                for (int j = 1; j < line.wordCount(); j++) {
                    sb.append(' ');
                    sb.append(line.words.get(j));
                }
                sb.append(getSlot(L - line.minimumLength()));
                output.add(sb.toString());
            } else {
                int space = (L - line.totalNonSpaceLetterLength())
                        / (line.wordCount() - 1);
                int remain = (L - line.totalNonSpaceLetterLength())
                        % (line.wordCount() - 1);
                StringBuilder sb = new StringBuilder();
                sb.append(line.words.get(0));
                for (int j = 1; j <= remain; j++) {
                    sb.append(getSlot(space+1));
                    sb.append(line.words.get(j));
                }
                for (int j = remain+1; j < line.wordCount(); j++) {
                    sb.append(getSlot(space));
                    sb.append(line.words.get(j));
                }
                output.add(sb.toString());
            }
        }
        return output;
    }

    public List<String> fullJustify(String[] words, int L) {
        if (words == null || words.length == 0) {
            return Collections.emptyList();
        }
        List<Line> lines = parseToLines(words, L);
        return fillLines(lines, L);
    }
}
