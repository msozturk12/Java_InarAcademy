package chapters.chapter06.Listing06;

public class TestMax {
    public static void main(String[] args) {
        System.out.println(max(32,65));

    }

    public static int max(int a, int b) {
        int result;

        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
