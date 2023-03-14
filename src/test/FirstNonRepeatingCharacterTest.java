package test;

import challenges.FirstNonRepeatingCharacter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

/**
 * @author Daniel
 * @Date 14/03/2023
 */
class FirstNonRepeatingCharacterTest {

    @Test
    public void testFirstNonRepeatingCharacterFirstTest() {
        Integer result = FirstNonRepeatingCharacter.firstNonRepeatingCharacter("AabcIAcbd");
        assertEquals(1, result);
    }

    @Test
    public void testFirstNonRepeatingCharacterSecondTest() {
        Integer result = FirstNonRepeatingCharacter.firstNonRepeatingCharacter("aaAA33");
        assertNull(result);
    }

    @Test
    public void testFirstNonRepeatingCharacterThirdTest() {
        Integer result = FirstNonRepeatingCharacter.firstNonRepeatingCharacter("abc");
        assertEquals(0, result);
    }

    @Test
    public void testFirstNonRepeatingCharacterFourthTest() {
        Integer result = FirstNonRepeatingCharacter.firstNonRepeatingCharacter("DDAbcIIAcbd");
        assertEquals(10, result);
    }

}