package chapters.chapter08.Exercises08;

public class Exercises08_03 {
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


        int[] results = correctCounter(answers, key);
        displayTheScoreIncreasingOrder(results);
    }

    public static void displayTheScoreIncreasingOrder(int[] results) { //result=[7,6,5,4,8,7,7,7]
        for (int i = 0; i < results.length; i++) {
            int minCorrect = Integer.MAX_VALUE;
            int minIndex = -1;
            for (int j = 0; j < results.length; j++) {
                if (results[j] < minCorrect) {
                    minCorrect = results[j];
                    minIndex = j;

                }

            }
            System.out.println("Student " + minIndex + " 's correct count is " + minCorrect);
            results[minIndex]=Integer.MAX_VALUE;//bulunan küçük sayıyı büyük sayı ile değiştiriyoruz ki min e girmesin
        }

    }

    public static int[] correctCounter(char[][] answers, char[] key) {
        int[] results = new int[answers.length];
        for (int i = 0; i < answers.length; i++) {
            int correctCount = 0;
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == key[j]) {
                    correctCount++;
                }

            }
            results[i] = correctCount;
        }
        return results;
    }
}
