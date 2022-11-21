package weeks.week_15.Calculator;


import java.util.Scanner;

public class CalculationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
        Number n1 = new Number(input.nextInt());
        Number n2 = new Number(input.nextInt());

        System.out.println("Please enter the calculator");
        String str = input.next();

        switch (str) {
            case "+":
                print1(Calculator.sum(n1, n2));
                break;
            case "-":
                print1(Calculator.subtract(n1, n2));
                break;
            case ("/"):
                print1(Calculator.divide(n1, n2));
                break;
            case ("*"):
                print1(Calculator.multiply(n1, n2));
                break;
            case ("re")://reset
                print1(Calculator.reset());
                break;
            case ("c1")://change number1 sign
                print1(Calculator.change1(n1));
                break;
            case ("c2")://change number2 sign
                print1(Calculator.change2(n2));
                break;

        }


    }

    private static void print1(Number result) {
        System.out.println("After calculation the number is " + result.getValue());
    }


}
