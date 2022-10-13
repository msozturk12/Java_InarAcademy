package chapters.chapter07.Exercise07;

public class Exercises07_06 {
    public static void main(String[] args) {
        /*
       - the first 50 prime numbers
        -use an array to store the prime numbers
        -prime numbers less than or equal sgrt(n) tam bölünürse false

        ex 2 3 5 7
         */


        int[] primeNumber = new int[50];
        takeNumber(primeNumber);
        displayPrimeNumber(primeNumber);


    }

    public static void displayPrimeNumber(int[] primeNumber) {
        for (int i = 0; i < primeNumber.length; i++) {

            System.out.printf("%4d ", primeNumber[i]);

            if ((i+1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void takeNumber(int[] primeNumber) {
        int counter = 0;
        int number = 2;

        while (counter < primeNumber.length) {
            if (isPrime(primeNumber, counter, number)) {
                primeNumber[counter] = number;
                counter++;
            }
            number++;
        }

    }

    public static boolean isPrime(int[] primeNumber, int count, int number) {

        for (int i = 0; i < count; i++) {
            if (primeNumber[i] <= Math.sqrt(number)) {
                if (number % primeNumber[i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}