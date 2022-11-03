package chapters.chapter09.exercises09.Exercises09_10;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a,b,c values ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        equation.display();
    }


}
