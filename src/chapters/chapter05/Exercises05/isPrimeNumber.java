package chapters.chapter05.Exercises05;

public class isPrimeNumber {

    public static void main(String[] args) {
/**
 * per_line;count; divisor;for
 * Asal sayıları bulma 1-50
 * önce asal mı degil mi bul
 *					-bolen olucak number bölünce 0 oluyorsa asal degil
 *	count satır 10 a gelince aşagı geçsin
 */

        final int PER_LINE = 10;
        final int NUMBER_OF_PRIME=50;
        int count = 0;

        for (int number = 2; number < NUMBER_OF_PRIME; number++) {
            boolean isPrime = true;
            for (int divisor = 2; divisor <= number / 2; divisor++) {

                if (number % divisor == 0) {
                    isPrime = false;

                }
            }
            if (isPrime) {
                count++;
                if (count % PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }

    }
}