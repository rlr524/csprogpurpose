public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int x = 0;
        int y = 0;
        int steps = 0;

        for (int i = 1; i < (Math.abs(x) + Math.abs(y)) || (Math.abs(x) + Math.abs(y)) != r; i++) {
            double rand = Math.random();
            if (rand >= 0.0 && rand <= 0.24) {
                x = x + 1;
                System.out.println("(" + x + ", " + y + ")");
                steps++;
            } else if (rand > 0.24 && rand <= 0.49) {
                x = x - 1;
                System.out.println("(" + x + ", " + y + ")");
                steps++;
            } else if (rand > 0.49 && rand <= 0.74) {
                y = y + 1;
                System.out.println("(" + x + ", " + y + ")");
                steps++;
            } else {
                y = y - 1;
                System.out.println("(" + x + ", " + y + ")");
                steps++;
            }
        }
        System.out.println("steps = " + steps);
    }
}
