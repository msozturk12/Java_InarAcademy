package chapters.chapter06.Exercises06;

import java.util.Scanner;

public class Exercises_06_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for pattern");
        int lines = input.nextInt();

        displayPattern(lines);

    }
    public static void displayPattern(int n){

        for(int i =1 ; i <= n ; i++){
            for(int s =n-i ; s>0 ;s-- ){
                System.out.print("   ");
            }
            for(int j = i ; j > 0 ; j-- ){
                System.out.printf("%3d",j);
            }
            System.out.println();
        }


    }



}
