package sum;
public class SumTwoDimArray {
    public static void main(String[] args) {
        int[] row = new int[] {3, 5, 6, 9, 11, 12, 15};
        int[] col = new int[] {2, 9, 4, 5, 7, 7, 2};

        for (int k : row) {
            for (int i : col) {
                System.out.printf("The sum of %d and %d is: %d \n", k, i, k + i);
            }
        }

        arrayRandom(10);
    }

    public static void arrayRandom(int arrSize) {
        double[] arr = new double[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
            System.out.println(arr[i]);
        }
    }

    public void printEmployees() {
        String[] employees = new String[] {"Janine", "Sheryl", "Theresa", "Dave", "Steve"};

        for (String employee : employees) {
            System.out.println(employee);
        }
    }
}
