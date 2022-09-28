package chapters.chapter06.Listing06;

public class BasitMethod {
    public static void main(String[] args) {
        int sum = sum(1, 10);
        System.out.println("1-10 sayılar toplamı " + sum);
        System.out.println("5-115 sayılar toplamı " + sum(5, 115));
        System.out.println("16-26 sayılar toplamı " + sum(16, 26));
        System.out.println("çarpım " + multiple(6, 30));
        System.out.println(TestMax.max(102,26));

    }

    static int sum(int number1, int number2) {
        int sum = 0;

        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        return sum;

    }

    public static int multiple(int n1, int n2) {
        int sum = n1 * n2;
        return sum;
    }

}
