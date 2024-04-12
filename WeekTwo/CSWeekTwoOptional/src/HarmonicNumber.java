public class HarmonicNumber {
    public static void main(String[] args) {
        // Compute the (n)th harmonic number
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            // Add the (i)th term to the sum
            sum += 1.0/i;
        }
        System.out.println(sum);
    }
    // The result is ln(n) + 0.57721 for larger numbers (natural log of n + 0.57721)
    // Harmonic numbers are the "discrete analog" of the log
    // They also approximate the area under the curve of y = 1/x
}
