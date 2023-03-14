package test;


import challenges.Palindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Daniel
 * @Date 14/03/2023
 */
class PalindromeTest {

    @Test
    public void testPalindromeFistTest() {
        assertTrue(Palindrome.palindrome("anitalavalatina"));
    }

    @Test
    public void testPalindromeSecondTest() {
        assertTrue(Palindrome.palindrome("malayalam"));
    }

    @Test
    public void testPalindromeThirdTest() {
        assertTrue(Palindrome.palindrome("aa"));
    }

    @Test
    public void testPalindromeFourthTest() {
        assertTrue(Palindrome.palindrome("b"));
    }
    @Test
    public void testPalindromeFifthTest() {
        assertFalse(Palindrome.palindrome("aA"));
    }

}