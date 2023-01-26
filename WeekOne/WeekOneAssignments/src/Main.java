public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        printRands();
        printAverage();
        printMin();
        printMax();
        threeSort(args);
    }

    static double a = Math.random();
    static double b = Math.random();
    static double c = Math.random();
    static double d = Math.random();
    static double e = Math.random();

    public static void printRands() {
        System.out.printf("The random numbers are: %f, %f, %f, %f, %f\n", a, b, c, d, e);
    }

    public static void printAverage() {
        double avgValue = (a + b + c + d + e) / 2;
        System.out.printf("The average is: %f\n", avgValue);
    }

    public static void printMin() {
        double minValue = Math.min(a, Math.min(Math.min(b, c), Math.min(d, e)));
        System.out.printf("The min value is: %f\n", minValue);
    }

    public static void printMax() {
        double maxValue = Math.max(a, Math.max(Math.max(b, c), Math.max(d, e)));
        System.out.printf("The max value is: %f\n", maxValue);
    }

    public static void threeSort(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        int high = Math.max(a, Math.max(b, c));
        int low = Math.min(a, Math.min(b, c));
        int middle = (a + b + c) - (high + low);
        System.out.printf("Ascending order: %d, %d, %d\n", low, middle, high);
        System.out.println("bc" + 2 + 3);
    }
}