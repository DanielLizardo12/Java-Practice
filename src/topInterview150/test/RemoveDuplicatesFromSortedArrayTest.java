package topInterview150.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import topInterview150.challenge.RemoveDuplicatesFromSortedArray;

/**
 * RemoveDuplicatesFromSortedArrayTest description.
 *
 * @author Daniel
 * @version 17/02/2024
 */
class RemoveDuplicatesFromSortedArrayTest {


  @Test
  public void ex5() {
    var input = new int[]{0,0,0,0,3};
    var expected = 2;

    var result = RemoveDuplicatesFromSortedArray.removeDuplicates(input);

    Assertions.assertEquals(expected, result);
  }

}