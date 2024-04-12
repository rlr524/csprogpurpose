public class ThreeSort {
    public static void main(String[] args) {
        int intOne = Integer.parseInt(args[0]);
        int intTwo = Integer.parseInt(args[1]);
        int intThree = Integer.parseInt(args[2]);

        int intMin = Math.min(intOne, Math.min(intTwo, intThree));
        int intMax = Math.max(intOne, Math.max(intTwo, intThree));
        int intMedian = (intOne + intTwo + intThree) - (intMin + intMax);

        System.out.println(intMin + " " + intMedian + " " + intMax);
        System.out.println(7/3);
        System.out.println(2 + 2.0);
    }
}
