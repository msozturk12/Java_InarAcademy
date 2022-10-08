package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_37 {

    public static void main(String[] args) {
        /*
        format an ınteger

        format(34,4)-->0034
        4 -->length
        format(4214,3)-->4214
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.println("Enter the width");
        int width = input.nextInt();
        String formated = format(number, width);
        System.out.println("Your formated number is " + formated);


    }

    public static String format(int number, int width) {   //format(34,4)-->0034
        String numb = number + "";

        if (numb.length() < width) {

            for (int i = width - numb.length(); i > 0; i--) {  //--34 --> -034 -->0034
                numb = 0 + numb;
            }
        }
        return numb;
    }


}
