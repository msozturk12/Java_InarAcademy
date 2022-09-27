package chapters.chapter06.Exercises06;

public class Exercises_06_01 {
    public static void main(String[] args) {

        writePentagonalNumbers(100);

    }

    public static void writePentagonalNumbers(int numberOfPen) {

        int counter = 1;

        for (int n = 1; n < numberOfPen; n++) {

            int pentagonalNumber = getPentagonalNumbers(n);
            if (counter % 10 == 0) {
                System.out.println();
            } else {
                System.out.printf("%9d", pentagonalNumber);
            }
            counter++;
        }

    }
    public static int getPentagonalNumbers(int n) {
        n = n * (3 * n - 1) / 2;
        return n;
    }

}
