package chapters.chapter05.chapter05;

public class Exercises_05_11 {

    public static void main(String[] args) {

        //Find numbers divisible by 5 or 6, but not both
        final int NUMBERS_OF_PER_LINE = 10;
        int count = 0;

        for (int number = 100; number < 200; number += 1) {

            if (number % 5 == 0 || number % 6 == 0) {
                count++;
                if (count % NUMBERS_OF_PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }
    }

}
