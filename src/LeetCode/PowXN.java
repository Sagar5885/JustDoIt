package LeetCode;

public class PowXN {
    public static double myPow(double x, int n) {
        if(n == 0) return 1;

        double tmp = myPow(x, n/2);

        if(n%2 == 0) return tmp*tmp;
        else if(n>0) return tmp*tmp*x;
        else return (tmp*tmp)/x;
    }

    public static double myPow3(double x, int n) {
        double res = 1.0;
        long N = n;

        if (n < 0) {
            x = 1 / x;
            N = -N;
        }

        double curProduct = x;
        for (long i = N; i > 0; i /= 2) {
            if (i % 2 == 1) {
                res *= curProduct;
            }

            curProduct *= curProduct;
        }

        return res;
    }

    public static void main(String args[]){
        double x = 2.00000;
        int n = 10;
        System.out.println(myPow3(x,n));
    }
}
