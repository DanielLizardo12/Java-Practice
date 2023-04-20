package test;

import challenges.LemonadeChange;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 20/04/2023
 */

class LemonadeChangeTest {

    @Test
    public void testLemonadeChangeCorrectChange() {
        Assertions.assertTrue(LemonadeChange.lemonadeChange(new int[]{5, 5, 5, 10, 20}));
    }

    @Test
    public void testLemonadeChangeNotEnoughChange() {
        Assertions.assertFalse(LemonadeChange.lemonadeChange(new int[]{5, 5, 10, 10, 20}));
    }

}