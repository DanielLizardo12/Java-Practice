package test;

import challenges.Permutation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @author Daniel
 * @Date 04/04/2023
 */

class PermutationTest {

    @Test
    public void testPermutation() {
        List<int[]> permuted = Permutation.permute(new int[]{1, 2, 3});
        Assertions.assertEquals(6, permuted.size());
    }

}