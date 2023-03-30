package test;

import challenges.Fibonacci;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author Daniel
 * @Date 29/03/2023
 */

class FibonacciTest {

    @Test
    public void testFibonacciFourthElement() {

        BigInteger three = BigInteger.valueOf(3);

        assertEquals(3, Fibonacci.fibonacciInN(4));
        assertEquals(three, Fibonacci.fibonacci(4));
    }

}