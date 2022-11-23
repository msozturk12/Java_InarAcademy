package chapters.chapter12.Listing12;


import java.io.*;

public class Listing_12_13WriteData {
    public static void main(String[] args) throws IOException {

        File file = new File("C:\\Users\\mesut\\Music\\Listing_12_12FileTest\\scores\\ScoresList5.txt");
        if(file.exists()){
            System.out.println("File already exist");
            return;
        }

        PrintWriter output = new PrintWriter(file);
        output.print("Mesut Said Öztürk ");
        output.println(85);
        output.print("Enes Öztürk ");
        output.println(90);
        output.println("ı'm writing this from intellij :)");

        output.close();
    }
}
