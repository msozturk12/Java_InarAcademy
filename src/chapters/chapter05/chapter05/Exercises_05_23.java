package chapters.chapter05.chapter05;


public class Exercises_05_23 {

    public static void main(String[] args) {

        double sumLeftToRight = 0.0;
        double sumRightToLeft = 0.0;

        for (double n = 1; n <= 50000.0; n++) {
            sumLeftToRight += (1 / n);

        }
        for (double n2 = 50000.0; n2 > 0; n2--) {
            sumRightToLeft  += (1 / n2);

        }

        System.out.println("Left to right sum is= " + sumLeftToRight );
        System.out.println("Right to left sum is= " + sumRightToLeft);
        System.out.println("The differences between them : " +(sumLeftToRight-sumRightToLeft));
    }

}
