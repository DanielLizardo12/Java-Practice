package test;

import challenges.SearchInMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Daniel
 * @Date 19/03/2023
 */

class SearchInMatrixTest {

    @Test
    public void testSearchMatrixFistTest() {
        assertTrue(SearchInMatrix.searchMatrix(null, 1));
    }

}