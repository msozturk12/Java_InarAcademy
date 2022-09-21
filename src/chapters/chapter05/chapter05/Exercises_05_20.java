package chapters.chapter05.chapter05;

public class Exercises_05_20 {

    public static void main(String[] args) {

        //Display prime numbers between 2 and 1,000)
        /**
         * per_line=8
         * kendisine ve sadece 1 e bölüncek
         *
         */
        final int PER_LINE = 8;
        int count = 0;

        for (int number = 2; number <= 1000; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= number / 2; divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;

                }

            }
            if (isPrime) {
                count++;

                if (count % PER_LINE == 0) {
                    System.out.println();
                } else {
                    System.out.print(number + " ");
                }
            }

        }

    }

}
