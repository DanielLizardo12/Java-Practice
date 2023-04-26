package test;

import challenges.ReversePrefixWord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Daniel
 * @Date 26/04/2023
 */

class ReversePrefixWordTest {

    @Test
    public void testReversePrefixWordSimpleReverse() {
        String result = ReversePrefixWord.reversePrefix("abcdefd", 'd');
        Assertions.assertEquals('d', result.charAt(0));
        Assertions.assertEquals('c', result.charAt(1));
        Assertions.assertEquals('b', result.charAt(2));
        Assertions.assertEquals('a', result.charAt(3));
        Assertions.assertEquals('e', result.charAt(4));
        Assertions.assertEquals('f', result.charAt(5));
        Assertions.assertEquals('d', result.charAt(6));
    }

}