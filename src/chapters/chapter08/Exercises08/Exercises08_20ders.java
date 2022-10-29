package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_20ders {
    /*

        * 1 - Anlat
        * 2 - Ornekle
        * 3 - Algoritmani sozel
        * 4 - Test case olustur
        * 5 - Kod yaz
        * 6 - test et


       --ANLAT---
        1- 6 satır 7 sutun board
        2- 4 disk

        2-  2.1- Same row (4 disk olacak)
            2.2-Same column
            2.3-Diagonal right
            2.4-Diagonal left
        3- oyuncular sırayla atıyor

        ---ÖRNEKLE----
        kitap üzerinde....

        ----ALGORİTMA---
         0-Ask the user for ınput
         1-validationCheck
                    ->user sutundan küçük/büyük bir girişte bulundu mu
                    ->user dolu olan sutuna atmaya çalışırsa ,tekrar aynı usera soralım


         2-process->userın girdigi degeri board a ata
         3-Display method- anlık board göstersin
         4-kazanma ya da berabere durumu var mı

        ------TEST CASE-----
         1-00000000
         2-kazanma
         3-oyna
         */
    private static Scanner input = new Scanner(System.in);
    private static int row = 6;
    private static int col = 7;
    /*
    default -0(Empty)
    RED -1
    Yellow-2
     */
    private static int[][] board = new int[row][col];

    private static boolean isRedTurn = true;

    //https://www.geeksforgeeks.org/how-to-print-colored-text-in-java-console/
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    public static void main(String[] args) {

        do {
            askUserForInput();
            int usersEntry = input.nextInt();
            if (!isValid(usersEntry)) {
                System.out.println("ınvalid entry!");
                continue; // valid olmayınca devam edio
            }
            processEntryToTheBoard(usersEntry);
            display1();
            //? üstte tanımladığı için
        } while (!isGameOver());
    }


    public static void askUserForInput() {
        String color = isRedTurn ? "Red" : "Yellow";
        System.out.printf("Drop a %s disk at column (0–6):", color);
    }
    private static boolean isValid(int usersEntry) {
        if (usersEntry < 0 || col <= usersEntry) {
            return false;
        } else if (isTheColFull(usersEntry)) {
            return false;
        }
        return true;
    }

    private static boolean isTheColFull(int usersEntry) {

        return board[0][usersEntry] != 0;//userın girdiği 0 degilse true dön.if its full
    }

    private static void processEntryToTheBoard(int usersEntry) {
        // 0 degilse(if its no empty) bir öncekine yazdr
        //we have already check the 0th row in validation process
        for (int i = 1; i < row; i++) {
            if (board[i][usersEntry] != 0) {
                board[i - 1][usersEntry] = isRedTurn ? 1 : 2;//default 0 var eger 0 degilse-> ,red se 1 yellowsa 2
                return;//methodu kapatır
            }
        }
        board[row - 1][usersEntry] = isRedTurn ? 1 : 2; // hepsi 0 sa yazıo
    }
    private static boolean isGameOver() {
        //kazanma
        if (isSameRow() || isSameCol() || isRightDiagonal() || isLeftDiagonal()) { //winning case
            System.out.printf("Congratulations!!!\n%s WINS!!!!", isRedTurn ? "RED" : "YELLOW");
            return true;

        } else if (isTheBoardFull()) { //draw case
            System.out.println("Game is over! it's a DRAW!");
            return true;
        } else {
            //keep playing
            isRedTurn = !isRedTurn;
            return false;

        }

    }

    private static boolean isLeftDiagonal() {

        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < row - 3; i++) {
            for (int j = 3; j < col ; j++) {
                int counter = 0;
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j - k] == num) {
                        counter++;
                    } else {
                        break;
                    }
                    if (counter >= 4) {
                        System.out.println("LEFT DIAGONAL!!!");
                        return true;
                    }
                }

            }

        }
        return false;
    }


    private static boolean isRightDiagonal() {
        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < row - 3; i++) {
            for (int j = 0; j < col - 3; j++) {
                int counter = 0;
                for (int k = 0; k < 4; k++) {
                    if (board[i + k][j + k] == num) {
                        counter++;
                    } else {
                       break;
                    }
                    if (counter == 4) {
                        System.out.println("RIGHT DIAGONAL!!!");
                        return true;
                    }
                }

            }

        }
        return false;
    }

    private static boolean isSameCol() {
        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < col; i++) {
            int counter = 0;
            for (int j = 0; j < row; j++) {
                if (board[j][i] == num) {
                    counter++;
                } else {
                    counter = 0;
                }

                if (counter >= 4) {
                    System.out.println("SAME COLUMN!!!");
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean isSameRow() {
        int num = isRedTurn ? 1 : 2;

        for (int i = 0; i < row; i++) {
            int counter = 0;
            for (int j = 0; j < col; j++) {
                if (board[i][j] == num) {
                    counter++;
                } else {
                    counter = 0;
                }

                if (counter >= 4) {
                    System.out.printf("SAME ROW!!!");
                    return true;
                }
            }

        }
        return false;
    }

    private static boolean isTheBoardFull() {
        for (int i = 0; i < col; i++) {
            if (board[0][i] == 0) {
                return false;
            }

        }
        return true;
    }

    private static void display() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = ' ';
                if (board[i][j] == 1) {
                    c = 'R';
                } else if (board[i][j] == 2) {
                    c = 'Y';
                }
                System.out.printf("|%3s", "" + c);
            }
            System.out.println("|");
        }

    }

    private static void display1() {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                char c = ' ';
                System.out.print("| ");
                if(board[i][j]==1){
                    System.out.print(ANSI_RED + "R" + ANSI_RESET);
                }else if(board[i][j]==2){
                    System.out.print(ANSI_YELLOW + "Y" + ANSI_RESET);
                }else{
                    System.out.print(" ");
                }
                System.out.print(" ");
            }
            System.out.println("|");
        }
        System.out.println("\n");
    }







}

















