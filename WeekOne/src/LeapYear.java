public class LeapYear {
    public static boolean main(String yearArg) {
        int year = Integer.parseInt(yearArg);
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        return isLeapYear;
    }
}
