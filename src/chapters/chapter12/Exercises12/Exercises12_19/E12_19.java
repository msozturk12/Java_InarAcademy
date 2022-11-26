package chapters.chapter12.Exercises12.Exercises12_19;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class E12_19 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your url txt file to counts words");
        String urlTxt = input.nextLine();
        try {
            URL url = new URL(urlTxt);
            String line;
            String[] str;
            int wordCounter = 0;

            try (
                    Scanner input2 = new Scanner(url.openStream());
            ) {
                while (input2.hasNext()) {
                    line = input2.nextLine() + "\n";
                    str = line.split(" ");
                    wordCounter += str.length;

                }
            }
            System.out.println(urlTxt + " has " + wordCounter + " words");
        } catch (MalformedURLException ex) {
            System.out.println("Invalid url");
        } catch (IOException ex) {
            System.out.println("I/O Errors: no such file");
        }

    }
}
