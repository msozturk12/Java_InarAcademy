package chapters.chapter12.Listing12;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Listing_12_14WriteDataWithAutoClose {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\mesut\\Music\\Listing_12_12FileTest\\scores\\ScoresList2.txt");

        if (file.exists()) {
            System.out.println("File already exist");
            System.exit(0);
        }

        try (
                PrintWriter output = new PrintWriter(file);
        ) {
            output.print("Mesut Said Öztürk ");
            output.println(85);
            output.print("Enes Öztürk ");
            output.println(90);
            output.println("ı'm writing this from intellij :)");
            output.println("Listing_12_14WriteDataWithAutoClose :)");
            output.println("try-with-resources :)");


        }


    }
}
