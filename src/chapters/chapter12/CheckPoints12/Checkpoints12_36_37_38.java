package chapters.chapter12.CheckPoints12;

import java.util.Scanner;

public class Checkpoints12_36_37_38 {
    public static void main(String[] args) {

        // 45 57,8 789
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your values");
        int intValue = input.nextInt();
        double doubleValue = input.nextDouble();
        String line = input.nextLine();

       System.out.println(intValue + " "+ doubleValue + " " +line);
    }
    /*
    if you write values  45 57,8 789 then press enter it executes normally

     but if you press enter after every values, String line--> will be empty
     */
    /*

    Checkpoints12_38-->
    How do you create a Scanner object for reading text from a URL?
            -Scanner input = new Scanner(url.openStream());

    Checkpoints12_39-->
       ? Before a URL is added to listOfPendingURLs, line 25 tests whether it has been traversed.
        Is it possible that listOfPendingURLs contains duplicate URLs? If so, give an example.

            -Yes,it is possible,if we not check duplicate it can ce duplicate link
            -Suppose link1 is not in listOfTraversedURLs, but it appears more than one time in a page.
               Duplicate link1 will be added into listOfPendingURLs
     */
}
