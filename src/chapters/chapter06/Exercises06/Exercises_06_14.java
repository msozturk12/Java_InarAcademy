package chapters.chapter06.Exercises06;

public class Exercises_06_14 {
    public static void main(String[] args) {
        System.out.println("Estimate pi number");

        System.out.println("i_____________________m(i)_____");
        for(int i = 1 ; i<=901 ; i+=100){
            System.out.printf("%3d                   %6.4f\n",i,m(i));
        }

    }

    public static double m(double i) {
        double sum = 0;

        for(double n =1 ; n<=i ;n++ ){

            sum += Math.pow(-1, n + 1) / (2 * n - 1);

        }

        return 4*sum;
    }

}
