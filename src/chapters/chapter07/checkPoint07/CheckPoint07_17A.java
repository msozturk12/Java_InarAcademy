package chapters.chapter07.checkPoint07;

public class CheckPoint07_17A {
    public static void main(String[] args) {

        int number = 0;
        int[] numbers = new int[1];
        m(number, numbers);
        System.out.println("number is " + number + " and number[0] is " + numbers[0]);
    }

    public static void m(int x, int[] y) {
        x = 3;
        y[0] = 3;
    }
}
//number-->0
//numbers[0]-->3