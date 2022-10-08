package chapters.chapter06.Exercises06;

import chapters.chapter06.Listing06.RandomCharacters;

public class Exercises_06_38 {

    public static void main(String[] args) {

        final int NUMBER_OF_UPPER_CASE_LETTER=100;
        final int NUMBER_OF_DIGIT_CHARACTER=100;
        int counter = 0;

        while (counter < NUMBER_OF_UPPER_CASE_LETTER) {
            System.out.printf("%s ",RandomCharacters.getRandomUpperCase());
            counter++;
            if(counter % 10 ==0){
                System.out.println();
            }
        }
        System.out.println("--------------------------");

        int counter2=0;
        while (counter2 < NUMBER_OF_DIGIT_CHARACTER) {
            System.out.printf("%s ",RandomCharacters.getRandomDigitCharacter());
            counter2++;
            if(counter2 % 10 ==0){
                System.out.println();
            }
        }

    }
}
