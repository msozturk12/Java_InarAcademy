package chapters.mixedExercises.ArrayList;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class E20_01 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 1) {
            System.out.println("Usage : java E20_01 textFileName");
            System.exit(0);
        }
        ArrayList<String> words = new ArrayList<>();
        File file = new File(args[0]);
        getWords(words, file);
        Collections.sort(words);
        print(words);
    }


    private static void getWords(ArrayList<String> words, File file) throws FileNotFoundException {
        try (Scanner input = new Scanner(file)) {
            while (input.hasNext()) {
                String s = input.nextLine();
                if (Character.isLetter(s.charAt(0))) {
                    words.add(s);
                }

            }

        }
    }

    private static void print(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            System.out.print(words.get(i) + " ");

        }
    }


}
