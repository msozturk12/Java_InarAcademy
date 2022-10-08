package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_25 {
    public static void main(String[] args) {
        /*
            (Convert milliseconds to hours, minutes, and seconds) Write a method that converts
            milliseconds to hours, minutes, and seconds using the following header:
            public static String convertMillis(long millis)
            The method returns a string as hours:minutes:seconds.

            For example,
            convertMillis(5500) returns a string 0:0:5, convertMillis(100000) returns
            a string 0:1:40, and convertMillis(555550000) returns a string 154:19:10.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the millisecond");
        long millis = input.nextLong();

        System.out.println(millis + " is --> " + convertMillis(millis));
    }

    public static String convertMillis(long millis) {

        long totalSeconds = millis / 1000;
        long seconds = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long minutes = totalMinutes % 60;
        long hours = totalMinutes / 60;

       return hours + ":" + minutes + ":" + seconds;

    }
}
