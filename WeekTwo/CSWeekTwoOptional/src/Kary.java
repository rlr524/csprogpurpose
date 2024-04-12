public class Kary {
    public static void main(String[] args) {
        long i = Long.parseLong(args[0]);
        int k = Integer.parseInt(args[1]);

        // Take i and k and convert i to base k; k is between 2 and 16
        // For bases greater than 10, use Hex notation (A-F) to represent 11-16
        while (k <= i/2) {
            k *= 2;
            // Now, power is the largest power of 2 <= n
        }
        while (k > 0) {
            // Cast out powers of 2 in decreasing order
            if (i < k) {
                System.out.print(0);
            } else {
                System.out.print(1);
                i -= k;
            }
            k /= 2;
        }
        System.out.println();
    }
}
