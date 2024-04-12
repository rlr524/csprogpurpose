public class DivisorPattern {
    public static void main(String[] args) {
        // Print a square that visualizes divisors
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++) {
            // Print the (i)th line
            for (int j = 1; j <= n; j++) {
                // Print the (j)th element in the (i)th line
                if ((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                 else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }
}
