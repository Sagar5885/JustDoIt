package FBLogicalExamples;

/**
 * Created by sdodia on 2/9/18.
 */
public class ShortestSuperstring {
    public static void main(String args[]){
        String a = "aabb";
        String b = "bca";

        if(a.contains(b)){
           System.out.println(a);
        }else {
            int tmp = b.length();
            while(tmp>0){
                String tmpa = a.substring(a.length()-tmp,a.length());
                String tmpb = b.substring(0, b.length()-tmp);
                if(tmpa.equals(tmpb)){

                }
                tmp--;
            }
        }
    }
}
