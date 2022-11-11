package chapters.chapter10.Exercises10.Exercise10_19;

import java.math.BigInteger;

public class MersennePrime {
    public static void main(String[] args) {

        BigInteger mPrime;

        System.out.println("p        2^p-1 ");
        System.out.println("-----------------------------------");
        for (int p = 2; p <= 100; p++) {
            if (isPrime(p)) {
                mPrime = BigInteger.ONE;
                for (int i = 0; i < p; i++) {
                    mPrime = mPrime.multiply(new BigInteger(2 + ""));//2p--> p tane 2 çarp
                }
                mPrime = mPrime.subtract(BigInteger.ONE);//2p-1
                System.out.printf("%-5d %s %-30s\n", p, "  ", mPrime);
            }
        }
    }

    public static boolean isPrime(int p) {
        for (int divisor = 2; divisor <= p / 2; divisor++) {
            if (p % divisor == 0) {
                return false;
            }
        }
        return true;
    }

}
