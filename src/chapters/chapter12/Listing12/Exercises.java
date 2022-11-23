package chapters.chapter12.Listing12;

import java.io.File;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) throws  Exception{
        String lineSeparator = System.getProperty("line.separator");
        System.out.println(lineSeparator);

        Scanner input = new Scanner(new File("C:\\Users\\mesut\\Music\\Listing_12_12FileTest\\new file\\asd.txt"));
        String line = input.nextLine();
        System.out.println(line);
    }
}
