public class UniformRandomNumbers {
    public static void main(String[] args) {
        double randOne = Math.random();
        double randTwo = Math.random();
        double randThree = Math.random();
        double randFour = Math.random();
        double randFive = Math.random();
        double randAvg = (randOne + randTwo + randThree + randFour + randFive) / 5;
        double randMin = Math.min(randOne, Math.min(randTwo, Math.min(randThree, Math.min(randFour, randFive))));
        double randMax = Math.max(randOne, Math.max(randTwo, Math.max(randThree, Math.max(randFour, randFive))));

        System.out.println("The numbers are: " + randOne + " " + randTwo + " " + randThree + " " + randFour + " " + randFive);
        System.out.println("The average is: " + randAvg);
        System.out.println("The min is: " + randMin);
        System.out.println("The max is: " + randMax);
    }
}
