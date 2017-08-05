package LogicalExamples;

/**
 * Created by sdodia on 6/12/17.
 */
public class MultiplyTwoStrings {
    public String multiplyTwoStrings(String s1, String s2) {
//        int n1 = Integer.parseInt(s1);
//        int n2 = Integer.parseInt(s2);

//        Integer m1 = Integer.valueOf(s1);
//        Integer m2 = Integer.valueOf(s2);

        int o1 = convert_String_To_Number(s1);
        int o2 = convert_String_To_Number(s2);

        //int n3 = n1*n2;
        //Integer m3 = m1*m2;
        int o3 = o1*o2;

        //String res1 = String.valueOf(n3);
        //String res2 = String.valueOf(m3);
        String res3 = String.valueOf(o3);

        return res3;
    }
    public static int convert_String_To_Number(String numStr){

        char ch[] = numStr.toCharArray();
        int sum = 0;
        //get ascii value for zero
        int zeroAscii = (int)'0';
        for(char c:ch){
            int tmpAscii = (int)c;
            sum = (sum*10)+(tmpAscii-zeroAscii);
        }
        return sum;
    }


    public String multiply(String s1, String s2) {
        String n1 = new StringBuilder(s1).reverse().toString();
        String n2 = new StringBuilder(s2).reverse().toString();

        int[] d = new int[s1.length()+s2.length()];

        //multiply each digit and sum at the corresponding positions
        for(int i=0; i<n1.length(); i++){
            for(int j=0; j<n2.length(); j++){
                d[i+j] += (n1.charAt(i)-'0') * (n2.charAt(j)-'0');
            }
        }

        StringBuilder sb = new StringBuilder();

        //calculate each digit
        for(int i=0; i<d.length; i++){
            int mod = d[i]%10;
            int carry = d[i]/10;
            if(i+1<d.length){
                d[i+1] += carry;
            }
            sb.insert(0, mod);
        }

        //remove front 0's
        while(sb.charAt(0) == '0' && sb.length()> 1){
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public static void main(String args[]){
        MultiplyTwoStrings mts = new MultiplyTwoStrings();
        String s1 = "763175962178574";
        String s2 = "8597538831896433386048";
        String res = mts.multiplyTwoStrings(s1, s2);
        String res1 = mts.multiply(s1, s2);
        System.out.print("Result: "+res1);
    }
}
