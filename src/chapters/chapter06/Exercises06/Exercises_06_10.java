package chapters.chapter06.Exercises06;

public class Exercises_06_10 {
    public static void main(String[] args) {

        final int PER_LINE = 10;
        int counter = 0;
        int number = 2;

        for (number = 2; number < 10_000; number++) {
            if (isPrime(number)) {
                System.out.printf("%7d",number);
                counter++;

                if(counter%PER_LINE==0){
                    System.out.println();
                }
            }

        }
    }

    public static boolean isPrime(int number) {

        for (int divisor = 2; divisor <= number / 2; divisor++) {

            if (number % divisor == 0) {
                return false;
            }

        }
        return true;
    }

}

