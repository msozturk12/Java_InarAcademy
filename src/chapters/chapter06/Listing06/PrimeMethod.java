package chapters.chapter06.Listing06;

public class PrimeMethod {

    public static void main(String[] args) {
        System.out.println("ilk 500 asal sayı");
        asalSayılarıYazdır(500);

    }

    private static void asalSayılarıYazdır(int numberOfPrime) {
        int counterOfPrime = 0;
        int sayı = 2;

        while (counterOfPrime < numberOfPrime) {
            if (isPrime(sayı)) {
                System.out.printf("%8d", sayı);
                counterOfPrime++;

                if (counterOfPrime % 10 == 0) {
                    System.out.println();

                }
            }
            sayı++;
        }
    }

    public static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {

            if (number % i == 0) {
                return false;
            }

        }
        return true;

    }

}

