package chapters.chapter08.Listing08;

public class GradeExam {
    public static void main(String[] args) {
        char[][] answers = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}};


        char[] key = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
        for (int row = 0; row < answers.length; row++) {  //row
            int correctCount = 0;
            for (int col = 0; col < answers[row].length; col++) {  //column
                if (answers[row][col] == key[col]) {
                    correctCount++;
                }

            }
            System.out.println("Student " + (row + 1 )+ " 's correct count is " + correctCount);

        }
        System.out.println("----With using method----------");
        correctCounter(answers,key);
    }

    public static void correctCounter(char[][] answers, char[] key) {
        int count;
        for (int student = 0; student < answers.length; student++) {
            count=0;
            for (int j = 0; j < answers[student].length; j++) {
                if (answers[student][j] == key[j]) {
                    count++;
                }
            }
            System.out.println("Student " + (student +1) + " 's correct count is " + count);
        }

    }
}