package chapters.chapter12.Exercises12.Exercises12_10;

public class OutOfMemoryError1 {

    public static void main(String[] args) {
        try {

            int[] arr = new int[100_000 * 100_000];

        } catch (OutOfMemoryError ex) {
            System.out.println("Out of memory!!!");

        }
    }
}
