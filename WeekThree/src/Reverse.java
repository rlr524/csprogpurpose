public class Reverse {
    public static void main(String[] args) {
        double[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 10;
        for (int i = 0; i < n/2 ; i++) {
            double temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-i-1] = temp;
        }
        System.out.println(java.util.Arrays.toString(arr));
    }
}

