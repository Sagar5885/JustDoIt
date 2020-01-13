package Algorithms;

public class LeonardosPrimeFactors {

    public static void main(String args[]){
        long n = 10000000000L;//10000000000L
        System.out.println(printPrime(n));
    }

    static boolean isPrime(int n)
    {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }

        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= n; i = i + 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    // Function to print primes
    static int printPrime(long n)
    {
        int res = 0;
        for (int i = 2; i <= n; i++)
        {
            if (isPrime(i)) {
                n = n / i;
                res++;
            }
        }

        return res;
    }
}
