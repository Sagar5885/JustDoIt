package LogicalExampleHackerrank.Strings;

import java.util.*;

/**
 * Created by sdodia on 9/20/17.
 */
public class PseudoIsomorphicSubstrings {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int k=0; k<str.length(); k++){
            String s = str.substring(0,k+1);
            Set<String> setstr = new HashSet<>();
            if(s.length() == 1) {
                System.out.println(1);
            }else if(s.length() == 2){
                System.out.println(2);
            }else {
                for(int i=0; i<=s.length(); i++){
                    for(int j=i+1; j<=s.length(); j++){
                        if(setstr.isEmpty()) {
                            setstr.add(s.substring(i, j));
                        }else {
                            if(checkAllPseudoIsomorphic(setstr, s.substring(i, j))){
                                setstr.add(s.substring(i, j));
                            }
                        }
                    }
                }

                System.out.println(setstr.size());
            }
        }
    }

    public static boolean checkAllPseudoIsomorphic(Set<String> setstr, String s2){
        Iterator<String> it = setstr.iterator();
        while(it.hasNext()){
            String tmp = it.next();
            if(tmp.length() == s2.length() && isIsomorphic(tmp, s2)) {
                return false;
            }
        }
        return true;
    }

    static int size = 256;
    static boolean areIsomorphic(String str1, String str2)
    {
        int m = str1.length();
        int n = str2.length();

        if(m != n)
            return false;

        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);

        int[] map = new int[size];
        Arrays.fill(map, -1);

        for (int i = 0; i < n; i++)
        {
            if (map[str1.charAt(i)] == -1)
            {
                if (marked[str2.charAt(i)] == true)
                    return false;

                marked[str2.charAt(i)] = true;

                map[str1.charAt(i)] = str2.charAt(i);
            }

            else if (map[str1.charAt(i)] != str2.charAt(i))
                return false;
        }
        return true;
    }

    public static boolean isIsomorphic(String s, String t) {
        if(s==null||t==null)
            return false;

        if(s.length()!=t.length())
            return false;

        HashMap<Character, Character> map = new HashMap<Character, Character>();


        for(int i=0; i<s.length(); i++){
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if(map.containsKey(c1)){
                if(map.get(c1)!=c2)// if not consistant with previous ones
                    return false;
            }else{
                if(map.containsValue(c2)) //if c2 is already being mapped
                    return false;
                map.put(c1, c2);
            }
        }

        return true;
    }

//    public static boolean checkPseudoIsomorphic(String s1, String s2){
//        boolean b1 = true;
//        if(s1.length() != s2.length()){
//            b1 = false;
//        }else {
//            if(s1.length() > 1) {
//                for (int i = 0; i < s1.length() - 1; i++) {
//                    if (!(s1.charAt(i) != s1.charAt(i + 1) && s2.charAt(i) != s2.charAt(i + 1))) {
//                        b1 = false;
//                    }
//                }
//            }
//        }
//
//        return b1;
//    }



//    public static Set<String> strprefixs(String s){
//        Set<String> setstr = new TreeSet<>();
//
//        for(int i=0; i<s.length(); i++){
//            setstr.add(s.substring(0,i+1));
//        }
//
//        return setstr;
//    }


}
