package chapters.chapter06.Exercises06;

public class Exercises_06_12 {
    public static void main(String[] args) {
        printChars('1', 'Z', 10);

    }

    public static void printChars(char ch1, char ch2, int numberPerLine) {

        int first = (int) ch1;
        int last = (int) ch2;
        int counter = 0;

        for (int i = first; i <= last; i++) {
            counter++;
            if (counter % numberPerLine == 0) {
                System.out.println();
            } else {
                System.out.print((char) i + " ");
            }


        }


    }
}
