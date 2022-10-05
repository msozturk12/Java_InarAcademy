package chapters.chapter06.Exercises06;

public class Exercises_06_26 {
    public static void main(String[] args) {

        /*
        palindrom ve asal olmasını istiyorum
        tek basakmaklıklarda kabul
        -check ispalindrom and isPrime
        -if true write it
        ex: 2,3,5,.......787,929

         */
        int counter = 1;
        int number = 2;
        while (counter <= 100) {

            if (isPalindrom(number) && isPrime(number)) {
                System.out.printf("%6d",number);

                if (counter % 10 == 0) {
                    System.out.println();
                }
                counter++;
            }
            number++;
        }
    }

    public static boolean isPalindrom(int number) {

        return (number == reverse(number));
    }

    public static int reverse(int num) {

        int reversedNum = 0;

        while (num > 0) {
            reversedNum = (reversedNum * 10) + num % 10;
            num = num / 10;
        }
        return reversedNum;
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