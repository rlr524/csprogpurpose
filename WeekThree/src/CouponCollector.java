public class CouponCollector {
    public static void main(String[] args) {
        // Generate random values in [0...n] until finding each one.
        int numberCouponValues = Integer.parseInt(args[0]);
        boolean[] isCollected = new boolean[numberCouponValues];
        int countCoupons = 0;
        int distinctCoupons = 0;

        while (distinctCoupons < numberCouponValues) {
            // Generate another coupon.
            int randomCoupon = (int) (Math.random() * numberCouponValues);
            System.out.println(randomCoupon);
            countCoupons++;
            System.out.println(countCoupons + " cooupons have been checked");
            if (!isCollected[randomCoupon]) {
                distinctCoupons++;
                isCollected[randomCoupon] = true;
            }
        } // n distinct coupons found.
        System.out.println("The total number of coupons needed to get all " + numberCouponValues + " coupons was: " + countCoupons);
    }
}
