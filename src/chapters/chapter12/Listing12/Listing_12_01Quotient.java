package chapters.chapter12.Listing12;

import java.util.Scanner;

public class Listing_12_01Quotient {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two integer");
        int n1=input.nextInt();
        int n2=input.nextInt();


        if(n2==0){
            System.out.println("Divisor can not be zero");
        }else{
            System.out.printf("%d / %d = %d ",n1,n2,n1/n2);
        }



    }


}
