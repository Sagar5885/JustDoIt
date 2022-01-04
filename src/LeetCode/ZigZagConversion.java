package LeetCode;

public class ZigZagConversion {
    public static String convert(String s, int numRows) {
        if(numRows == 1) return s;

        int strlen = s.length();
        int len = numRows + numRows - 2;
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < numRows; ++i){ //iterate row by row
            int ptr = i, add = len - (i * 2);

            while(ptr < strlen){

                sb.append(s.charAt(ptr));

                if(add == 0) { //Bottom Row
                    ptr = ptr + len;
                }else {
                    ptr = ptr + add;
                    add = len - add;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        System.out.println(convert("PAYPALISHIRING", 3));
    }
}
