public class RightTriangle {
    public static void main(String[] args) {
        double sideOne = Double.parseDouble(args[0]);
        double sideTwo = Double.parseDouble(args[1]);
        double sideThree = Double.parseDouble(args[2]);

        double sideOneSq = sideOne * sideOne;
        double sideTwoSq = sideTwo * sideTwo;
        double sideThreeSq = sideThree * sideThree;

        double squareMin = Math.min(sideOneSq, Math.min(sideTwoSq, sideThreeSq));
        double squareMax = Math.max(sideOneSq, Math.max(sideTwoSq, sideThreeSq));
        double squareMed = (sideOneSq + sideTwoSq + sideThreeSq) - (squareMin + squareMax);

        boolean result = (sideOne > 0 && sideTwo > 0 && sideThree > 0 && ((squareMin + squareMed) == squareMax));
//        System.out.println(sideOne + " " + sideTwo + " " + sideThree);
//        System.out.println(sideOneSq + " " + sideTwoSq + " " + sideThreeSq);
//        System.out.println(squareMin + " " + squareMed + " " + squareMax);
        System.out.println(result);
    }
}
