package StringProblems.Level3;
import java.util.Scanner;
public class DeckOfCards {
        static String[] initializeDeck(String[] suits, String[] ranks) {
            String[] deck = new String[suits.length * ranks.length];
            int index = 0;
            for (String suit : suits)
                for (String rank : ranks)
                    deck[index++] = rank + " of " + suit;
            return deck;
        }
        static void shuffle(String[] deck) {
            for (int i = 0; i < deck.length; i++) {
                int r = i + (int) (Math.random() * (deck.length - i));
                String temp = deck[i];
                deck[i] = deck[r];
                deck[r] = temp;
            }
        }
        static String[][] distribute(String[] deck, int players, int cards) {
            String[][] result = new String[players][cards];
            int index = 0;
            for (int i = 0; i < players; i++)
                for (int j = 0; j < cards; j++)
                    result[i][j] = deck[index++];
            return result;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] suits = {"Hearts","Diamonds","Clubs","Spades"};
            String[] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
            String[] deck = initializeDeck(suits, ranks);
            shuffle(deck);
            System.out.print("Players and cards: ");
            int players = sc.nextInt();
            int cards = sc.nextInt();
            if (players * cards > deck.length) {
                System.out.println("Not possible");
                return;
            }
            String[][] result = distribute(deck, players, cards);
            for (int i = 0; i < players; i++) {
                System.out.println("Player " + (i+1));
                for (String card : result[i])
                    System.out.println(card);
            }
        }

}
