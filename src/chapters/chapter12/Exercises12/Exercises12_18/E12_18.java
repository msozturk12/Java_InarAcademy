package chapters.chapter12.Exercises12.Exercises12_18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E12_18 {
    public static void main(String[] args) throws Exception {

        if (args.length != 1) {
            System.out.println("Invalid enter Usage: srcRootDirectory");
            System.exit(0);
        }
        File directory = new File(args[0]);

        if (!directory.exists()) {
            System.out.println("There is no directory like " + directory.getName());
            System.exit(1);
        }
        if (!directory.isDirectory()) {
            System.out.println("This (" + directory.getName() + ")is not a directory");
            System.exit(2);
        }
        ArrayList<File> directoryList = getDirectories(directory);

        while (!directoryList.isEmpty()) {
            ArrayList<File> files = getFiles(directoryList);
            addPackageName(directoryList.get(0),files);
            directoryList.remove(0);

        }
    }

    private static void addPackageName(File directory,ArrayList<File> files)throws Exception {
        for (int i = 0; i < files.size(); i++) {
            ArrayList<String> packageName = new ArrayList<>();

            packageName.add("package " + directory.getName() + ";");

            try(Scanner input = new Scanner(files.get(i))){
                while(input.hasNext()){
                    packageName.add(input.nextLine());
                }
            }
            try(PrintWriter output = new PrintWriter(files.get(i))){
                for (int j = 0; j < packageName.size(); j++) {
                    output.println(packageName.get(j));

                }

            }
        }
        }


    private static ArrayList<File> getFiles(ArrayList<File> directoryList) {
        if (!directoryList.get(0).isDirectory()) {
            System.exit(0);
        }
        ArrayList<File> list = new ArrayList<>(Arrays.asList(directoryList.get(0).listFiles()));
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i).getName();
            if (!str.substring(str.lastIndexOf(".")).equals(".java")) {
                list.remove(i);
            }

        }
        return list;
    }

    private static ArrayList<File> getDirectories(File directory) {
        ArrayList<File> directories = new ArrayList<>();
        for (int i = 1; i <= 34; i++) {
            directories.add(new File(directory, "chapter" + (i < 10 ? "0" : "") + i));

        }
        return directories;
    }


}
