package chapters.chapter05.chapter05;

public class Exercises_05_39 {

    public static void main(String[] args) {

        double goalAmount = 30000;
        double baseSalary = 5000;
        double salesAmount = 0;
        double commission = 0;


        while (commission < goalAmount) {
            if (salesAmount < 5000) {
                commission = salesAmount * 0.08;
            } else if (salesAmount < 10_000) {
                commission = 5000 * 0.08 + (salesAmount - 5000) * 0.10;
            } else {
                commission = 5000 * 0.08 + 5000 * 0.10 + (salesAmount - 10000) * 0.12;
            }

           salesAmount = salesAmount + 0.01;
        }

        System.out.println("The minimum sales you have to generate in order to make $30,000--> " + salesAmount);
    }

}
