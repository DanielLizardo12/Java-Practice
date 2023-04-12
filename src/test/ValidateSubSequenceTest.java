package test;

import challenges.ValidateSubSequence;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Daniel
 * @Date 12/04/2023
 */

class ValidateSubSequenceTest {

    @Test
    public void validateSubSequenceSimpleInnerArray() {
        List<Integer> array = List.of(1, 2, 3, 4, 5, 6);
        List<Integer> innerArray = List.of(2, 4);

        Assertions.assertTrue(ValidateSubSequence.isValidSubsequence(array, innerArray));
    }

}