package chapters.chapter07.Exercise07;

import java.util.Arrays;
import java.util.Scanner;

public class Exercises07_21 {
    /*
        -take balls and slots number
        -getrandom path (math.random 1 for Right, 0 for Left
        -fill slot ne kadar R varsa ona göre slotlara düşüyor
        -

     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of balls to drop");
        int balls = input.nextInt();
        System.out.println("Enter the number of slots in the bean machine: ");
        int slots = input.nextInt();

        char[] path;
        int[] slot = new int[slots];
        for (int i = 0; i < balls; i++) {
            path = getRandomPath(slots);
            displayPath(path);
            slot = fillSlots(slot, path);
        }
        displaySlots(slot, balls);

    }

    public static char[] getRandomPath(int slots) {
        char[] path = new char[slots - 1];
        for (int i = 0; i < path.length; i++) {
            if ((int) (Math.random() * 2) == 0) {
                path[i] = 'L';
            } else {
                path[i] = 'R';
            }
        }
        return path;
    }

    public static void displayPath(char[] path) {
        for (int i = 0; i < path.length; i++) {
            System.out.print(path[i]);
        }
        System.out.println();
    }

    public static int[] fillSlots(int[] slots, char[] path) {
        int countRight = 0;
        for (int j = 0; j < path.length; j++) {
            if (path[j] == 'R') {
                countRight++;
            }
        }
        slots[countRight]++;
        return slots;
    }

    public static void displaySlots(int[] slots, int numberOfBalls) {
        for (int i = numberOfBalls; i > 0; i--) {
            for (int j = 1; j < slots.length; j++) {
                if (slots[j] == i) {
                    System.out.print("O");
                    slots[j]--;
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}