public class PokerHand {
    static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] rank = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};
    static String[] deck = new String[suit.length * rank.length];

    public static void main(String[] args) {
        playHand(args);
        cards();
    }

    public static void playHand(String[] args) {
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = rank[i] + " of " + suit[j];
            }
        }

        int handSize = Integer.parseInt(args[0]); // Sample size
        int deckSize = Integer.parseInt(args[1]); // Range
        int[] perm = new int[handSize]; // Permutations

        // Initialize perm.
        for (int j = 0; j < handSize; j++) {
            perm[j] = j;
        }

        // Take sample.
        for (int i = 0; i < deckSize; i++) {
            // Exchange perm[i] with a random element to its right.
            int r = i + (int) (Math.random() * (handSize-i));
            int temp = perm[r];
            perm[r] = perm[i];
            perm[i] = temp;
        }

        // Print sample.
        for (int i = 0; i < deckSize; i++) {
            System.out.println(deck[perm[i]] + " ");
        }
    }

    public static void cards() {
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suit.length; j++) {
                deck[suit.length * i + j] = rank[i] + " of " + suit[j];
            }
        }
        System.out.println(java.util.Arrays.toString(deck));

        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n-i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
        System.out.println(java.util.Arrays.toString(deck));
    }
}
