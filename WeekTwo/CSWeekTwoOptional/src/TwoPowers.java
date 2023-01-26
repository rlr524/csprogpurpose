//public class TwoPowers {
//    public static void main(String[] args) {
//        int n = Integer.parseInt(args[0]);
//        int power = 1;
//        int i = 0;
//        while (i <= n) {
//            System.out.println("2^" + i + " : " + power);
//            power = 2 * power;
//            i++;
//        }
//    }
//}

public class TwoPowers {
    public static void main(String[] args) {
        // Print powers of 2 using a for loop
        int n = Integer.parseInt(args[0]);
        int power = 1;
        for (int i = 0; i <= n; i++) {
            System.out.println(i + " " + power);
            power = 2 * power;
        }
    }
}
