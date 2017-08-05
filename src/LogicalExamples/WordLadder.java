package LogicalExamples;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by sdodia on 6/8/17.
 */
public class WordLadder {
    public int ladderLength(String beginWord, String endWord, String[] wordList) {
        Set<String> wordDict = new HashSet<String>(Arrays.asList(wordList));
        Set<String> reached = new HashSet<String>();
        reached.add(beginWord);
        //wordDict.add(endWord);
        int distance = 1;
        while (!reached.contains(endWord)) {
            Set<String> toAdd = new HashSet<String>();
            for (String each : reached) {
                for (int i = 0; i < each.length(); i++) {
                    char[] chars = each.toCharArray();
                    for (char ch = 'a'; ch <= 'z'; ch++) {
                        chars[i] = ch;
                        String word = new String(chars);
                        if (wordDict.contains(word)) {
                            toAdd.add(word);
                            wordDict.remove(word);
                        }
                    }
                }
            }
            distance++;
            if (toAdd.size() == 0) return 0;
            reached = toAdd;
        }
        return distance;
    }

    public static void main(String args[]){
        WordLadder wl = new WordLadder();

        String beginWord = "hit";
        String endWord = "cog";
        String[] wordList = {"ait", "hot", "dot", "dog", "lot", "log", "cog"};

//        Set<String> wordList = new HashSet<String>();
//        wordList.add("ait");
//        wordList.add("hot");
//        wordList.add("dot");
//        wordList.add("dog");
//        wordList.add("lot");
//        wordList.add("log");
//        wordList.add("cog");

        System.out.println("Length: "+wl.ladderLength(beginWord, endWord, wordList));
    }
}
