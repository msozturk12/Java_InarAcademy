package chapters.chapter07.Listing07;

import java.util.Scanner;

public class ExForArrays {

    public static void main(String[] args) {

        int[] cadets = new int[5];
        getDataFromUsers(cadets);
        writeArray(cadets);

    }


    public static void getDataFromUsers(int[] cadets) {
        System.out.printf("Please enter %d integer\n", cadets.length);
        for (int i = 0; i < cadets.length; i++) {
            Scanner input = new Scanner(System.in);
            cadets[i] = input.nextInt();

        }

    }

    public static void writeArray(int[] cadets) {
        for (int i = 0; i < cadets.length; i++) {
            System.out.print(cadets[i] + " ");

        }
    }

}
