package chapters.chapter07.Exercise07;

import java.util.Scanner;

public class Exercises07_35 {
    public static void main(String[] args) {

        String[] words = {"Isparta", "Anvers", "Paris", "Berlin", "Amsterdam"};
        playHangman(words);

    }

    public static void playHangman(String[] wordsList) {
        Scanner input = new Scanner(System.in);
        String word;
        do {
            word = wordsList[(int) (Math.random() * wordsList.length)];
            char[] answer = new char[word.length()];
            askToUser(word, answer);
            System.out.println("Do you want to guess another word? Enter y or n>");

        } while (input.next().toLowerCase().charAt(0) == 'y');

    }

    public static void askToUser(String word, char[] answer) {
        Scanner input = new Scanner(System.in);
        fill(answer, '*');
        int missTime = 0;

        while (true) {
            System.out.print("(Guess) Enter a letter in word ");
            printWordInAsterisk(answer);

            char ch = input.next().toLowerCase().charAt(0);
            missTime += checkLetter(word, answer, ch);

            if (checkAnswer(word, answer)) {
                break;
            }
        }
        displayAnswer(word, missTime);

    }

    private static void displayAnswer(String word, int missTime) {
        System.out.println("the word is " + word);
        if(missTime==0){
            System.out.println("You didnt miss");
        }else if(missTime==1){
            System.out.println("You missed " + missTime + " time");
        }else{
            System.out.println("You missed " + missTime + " time");
        }
    }


    private static boolean checkAnswer(String word, char[] answer) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != answer[i]) {
                return false;
            }

        }
        return true;
    }

    private static int checkLetter(String word, char[] answer, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == ch) {
                answer[i] = word.charAt(i);


            }

        }
        return contains(answer, ch) ? 1 : 0;// counts miss time
    }

    public static boolean contains(char[] answer, char ch) {
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == ch) {
                return true;
            }
        }
        return false;
    }

    private static void printWordInAsterisk(char[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);

        }
        System.out.println(" > ");
    }

    private static void fill(char[] answer, char ch) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ch;


        }
    }
}
