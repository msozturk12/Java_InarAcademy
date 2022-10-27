package chapters.chapter08.Exercises08;

import java.util.Scanner;

public class Exercises08_09 {
     /*

                    (Game: play a tic-tac-toe game) In a game of tic-tac-toe, two players take turns
            marking an available cell in a 3 * 3 grid with their respective tokens (either
            X or O). When one player has placed three tokens in a horizontal, vertical, or
            diagonal row on the grid, the game is over and that player has won. A draw (no
            winner) occurs when all the cells on the grid have been filled with tokens and
            neither player has achieved a win. Create a program for playing tic-tac-toe.
            The program prompts two players to enter an X token and O token alternately.
            Whenever a token is entered, the program redisplays the board on the
            console and determines the status of the game (win, draw, or continue). Here
            is a sample run:
        -3*3 grid var
        -two players X and O
        -put a chart X O
            -row col a göre yerleştirmek lazım
                -check place 3*3
         -game over
            -win--> checkRow checkCol checkDiagonal
            -draw --> if fill with token but no winner

         */

    private static Scanner input = new Scanner(System.in);

    private static int row = 3;
    private static int col = 3;

    private static char[][] table = new char[row][col];


    public static void main(String[] args) {
        char[][] table = new char[3][3];
        fillTable(table);
        displayTable(table);
        int counter = 0;
        while (counter < 9) {
            getXOFromUser(table, 0);//0->player
            displayTable(table);
            if (isGameOver(table)) {
                break;
            }
            counter++;

            if (counter == 9) {
                System.out.println("Its draw !");
                break;

            }

            getXOFromUser(table, 1);
            displayTable(table);
            if (isGameOver(table)) {
                break;
            }
            counter++;

        }
    }

    private static boolean isGameOver(char[][] table) {

        return checkRow(table) || checkCol(table) || checkRigtDiagonal(table) || checkLeftDiagonal(table);
    }

    private static boolean checkLeftDiagonal(char[][] table) {
        int xCount = 0;
        int oCount = 0;
        for (int row = table.length - 1, j = table.length - 1; row < 0; row--, j--) {
            if (table[row][col] == 'X') {
                xCount++;
            }
            if (table[row][col] == 'O') {
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            checkForWinner(xCount, oCount);
            return true;

        }
        return false;
    }

    private static boolean checkRigtDiagonal(char[][] table) {
        int xCount = 0;
        int oCount = 0;
        for (int row = 0, j = 0; row < table.length; row++, j++) {
            if (table[row][col] == 'X') {
                xCount++;
            }
            if (table[row][col] == 'O') {
                oCount++;
            }
        }
        if (xCount == 3 || oCount == 3) {
            checkForWinner(xCount, oCount);
            return true;

        }
        return false;
    }

    private static boolean checkCol(char[][] table) {
        for (int col = 0; col < table[0].length; col++) {
            int xCount = 0;
            int oCount = 0;
            for (int row = 0; row < table.length; row++) {
                if (table[row][col] == 'X') {
                    xCount++;
                }
                if (table[row][col] == 'O') {
                    oCount++;
                }
            }
            if (xCount == 3 || oCount == 3) {
                checkForWinner(xCount, oCount);
                return true;

            }
        }
        return false;
    }

    private static boolean checkRow(char[][] table) {
        for (int row = 0; row < table.length; row++) {
            int xCount = 0;
            int oCount = 0;
            for (int col = 0; col < table[0].length; col++) {
                if (table[row][col] == 'X') {
                    xCount++;
                }
                if (table[row][col] == 'O') {
                    oCount++;
                }
            }
            if (xCount == 3 || oCount == 3) {
                checkForWinner(xCount, oCount);
                return true;

            }
        }
        return false;
    }

    private static void checkForWinner(int xCount, int oCount) {
        if (xCount == 3) {
            System.out.println("X player won");
        }
        if (oCount == 3) {
            System.out.println("O player won");
        }
    }

    private static void displayTable(char[][] table) {
        System.out.println("------------------------");
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[0].length; j++) {
                System.out.print("|  ");
                System.out.print(table[i][j]);
                System.out.print("  ");

            }
            System.out.println("|");
            System.out.println("------------------------");
        }

    }

    private static void fillTable(char[][] table) {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                table[i][j] = ' ';

            }

        }
    }


    public static void getXOFromUser(char[][] table, int player) {

        System.out.printf("Enter a row (0, 1, or 2) for player %s:", (player == 0 ? "X" : "O"));
        row = input.nextInt();
        System.out.printf("Enter a column (0, 1, or 2) for player %s:", (player == 0 ? "X" : "O"));
        col = input.nextInt();

        if (player == 0) {
            table[row][col] = 'X';
        } else {
            table[row][col] = 'O';

        }

    }
}
