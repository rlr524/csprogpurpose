public class TwoDimensionalGrades {
    public static void main(String[] args) {
        Double[][] testScores = {
                {99.0, 85.0, 98.0, 0.0},
                {98.0, 57.0, 79.0, 0.0},
                {92.0, 77.0, 74.0, 0.0},
                {94.0, 62.0, 81.0, 0.0},
                {99.0, 94.0, 92.0, 0.0},
                {0.0, 0.0, 0.0, 0.0}
        };

        int m = 5;
        int n = 3;

        for (int i = 0; i < m; i++) {
            double sum = 0.0;
            for (int j = 0; j < n; j++) {
                sum += testScores[i][j];
            }
            System.out.println(testScores[i][n] = sum / n);
        }
        for (int j = 0; j < n; j++) {
            double sum = 0.0;
            for (int i = 0; i < m; i++) {
                sum += testScores[i][j];
            }
            System.out.println(testScores[m][j] = sum / m);
        }
    }
}
