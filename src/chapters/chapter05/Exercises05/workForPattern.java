package chapters.chapter05.Exercises05;

public class workForPattern {
    public static void main(String[] args) {

        for (int row = 1; row <= 8; row++) {
            for (int s = 0; s <= 8 - row; s++) {
                System.out.print("****");
            }
            for (int j = 0; j < row; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            for (int m = row - 2; m >= 0; m--) {
                System.out.printf("%4d", (int) Math.pow(2, m ));

            }
            for(int g = 0 ; g<=8-row ; g++){
                System.out.print("****");

            }
            System.out.println();
        }
    }
}
