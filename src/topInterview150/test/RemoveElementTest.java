package topInterview150.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import topInterview150.challenge.RemoveElement;

/**
 * RemoveElementTest description.
 *
 * @author Daniel
 * @version 16/02/2024
 */
class RemoveElementTest {

  @Test
  public void ex1() {
    var nums = new int[] {3,2,2,3};
    var val = 3;
    var expected = 2;
    var result = RemoveElement.removeElement(nums, val);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void ex2() {
    var nums = new int[] {0,1,2,2,3,0,4,2};
    var val = 2;
    var expected = 5;
    var result = RemoveElement.removeElement(nums, val);

    Assertions.assertEquals(expected, result);
  }

  @Test
  public void ex3() {
    var nums = new int[] {4,5};
    var val = 4;
    var expected = 1;
    var result = RemoveElement.removeElement(nums, val);

    Assertions.assertEquals(expected, result);
  }

}