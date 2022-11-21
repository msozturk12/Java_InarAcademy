package chapters.chapter12.CheckPoints12;

public class CheckPoints12_6a {
    public static void main(String[] args) {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            } catch (Exception ex) {
            }
        }
    }


}
// output is --> 0 1
