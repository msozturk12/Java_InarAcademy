package chapters.chapter05.chapter05;

public class Exercises_05_19 {

    public static void main(String[] args) {

        int lines = 8;

        for (int i = 1; i <= 8; i++) {
            for (int s = 1; s <= 8 - i; s++) {
                System.out.print("    ");

            }
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d",(int) Math.pow(2, j) );
            }
            for(int m = i-2 ; m >=0 ; m--){
                System.out.printf("%4d",(int) Math.pow(2, m));
            }
            System.out.println();
        }

    }
}


