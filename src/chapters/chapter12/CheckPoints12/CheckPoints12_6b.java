package chapters.chapter12.CheckPoints12;

public class CheckPoints12_6b {
    public static void main(String[] args) {
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {
            System.out.println("\nException handled in  first iteration");
        }
    }
}
   // output is --> 0
