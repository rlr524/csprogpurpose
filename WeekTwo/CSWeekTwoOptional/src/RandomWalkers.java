public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int steps = 0;
        double totalSteps = 0.0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;

            for (int j = 1; j < (Math.abs(x) + Math.abs(y)) || (Math.abs(x) + Math.abs(y)) != r; j++) {
                double rand = Math.random();
                if (rand >= 0.0 && rand <= 0.24) {
                    x = x + 1;
                    steps++;
                } else if (rand > 0.24 && rand <= 0.49) {
                    x = x - 1;
                    steps++;
                } else if (rand > 0.49 && rand <= 0.74) {
                    y = y + 1;
                    steps++;
                } else {
                    y = y - 1;
                    steps++;
                }
            }
        }
        totalSteps = totalSteps + steps;
        System.out.println("average number of steps = " + totalSteps / trials);
    }
}
