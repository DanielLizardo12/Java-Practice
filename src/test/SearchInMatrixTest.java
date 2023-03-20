package test;

import challenges.SearchInMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * @author Daniel
 * @Date 19/03/2023
 */

class SearchInMatrixTest {

    int[][] matrix = new int[][]{
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 60}
    };

    @Test
    public void testSearchMatrixFistTest() {
        assertTrue(SearchInMatrix.searchMatrix(matrix, 3));
    }

    @Test
    public void testSearchMatrixSecondTest() {
        assertTrue(SearchInMatrix.searchMatrix(matrix, 16));
    }

    @Test
    public void testSearchMatrixThirdTest() {
        assertTrue(SearchInMatrix.searchMatrix(matrix, 60));
    }

    @Test
    public void testSearchMatrixFourthTest() {
        assertFalse(SearchInMatrix.searchMatrix(matrix, 0));
    }

    @Test
    public void testSearchMatrixFifthTest() {
        assertFalse(SearchInMatrix.searchMatrix(matrix, 200));
    }

}