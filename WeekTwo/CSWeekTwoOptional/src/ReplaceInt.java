public class ReplaceInt {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        if (x > y) {
            int t = x;
            x = y;
            y = t;
        }
        System.out.println(x + " " + y);
    }
}

