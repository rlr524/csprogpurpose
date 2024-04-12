public class BadHellos {
    public static void main(String[] args) {
        // Example of an infinite loop
        int i = 4;
        while (i > 3) { // This is always true so the loop never exits
            System.out.println(i + "th Hello");
            i = i + 1;
        }
    }
}
