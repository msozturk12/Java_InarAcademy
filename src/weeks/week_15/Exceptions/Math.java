package weeks.week_15.Exceptions;

import java.util.Scanner;

public class Math {
    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            divWithOneTryCatch();
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("Index bound of exception is handled");

        } catch (java.lang.Exception e) {
            System.out.println("Exception is handled");
            System.out.println("The messenger " + e.getMessage());

        }
    }

    public static void divWithOneTryCatch() {
        System.out.println("Please enter two numbers to calculate n1/n2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        System.out.printf("%d / %d = %d", n1, n2, n1 / n2);

    }

    public static  void div(){
        System.out.println("Please enter two numbers to calculate n1/n2");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        if(n2==0){
            System.out.println("Wrong input");
        }
        System.out.printf("%d / %d = %d", n1, n2, n1 / n2);
    }
}
