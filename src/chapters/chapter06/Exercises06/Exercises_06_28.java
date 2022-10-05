package chapters.chapter06.Exercises06;

public class Exercises_06_28 {
    public static void main(String[] args) {

        /*
        mersenne prime
        -make isprime method  and  make 2^p-1 formula method
        -in for loop initialize a 'p' value it must be prime number to 31 exclude

         */

        System.out.println("---Mersenne Prime---\n");
        System.out.println("p               2^p-1");
        System.out.println("-----------------------------");

        for (int p = 2; p <= 31; p++) {

            if (isPrime(p)) {
                System.out.printf("%2d              %d\n", p, getMersennePrime(p));
            }
        }


    }

    public static int getMersennePrime(int p) {

        if(isPrime(p)){
            p = (int)Math.pow(2,p) - 1;
        }
    return p;
    }

    public static boolean isPrime(int p) {

        for(int divisor= 2 ; divisor<p; divisor++){
            if(p % divisor==0){
                return false;
            }

        }
    return true;
    }


}
