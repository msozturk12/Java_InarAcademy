package chapters.chapter06.Listing06;

import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("---GREATEST COMMON DIVISOR---");
        System.out.println("Enter  number1 ");
        int number1= input.nextInt();
        System.out.println("Enter  number2 ");
        int number2= input.nextInt();

        int min = getMin(number1, number2);

        int obeb = getObeb(number1, number2, min);

        System.out.printf("the gcd for %d and %d is %d ",number1,number2,obeb);




    }

    private static int getObeb(int number1, int number2, int min) {
        int obeb = 1;

        for(int divisor = 2; divisor < min; divisor++){
            if((number1 % divisor == 0) && (number2 % divisor == 0 )){
                obeb=divisor;
            }
        }
        return obeb;
    }

    private static int getMin(int number1, int number2) {
        int min=0;
        if(number1 < number2){
            min= number1;
        }else{
            min= number2;
        }
        return min;
    }


}
