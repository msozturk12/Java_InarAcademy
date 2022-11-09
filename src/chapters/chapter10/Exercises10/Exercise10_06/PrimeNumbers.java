package chapters.chapter10.Exercises10.Exercise10_06;

public class PrimeNumbers {

    public static void main(String[] args) {


        StackOfIntegers6 prime = getPrimeNumber();
        while (!prime.empty()) {
            System.out.print(prime.pop() + " ");
        }

    }

    private static StackOfIntegers6 getPrimeNumber() {
        StackOfIntegers6 stack = new StackOfIntegers6();

        for (int number = 2; number < 120; number++) {
            if (isPrime(number)) {
                stack.push(number);
            }
        }
        return stack;

    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }

        }
        return true;
    }
}
