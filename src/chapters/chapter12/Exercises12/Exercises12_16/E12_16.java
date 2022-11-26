package chapters.chapter12.Exercises12.Exercises12_16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class E12_16 {
    public static void main(String[] args) throws FileNotFoundException {
        if (args.length != 3) {
            System.out.println("Usage: java Exercises_12_16ReplaceText file oldStr newStr");//file old new
            System.exit(1);

        }
        File sourceFile = new File(args[0]);
        if (!sourceFile.exists()) {
            System.out.println("File " + args[0] + " doesn't exist");
            System.exit(2);
        }

        String str = "";
        try (
                Scanner input = new Scanner(sourceFile);
        ) {
            while (input.hasNext()) {
                String s1 = input.nextLine();
                str += s1.replaceAll(args[1], args[2]) + "\n";

            }
        }
        try (
                PrintWriter output = new PrintWriter(sourceFile);
        ) {

            output.print(str);

        }
    }
}
