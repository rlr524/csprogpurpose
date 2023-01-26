public class RandomInt {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        double random = Math.random();
        int value = (int) (number * random);
        System.out.println(random);
        System.out.println(value);
        System.out.println(Math.abs(-15555));
        System.out.println(Math.abs(-42));
        System.out.println(Math.abs(-2147483648));
    }
}
