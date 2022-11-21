package weeks.week_15.Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayOutOf {
    public static void main(String[] args) {


        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your array size");
            int size = input.nextInt();
            int[] arr = new int[5];
            System.out.println(arr[size]);
        } catch (IndexOutOfBoundsException ie) {
            System.out.println("İndex out of bound exception is handled");
            System.out.println("Array size must be < 5");

        } catch (InputMismatchException ie) {
            System.out.println("Input miss match exception");
            System.out.println(ie.getMessage());
        }
        System.out.println("Try dan sonraki satır");
    }

    public static void arrayIOBExample() {
        Scanner input = new Scanner(System.in);
        System.out.print("sayi giriniz :");
        int n1 = input.nextInt();
        int[] arr1 = new int[2];

        if (n1 >= arr1.length) {
            System.out.println("Yanlis girdin if-else yakaladi");
        } else {
            System.out.println(arr1[n1]);
        }
    }
}
