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
        Assertions.assertFalse(AreNumbersAscending.areNumbersAscending(input));
    }

}