package chapters.chapter12.Exercises12.Exercises12_23;

import java.net.URL;
import java.util.Scanner;

public class E12_23 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your url");
        String urlName = input.nextLine();
        URL url = new URL(urlName);

        double sum = 0;
        int count = 0;
        try (
                Scanner input1 = new Scanner(url.openStream());
        ) {
            while (input1.hasNext()) {
                sum += input1.nextDouble();
                count++;
            }

        }
        System.out.printf("Sum of the number is--> %.2f\n " +
                "Average of the number is--> %.2f", sum, (sum / count));
    }
}
