package chapters.chapter12.Exercises12.Exercises12_15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercises12_15 {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\mesut\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\Exercises12\\Exercises12_15\\Exercise12_155.txt");
        if (file.exists()) {
            System.out.println("There is already a file with the same name");
            System.exit(0);
        }
        writeRandomNumbers(file, 100);
        ArrayList<Integer> list = sortList(file);
        getDisplayList(list);
    }

    private static void getDisplayList(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%3d", list.get(i));
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }

        }
    }

    private static ArrayList<Integer> sortList(File file) throws Exception {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(file);
        while (input.hasNext()) {
            list.add(input.nextInt());
        }
        Collections.sort(list);
        return list;
    }

    private static void writeRandomNumbers(File file, int limit) throws FileNotFoundException {
        try (
                PrintWriter output = new PrintWriter(file)
        ) {
            for (int i = 0; i < limit; i++) {
                int random = (int) (Math.random() * 100);
                output.printf("%3d",random);
                if((i+1)%10==0){
                    output.println();
                }

            }

        }
    }

}
