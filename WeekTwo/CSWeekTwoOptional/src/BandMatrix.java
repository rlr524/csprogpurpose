public class BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);

            // print an n by n pattern with 0 for each element whose distance from the main
            // diagonal is > than width and * for each element that is not as well as two
            // spaces between each 0 or *
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    if (Math.abs(i - j) > width || Math.abs(j - i) > width) {
                        System.out.print("0  ");
                    } else {
                        System.out.print("*  ");
                    }
                }
                System.out.println("  ");
            }
        }
    }
