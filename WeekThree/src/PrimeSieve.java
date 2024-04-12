public class PrimeSieve {
    // Print the number of primes <= numberPrimes using the Sieve of Eratosthenes technique
    public static void main(String[] args) {
        // The number for which we want to return the number of primes up to but not including, 
        // e.g. 25 will return 9 (1, 3, 5, 7, 11, 13, 17, 19, 23) as will 29 (even though 29 
        // is a prime, it won't be included)
        int numberPrimes = Integer.parseInt(args[0]);
        // An array that stores the true/false (is/isn't a prime) for each element i 
        // as we loop through numberPrimes
        boolean[] isPrime = new boolean[numberPrimes + 1]; 
        for (int i = 0; i < numberPrimes; i++) {
            // Set each of the elements of the array to true to start
            isPrime[i] = true;
        }
        for (int i = 2; i <= numberPrimes/i ; i++) {
            if (isPrime[i]) {
                // Mark multiples of i as non prime.
                for (int j = i; j <= numberPrimes/i; j++) {
                    isPrime[i * j] = false;
                }
            }
        }
        // Count the primes.
        int primes = 0;
        for (int i = 2; i < numberPrimes; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                primes++;
            }
        }
        System.out.println();
        System.out.println("The number of primes up to but not including " 
                + numberPrimes + " is: " + primes);
    }
}
