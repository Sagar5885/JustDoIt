package LogicalExamples;

/**
 * Created by sdodia on 6/4/17.
 */
public class MinSubStringWithAllChars {
    public static String shortestSubstrContainingAllChars(String s, String t) {
        int needToFind[] = new int[256];
        int hasFound[] = new int[256];
        int totalCharCount = 0;
        String result = null;

        if(!s.isEmpty() && !t.isEmpty()) {
            if (t.length() <= 1 && s.length() <= 1) {
                if (s.equals(t)) {
                    return s;
                } else {
                    return "";
                }
            } else {
                char[] targetCharArray = t.toCharArray();
                for (int i = 0; i < targetCharArray.length; i++) {
                    needToFind[targetCharArray[i]]++;
                }

                char[] inputCharArray = s.toCharArray();
                for (int begin = 0, end = 0; end < inputCharArray.length; end++) {

                    if (needToFind[inputCharArray[end]] == 0) {
                        continue;
                    }

                    hasFound[inputCharArray[end]]++;
                    if (hasFound[inputCharArray[end]] <= needToFind[inputCharArray[end]]) {
                        totalCharCount++;
                    }
                    if (totalCharCount == t.length()) {
                        while (needToFind[inputCharArray[begin]] == 0
                                || hasFound[inputCharArray[begin]] > needToFind[inputCharArray[begin]]) {

                            if (hasFound[inputCharArray[begin]] > needToFind[inputCharArray[begin]]) {
                                hasFound[inputCharArray[begin]]--;
                            }
                            begin++;
                        }

                        String substring = s.substring(begin, end + 1);
                        if (result == null || result.length() > substring.length()) {
                            result = substring;
                        }
                    }
                }
                return result;
            }
        }else if(s.isEmpty() && !t.isEmpty()){
            return t;
        }else if(!s.isEmpty() && t.isEmpty()){
            return s;
        }else {
            return "";
        }
        //return result;
    }
}
