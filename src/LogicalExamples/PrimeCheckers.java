package LogicalExamples;

import java.math.BigInteger;

/**
 * Created by sdodia on 7/5/17.
 */
public class PrimeCheckers {
    boolean isPrime1(int n) {
        for(int i=2;i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    //More Faster
    boolean isPrime2(int n) {
        for(int i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    //More Faster
    boolean isPrime3(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static boolean returnPrime(BigInteger number) {
        if (!number.isProbablePrime(5))
            return false;

        BigInteger two = new BigInteger("2");
        if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two)))
            return false;

        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) {
            if (BigInteger.ZERO.equals(number.mod(i)))
                return false;
        }
        return true;
    }

    public static String returnPrime1(BigInteger number) {
        if (!number.isProbablePrime(5))
            return "not prime";

        BigInteger two = new BigInteger("2");
        if (!two.equals(number) && BigInteger.ZERO.equals(number.mod(two)))
            return "not prime";

        for (BigInteger i = new BigInteger("3"); i.multiply(i).compareTo(number) < 1; i = i.add(two)) {
            if (BigInteger.ZERO.equals(number.mod(i)))
                return "not prime";
        }
        return "prime";
    }

    public static void main(String args[]){
        BigInteger a = BigInteger.valueOf(13);
        System.out.println(returnPrime1(a));
    }
}
