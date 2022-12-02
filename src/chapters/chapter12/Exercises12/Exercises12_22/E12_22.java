package chapters.chapter12.Exercises12.Exercises12_22;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class E12_22 {
    public static void main(String[] args) throws IOException {
        if (args.length != 3) {
            System.out.println("Invalid ınput Usage:java Exercise12_22 dir oldString newString");
            System.exit(0);
        }
        File directory = new File(args[0]);

        if (!directory.exists()) {
            System.out.println(directory.getName() + " is not exist");
            System.exit(1);
        }
        if (!directory.isDirectory()) {
            System.out.println(args[0] + " is not a directory");
            System.exit(2);
        }

        ArrayList<File> directories = new ArrayList<>();
        directories.add(directory);
        while (!directories.isEmpty()) {
            File fileFromDir = directories.remove(0);
            if (fileFromDir.isDirectory()) {
                File[] files = fileFromDir.listFiles();
                for (int i = 0; i < files.length; i++) {
                    if (files[i].isDirectory()) {
                        directories.add(files[i]);
                    } else {
                        replaceOldStrWithNew(files[i], args[1], args[2]);
                    }

                }
            }
        }
    }

    private static void replaceOldStrWithNew(File file, String oldString, String newString) throws IOException {
        String result = "";
        try (Scanner input = new Scanner(file);) {
            while (input.hasNext()) {
                String s = input.nextLine();
                s = s.replaceAll(oldString, newString);
                result += s + "\n";
            }


        }

        try (PrintWriter output = new PrintWriter(file)) {
            output.println(result);
        }
    }
}
