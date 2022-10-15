package chapters.chapter07.Exercise07;

import java.util.Arrays;

public class Exercises07_13 {
    public static void main(String[] args) {
        /*

                    (Random number chooser) Write a method that returns a random number between
            1 and 54, excluding the numbers passed in the argument. The method header is
            specified as follows:
            public static int getRandom(int... numbers)
                     */

        int random = getRandom(1, 2,4,5);//bu sayılar seçilmeyecek randomlarda
        System.out.println("Random number : " + random);


    }

    public static int getRandom(int... numbers) {

        int randomNumber = 0;
        boolean isExclude = true;

        while (isExclude) {
            isExclude = false;
            randomNumber = (int) (1 + Math.random() * 5);

            for (int i = 0; i < numbers.length; i++) {
                if (randomNumber == numbers[i]) {
                    isExclude = true;
                    break;
                }

            }
        }
        return randomNumber;

    }

}


