package chapters.chapter06.Listing06;

public class OverLoading {
    public static void main(String[] args) {
        int m = max(5, 15);
        System.out.println(m);
        System.out.println(max(5.14, 6.45));
        System.out.println(max(265,52.5,65.2));
    }

    public static int max(int num1, int num2) {
        int max;
        if (num1 > num2) {
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public static double max(double number1, double number2) {
        return (number1 > number2) ? number1 : number2;
    }

    public static double max(double num1, double num2, double num3) {
        return max(max(num1, num2), num3);
    }
}
