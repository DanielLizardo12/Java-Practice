package test;

import challenges.AreNumbersAscending;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 14/04/2023
 */

class AreNumbersAscendingTest {

    @Test
    public void testAreNumbersAscendingPuppy() {
        String input = "a puppy has 2 eyes 4 legs";
        Assertions.assertTrue(AreNumbersAscending.areNumbersAscending(input));
    }

    @Test
    public void testAreNumbersAscendingBox() {
        String input = "1 box has 3 blue 4 red 6 green and 12 yellow marbles";
        Assertions.assertTrue(AreNumbersAscending.areNumbersAscending(input));
    }

    @Test
    public void testAreNumbersAscendingHelloWorld() {
        String input = "hello world 5 x 5";
        Assertions.assertFalse(AreNumbersAscending.areNumbersAscending(input));
    }

    @Test
    public void testAreNumbersAscendingSunset() {
        String input = "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s";
        Assertions.assertFalse(AreNumbersAscending.areNumbersAscending(input));
    }

}