package chapters.chapter12.Listing12;

import java.util.Scanner;

public class Listing_12_03QuotientWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int result = quotient(n1,n2);
        System.out.printf("%d / %d = %d ",n1,n2,result);


    }

    public static int quotient(int n1, int n2) {
        if (n2 == 0) {
            System.out.println("Divisor can not be zero");
            System.exit(1);

        }

        return n1 / n2;
    }
}
