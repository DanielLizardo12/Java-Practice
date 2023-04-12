package test;

import challenges.AddToArrayForm;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniel
 * @Date 11/04/2023
 */

class AddToArrayFormTest {

    @Test
    public void testAddToArraySimpleSum() {
        // This creates an immutable list containing the integers 1, 2, 3.
        // note that this method should only be used if the list won't
        // change later, as it will throw an UnsupportedOperationException if you try to modify it.
        List<Integer> integerList = List.of(1, 2, 3);
        // this will not be used, but, it is a good to know

        int[] ints = new int[]{1};

        List<Integer> result = AddToArrayForm.addToArrayForm(ints, 1);

        Assertions.assertEquals(2, result.get(0));

    }

}