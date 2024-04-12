public class PrimeNumbers {
    public static void main(String[] args) {
        int number = 1;
        while (number < 10000 && number != number) {
                System.out.println(number);
                number++;
            }
    }
}
