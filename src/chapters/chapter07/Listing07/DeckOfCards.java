package chapters.chapter07.Listing07;

public class DeckOfCards {
    public static void main(String[] args) {

        int[] deck = new int[52];

        String[] suits = new String[4];
        suits[0] = "Spades";
        suits[1] = "Hearts";
        suits[2] = "Diamonds";
        suits[3] = "Clubs";

        String[] ranks=new String[13];
        ranks[0]="Ace";
        ranks[1]="2";
        ranks[2]="3";
        ranks[3]="4";
        ranks[4]="5";
        ranks[5]="6";
        ranks[6]="7";
        ranks[7]="8";
        ranks[8]="9";
        ranks[9]="10";
        ranks[10]="Jack";
        ranks[11]="Queen";
        ranks[12]="King";

        for (int i = 0; i <deck.length ; i++) {
            deck[i]=i;
        }

      //shuffle the deck
        for (int i = 0; i < deck.length; i++) {
            int random = (int)(Math.random() * 52);

            int temp = deck[i];
            deck[i]=deck[random];
            deck[random]=temp;

        }

        for(int i = 0 ; i<4 ; i++){
            String suit = suits[deck[i] / 13];
            String rank = ranks[deck[i] % 13];
            System.out.println(suit + " - " + rank);
        }
    }
}
