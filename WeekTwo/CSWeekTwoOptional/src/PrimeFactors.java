public class PrimeFactors {
    public static void main(String[] args) {
        // Print the prime factorization of n
        long n = Long.parseLong(args[0]);
        long factor; /* An example of declaring the loop iterator before initializing it; we see this a lot but it's
        somewhat of a relic from old days and not great form */
        for (factor = 2; factor <= n/factor; factor++) {
            // Test potential factor
            while (n % factor == 0) {
                // Cast out and print factor
                n /= factor;
                System.out.print(factor + " ");
            } // Any factor of n must be greater than factor
        }
        if (n > 1) {
            System.out.print(n);
            System.out.println();
        }
    }
}
