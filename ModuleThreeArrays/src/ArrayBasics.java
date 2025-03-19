import java.util.Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // Create an array with random values.
        double[] a = new double[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = Math.random();
        }
        
        // Print the values one per line.
        for (double v : a) {
            System.out.println(v);
        }
        
        // Print the values all in an array.
        System.out.println("A = " + Arrays.toString(a));
        
        // Find the maximum of the array values.
        double max = Double.NEGATIVE_INFINITY;
        for (double v : a) {
            if (v > max) {
                max = v;
            }
        }
        System.out.println(max);
        
        // Compute the average of the array values.
        double sum = 0.0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double average = sum / a.length;
        System.out.printf("The average of the array values is %,.15f\n", average);
        
        // Reverse the values within the array.
        for (int i = 0; i < a.length/2; i++) {
            double temp = a[i];
            a[i] = a[a.length-1-i];
            a[a.length-i-1] = temp;
        }
        System.out.println("Array reversed in place = " + Arrays.toString(a));
        
        // Copy the sequence of values to another array. (They will be reversed; remember that the reverse operation
        // above reverses the values of the array in place, it does not create a new array.)
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        System.out.println("Array b = " + Arrays.toString(b));
        
        // Setting array values at compile time
        String[] SUITS = { "Clubs", "Diamonds", "Hearts", "Spades" };
        String[] RANKS = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "Spades" };
        
        int i = (int) (Math.random() * RANKS.length);
        int j = (int) (Math.random() * SUITS.length);

        System.out.println(i);
        System.out.println(j);
        System.out.println(RANKS[i] + " of " + SUITS[j]);
    }
}