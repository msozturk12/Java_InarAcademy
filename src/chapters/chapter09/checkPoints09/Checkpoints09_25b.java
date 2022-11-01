package chapters.chapter09.checkPoints09;

public class Checkpoints09_25b {

    public static void main(String[] args) {
        int[] a = {1, 2};
        swap(a);
        System.out.println("a[0] = " + a[0] + " a[1] =" + a[1]);

    }

    public static void swap(int[] a) {
        int temp = a[0];
        a[0] = a[1];
        a[1] = temp;
    }
}
