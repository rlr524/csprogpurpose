public class Main {

    public static void main(String[] args) {
        double[] arr = new double[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Math.random();
            System.out.println(arr[i]);
        }
        double result = findMax(arr, 10);
        System.out.println(result);
    }

    public static double findMax(double a[], double n) {
        double max = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            if (a[i] > max) {
                max = a[1];
            }
        }
        return max;
    }
}

