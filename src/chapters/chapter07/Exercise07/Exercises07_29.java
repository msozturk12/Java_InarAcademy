package chapters.chapter07.Exercise07;

public class Exercises07_29 {
    public static void main(String[] args) {
        /*

                    (Game: pick four cards) Write a program that picks four cards from a deck of 52
            cards and computes their sum. An Ace, King, Queen, and Jack represent 1, 13,
            12, and 11, respectively. Your program should display the number of picks that
            yields the sum of 24.

         */
        int[] myPick = pickCard();
        displayDeck(myPick);


    }

    public static int[] pickCard() {
        int sum = 0;
        int[] myPick = new int[5];

        while (sum != 24) {
            for (int i = 0; i < myPick.length; i++) {
                myPick[i] = (int) (Math.random() * 52);
            }
            sum = getSum(myPick);
            myPick[4]++;//kaç kere deneniyor sayılıyor

        }
        return myPick;
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i] % 13 == 0 ? 13 : arr[i] % 13;// 0 dan başladığı için +1

        }
        return sum;
    }

    public static void displayDeck(int[] deck) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i < deck.length - 1; i++) {
            System.out.println(ranks[deck[i] % 13] + " of " + suits[deck[i] / 13]);

        }
        System.out.println("the number of picks that yields the sum of 24--> " + deck[4] + " times");
    }


}
