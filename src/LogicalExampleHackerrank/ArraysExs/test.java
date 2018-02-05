package LogicalExampleHackerrank.ArraysExs;

/**
 * Created by sdodia on 1/23/18.
 */
public class test {
    public static void main(String args[]){
//        Scanner sc = new Scanner(System.in);
//        int m = sc.nextInt();
//        int n = sc.nextInt();
//        int[][] arr = new int[m][n];
//        for(int i=0; i<m; i++) {
//            for (int j = 0; j < n; j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        System.out.println(solu(arr));
// \u000d System.out.println("Sagar"); //System.out.println("Dodia");
        System.out.print("ONE"+1+2+"TWO"+"THREE"+3+4+"FOUR"+"FIVE"+5);
    }

//    public static int solu(int[][] arr){
//
//        int m = arr.length;
//        int n = arr[0].length;
//
//        if(arr[0][0] == 1 || arr[m-1][n-1] == 1){
//            return 0;
//        }else {
//
//            int[][] tmp = new int[m][n];
//            tmp[0][0] = 1;
//
//            for (int i = 1; i < m; i++) {
//                if (arr[i][0] == 1) {
//                    tmp[i][0] = 0;
//                } else {
//                    tmp[i][0] = tmp[i - 1][0];
//                }
//            }
//
//            for (int i = 1; i < n; i++) {
//                if (arr[0][i] == 1) {
//                    tmp[0][i] = 0;
//                } else {
//                    tmp[0][i] = tmp[0][i - 1];
//                }
//            }
//
//            for (int i = 1; i < m; i++) {
//                for (int j = 1; j < n; j++) {
//                    if (arr[i][j] == 1) {
//                        tmp[i][j] = 0;
//                    } else {
//                        tmp[i][j] = tmp[i - 1][j] + tmp[i][j - 1];
//                    }
//                }
//            }
//
//            return tmp[m - 1][n - 1];
//        }
//    }
}
