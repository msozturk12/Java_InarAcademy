package chapters.chapter05.chapter05;

public class Exercises_05_10 {

    public static void main(String[] args) {

        /**Find numbers divisible by 5 and 6 (100-1000)
         * count=0;  for per line
         * if(number%5==0 && number%6==0)
         * 			if (count%per_line==0);
         *				alt satıra geçiş
         *					degilse devam arada bir boşlukla
         */
        final int PER_LINE = 10;
        int counter = 0;

        for (int number = 100; number < 1000; number += 5) {


            if (number % 5 == 0 && number % 6 == 0) {
                counter++;
                if (counter % PER_LINE == 0) {
                    System.out.println(number);
                } else {
                    System.out.print(number + " ");
                }
            }
        }


    }

}
