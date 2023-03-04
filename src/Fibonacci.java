import java.math.BigInteger;

/**
 * @author Daniel
 * @Date 03/03/2023
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(480000));
        System.out.println(fibonacciInN(46));
    }

    /**
     * Given n, return the number in the fibonacci sequence
     *
     * Time complexity: O(n)
     *   - The algorithm iterates through n numbers in the sequence once.
     *   - The time complexity is linear with respect to the input value n.
     *   - For example, if we want to compute the 10th number in the sequence,
     *   the algorithm will iterate through the sequence 10 times. If we want to compute the 20th number,
     *   it will iterate through the sequence 20 times. And so on.
     *
     * Space complexity: O(1)
     *   - The algorithm uses only constant space to store the previous two numbers in the sequence.
     *   - The space complexity does not depend on the input value n.
     *   - The reason for this is that the algorithm only uses three variables
     *   (previous, current, and next) to compute the Fibonacci sequence, and these variables occupy a constant
     *   amount of memory regardless of the value of n. This is why the space complexity is considered O(1).
     *
     * @param n the index of the number to return
     * @return the nth number in the Fibonacci sequence
     * @throws IllegalArgumentException if n is negative
     * @throws ArithmeticException if the final number in the sequence overflows an int
     */
    public static int fibonacciInN(int n) {
        // Check if n is negative, and throw an exception if it is
        if (n < 0) throw new IllegalArgumentException("n must be a positive value");

        // Base case: if n is 0, return 0
        if (n == 0) return 0;

        // Initialize variables to represent the first two numbers in the sequence
        int previous = 0;
        int current = 1;

        int next;
        // Loop through the remaining n-1 numbers in the sequence
        for (int i = 2; i <= n; i++) {
            // Calculate the next number in the sequence by adding the two previous numbers
            next = previous + current;
            // Shift the previous numbers down the sequence
            previous = current;
            current = next;
        }

        // Check if the final number in the sequence overflows an int, and throw an exception if it does
        if (current < 0) throw new ArithmeticException("Integral overflow");

        // Return the final number in the sequence

        return current;
    }

    public static BigInteger fibonacci(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be a positive value");
        if (n == 0) {
            return BigInteger.ZERO;
        } else if (n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger[][] matrix = {{BigInteger.ONE, BigInteger.ONE}, {BigInteger.ONE, BigInteger.ZERO}};
            BigInteger[][] result = matrixPower(matrix, n - 1);
            return result[0][0];
        }
    }

    private static BigInteger[][] matrixPower(BigInteger[][] matrix, int n) {
        if (n == 1) {
            return matrix;
        } else if (n % 2 == 0) {
            BigInteger[][] temp = matrixPower(matrix, n / 2);
            return multiply(temp, temp);
        } else {
            BigInteger[][] temp = matrixPower(matrix, (n - 1) / 2);
            return multiply(multiply(temp, temp), matrix);
        }
    }

    private static BigInteger[][] multiply(BigInteger[][] a, BigInteger[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int colsB = b[0].length;
        BigInteger[][] c = new BigInteger[rowsA][colsB];
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                BigInteger sum = BigInteger.ZERO;
                for (int k = 0; k < colsA; k++) {
                    sum = sum.add(a[i][k].multiply(b[k][j]));
                }
                c[i][j] = sum;
            }
        }
        return c;
    }
}
