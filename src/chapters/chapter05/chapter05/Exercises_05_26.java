package chapters.chapter05.chapter05;

public class Exercises_05_26 {

    public static void main(String[] args) {

        double e1 = 1;
        double factor1 = 1;
        for (double i = 1; i <= 10_000; i++) {
            factor1 = i;
	        for(double n = i-1 ; n>0 ; n--){
                factor1*=n;
            }
            e1+= 1 / factor1;
        }
        System.out.println("e value for i = 10_000 :" + e1);


        double e2 = 1;
        double factor2 = 1;
        for (double i = 1; i <= 20_000; i++) {
            factor2 = i;
            for (double n = i - 1; n >= 1; n--) {

                factor2 *= n;
            }
            e2 += 1 / factor2;
        }
        System.out.println("e value for i = 20_000 :" + e2);


        double e3 = 1;
        double factor3 = 1;
        for (double i = 1; i <= 20_000; i++) {
            factor3 = i;
            for (double n = i - 1; n >= 1; n--) {

                factor3 *= n;

            }
            e3 += 1 / factor3;
        }
        System.out.println("e value for i = 100_000 :" + e3);
    }

}
