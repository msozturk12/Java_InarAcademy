package chapters.chapter05.Exercises05;

import java.util.Scanner;

public class TestDoWhile {
    public static void main(String[] args) {
        System.out.println("Listing 5.4");

        /**
         * kullanıcan 0 yazana kadar bir değer gir
         *  yazdıgı degerlerden en büyük olanını yazdır
         *  girilen değerlerin toplamını bul
         *
         */


        Scanner input = new Scanner(System.in);
        int number=0;
        int max=0;
        int sum=0;
        do{
            System.out.println("Enter an integer(the input ends when it is 0):");
            number=input.nextInt();

            if(number>max){
                max=number;
                sum+=number;
            }

        }while (number!=0);

        System.out.println("the max is " + max);
        System.out.println("the sum is " + sum);
    }
}
