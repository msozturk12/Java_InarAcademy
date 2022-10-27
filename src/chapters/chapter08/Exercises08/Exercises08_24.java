package chapters.chapter08.Exercises08;

public class Exercises08_24 {
    public static void main(String[] args) {
        /*
        -get values of sudoku
        -check whether the order is rıght
                 -check--> row , col , small boxes
         */

        int[][] sudoku = {
                {5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };

        System.out.println(isValid(sudoku) ? "Valid solution" : "Invalid Solution");

    }

    public static boolean isValid(int[][] sudoku) {

        return checkValidNumber(sudoku) && checkRows(sudoku) && checkCol(sudoku) && checkSmallBox(sudoku);
    }


    public static boolean checkValidNumber(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            for (int j = 0; j < sudoku[i].length; j++) {
                if (sudoku[i][j] < 1 || sudoku[i][j] > 9) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean checkRows(int[][] sudoku) {
        for (int i = 0; i < sudoku.length; i++) {
            boolean[] isHave = new boolean[9];
            for (int j = 0; j < sudoku[i].length; j++) {
                isHave[sudoku[i][j] - 1] = true; // 1- 9 arasında eleman var -1
            }                                    // hepsi true olmalı yani farklı değer olmalı 1-9
            for (boolean b : isHave) {
                if (!b) {
                    return false;
                }
            }

        }

        return true;
    }

    public static boolean checkCol(int[][] sudoku) {
        for (int col = 0; col < sudoku[0].length; col++) {
            boolean[] isHave = new boolean[9];
            for (int row = 0; row < sudoku.length; row++) {
                isHave[sudoku[row][col] - 1] = true;

            }
            for (int i = 0; i < isHave.length; i++) {
                if (isHave[i] == false) {
                    return false;

                }
            }
        }
        return true;
    }
    public static boolean checkSmallBox(int[][] sudoku) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                boolean[] isHave = new boolean[9];

                for (int row = i * 3; row < (i * 3) + 3; row++) {
                    for (int col = j * 3; col < (j * 3) + 3; col++) {
                        isHave[sudoku[row][col] - 1] = true; // 9 farklı deger olucak false varsa o sayı yok demektir
                    }
                }
                for (boolean b : isHave) {
                    if (!b) {    //if boolean array has false
                        return false;
                    }
                }
            }
        }

        return true;
    }




}
