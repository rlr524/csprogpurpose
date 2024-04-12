public class Sample {
    public static void main(String[] args) {
        // Print a random sample of m integers from 0 ... n-1 with no duplicates.
        // m: sample size
        // n: range
        // perm[]: permutation of 0 to n-1
        int m = Integer.parseInt(args[0]);
        int n = Integer.parseInt(args[1]);
        int[] perm = new int[n];

        // Initialize perm.
        for (int j = 0; j < n; j++) {
            perm[j] = j;
        }

        // Take sample
        for (int i = 0; i < m; i++) {
            // Exchange perm[i] with a random element to its right.
            int r = i + (int) (Math.random() * (n-i));
            int temp = perm[r];
            perm[r] = perm[i];
            perm[i] = temp;
        }

        // Print sample.
        for (int i = 0; i < m; i++) {
            System.out.print(perm[i] + " ");
            System.out.println();
        }
    }
}
