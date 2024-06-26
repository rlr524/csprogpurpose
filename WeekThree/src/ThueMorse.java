/*
* Thue–Morse weave. Write a program ThueMorse.java that takes an integer command-line argument n and
* prints an n-by-n pattern like the ones below. Include two space characters between each + and - character.
~/Desktop/arrays> java ThueMorse 4
+  -  -  +
-  +  +  -
-  +  +  -
+  -  -  +

~/Desktop/arrays> java ThueMorse 8
+  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +

~/Desktop/arrays> java ThueMorse 16
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
-  +  +  -  +  -  -  +  +  -  -  +  -  +  +  -
+  -  -  +  -  +  +  -  -  +  +  -  +  -  -  +
The Thue–Morse sequence is an infinite sequence of 0s and 1s that is constructed by starting with 0 and
* successively appending the bitwise negation (interchange 0s and 1s) of the existing sequence. Here are
* the first few steps of this construction:
0010110011010010110100110010110
To visualize the Thue–Morse sequence, create an n-by-n pattern by printing a + (plus sign) in row i and
* column j if bits i and j in the sequence are equal, and a - (minus sign) if they are different.
Thue–Morse weave
Note: you may assume that n is a positive integer (but it need not be a power of 2).

The Thue–Morse sequence has many fascinating properties and arises in graphic design and in music composition.
* */

public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int box = i * n + j;
                if (Integer.bitCount(box) % 2 == 0) {
                    System.out.print("+ ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
