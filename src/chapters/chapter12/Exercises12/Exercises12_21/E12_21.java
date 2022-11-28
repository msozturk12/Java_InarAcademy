package chapters.chapter12.Exercises12.Exercises12_21;

import java.io.File;
import java.util.Scanner;

public class E12_21 {
    public static void main(String[] args) throws Exception {


        File file = new File("C:\\Users\\mesut\\workspace\\InarAcademy\\Java_InarAcademy\\src\\chapters\\chapter12\\Exercises12\\Exercises12_21\\SortedStrings.txt");
        try {
            System.out.println("Is the list  sorted--> " + isSortedString(file));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        }
    }

    public static boolean isSortedString(File file) throws Exception {
        String str1;
        String str2 = null;

        try (
                Scanner input = new Scanner(file)) {

            while (input.hasNext()) {

                str1 = input.next();

                if (str2 != null) {

                    if (str2.compareToIgnoreCase(str1) > 0) {
                        return false;

                    }
                }
                str2 = str1;
            }

        }

        return true;
    }
}