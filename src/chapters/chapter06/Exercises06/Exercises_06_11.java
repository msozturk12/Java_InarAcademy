package chapters.chapter06.Exercises06;

public class Exercises_06_11 {
    public static void main(String[] args) {
        System.out.println("Financial application: compute commissions");
        System.out.println();

        System.out.println("Sales Amount            Commission");
        for (int i = 10_000; i <= 100_000; i += 5000) {
            System.out.printf("%-7d                   %8.1f\n", i, computeCommission(i));
        }
    }

    public static double computeCommission(double salesAmount) {
        salesAmount = (5000 * 0.08) + (5000 * 0.10) + ((salesAmount - 10_000) * 0.12);
        return salesAmount;
    }

}


