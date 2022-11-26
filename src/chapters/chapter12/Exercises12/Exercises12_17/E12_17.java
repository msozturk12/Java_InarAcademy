package chapters.chapter12.Exercises12.Exercises12_17;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class E12_17 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> words = getWordListFromFile();
        playHangman(words);

    }

    private static ArrayList<String> getWordListFromFile() throws FileNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your file path name");
        String pathName = input.nextLine();
        File file = new File(pathName);

        if (!file.exists()) {
            System.out.println("There is no such file");
            System.exit(0);
        }
        ArrayList<String> words = new ArrayList<>();
        try (
                Scanner input1 = new Scanner(file);
        ) {
            while (input1.hasNext()) {
                words.add(input1.next());

            }
        }
        return words;
    }


    public static void playHangman(ArrayList<String> words) {
        Scanner input = new Scanner(System.in);
        String word = "";
        do {
            word = words.get((int) (Math.random() * words.size()));
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
        if (missTime == 0) {
            System.out.println("You didnt miss");
        } else if (missTime == 1) {
            System.out.println("You missed " + missTime + " time");
        } else {
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
