public class LargestPower {
    public static void main(String[] args) {
        // Get the largest power of 2 that is less than or equal to the given argument n
        int n = Integer.parseInt(args[0]);
        int power = 1;
        while (power <= n/2) {
            power = 2 * power;
            System.out.println(power);
        }
    }
}

