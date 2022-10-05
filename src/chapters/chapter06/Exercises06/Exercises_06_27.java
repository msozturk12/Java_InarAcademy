package chapters.chapter06.Exercises06;

public class Exercises_06_27 {
    public static void main(String[] args) {
        /*
        emirp number
        reversed form and normal form must be prime
        ex: 17 and 71 true
         */

        int counter = 1;
        int number = 10;

        while (counter <= 100) {


            if (Exercises_06_26.isPrime(number) && isEmirp(number)) {
                System.out.printf("%7d", number);

                if (counter % 10 == 0) {
                    System.out.println();
                }
                counter++;
            }
            number++;
        }

    }

    public static boolean isEmirp(int number) {

        int reversednumber = reverse(number);
        return Exercises_06_26.isPrime(reversednumber);


    }

    public static int reverse(int num) {
        int reversedNum = 0;
        while (num > 0) {
            reversedNum = (reversedNum * 10) + num % 10;
            num = num / 10;
        }
        return reversedNum;
    }
}



