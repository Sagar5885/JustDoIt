package LogicalExamples;

import java.util.HashMap;

/**
 * Created by sdodia on 6/6/17.
 */
public class MapDecoding {

    public int mapDecoding(String message) {
        char[] ch = message.toCharArray();
        String[] res1 = new String[25];
        int comb=1;
//        for(int i=0; i<ch.length; i++){
//            res1[i] = ""+ch[i];
//            comb++;
//        }
        for(int j=0; j<ch.length-1; j++){
            if(Integer.parseInt(""+ch[j]+ch[j+1])<27){
                res1[comb] = ""+ch[j]+ch[j+1];
                comb++;
            }
        }
        return comb;
    }

    public char[] getch(String message){
        char[] res = message.toCharArray();
        HashMap<Integer, Character> checkSum = new HashMap<Integer, Character>();
        char m = 'a';
        for(int i=1; i<=26; i++){
            checkSum.put(i, m);
            m++;
        }
        char[] result = new char[res.length];
        for(int i=0; i<res.length; i++){
            result[i] = checkSum.get(i+1);
        }
        return result;
    }

    public String[] percom(char[] ch){
        String[] res1 = new String[25];
        int comb=0;
        for(int i=0; i<ch.length; i++){
            res1[i] = ""+ch[i];
            comb++;
        }
        for(int j=0; j<ch.length-1; j++){
            if(Integer.parseInt(""+ch[j]+ch[j+1])<27){
                res1[comb] = ""+ch[j]+ch[j+1];
                comb++;
            }

        }
        return res1;
    }

    public static void main(String args[]){
        MapDecoding md = new MapDecoding();
        String a = "12345";
        char[] r1 = md.getch(a);

        for (char ch:r1) {
            System.out.print(ch+" ");
        }

        char[] r2 = a.toCharArray();
         String[] strar = md.percom(r2);
        int i=0;
        for (String s:strar) {
            if(s != null){
                System.out.print(s+" ");
                i++;
            }
        }
        System.out.println("Count: "+i);

        System.out.println("Count2: "+md.mapDecoding(a));

    }
}
