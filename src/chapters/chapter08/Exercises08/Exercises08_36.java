package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_36 {
    /*
    latin square
    take char matrix
    -eger
     */
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter number n");
        int n = input.nextInt();
        char[][] arr = new char[n][n];

        takeInput(arr,n);

        System.out.println("The input array is " + (getCheckIfLatin(arr) ? "a Latin square: " : "not a Latin square"));
    }



    public static void takeInput(char[][] latinMatrix,int n) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter "+ n + " rows of letters separated by spaces:");
        for (int i = 0; i < latinMatrix.length; i++) {
            for (int j = 0; j < latinMatrix[i].length; j++) {
                char c = input.next().charAt(0);
                latinMatrix[i][j] = c;

                if (('A' + latinMatrix.length) <= latinMatrix[i][j] || latinMatrix[i][j] < 'A') {
                    System.out.println("Wrong input : the letters must be from A to " + (char) ('A' + latinMatrix.length - 1));
                    break;
                }

            }

        }
    }
    public static boolean getCheckIfLatin(char[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                for (int k = col + 1; k < arr[row].length; k++) {
                    if (arr[row][col] == arr[row][k]) {  //each row it must be dif
                        return false;
                    }

                }
                for (int n = col + 1; n < arr.length; n++) { // for all col check if it is dif
                    if (arr[row][col] == arr[n][col]) {
                        return false;

                    }

                }
            }

        }
        return true;
    }




}
