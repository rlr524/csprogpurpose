public class SelfAvoidingWalk {
    public static void main(String[] args) {
        // Do some trials of random self-avoiding walks in an n by n lattice
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int deadEnds = 0;
        for (int t = 0; t < trials; t++) {
            boolean[][] intersectionsVisited = new boolean[n][n];
            int x = n/2, y = n/2;
            while (x > 0 && x < n-1 && y > 0 && y < n-1) {
                // Check for a dead end and make a random move.
                intersectionsVisited[x][y] = true;
                if (intersectionsVisited[x - 1][y] && intersectionsVisited[x + 1][y] && intersectionsVisited[x][y - 1]  && intersectionsVisited[x][y + 1]) {
                    deadEnds++;
                    break;
                }
                double rand = Math.random();
                if (rand < 0.25) { if (!intersectionsVisited[x + 1][y]) x++;}
                else if (rand < 0.50) { if (!intersectionsVisited[x -1][y]) x--;}
                else if (rand < 0.75) { if (!intersectionsVisited[x][y + 1]) y++;}
                else if (rand < 1.00) {if (!intersectionsVisited[x][y -1 ]) y--;}
            }
        }
        System.out.println(100*deadEnds/trials + "% dead ends");
    }
}
