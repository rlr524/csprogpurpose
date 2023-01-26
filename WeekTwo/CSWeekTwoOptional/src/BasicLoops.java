public class BasicLoops {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 20; i++)
            System.out.println("The sum of " + i + ", which is i, and " + sum + ", which is sum, is: " + (sum += i));
    }
}
