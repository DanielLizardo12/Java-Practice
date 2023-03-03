import java.math.BigInteger;

/**
 * @author Daniel
 * @Date 03/03/2023
 */

public class Fibonacci {

    //Given n, return the number in the fibonacci sequence
    public static void main(String[] args) {
        System.out.println(fibonacci(480000));
        System.out.println(fibonacciInN(46));
    }

    public static int fibonacciInN(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be a positive value");
        if (n == 0) return 0;

        //this determinate the first two numbers in the sequence
        int previous = 0;
        int current = 1;

        int next;
        for (int i = 2; i <= n; i++) {
            next = previous + current;
            previous = current;
            current = next;
        }

        if (current < 0) throw new ArithmeticException("Integral overflow");

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
