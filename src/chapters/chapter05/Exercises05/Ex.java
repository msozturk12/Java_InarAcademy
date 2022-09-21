package chapters.chapter05.Exercises05;

public class Ex {
    public static void main(String[] args) {


        double sumLeftToRight = 0;
        double sumRightToLeft = 0;


        for (double n = 1; n <= 50_000; n++) {

            sumLeftToRight += (1 / n);
        }

        for (double n = 50_000; n > 0; n--) {

            sumRightToLeft += (1 / n);


        }
        System.out.println("Result for Left to Right :" + sumLeftToRight);
        System.out.println("Result for Right to Left  :" + sumRightToLeft);

        System.out.println("The differences between them : " + (sumRightToLeft - sumLeftToRight));
    }
}