public class CoinFlip {
    public static void main(String[] args) {
        int trials = Integer.parseInt(args[0]);
        int heads = 0;
        int tails = 0;
        double totalTrials = 0.0;

        for (int i = 0; i < trials; i++) {
            if (Math.random() < 0.5) {
//                System.out.println("Heads");
                heads++;
                totalTrials++;
            } else {
//                System.out.println("Tails");
                tails++;
                totalTrials++;
            }
        }
        System.out.println("There were " + heads + " heads results and " + tails + " tails results for a probability of heads of " + (double ) heads / totalTrials + " among " + totalTrials + " trials.");
    }
}
