package chapters.chapter12.Exercises12.Exercises12_13;

import java.io.File;
import java.util.Scanner;

public class Exercises12_13 {
    public static void main(String[] args) throws Exception {
        if (args.length != 1) {
            System.out.println("Usage: takes one argument and its file name please");
            System.exit(0);
        }
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("The file " + file + " not exist");
            System.exit(1);
        }

        String str = "";
        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                str = input.nextLine();
                lineCount++;
                wordCount += wordCount(str);
                charCount += charCount(str);
            }
        }
        System.out.println("File " + file + "  has:\n" + charCount + " characters\n" +
                wordCount + " words\n" + lineCount + " lines");
    }

    public static int charCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                count++;
            }
        }
        return count;
    }

    public static int wordCount(String str) {
       String[] arr = str.split(" ");
       return arr.length;
    }


}
