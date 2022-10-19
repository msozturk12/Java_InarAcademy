package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_33 {
    public static void main(String[] args) {
        /*
                (Culture: Chinese Zodiac) Simplify Listing 3.9 using an array of strings to store
        the animal names.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year");
        int year=input.nextInt();

        String[] zodiac = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        System.out.printf("You entered the year %d and for Chinese Zodiac it is --> %s",year,zodiac[year%12]);


    }

}
