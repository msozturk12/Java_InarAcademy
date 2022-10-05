package chapters.chapter06.Exercises06;

public class Exercises_06_32 {

    public static void main(String[] args) {
        /*
        Game craps run it 10_000 times and display the winning games

         */

        final int PLAY_TURN = 10_000;
        int counter = 0;
        int sum = 0;
        int countWin=0;
        while (counter < PLAY_TURN) {
            int dice1 = getDice();
            int dice2 = getDice();
            sum = getSum(dice1, dice2);


            if (isCraps(sum)) {
                System.out.printf("you rolled %d + %d = %d", dice1, dice2, sum);
                System.out.println("\nyou lose");
                breakPoint();

            } else if (isNatural(sum)) {

                System.out.printf("you rolled %d + %d = %d", dice1, dice2, sum);
                System.out.println("\nyou win");
                countWin++;
                breakPoint();

            } else {
                System.out.printf("you rolled %d + %d = %d", dice1, dice2, sum);
                System.out.println("\npoint is " + sum);
                int dice3 = getDice();
                int dice4 = getDice();
                int sum2 =getSum(dice3,dice4);
                System.out.printf("you rolled %d + %d = %d", dice3, dice4, sum2);
                if (sum == 7) {
                    System.out.println(" \nyou lose");
                } else {
                    System.out.println(" \nyou win");
                    countWin++;
                }
                breakPoint();
            }
            counter++;
        }
        System.out.println("You play 10_000 times and the number of winning games is -->" + countWin);
    }

    public static int getSum(int dice1, int dice2) {
        int sum;
        sum = dice1 + dice2;
        return sum;
    }

    public static void breakPoint() {
        System.out.println("------------------------------");
    }


    private static int getDice() {
        return (int) (1 + Math.random() * 6);
    }

    public static boolean isNatural(int sum) {
        return (sum == 7 || sum == 11);
    }

    public static boolean isCraps(int sum) {
        return (sum == 2 || sum == 3 || sum == 12);
    }



}
