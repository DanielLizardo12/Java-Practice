package test;

import challenges.MakeFancyString;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 22/04/2023
 */

class MakeFancyStringTest {

    @Test
    public void testMakeFancyStringLeetcode() {
        Assertions.assertEquals("leetcode", MakeFancyString.makeFancyString("leeetcode"));
    }

}