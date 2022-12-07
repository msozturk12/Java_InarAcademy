package chapters.mixedExercises.Set;

import java.util.*;

import static java.util.Collections.*;

public class E7_6 {
    public static void main(String[] args) {
        Set<Integer> primeNumber = new HashSet<>();

        int count = 0;
        for (int i = 2; i < 50; i++) {
            if (isPrime(i)) {
                primeNumber.add(i);
                count++;
            }

        }
        System.out.println("The first 50 prime numbers are :\n "+primeNumber.toString());
    }


    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
