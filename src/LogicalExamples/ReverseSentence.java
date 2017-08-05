package LogicalExamples;

/**
 * Created by sdodia on 6/3/17.
 */
public class ReverseSentence {
    public String starr(String sentence){
        char[] a = sentence.toCharArray();
        //Find total no of spaces for total no of words in sentence
        int ln=1;
        for(int i=0; i<sentence.length(); i++){
            if(a[i]==' '){
                ln++;
            }
        }
        //Assign empty string to all
        String[] result = new String[ln];
        for(int i=0; i<result.length; i++){
            result[i] = "";
        }

        //get all words from sentence and give it to result string array
        int j=0;
        for(int i=0; i<sentence.length(); i++){
            if(a[i]!=' '){
                result[j] += String.valueOf(a[i]);
            }else{
                j++;
            }
        }

        String tmp = "";
        for(int i=0; i<result.length;i++){
            tmp += result[result.length-i-1];
            if(i!=result.length-1){
                tmp += " ";
            }
        }

        return tmp;
    }

//    //Reverse String array Object
//    public String[] reversearr(String[] sarr){
//        String[] tmp = new String[sarr.length];
//        for(int i=0; i<sarr.length;i++){
//            tmp[i] = sarr[sarr.length-i-1];
//        }
//        return tmp;
//    }

    public static void main(String args[]){
        ReverseSentence rs = new ReverseSentence();
        String sentence = "Man bites dog";
        String star = rs.starr(sentence);
        System.out.print(star);
    }
}
