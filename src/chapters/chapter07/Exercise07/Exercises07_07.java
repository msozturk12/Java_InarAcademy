package chapters.chapter07.Exercise07;

public class Exercises07_07 {
    public static void main(String[] args) {
         /*
    -100 random integer
    -0-9 arasında 100 tane sayı random yazılacak
    -her sayıdan kaç tane var onu bul
     */

        int[] numbers = fillArrayWithRandomNumbers();
        printNumbers(numbers);

        int[] counts = findTheCountOfSingleDigit(numbers);
        printCounter(counts);
    }

    private static void printNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            if((i+1) % 20 == 0){
                System.out.println();
            }

        }
    }

    public static void printCounter(int[] counts) {

        for (int i = 0; i < counts.length; i++) {
            System.out.println("Occurence of " + i +"'s:"+ counts[i]);

        }
    }

    //numbers--> 9 0 5 5 9 0 4 5 2  2 3 2 1
//counts -- 0 1 2 3 4 5 6 7 8 9 dan kaç tane varsa yazdıracak
    public static int[] findTheCountOfSingleDigit(int[] numbers) {
        int[] counts = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            counts[numbers[i]]++;

        }
        return counts;
    }

    public static int[] fillArrayWithRandomNumbers() {
        int[] numbers = new int[100];
        for (int i = 0; i < numbers.length; i++) {
            int random = (int) (Math.random() * 10);
            numbers[i] = random;
        }
        return numbers;
    }


}
