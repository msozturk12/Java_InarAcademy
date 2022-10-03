package chapters.chapter06.Exercises06;

public class Exercises_06_13 {
    public static void main(String[] args) {

        System.out.println("Sum series\n");
        System.out.println(" i       m(i)");

        for (int i = 1; i <= 20; i++) {

            System.out.printf("%-2d      %8.4f\n", i, m(i));
        }

    }

    public static double m(double i) {
        double sum = 0;
        for (double n = 1; n <= i; n++) {

            sum += n / (n + 1);

        }
        return sum;
    }
}