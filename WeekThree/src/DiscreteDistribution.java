/*
Discrete distribution. Write a program DiscreteDistribution.java that takes an integer 
command-line argument m, followed by a sequence of positive integer command-line 
arguments a1,a2,…,and prints m random indices (separated by whitespace), choosing each index i
with probability proportional to a_i.

~/Desktop/arrays> java DiscreteDistribution 25 1 1 1 1 1 1
5 2 4 4 5 5 4 3 4 3 1 5 2 4 2 6 1 3 6 2 3 2 4 1 4

~/Desktop/arrays> java DiscreteDistribution 25 10 10 10 10 10 50
3 6 6 1 6 6 2 4 6 6 3 6 6 6 6 4 5 6 2 2 6 6 2 6 2

~/Desktop/arrays> java DiscreteDistribution 25 80 20
1 2 1 2 1 1 2 1 1 1 1 1 1 1 1 2 2 2 1 1 1 1 1 1 1

~/Desktop/arrays> java DiscreteDistribution 100 301 176 125 97 79 67 58 51 46
6 2 4 3 2 3 3 1 7 1 1 3 4 7 1 4 2 2 1 1 3 1 8 6 2
1 3 6 1 8 5 1 3 6 1 1 2 3 8 7 4 6 4 3 1 5 3 3 7 3
1 3 1 7 7 2 2 3 6 5 4 1 1 1 7 2 3 5 2 2 1 4 1 2 1
2 1 2 2 3 2 8 4 3 2 1 8 3 5 3 3 8 1 2 3 3 1 2 3 1
To generate a random index i with probability proportional to a_i:

Define the cumulative sums Si=a1+a2+…+a_i, with S0=0.
Pick a random integer r uniformly between 0 and Sn−1.
Find the unique index i between 1 and n such that Si−1≤r<Si.

Geometrically, this subdivides the interval (0,Sn) into n sub-intervals (Si−1,Si), 
with the length of sub-interval i proportional to a_i For example, if the discrete 
distribution is defined by (a1,a2,a3,a4,a5,a6)=(10,10,10,10,10,50), then the cumulative sums are
(S1,S2,S3,S4,S5,S6)=(10,20,30,40,50,100) and the following diagram illustrates the 6 sub-intervals.

In probability theory, this is known as sampling from a discrete distribution.
*/

public class DiscreteDistribution {
    public static void main(String[] args) {
        int n = args.length;
        int [] a = new int [n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
        }
        int [] s = new int [n];
        for (int i = 1; i < n; i++) {
            s[0] = 0;
            s[i] = s[i-1] + a[i];
        }
        for (int m = 0; m < a[0]; m++) {
            int index = 1;
            int r = (int) (s[n-1] * Math.random());
            for (int i = 1; i < n; i++) {
                if (s[i-1] <= r && r < s[i])
                    index = i;
            }
            System.out.printf("%d ", index);
        }
        System.out.println("\n");
    }
}
