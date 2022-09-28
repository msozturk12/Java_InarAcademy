package chapters.chapter06.CheckPoint06;

public class CheckPoint06_03 {

    public static void main(String[] args) {
        int i = 5;
        int j = 2;

        int k = max(i, j);
        System.out.println("The maximum of " + i + " and " + j + " is " + k);
    }

    public static int max(int num1, int num2) {
        return num1 > num2 ? num1 : num2;
    }
}
