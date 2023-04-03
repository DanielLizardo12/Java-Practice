package test;

import challenges.IsomorphicStrings;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 02/04/2023
 */

class IsomorphicStringsTest {

    private static final String STRING = "paper";
    private static final String TRAVERSED = "title";

    @Test
    public void testIsomorphicStringFirstApproach() {
        Assertions.assertTrue(IsomorphicStrings.isomorphicStringsFistApproach(STRING, TRAVERSED));
    }

    @Test
    public void testIsomorphicStringSecondApproach() {
        Assertions.assertTrue(IsomorphicStrings.isomorphicStrings(STRING, TRAVERSED));
    }

}