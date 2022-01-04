package LeetCode;

public class MultiplyStrings {
    public static String multiply4(String num1, String num2) {
        if (num1.length() == 0 && num2.length() == 0){
            return "";
        }

        char[] char1 = num1.toCharArray();
        char[] char2 = num2.toCharArray();
        int m = char1.length - 1, n = char2.length - 1;
        int[] resultArr = new int[m + n + 2];
        for (int i = n; i >= 0; i--) {
            for (int j = m; j >= 0; j--) {
                int res = (char1[j] - '0') * (char2[i] - '0') + resultArr[i + j + 1];
                resultArr[i + j + 1] = res % 10;
                resultArr[i + j] += res / 10;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k : resultArr){
            if (k == 0 && sb.length() == 0){
                // do nothing
            } else {
                sb.append(k);
            }
        }

        return sb.length() > 0 ? sb.toString() : "0";
    }


    public static void main(String args[]){
        String num1 = "123456789";
        String num2 = "99";
        System.out.println(multiply4(num1, num2));
    }
}
