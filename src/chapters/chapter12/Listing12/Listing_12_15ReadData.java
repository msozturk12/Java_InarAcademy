package chapters.chapter12.Listing12;

import java.io.File;
import java.util.Scanner;

public class Listing_12_15ReadData {
    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\mesut\\Music\\Listing_12_12FileTest\\scores\\ScoresList1.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
          //  String line = input.nextLine();-->hepsini yazar
           // System.out.println(line);


            String firstName = input.next();
            String middleName = input.next();
            String lastName = input.next();

            int score = input.nextInt();

            System.out.printf("First name: %s\nSecond name: %s\nLast name: %s\nScore : %d ", firstName, middleName, lastName, score);


        }
        input.close();


    }

    public static void scan() {
        Scanner input = new Scanner("13-14");
        int sum = input.nextInt() + input.nextInt();
        System.out.println("Sum is " + sum);


    }
}
