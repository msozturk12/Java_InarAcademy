package chapters.chapter06.Exercises06;

public class Exercises_06_29 {
    public static void main(String[] args) {

       /*
       (3,5)  x-->3 is  prime x+2=y  if y also prime they are twin primes
       ex.11-13
       want me to find all twin prime less than 1000
        */
        System.out.println("Twin primes");
        System.out.println("------------------");

        for (int i = 3; i < 1000; i++) {
            int j = i + 2;
            if (Exercises_06_26.isPrime(i) && Exercises_06_26.isPrime(j)){
                System.out.printf("(%3d,%3d)\n",i,j);

            }


        }
    }
}