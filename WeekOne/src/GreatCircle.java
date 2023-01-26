/*
 GreatCircle will calculate the distance between two places where x1 and y1
 are the lat and long of place one and x2 and y2 are the lat and long of place two.
*/
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double xRadians = Math.toRadians(x2 - x1);
        double yRadians = Math.toRadians(y2 - y1);

        double radiusOfEarth = 6371.0;

        double x1Radians = Math.toRadians(x1);
        double x2Radians = Math.toRadians(x2);

        double x1Cos = Math.cos(x1Radians);
        double x2Cos = Math.cos(x2Radians);

        double getCalculation = Math.pow(Math.sin(xRadians / 2), 2) + Math.pow(Math.sin(yRadians / 2), 2) * x1Cos * x2Cos;
        double getSquareRootOfCalculation = Math.asin(Math.sqrt(getCalculation));

        double distance = (2 * radiusOfEarth) * getSquareRootOfCalculation;

        System.out.println(distance + " kilometers");
    }
}
