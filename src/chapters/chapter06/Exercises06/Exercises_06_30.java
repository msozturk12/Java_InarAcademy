package chapters.chapter06.Exercises06;

public class Exercises_06_30 {
    public static void main(String[] args) {
        /*
        Game craps
        roll two dice --> math random
        if the sum of two value 2,3,12 called craps--> you lose
        if the sum-->7,11 called natural you win :)
        if the sum another num 3,4,5,6,8,9,10 continue to roll the dice *until 7 or same value rolled
        if it is 7 you lose otherwise you win
         */

        final int PLAY_TURN = 1;
        int counter = 0;
        int sum = 0;
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
                breakPoint();

            } else {
                System.out.printf("you rolled %d + %d = %d", dice1, dice2, sum);
                System.out.println("\npoint is " + sum);
                extractedPoint(sum);
                breakPoint();
            }
            counter++;
        }
    }

    public static int getSum(int dice1, int dice2) {
        int sum;
        sum = dice1 + dice2;
        return sum;
    }

    public static void breakPoint() {
        System.out.println("------------------------------");
    }

    private static void extractedPoint(int sum) {
        int dice3 = getDice();
        int dice4 = getDice();
        int sum2 = dice3 + dice4;
        System.out.printf("you rolled %d + %d = %d", dice3, dice4, sum2);
        if (sum == 7) {
            System.out.println(" \nyou lose");
        } else {
            System.out.println(" \nyou win");
        }
    }

    public static int getDice() {

        return (int) (1 + Math.random() * 6);
    }

    public static boolean isNatural(int sum) {

        return (sum == 7 || sum == 11);
    }

    public static boolean isCraps(int sum) {
        return (sum == 2 || sum == 3 || sum == 12);
    }


}
