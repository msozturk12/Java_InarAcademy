package chapters.chapter11.Exercises11.exercise11_17;

import java.util.ArrayList;
import java.util.Scanner;

public class exercise11_17 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter an Integer m");
        int m = input.nextInt();

        int n = getFactor(m);
        System.out.println("The smallest number n for m * n to be a perfect square is " + n);
        System.out.println("m * n is " + (m * n));

    }

    private static int getFactor(int m) {

        ArrayList<Integer> factorList = new ArrayList<>();
        int divisor = 2;

        while (m > 1) {
            if (!isPrime(divisor)) {
                divisor++;
            } else {
                if (m % divisor == 0) {
                    factorList.add(divisor);
                    m = m / divisor;
                } else {
                    divisor++;
                }
            }
        }
        return findNs(factorList);
    }

    public static int findNs(ArrayList<Integer> factorList) {
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < factorList.size(); i++) {
            int counter = 0;
            for (int j = 0; j < factorList.size(); j++) {
                if (factorList.get(i).equals(factorList.get(j))) {
                    counter++;
                }

            }
            if (counter % 2 == 1 && !odd.contains(factorList.get(i))) {
                odd.add(factorList.get(i));
            }

        }
        //multıply the values of N
        int n = 1;
        for (int i = 0; i < odd.size(); i++) {
            n = n * odd.get(i);

        }
        return n;
    }

    public static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number / divisor == 0) {
                return false;
            }

        }
        return true;

    }
}
