package chapters.chapter12.Exercises12.Exercises12_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class E12_11 {

    public static void main(String[] args) throws Exception {
        if (args.length != 2) {
            System.out.println("Usage: java Exercise12_11 word filename ");
            System.exit(0);

        }
        File file = new File(args[1]);
        if (!file.exists()) {
            System.out.println("File " + file + " doesn't exist");
            System.exit(1);
        }
        String str = "";
        try (
                Scanner input = new Scanner(file);
        ) {
            while (input.hasNext()) {
                String line = input.nextLine();
                str += line.replace(args[0],"") + "\n";
            }
        }
        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print(str);
        }
    }

}
