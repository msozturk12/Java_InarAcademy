package chapters.chapter07.Exercise07;

public class Exercises07_24 {
    public static void main(String[] args) {
        /*
        a shuffled deck of 52 cards repeatedly(*)
        -deck olustur
        -içini doldur initialize it
        -pick 4 cards one of each suit


     */
        int[] deck = new int[52];
        composeDeck(deck);
        shuffle(deck);

        int[] picks = new int[4];
        getNumberOfPick(deck, picks);

        displayPicks(picks);


    }


    public static int getNumberOfPick(int[] deck, int[] picks) {
        int countPick = 0;
        while (!hasOneOfEachSuit(picks)) {
            countPick++;
            for (int i = 0; i < 4; i++) {
                picks[i] = (int) (Math.random() * 52);

            }
        }
        return countPick;
    }


    public static boolean hasOneOfEachSuit(int[] picks) {
        for (int i = 0; i < picks.length - 1; i++) {
            for (int j = i + 1; j < picks.length; j++) {

                int suit1 = picks[i] / 13;
                int suit2 = picks[i] % 13;

                if (suit1 == suit2) {
                    return false;
                }


            }

        }
        return true;
    }

    public static void shuffle(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int random = (int) (Math.random() * deck.length);

            int temp = deck[i];
            deck[i] = deck[random];
            deck[random]= temp;

        }
    }

    public static void composeDeck(int[] deck) {
        for (int i = 0; i < deck.length; i++) {
            deck[i] = i; //Sayı veriliyor kartlara

        }
    }
/*
         info for deck cards:A standard deck of cards has four suites: hearts, clubs, spades, diamonds.
                             Each suite has thirteen cards: ace, 2, 3, 4, 5, 6, 7, 8, 9, 10, jack, queen and king.
                             Thus the entire deck has 52 cards total.

     //0 - 12 spades   35 / 13 = 2 (for suit) ---- 35 % 13 = 9 (for rank)   20
    //13 - 25 Clubs
    //26 - 39 Hearts
    //40 - 52 Diamonds
 */
    public static void displayPicks(int[] picks) {
        String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

        for (int i = 0; i <picks.length ; i++) {
            int suitIndex = picks[i] / 13;
            int rankIndex = picks[i] % 13;

            System.out.println(ranks[rankIndex] + " of " + suits[suitIndex]);

        }
    }

}
