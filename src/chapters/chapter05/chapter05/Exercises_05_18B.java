package chapters.chapter05.chapter05;

public class Exercises_05_18B {

    public static void main(String[] args) {

        System.out.println("Pattern B");

        for(int row = 1 ; row<7 ; row++){
            for(int colon = 1 ; colon<=7-row ; colon++){
                System.out.print(colon + " ");

            }
            System.out.println();
        }

    }
}


