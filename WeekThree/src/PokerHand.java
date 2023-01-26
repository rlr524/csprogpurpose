public class PokerHand {
    public static void main(String[] args) {
        String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String[] rank = {"Ace", "King", "Queen", "Jack", "Ten", "Nine", "Eight", "Seven", "Six", "Five", "Four", "Three", "Two"};

        String[] deck = new String[suit.length * rank.length];
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
}
